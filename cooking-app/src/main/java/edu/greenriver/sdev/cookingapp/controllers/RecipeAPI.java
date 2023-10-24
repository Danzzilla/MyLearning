package edu.greenriver.sdev.cookingapp.controllers;

import edu.greenriver.sdev.cookingapp.model.Recipe;
import edu.greenriver.sdev.cookingapp.services.RecipeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("recipes")//all paths start with recipes
public class RecipeAPI {
    private RecipeService service;

    public RecipeAPI(RecipeService service){
        this.service = service;
    }

    @GetMapping("")
    public ResponseEntity<List<Recipe>> allRecipes(){
        return new ResponseEntity<>(service.allRecipes(), HttpStatus.OK);
    }

    @GetMapping("{recipeName}")
    public ResponseEntity<Recipe> recipeByName(@PathVariable String recipeName){
        if(service.findRecipeByName(recipeName) == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(service.findRecipeByName(recipeName), HttpStatus.OK);
    }

    @GetMapping("filter")
    public List<Recipe> filterByVegan(@RequestParam boolean vegan){
        return service.filterByVegan(vegan);
    }

    @PostMapping("")
    public ResponseEntity<Recipe> addRecipe(@RequestBody Recipe recipe){
        if(!service.isValidRecipe(recipe)){
            //No response body, status code 400
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        //response body is saved recipe, status code 201
        return new ResponseEntity<>(service.addRecipe(recipe), HttpStatus.CREATED);
    }

    @PostMapping("add")
    public void addRecipe(@RequestParam String name, @RequestParam double servings,
                          @RequestParam int cookTime, @RequestParam boolean vegan){
        service.addRecipe(new Recipe(name, List.of(), servings, cookTime, vegan));
    }

    @PutMapping("")
    public ResponseEntity<Recipe> updateRecipe(@RequestBody Recipe updatedRecipe){
        //not found
        if(service.findRecipeByName(updatedRecipe.getName()) == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        //invalid data
        else if(!service.isValidRecipe(updatedRecipe)){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        return new ResponseEntity<>(service.updateRecipe((updatedRecipe)), HttpStatus.OK);
    }

    @DeleteMapping("{recipeName}")
    public void deleteRecipe(@PathVariable String recipeName){
        service.deleteRecipe(recipeName);
    }
}

package edu.greenriver.sdev.cookingapp.services;

import edu.greenriver.sdev.cookingapp.model.Recipe;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RecipeService {
    private List<Recipe> recipes = new ArrayList<>(List.of(
            Recipe.builder()
                    .vegan(false)
                    .cookTime(45)
                    .name("Yellow Cake")
                    .ingredients(List.of(
                        "butter","oil","flour","sugar"
                    ))
                    .servings(15)
                    .build(),
            Recipe.builder()
                    .vegan(false)
                    .cookTime(15)
                    .name("Tacos")
                    .ingredients(List.of(
                            "ground beef","cheddar cheese","sour cream"
                    ))
                    .servings(6)
                    .build(),
            Recipe.builder()
                    .vegan(true)
                    .cookTime(20)
                    .name("Nigerian Rice")
                    .ingredients(List.of(
                            "bouillon cube","rice","carrots","peas"
                    ))
                    .servings(20)
                    .build()
    ));

    //GET requests (read)

    public List<Recipe> allRecipes(){
        return recipes;
    }

    public Recipe findRecipeByName(String recipeName){
        return recipes.stream()
                .filter(rec -> rec.getName().equalsIgnoreCase(recipeName))
                .findFirst()
                .orElse(null);
    }

    //POST requests (create)

    public Recipe addRecipe(Recipe newRecipe){
        recipes.add(newRecipe);
        return newRecipe;
    }

    //PUT requests (update)

    public Recipe updateRecipe(Recipe updatedRecipe){
        Recipe found = findRecipeByName(updatedRecipe.getName());

        if(found != null){
            found.setIngredients(updatedRecipe.getIngredients());
            found.setVegan(updatedRecipe.isVegan());
            found.setCookTime(updatedRecipe.getCookTime());
            found.setServings(updatedRecipe.getServings());
        }

        return found;
    }

    //DELETE requests (delete)

    public void deleteRecipe(String recipeName){
        //filter out just the matching recipe name
        recipes = recipes.stream()
                .filter(rec -> !rec.getName().equalsIgnoreCase(recipeName))
                .toList();
    }

    public List<Recipe> filterByVegan(boolean vegan){
        return recipes.stream()
                .filter(recipe -> recipe.isVegan() == vegan)
                .toList();
    }

    public boolean isValidRecipe(Recipe recipe) {
        return recipe.getName() != null && !recipe.getName().isEmpty();
    }
}

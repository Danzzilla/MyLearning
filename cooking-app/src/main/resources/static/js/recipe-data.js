//run this function on page load
window.onload = function(){
    //load the recipes
    loadRecipes();

    //add form event handlers
    addFormHandler();
}

function loadRecipes(){
    let uri = "http://localhost:8080/recipes";
    let params = {
        method: "get"
    };

    fetch(uri, params)
        .then(function(response){
            console.log(response);
            return response.json();
        })
        .then(function(json){
            console.log(json);
            showRecipes(json);
        })
}

function addFormHandler(){
    let formButton = document.querySelector("button");
    formButton.onclick = handleFormSubmit;
}

function handleFormSubmit(event){
    //stop the form from submitting
    event.preventDefault();

    let newRecipe = {
        name: document.getElementById("name").value,
        servings: document.getElementById("servings").value
    };

    let uri = "http://localhost:8080/recipes";
    let params = {
        method: "post",
        body: JSON.stringify(newRecipe),
        headers: {
            "Content-Type": "application/json"
        }
    }

    fetch(uri, params)
        .then(function(response){
            console.log(response);
        });

}

function showRecipes(recipes){
    //get our list
    let list = document.getElementById("recipes");

    //loop over all our recipes
    for (let i = 0; i < recipes.length; i++) {
        //add recipe to the list
        let recipe = recipes[i];
        let name = recipe.name;

        //create element using function on document
        let li = document.createElement("li");
        li.innteHTML = name;

        //add spans
        let servingSpan = document.createElement("span");
        let timeSpan = document.createElement("span");

        servingSpan.className = "servings";
        timeSpan.className = "cook-time";

        servingSpan.innerHTML = recipe.servings + " servings";
        timeSpan.innerHTML = recipe.cookTime + " minutes";

        li.appendChild(servingSpan);
        li.appendChild(timeSpan);

        //attach the li to the DOM
        list.appendChild(li);

        //

    }
}


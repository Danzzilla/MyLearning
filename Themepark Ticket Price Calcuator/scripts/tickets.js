/*
    This file calculates the cost of theme park tickets when
    the user clicks the calculate button.
    Author: Daniel Svirida 
    File: Themepark ticket calculator
    Date: 10/6/21
*/

let output = document.getElementById("output");

let button = document.querySelector("button");
button.onclick = function(event) {
    //prevent the form from submitting
    event.preventDefault();

    //Load in variables / refresh variables used
    //assign input and drop down elements to variables
    let adultCost = document.getElementById("adultCost");
    let childCost = document.getElementById("childCost");
    let adultQuantity = document.getElementById("adultQuantity");
    let childQuantity = document.getElementById("childQuantity");
    let result;
 
    //1. if the user didnt input a number
    //2. if the user inputted letters
    //3. if the user inputted everything correctly
    if(adultCost.value == ""){
       adultCost = adultCost.placeholder; 
    } else if(isNaN(parseFloat(adultCost.value))){
        alert("Please use numbers");
    } else {
        adultCost = parseFloat(adultCost.value);
    }

    //1. if the user didnt input a number
    //2. if the user inputted letters
    //3. if the user inputted everything correctly
    if(childCost.value == ""){
        childCost = childCost.placeholder; 
    } else if(isNaN(parseFloat(childCost.value))){
         alert("Please use numbers");
    } else {
         childCost = parseFloat(childCost.value);
    }

    //asigning drop down values to variables
    adultQuantity = parseInt(adultQuantity.value);
    childQuantity = parseInt(childQuantity.value);

    //calculation of total ticket cost
    result = (adultCost * adultQuantity) + (childCost * childQuantity);

    //outputing in a string the ticket cost to a div element with the id "output"
    output.innerHTML = `Total cost for tickets: $${result}`;
}
/*
    Daniel Svirida
    10/15/2021
    script.js

    Javascript file responsible for all the calculations 
    and outputs in the calorie tracker 
*/

//this registers the button click events when the
//page loads
window.onload = function() {
    //register button events when the page loads
    document.getElementById("lbs-to-kgs").onclick = lbsToKgs;
    document.getElementById("workout-to-met").onclick = workoutToMet;
    document.getElementById("calc-calories").onclick = calculateCalories;
}

//convert lbs to kgs from the input fields in the
//page and send output to the console
function lbsToKgs(){
    let pounds = document.getElementById("lbs").value;
    let field = document.getElementById("kgs");
    let kg;

    if(!isNaN(parseFloat(pounds))){
        kg = parseFloat(pounds) * 0.453592;
        kg = kg.toFixed(2);

        output(`${pounds} pounds is ${kg} kilograms`);
        field.value = kg;
    } else {
        output(`Pounds field is empty!`);
    }
}

//determine MET value for exercises in the dropdown
//list and send output to the console
function workoutToMet(){
    let exercise = document.getElementById("workouts").value;
    let field = document.getElementById("met");

    switch(exercise){
        case "Walking":
            output(`${exercise} has a MET value of 3.0`);
            field.value = `3.0`;
            break;
        case "Running":
            output(`${exercise} has a MET value of 8.3`);
            field.value = `8.3`;
            break
        case "Biking":
            output(`${exercise} has a MET value of 8.5`);
            field.value = `8.5`;
            break;
        case "Swimming":
            output(`${exercise} has a MET value of 6.0`);
            field.value = `6.0`;
            break;
        case "Skiing":
            output(`${exercise} has a MET value of 7.0`);
            field.value = `7.0`;
            break;
        case "Snowboarding":
            output(`${exercise} has a MET value of 4.3`);
            field.value = `4.3`;
            break;
        case "Snowmobiling":
            output(`${exercise} has a MET value of 3.5`);
            field.value = `3.5`;
            break;
        case "Soccer":
            output(`${exercise} has a MET value of 7.0`);
            field.value = `7.0`;
            break;
        default:
            output(`Please select a workout type!`);
    }
}

//Calculates the calories burned per minute, given
//the inputs from the page and sends the output
//to the console
function calculateCalories(){
    let met = document.getElementById("met").value;
    let kg = document.getElementById("kgs").value;

    console.log(parseFloat(met));
    console.log(parseFloat(kg));

    if(isNaN(parseFloat(met)) && isNaN(parseFloat(kg))){
        output(`MET field and Kilogram field is empty!`);
    } 
    else if(isNaN(parseFloat(met))){
        output(`MET field is empty!`);
    } 
    else if(isNaN(parseFloat(kg))){
        output(`Kilogram field is empty!`);
    }
    else{
        met = parseFloat(met);
        kg = parseFloat(kg);

        let cal = (met * 3.5 * kg) / 200;
        cal = cal.toFixed(2);

        output(`MET ${met}, weight ${kg} kg -- burns ${cal} calories per minute`);
    }
}

//this function takes the provided message and prints
//it to the console on the page
function output(message){
    let console = document.getElementById("console");
    console.innerHTML = message + "\n" + console.innerHTML;
}
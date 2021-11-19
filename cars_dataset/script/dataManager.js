/*
Author: Daniel Svirida
filename: dataManager.js
date: 11/17/21

This file manages the data in the data.js file and
fills in fields throughout the page with car specifications
and facts
*/

"use strict";
//access to buttons
const previous = document.querySelector("#previous");
const next = document.querySelector("#next");

//access to info fields
const field1 = document.querySelector("#field1");
const field2 = document.querySelector("#field2");
const field3 = document.querySelector("#field3");
const field4 = document.querySelector("#field4");
const field5 = document.querySelector("#field5");
const field6 = document.querySelector("#field6");
const field7 = document.querySelector("#field7");

//access to interesting facts fields
const data_num = document.querySelector("#data_num");
const fact1 = document.querySelector("#fact1");
const fact2 = document.querySelector("#fact2");
const fact3 = document.querySelector("#fact3");
const fact4 = document.querySelector("#fact4");

//index of current object
let index = 0;

//fills in all the fields
start();

//previous button
previous.onclick = function(){
    if(index > 0){
        index--;
        display();
    } else {
        index = cars.length - 1;
        display();
    }
}

//next button
next.onclick = function(){
    if(index < cars.length - 1){
        index++;
        display();
    } else {
        index = 0;
        display();
    }
}

//displays record in array at current index
function display(){
    field1.innerHTML = cars[index]["Identification"]["ID"];
    field2.innerHTML = `Driveline: ${cars[index]["Engine Information"]["Driveline"]}`;
    field3.innerHTML = `Engine: ${cars[index]["Engine Information"]["Engine Type"]}`;
    field4.innerHTML = `Transmission: ${cars[index]["Engine Information"]["Transmission"]}`;
    field5.innerHTML = `Fuel Type: ${cars[index]["Fuel Information"]["Fuel Type"]}`;
    field6.innerHTML = `City MPG: ${cars[index]["Fuel Information"]["City mpg"]}`;
    field7.innerHTML = `Highway MPG: ${cars[index]["Fuel Information"]["Highway mpg"]}`;
}

//starts off the page with all the fields filled in
function start(){
    display();

    data_num.innerHTML = cars.length;
    fact1.innerHTML = hpAverage().toFixed(2);
    fact2.innerHTML = mercedesCount();
    let slowest_car = slowestCar();
    fact3.innerHTML = slowest_car["Identification"]["ID"];
    let drift_car = driftPotential();
    fact4.innerHTML = drift_car["Identification"]["ID"];
}

//finds the average horsepower of cars in database
function hpAverage(){
    let sum = 0;
    for(let i = 0; i < cars.length - 1; i++){
        sum += cars[i]["Engine Information"]["Engine Statistics"]["Horsepower"];
    }
    let hpAverage = sum / cars.length;

    return hpAverage;
}

//finds number of mercedes in database
function mercedesCount(){
    let count = 0;
    for(let i = 0; i < cars.length - 1; i++){
        if(cars[i]["Identification"]["Make"].substring(0, 8) == "Mercedes") count++;
    }
    return count;
}

//finds slowest car in database
function slowestCar(){
    let stored_car = cars[0];
    for(let i = 0; i < cars.length - 1; i++){
        if(cars[i]["Engine Information"]["Engine Statistics"]["Horsepower"] < stored_car["Engine Information"]["Engine Statistics"]["Horsepower"]){
            stored_car = cars[i];
        }
    }
    return stored_car;
}

//finds car with highest drift potential
function driftPotential(){
    let stored_car = cars[0]
    for(let i = 0; i < cars.length - 1; i++){
        if((cars[i]["Engine Information"]["Driveline"] === "Rear-wheel drive") &&
        ((cars[i]["Engine Information"]["Transmission"] === "6 Speed Manual") || (cars[i]["Engine Information"]["Transmission"] === "5 Speed Manual"))&&
        (cars[i]["Engine Information"]["Engine Statistics"]["Torque"] > stored_car["Engine Information"]["Engine Statistics"]["Torque"])){
            stored_car = cars[i];
        }
    }
    return stored_car;
}
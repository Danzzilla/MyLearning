'use strict';

/*
let hasDriversLicense = false;
const passTest = true;

if(passTest) hasDriversLicense = true;
if(hasDriversLicense) console.log("I can drive!");

//const interface = "Audio";
//const private = 534;

function logger(){
    console.log("My name is Daniel");
}

// calling / running / invoking function
logger();
logger();
logger();

function fruitProcessor(apples, oranges){
    const juice = `Juice with ${apples} apples and ${oranges} oranges.`;
    return juice;
}

const appleJuice = fruitProcessor(5, 0);
console.log(appleJuice);

const appleOrangeJuice = fruitProcessor(2, 4);
console.log(appleOrangeJuice);

const num = Number("23");

const age1 = calcAge1(2002);
//console.log(age1);

function calcAge1(birthYear){
    return 2021 - birthYear;
}

const calcAge2 = function(birthYear){
    return 2021 - birthYear;
}

const age2 = calcAge2(2002);
console.log(age1, age2);

//function expression
const calcAge2 = function(birthYear){
    return 2021 - birthYear;
}

//Arrow function
const calcAge3 = birthYear => 2021 - birthYear;

const age3 = calcAge3(2002);
console.log(age3);

const yearsUntilRetirement = (birthYear, firstName) => {
    const age = 2021 - birthYear;
    const retirement = 65 - age;
    //return retirement;
    return `${firstName} retires in ${retirement} years`;
}

console.log(yearsUntilRetirement(2002, "Daniel"));
console.log(yearsUntilRetirement(1991, "Jonas"));

function cutFruitPieces(fruit){
    return fruit * 3;
}

function fruitProcessor(apples, oranges){
    const applePieces = cutFruitPieces(apples);
    const orangePieces = cutFruitPieces(oranges);

    const juice = `Juice with ${applePieces} apple pieces and ${orangePieces} orange pieces.`;
    return juice;
}

console.log(fruitProcessor(2, 3));

function calcAge(birthYear){
    return 2021 - birthYear;
}

function yearsUntilRetirement(birthYear, firstName){
    const age = 2021 - birthYear;
    const retirement = 65 - age;
    //return retirement;
    if(retirement > 0){
        console.log(`${firstName} retires in ${retirement} years`);
        return retirement;
    } else {
        console.log(`${firstName} has already retired`);
        return -1;
    }
}

console.log(yearsUntilRetirement(2002, "Daniel"));
console.log(yearsUntilRetirement(1950, "Mike"));

const friend1 = "Michael";
const friend2 = "Steven";
const friend3 = "Peter";

const friends = ["Michael", "Steven", "Peter"];
console.log(friends);

const y = new Array(1991, 1984, 2008, 2020);

console.log(friends[0]);
console.log(friends[2]);

console.log(friends.length);
console.log(friends[friends.length - 1]);

friends[2] = "Jay";
console.log(friends);
//friends = ["Bob", "Alice"]; //Not allowed

const firstName = "Daniel";
const daniel = [firstName, "Svirida", 2021 - 2002, "Student", friends];

console.log(daniel);
console.log(daniel.length);

//Exercise
function calcAge(birthYear){
    return 2021 - birthYear;
}

const years = [1990, 1967, 2002, 2010, 2018];

const age1 = calcAge(years[0]);
const age2 = calcAge(years[1]);
const age3 = calcAge(years[years.length - 1]);
console.log(age1, age2, age3);

const ages = [calcAge(years[0]), calcAge(years[1]), calcAge(years[years.length - 1])];
console.log(ages);
*/

const friends = ["Michael", "Steven", "Peter"];

//Add elements
const newLength = friends.push("Jay");
console.log(friends);
console.log(newLength);

friends.unshift("John");
console.log(friends);

//Remove elements
friends.pop(); //Last
const popped = friends.pop();
console.log(popped);
console.log(friends);

friends.shift(); //First
console.log(friends);

console.log(friends.indexOf("Steven"));
console.log(friends.indexOf("Bob"));

friends.push(23);
console.log(friends.includes("Steven"));
console.log(friends.includes("Bob"));
console.log(friends.includes(23));

if(friends.includes("Steven")){
    console.log("You have a friends called Steven");
}
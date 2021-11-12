"use strict";
console.log("Number 1-------------------");
console.log();

let sumArray = [2, 4, 8, 1, 4, 5, 9, 10];
let sum = 0;

for(let i = 0; i < sumArray.length; i++){
    sum += sumArray[i];
}

console.log("Array: " + sumArray);
console.log("Sum: " + sum);
console.log();

console.log("Number 2-------------------");
console.log();

let smallestArray = [4, 3, 6, 7, 1, 2, 4, 8, 9, 10, 3, 12];
let smallest;

for(let i = 0; i < smallestArray.length; i++){
    let temp = smallestArray[i];

    if(i === 0){
        smallest = temp;
    } else if (temp < smallest){
        smallest = temp;
    }
}

console.log("Array: " + smallestArray);
console.log("Smallest: " + smallest);
console.log();

console.log("Number 3-------------------");
console.log();

let index;

for(let i = 0; i < smallestArray.length; i++){
    let temp = smallestArray[i];

    if(i === 0){
        smallest = temp;
        index = i;
    } else if (temp < smallest){
        smallest = temp;
        index = i;
    }
}

console.log("Array: " + smallestArray);
console.log("Smallest: " + smallest);
console.log("Index: " + index);
console.log()

console.log("Number 4-------------------");
console.log();

let wordArray = [];
for(let i = 0; i < 5; i++){
    wordArray.push(prompt("Enter an English word"));
}

for(let i = 0; i < wordArray.length; i++){
    console.log(`[${i}] = ${wordArray[i]}`);
}
console.log();

console.log("Number 5-------------------");
console.log();

let myString = prompt("Enter a sentence");

let stringArray = myString.split(" ");

console.log(stringArray.length);

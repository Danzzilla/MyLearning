//print some output to verify our script is working
console.log("This script is working");
console.log("Written by Daniel");
console.log(); //empty line

//Create a few variables using differnt data types
let title = "Interstellar";
let year = 2014
let minutes = 165.5
let genre = "Sci-Fi";
let likeIt = true;

console.log("Title: " + title);
console.log("Year: " + year);
console.log("Minutes: " + minutes);
console.log("Genre: " + genre);
console.log("Did I like it? " + likeIt);
console.log();

//we use the typeof operator to print out the data type of a variable
console.log(typeof title);
console.log(typeof year);
console.log(typeof minutes);
console.log(typeof genre);
console.log(typeof likeIt);

let movieDetail = "Saw";
console.log("Title: " + movieDetail);

movieDetail = 2003;
console.log("Year: " + movieDetail);

movieDetail = 103; //minutes
movieDetail = false; //Did I like it?
console.log("Other detail: " + movieDetail);


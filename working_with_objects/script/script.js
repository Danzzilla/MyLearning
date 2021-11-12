"use strict"
console.log("*************Book Practice**************");
console.log("");

let book = {
    title: "The Bible",
    author: "Many authors",
    pages: 2228,
    synopsis: "A written witness of God's impact on nations. A written witness of "+
    "God's life when he came down to earth in the form of a human being. God's love letter.",
    format: "Any",
    genre: ["Narrative", "Poetry", "Wisdom", "Prophecy", "Gospels", "Epistles", "Apocalypse"]
}

function printBook(){
    console.log(`${book.title} (${book.author})`);
    console.log("---------------------------------------");
    console.log(`Pages: ${book.pages}`);
    console.log(`Format: ${book.format}`);
    console.log(`Synopsis: ${book.synopsis}`);
    console.log(`Genres: ${book.genre}`);
    console.log("---------------------------------------");
}

printBook();

console.log("");
console.log("************Point Practice*************");
console.log("")

let plane = {
    name: "Cartesian Plane",
    origin:{
        x: 0,
        y: 0
    },
    points: [
        {x: 2, y: 4},
        {x: 1, y: 1},
        {x: -3, y: 2},
        {x: 0, y: 1}
    ],
    onAnAxis: function(x, y){
        return x == 0 || y == 0;
    },
    distance: function(point1, point2){
        return Math.sqrt(
            (point1.x - point2.x) ** 2 +
            (point1.y - point2.y) ** 2);
    }
}

let point1 = {
    x: 3,
    y: 2
}

let point2 = {
    x: 13,
    y: -4
}

function printPlane(){
    console.log(plane.name);
    console.log("---------------------------------------");
    console.log(`Origin: (${plane.origin.x}, ${plane.origin.y})`);
    for(let i = 0; i < plane.points.length; i++){
        console.log(`Point ${i + 1}: (${plane.points[i].x}, ${plane.points[i].y})`);
    }
    console.log(`Distance: ${plane.distance(point1, point2)}`);
    console.log("---------------------------------------");
}

printPlane();
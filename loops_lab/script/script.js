let string = "";
for(let i = 1; i <= 8; i++){
    string = string + i;
    if(i < 8){
        string = string + ", ";
    }
}
console.log(`1 For: ${string}`);


string = "";
for(let i = 1; i <= 5; i++){
    string = string + (i * 4);
    if(i < 5){
        string = string + ", ";
    }
}
console.log(`1 For: ${string}`);


string = "";
for(let i = 7; i >= 1; i--){
    string = string + i;
    if(i > 1){
        string = string + ", ";
    }
}
console.log(`1 For: ${string}`);


string = "";
for(let i = 7; i <= 448; i *= 2){
    string = string + i;
    if(i <= 224){
        string = string + ", ";
    }
}
console.log(`1 For: ${string}`);
console.log("");

//--------------------------------------------------

string = "";
for(let i = 1; i <= 10; i++){
    string = string + (i * 3) + " ";
}
console.log(`2 For: ${string}`);


string = "";
for(let i = 64; i >= 1; i /= 2){
    string = string + i;
    if(i > 1){
        string = string + ", ";
    }
}
console.log(`2 For: ${string}`);


string = "";
for(let i = 1; i <= 10; i++){
    string = string + "e";
}
console.log(`2 For: ${string}`);
console.log("");

//---------------------------------------------------

let num = prompt("Enter a positive number");
if(isNaN(parseInt(num))){
    console.log("Error during take-off");
} else {
    string = "";
    for(num = parseInt(num); num >= 1; num--){
        string = string + num + ", ";
        if(num <= 1){
            string = string + "..., n, Blast-off!";
        }
    }
    console.log(`3 For: ${string}`);
}

console.log("");

//-----------------------------------------------------

string = "";
let total = 0;
for(let i = 1; i <= 100; i++){
    total = total + i;
    if(i < 100){
        string = string + i + " + ";
    } else {
        string = string + i + " = " + total;
    }
}
console.log(`4 For: ${string}`);
console.log("");
console.log("");

//------------------------------------------------------
//------------------------------------------------------

string = "";
total = 1;
num = 1;
while(num <= 9){
    total = total * num;

    if(num < 9){
        string = string + num + " * ";
    } else {
        string = string + num + " = " + total;
    } 

    num++;
}
console.log(`1 While: ${string}`);
console.log("");

//-------------------------------------------------------

while(!confirm("Are we there yet??")){
    console.log("2 While: Not yet!");
}
console.log("");

//-------------------------------------------------------

num = prompt("Enter a number");
while(num.toLowerCase() != "stop"){
    if(!isNaN(parseInt(num))){
        console.log("3 While: " + num);
    } else {
        console.log("3 While: Hey! That is not a number!");
    }

    num = prompt("Enter a number");
}
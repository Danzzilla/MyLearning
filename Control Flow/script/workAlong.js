/*
const age = 15;
//const isOldEnough = age >= 18;

if(age >= 18){
    console.log("Sarah can start driving liscense")
} else {
    const yearsLeft = 18 - age;
    console.log(`Sarah is too young. Wait another ${yearsLeft} years.`)
}

let century;
const birthYear = 1991;
if(birthYear <= 2000){
    century = 20;
} else {
    century = 21
}

console.log(century);

const inputYear = '1991';
console.log(Number(inputYear), inputYear);
console.log(Number(inputYear) + 18);

console.log(Number('Jonas'));
console.log(typeof NaN);

console.log(String(23), 23);

//type coercion
console.log('I am ' + 23 + ' years old');
console.log('23'+'10' + 3);
console.log('23' / '2');
console.log('23' > '18');

let n = '1' + 1;
n = n - 1;
console.log(n);

// in console

//2+3+4+'5'
//'10' - '4' - '3' - 2 + '5'

//5 falsy values: 0, '', undefined, null, NaN

console.log(Boolean(0));
console.log(Boolean(undefined));
console.log(Boolean("Jonas"));
console.log(Boolean({}));
console.log(Boolean(""));

const money = 100;
if(money){
    console.log("Don't spend it all ;)");
} else {
    console.log("You should get a job!");
}

let height = 0;
if (height){
    console.log("Yay! Height is defined!");
} else {
    console.log("Height is UNDEFINED");
}

const age = 18;
if(age === 18) console.log("You just became an adult :D (Strict)");

if(age == 18) console.log("You just became an adult :D (Loose)");

//in console
//18 === 18
// returned true

//18 === 19
//returned false

//'18' == 18
//returned true

//'18' === 18
//returned false

const favourite = Number(prompt("What's your favorite number?"));
console.log(favourite);
console.log(typeof favourite);

if (favourite === 23){ 
    console.log("Cool! 23 is an amazing number!");
} else if (favourite === 7) {
    console.log("7 is also a cool number");
} else if (favourite === 9) {
    console.log("9 is also a cool number");
}else {
    console.log("Number is not 23 or 7 or 9");
}

if(favourite !== 23) console.log("Why not 23?");

const hasDriversLicense = true; //A
const hasGoodVision = true; //B

console.log(hasDriversLicense && hasGoodVision);
console.log(hasDriversLicense || hasGoodVision);
console.log(!hasDriversLicense);

//const shouldDrive = hasDriversLicense && hasGoodVision;

//if (shouldDrive){
//    console.log("Sarah is able to drive")
//} else {
//    console.log("Someone else should drive...");
//}

const isTired = false; //C
console.log(hasDriversLicense && hasGoodVision && isTired);

if(hasDriversLicense && hasGoodVision && !isTired){
    console.log("Sarah is able to drive!");
} else {
    console.log("Someone else should drive...");
}

const day = "monday";
switch(day){
    case"monday": //day === monday
        console.log("Plan course structure");
        console.log("Go to coding meetup");
        break;
    case "tuesday":
        console.log("Prepare theory videos");
        break;
    case "wednesday":
    case "thursday":
        console.log("Write code examples");
        break;
    case "friday":
        console.log("Record videos");
        break;
    case "saturday":
    case "sunday":
        console.log("Enjoy the weekend");
        break;
    default:
        console.log("Not a valid day");
}

if(day === "monday"){
    console.log("Plan course structure");
    console.log("Go to coding meetup");
} else if(day === "tuesday"){
    console.log("Prepare theory videos");
}else if(day === "wednesday" || day === "thursday"){
    console.log("Write code examples");
} else if(day === "friday"){
    console.log("Record videos");
} else if(day === "saturday" || day === "sunday"){
    console.log("Enjoy the weekend");
} else {
    console.log("Not a valid day");
}

3 + 4
1991
true && false && !false

if(23 > 10){
    const str = "23 is bigger";
}

const me = "Jonas";
console.log(`I'm ${2037-1991} years old ${me}`);

*/

const age = 15;
age >= 18 ? console.log("I can drink wine"):
console.log("I can drink water");

const drink = age >= 18 ? "wine" : "water";
console.log(drink);

let drink2;
if(age >= 18){
    drink2 = "wine";
} else {
    drink2 = "water";
}
console.log(drink2);

console.log(`I can drink ${age >= 18 ? "wine" : "water"}`);
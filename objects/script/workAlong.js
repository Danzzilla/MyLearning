/*
const jonas = {
    firstName: "Jonas",
    lastName: "Schmedtmann",
    age: 2021 - 1991,
    job: "teacher",
    friends: ["Michael", "Peter", "Steven"]
}

console.log(jonas);

console.log(jonas.lastName);
console.log(jonas["lastName"]);

const nameKey = "Name";
console.log(jonas["first" + nameKey]);
console.log(jonas["last" + nameKey]);

//console.log(jonas."last" + nameKey); Will not work

const interestedIn = prompt("What do you want to know about Jonas? Choose between firstName, lastName, age, job, and friends");
console.log(jonas[interestedIn]);

if(jonas[interestedIn]){
    console.log(jonas[interestedIn]);
} else {
    console.log("Wrong request! Choose between firstName, lastName, age, job, and friends");
}

jonas.location = "Portugal";
jonas["twitter"] = "@joasschmedtman";
console.log(jonas);

//Challenge
//Jonas has 3 friends, and his best friend is Michael
console.log(`${jonas.firstName} has ${jonas.friends.length} friends, and his best friend is called ${jonas.friends[0]}`);

const jonas = {
    firstName: "Jonas",
    lastName: "Schmedtmann",
    birthYear: 1991,
    job: "teacher",
    friends: ["Michael", "Peter", "Steven"],
    hasDriversLicense: true,

    //calcAge: function(birthYear){
    //    return 2021 - birthYear;
    //}
    
    // calcAge: function(){
    //     return 2021 - this.birthYear;
    // }

    calcAge: function(){
        this.age = 2021 - this.birthYear;
        return this.age;
    },

    getSummary: function() {
        return `${this.firstName} is a ${this.calcAge()}-year old ${this.job}, and he has ${this.hasDriversLicense ? "a" : "no"} driver's license.`;
    }
}

// console.log(jonas.calcAge(1991));
// console.log(jonas["calcAge"](1991));

//console.log(jonas.calcAge());

console.log(jonas.calcAge());
console.log(jonas.age);

//Challenge
//Jonas is a 46 year old teacher, and he has a drivers license
console.log(jonas.getSummary());

// console.log("lifting weights repetition 1");
// console.log("lifting weights repetition 2");
// console.log("lifting weights repetition 3");
// console.log("lifting weights repetition 4");
// console.log("lifting weights repetition 5");
// console.log("lifting weights repetition 6");
// console.log("lifting weights repetition 7");
// console.log("lifting weights repetition 8");
// console.log("lifting weights repetition 9");
// console.log("lifting weights repetition 10");

for(let rep = 1; rep <= 10; rep++){
    console.log(`Lifting weights repetition ${rep}`);
}

const jonas = [
    "Jonas",
    "Schmedtmann",
    2021 - 1991,
    "teacher",
    ["Michael", "Peter", "Steven"],
    true
];

const types = [];

for(let i = 0; i < jonas.length; i++){
    //reading from jonas array
    console.log(jonas[i], typeof jonas[i]);

    //filling types array
    //types[i] = typeof jonas[i];
    types.push(typeof jonas[i]);
}

console.log(types);

const years = [1991, 2007, 1969, 2003];
const ages = [];

for(let i = 0; i < years.length; i++){
    ages.push(2021 - years[i]);
}

console.log(ages);

//continue and break
console.log("----Only Strings----");
for(let i = 0; i < jonas.length; i++){
    if(typeof jonas[i] !== "string") continue;

    console.log(jonas[i], typeof jonas[i]);
}

console.log("----Break with Number----");
for(let i = 0; i < jonas.length; i++){
    if(typeof jonas[i] === "number") break;

    console.log(jonas[i], typeof jonas[i]);
}

const jonas = [
    "Jonas",
    "Schmedtmann",
    2021 - 1991,
    "teacher",
    ["Michael", "Peter", "Steven"],
    true
];

for(let i = jonas.length - 1; i >= 0; i--){
    console.log(jonas[i]);
}

for(let exercise = 1; exercise < 4; exercise++){
    console.log(`------Starting Exercise ${exercise}`);

    for(let rep = 1; rep < 6; rep++){
        console.log(`Exercise ${exercise}: Lifting weight repetition ${rep}`);
    }
}
*/

for(let rep = 1; rep <= 10; rep++){
    console.log(`Lifting weights repetition ${rep}`);
}

let rep = 1;
while(rep <= 10){
    console.log(`WHILE: Lifting weights repetition ${rep}`);
    rep++;
}

let dice = Math.trunc(Math.random() * 6) + 1;
console.log(dice);

while(dice !== 6){
    console.log(`You rolled a ${dice}`);
    dice = Math.trunc(Math.random() * 6) + 1;
    if(dice ===6) console.log("Loop is about to end...");
}
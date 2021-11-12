//read in the user inputs
let breakfast = prompt("What did you eat for breakfast?");
let exercise = confirm("Did you exercise today? (ok = yes, cancel = no)");

breakfast = breakfast.toLowerCase();

//guess their personality
if(breakfast === "eggs"){
    if(exercise){
        alert("You are silly");
    } else {
        alert("You are brave")
    }
}

if(breakfast === "cereal"){
    if(exercise){
        alert("You are smart");
    } else {
        alert("You are melo-dramatic");
    }
}

if(breakfast === "pancakes"){
    if(exercise){
        alert("You are watchful");
    } else {
        alert("You are unwise");
    }
}

if(breakfast ==="fruit"){
    alert("You are wise");
}
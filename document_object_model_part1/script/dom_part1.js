'use strict';
/*
console.log(document.querySelector(".message").textContent);
document.querySelector(".message").textContent = "Correct Number!";

document.querySelector(".number").textContent = 13;
document.querySelector(".score").textContent = 10;

document.querySelector(".guess").value = 23;
console.log(document.querySelector(".guess").value);
*/

const secretNumber = Math.trunc(Math.random() * 20) + 1;
let score = 20;
let highschore = 0;

document.querySelector(".number").textContent = secretNumber;

document.querySelector(".check").addEventListener("click", function() {
    const guess = Number(document.querySelector(".guess").value);
    console.log(guess, typeof guess);

    if(!guess){
        if(score > 1){
            document.querySelector(".message").textContent = "No Number!";
        } else {
            document.querySelector(".message").textContent = "You lost the Game!";
            document.querySelector(".score").textContent = 0;
        }
    } else if(guess === secretNumber){
        if(score > 1){
            document.querySelector(".message").textContent = "Correct Number!";

            document.querySelector("body").style.backgroundColor = "#60b347"
            document.querySelector(".number").style.width = "30rem";
        } else {
            document.querySelector(".message").textContent = "You lost the Game!";
            document.querySelector(".score").textContent = 0;
        }

        if(score > highschore){
            highschore = score;
            document.querySelector(".highscore").textContent = highscore;
        }
    } else if(guess > secretNumber){
        if(score > 1){
            document.querySelector(".message").textContent = "Too High!";
            score--;
            document.querySelector(".score").textContent = score;
        } else {
            document.querySelector(".message").textContent = "You lost the Game!";
            document.querySelector(".score").textContent = 0;
        }
    } else if(guess < secretNumber){
        if(score > 1){
            document.querySelector(".message").textContent = "Too Low!";
            score--;
            document.querySelector(".score").textContent = score;
        } else {
            document.querySelector(".message").textContent = "You lost the Game!";
            document.querySelector(".score").textContent = 0;
        }
    }
});


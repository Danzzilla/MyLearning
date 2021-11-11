//Using <script> tag to add some Javascript
//code to the web page
let one = 11;
let two = 7;
				
//perform a calculation
let result = one + two;
				
//show the user the result in a popup box
alert("My result was " + result);

//show the result on the browser console
console.log("My result was " + result);

//send the output to the web page HTML
let paragraph = document.querySelector("#result");
paragraph.innerHTML = "My result was " + result;
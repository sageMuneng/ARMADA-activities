// Task 1: Custom Array Filter ----------------------------
function customFilter(arr, callback) {
    // Your code here

    // i declared an empty array
    let evenNums = [];
    for (let i in arr) {
        // if the callback returns true it will push the value of arr[i] in the temporary array
        if (callback(arr[i])) {
            evenNums.push(arr[i]);
        }
    }

    // after the loop it will return the evenNums array then output its values
    return evenNums;
}

function isEven(num) {
    return num % 2 === 0;
}

var numbers = [1, 2, 3, 4, 5, 6];
var evenNumbers = customFilter(numbers, isEven);
console.log(evenNumbers);  // Output: [2, 4, 6]


// Task 2: Countdown Timer ----------------------------
function countdown(start, callback) {
    // Your code here
    // here i created a conditional statement where if start is greater than or  equal to 0, it will proceed 
    if(start >= 0){
        // then it will call the function displayNumber that console log the start number
        callback(start);

        // here i put a Timer of 1 second to decrement the value of the start then call the countdown function again
        setTimeout(() => {
            start--;
           countdown(start, displayNumber);
        },1000);
    }
}

function displayNumber(num) {
    console.log(num);
}

countdown(5, displayNumber);  // Output: 5 4 3 2 1 0 (with 1-second delay between each)

// Task 3: Simple Event Listener ------------------------------------------------------------------- 
function createButton(buttonText, callback) {
    // Your code here
    // here i added an event listener that if the user click the button in the index.html it will call the callback with the text
    document.getElementById("click_button").addEventListener("click", function () {
        callback(buttonText);
    });
}

function buttonClicked() {
    console.log("Button Clicked!");
}

createButton("Click Me", buttonClicked);  


// Task 4: Task Runner ------------------------------------------------------------------- 
function runTasks(tasks) {
    // Your code here
    
    // here i use for loops to iterate the tasks array
    for(let i = 0; i < tasks.length; i++){
        // then i use the setTimeout to delay the output
        setTimeout(() => {
            tasks[i]();
        },i * 1000);
        // to set the delay i use the i, so 0* 1000 is 0ms
        // 1 * 1000 is 1ms
        // 2 * 1000 is 2ms
    }
}

function task1() {
    console.log("Task 1 completed");
}

function task2() {
    console.log("Task 2 completed");
}

function task3() {
    console.log("Task 3 completed");
}

runTasks([task1, task2, task3]);  

// Task 5: Interactive Quiz Game (Extra Miles) ------------------------------------------------------------------- 
function askQuestion(question, choices, correctAnswer, callback) {
    // Your code here
    // here i output first the question then by using backtick i output also the choices array,
    console.log(`${question} 
    choices: ${choices}`);
    
    // then i declare a userAnswer variable to set the users answer
    let userAnswer = "4";
    console.log(`user's answer: ${userAnswer}`);
    
    // then i use the call back if userAnswer is equal to correct answer
    callback(userAnswer == correctAnswer);
}

function checkAnswer(isCorrect) {
    if (isCorrect) {
        console.log("Correct!");
    } else {
        console.log("Wrong!");
    }
}

askQuestion("What is 2 + 2?", ["1", "2", "3", "4"], "4", checkAnswer);
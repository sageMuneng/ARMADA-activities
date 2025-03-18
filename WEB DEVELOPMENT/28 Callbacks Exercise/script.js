// // Exercise 1: Writing Your First Callback Function --------------------------------------
function calculate(num1, num2, operation) {
    return operation(num1, num2);
}

function add(a, b) {
    return a + b;
}
function subtract(a, b) {
    return a - b;
}

function multiply(a, b) {
    return a * b;
}

function divide(a, b) {
    return a / b;
}

console.log(calculate(5, 3, add));      // Output: 8
console.log(calculate(10, 9, subtract)); // Output: 1
console.log(calculate(4, 2, multiply)); // Output: 8
console.log(calculate(9, 2, divide)); // Output: 4.5


// Exercise 2: Using Callbacks with setTimeout --------------------------------------------
function delayedMessage(message,message2, delay, callback, callback2) {
    callback2(message2);

    setTimeout(() => {
        callback(message);
    }, delay);
}

delayedMessage("Hello, world!", "Loading...",2000, 
    function(msg) {
    console.log(msg);
}, function(msg){
    console.log(msg);
});


// Exercise 3: Handling Events with Callbacks --------------------------------------------
document.getElementById("clickMe").addEventListener("click", function () {
    alert('Button Clicked!')
});


// Exercise 4: Looping with Callbacks --------------------------------------------
function repeatTask(times,stop, callback) {
    for (let i = 0; i < times; i++) {
        if(stop != i){
            callback(i);
        }else{
            return false;
        }
    }
}

repeatTask(80, 20, function(index) {
    console.log("Iteration:", index);
});
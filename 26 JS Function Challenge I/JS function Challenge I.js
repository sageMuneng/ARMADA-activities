// CHALLENGE 1 --------------------------------------------------------
function calculateSum(arr) {
    let sum = 0;
    for (let i = 0; i < arr.length; i++) {
        sum += arr[i];
    }
    return sum;
}

let numbers = [1, 2, 3, 4];
console.log("Sum:", calculateSum(numbers));

// PREDICTION: "Sum:10"

// OUTPUT: "Sum:10"


// CHALLENGE 2 ---------------------------------------------------------
function isEven(num) {
    if (num % 2 === 0) {
        console.log
        return true;
    } else {
        return false;
    }
}

console.log(isEven(4));
console.log(isEven(7));
console.log(isEven(0));

// PREDICTION: true
        // false
        // true
        
// OUTPUT: true
        // false
        // true
// CHALLENGE 3 ---------------------------------------------------------
function greet(name) {
    return "Hello, " + name + "!";
}

function personalizedGreeting(names) {
    for (let i = 0; i < names.length; i++) {
        console.log(greet(names[i]));
    }
}

let friends = ["Alice", "Bob", "Charlie"];
personalizedGreeting(friends);

// PREDICTION: "Hello, Alice!"
        // "Hello, Bob!"
        // "Hello, Charlie!"

// OUTPUT: "Hello, Alice!"
        // "Hello, Bob!"
        // "Hello, Charlie!"

// CHALLENGE 4 ---------------------------------------------------------
function reverseArray(arr) {
    let reversed = [];
    for (let i = arr.length - 1; i >= 0; i--) {
        reversed.push(arr[i]);
    }
    return reversed;
}

let originalArray = [10, 20, 30];
console.log(reverseArray(originalArray));
console.log(originalArray);

// PREDICTION: 30, 20, 10
        // 10, 20, 30

// OUTPUT: 30, 20, 10
        // 10, 20, 30

// CHALLENGE 5 ---------------------------------------------------------
function multiplyMatrix(matrix) {
    for (let i = 0; i < matrix.length; i++) {
        for (let j = 0; j < matrix[i].length; j++) {
            matrix[i][j] *= 2;
        }
    }
    return matrix;
}

let matrix = [
    [1, 2],
    [3, 4],
];
console.log(multiplyMatrix(matrix));

// PREDICTION: [[2,4],[6,8]]


// OUTPUT: [[2,4],[6,8]]
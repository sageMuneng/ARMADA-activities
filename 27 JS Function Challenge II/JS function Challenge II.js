// CHALLENGE 1 --------------------------------------------------------

function generatePattern() {
    let result = "";
    for (let i = 1; i <= 3; i++) {
        for (let j = 1; j <= i; j++) {
            result += j + " ";
        }
        result += "\n";
    }
    return result;
}

console.log(generatePattern());

// PREDICTION: 
// 1
// 1 2
// 1 2 3

// OUTPUT: 
// 1
// 1 2
// 1 2 3


// CHALLENGE 2 ---------------------------------------------------------

function swapFirstLast(arr) {
    let first = arr.shift();
    let last = arr.pop();
    arr.unshift(last);
    arr.push(first);
    return arr;
}

let numbers = [10, 20, 30, 40];
console.log(swapFirstLast(numbers));
console.log(numbers);

// PREDICTION: [40,20,30,10]
            // [10,20,30,40]
// OUTPUT:[40,20,30,10]
    // [40,20,30,10]

// EXPLANATION: My prediction is incorrect because after calling the function it modifies that original array. Inside the function it swapped the first and last of array,
// amd in the end of the function is return so the array numbers is modified. 


// CHALLENGE 3 ---------------------------------------------------------

function filterPassingGrades(grades) {
    let passing = [];
    for (let grade of grades) {
        if (grade >= 70) {
            passing.push(grade);
        } else {
            passing.unshift(grade);
        }
    }
    return passing;
}

let scores = [85, 45, 90, 60];
console.log(filterPassingGrades(scores));

// PREDICTION: [60,45,85,90]
// OUTPUT: [60,45,85,90]


// CHALLENGE 4 ---------------------------------------------------------

function updateStatus(tasks) {
    for (let task of tasks) {
        task.completed = !task.completed;
    }
    return tasks;
}

let taskList = [
    { id: 1, completed: false },
    { id: 2, completed: true }
];

console.log(updateStatus(taskList));
console.log(taskList);

// PREDICTION: [{id: 1, completed: true}, {id: 2, completed: false}]
            // [{id: 1, completed: true}, {id: 2, completed: false}]
// OUTPUT: [{id: 1, completed: true}, {id: 2, completed: false}]
        // [{id: 1, completed: true}, {id: 2, completed: false}]


// CHALLENGE 5 ---------------------------------------------------------

function findValue(arr, target) {
    for (let i = 0; i < arr.length; i++) {
        if (arr[i] === target) {
            return `Found at index ${i}`;
        }
    }
    return "Not found";
}

let data = [5, 12, 8, 130, 44];
console.log(findValue(data, 12));
console.log(findValue(data, 100));

// PREDICTION: Found at index 1
            // Not found
// OUTPUT: Found at index 1
            // Not found
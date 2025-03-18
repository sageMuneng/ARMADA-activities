# CHALLENGE 1
```
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
```
|VARIABLE   |VALUE                                      |
|-----------|-------------------------------------------|
| `i      ` | `1 2 3                                  ` |
| `j      ` | `1, 1 12, 1 12 123                      ` |
| `result ` | `1 \n, 1 \n 1 \n2, 1 \n 1 \n2 1 \n2 \n3 ` |

### Prediction: 
``` 
1
1 2
1 2 3
```
#### Explanation: The function of this code is to generate a pattern with numbers. Inside the function declares a variable result with empty value, then a for loops that iterates from 1 to 3. Then a nested for loops that iterates with the value of i. Then it assign the value of j to the result with " ". After the nester for loops it adds a "\n" to create a new line. then after the loop it returns the result then console log the pattern.

### Output: 
``` 
1
1 2
1 2 3
```

# CHALLENGE 2
```
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
```
|VARIABLE    |VALUE              |
|------------|-------------------|
| `numbers ` | `10, 20, 30, 40 ` |
| `first   ` | `10             ` |
| `last    ` | `40             ` |

### Prediction: 
``` 
[40,20,30,10]
[10,20,30,40]
```
#### Explanation: This code swaps the first and last of the array. First it declares an array numbers with a values of 10, 20, 30, 40. Then it calls the function that accepts array, then inside the function it saves first in the variable first the index 0 of the array, then the variable last saves the last index of the array. Then the arr.unshift put the value of the last to the index 0 of the array and the arr.push puts the value of last to the last index of the array.

### Output: 
``` 
[40,20,30,10]
[10,20,30,40]
```

# CHALLENGE 3
```
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
console.log(numbers);
```
|VARIABLE    |VALUE              |
|------------|-------------------|
| `scores  ` | `85, 45, 90, 60 ` |
| `grade   ` | `85, 45, 90, 60 ` |
| `passing ` | `60, 45, 85, 90 ` |

### Prediction: 
``` 
60,45,85,90
```
#### Explanation: In this program it filters the passing grades from an array. First it declares an array scores with values 85, 45, 90, 60. Then there is a function filterPassingGrades that accepts an array. Inside the function it declares first an array passing with empty value. Then for looops to iterate the grades array. Then it will go to the conditional statement to add the passing grades then return the passing array to print the return value of the function.

### Output: 
``` 
60,45,85,90
```


# CHALLENGE 4
```
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
```
|VARIABLE    |VALUE              |
|------------|-------------------|
| `taskList ` | `{ id: 1, completed: false }, { id: 2, completed: true } ` |
| `task.completed ` | `true, false ` |

### Prediction: 
``` 
[{id: 1, completed: true}, {id: 2, completed: false}]
[{id: 1, completed: true}, {id: 2, completed: false}]
```
#### Explanation: The function of this code is to update the boolean completed inside of the taskList object. First it created an object taskList, then inside of it is id:1 completed false, and id:2 completed true. Then there is a function updateStatus that accepts object. Inside the function it iterates the tasks then calling the task.completed then inverting its boolean value. 

### Output: 
``` 
[{id: 1, completed: true}, {id: 2, completed: false}]
[{id: 1, completed: true}, {id: 2, completed: false}]
```

# CHALLENGE 5
```
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
```
|VARIABLE    |VALUE              |
|------------|-------------------|
| `data ` | `5, 12, 8, 130, 44 ` |
| `i ` | `0, 1, 2, 3, 4 ` |
| `arr[i] ` | `5, 12, 8, 130, 44 ` |
| `target ` | `12, 100 ` |

### Prediction: 
``` 
Found at index 1
Not found
```
#### Explanation: The function of this code is to find the target value to the array data. In there is a declared variable data with values 5, 12, 8, 130, 44. Then there is a function that accepts the array and a target value. Inside the function there is a for loops that iterates the array then a conditional statement where if the value of arr[i] is equals to the target, it will return and output Found at index ${i}, but if not it will return Not found
### Output: 
``` 
Found at index 1
Not found
```
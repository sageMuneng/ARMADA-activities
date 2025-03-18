# CHALLENGE 1
```
function calculateSum(arr) {
    let sum = 0;
    for (let i = 0; i < arr.length; i++) {
        sum += arr[i];
    }
    return sum;
}

let numbers = [1, 2, 3, 4];
console.log("Sum:", calculateSum(numbers));
```
| VARIABLE      |  VALUE                                          |
|---------------|-------------------------------------------------|
| `numbers    ` | `1, 2, 3, 4 ` |
| `i          ` | `0, 1, 2, 3 ` |
| `sum        ` | `10         ` |
| `arr.length ` | `4          ` |
| `arr[i]     ` | `1, 2, 3, 4 ` |
### Prediction: 
``` 
Sum:10
```
#### Explanation: In this code it has a function that accepts an array. Then it declare a variable numbers that has a value of 1, 2, 3, 4. then in console log it calls the calculateSum(numbers). Inside the function it declares a variable sum with value of 0. Then in for loops it iterates the array then it computes the sum + arr[i], example: 0 + 1 = 1. It will iterate this until it reachers the arr.length.
### Output: 
``` 
Sum:10
```

# CHALLENGE 2
```
function isEven(num) {
    if (num % 2 === 0) {
        return true;
    } else {
        return false;
    }
}

console.log(isEven(4));
console.log(isEven(7));
console.log(isEven(0));
```
|VARIABLE    |VALUE   |
|------------|--------|
| `num ` | `4, 7, 0 ` |
### Prediction: 
``` 
true
false
true
```
#### Explanation: In the console log, the isEven function is called with a number. inside the function there is a conditional statement that if the num % 2 === 0, it will return true, else it will return false. For example if 4 % 2 = 0 so it will return true indicating that 4 is even.
### Output: 
``` 
true
false
true
```

# CHALLENGE 3
```
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
```
|VARIABLE    |VALUE   |
|------------|--------|
| `friends ` | `Alice, Bob, Charlie ` |
| `i ` | `0 - it will iterate if the condition is true ` |
| `names.length ` | `3 ` |
| `greet(names[i]) ` | `Hello, Alice!, Hello, Bob!, Hello, Charlie! ` |

### Prediction: 
``` 
Hello, Alice!
Hello, Bob!
Hello, Charlie!
```
#### Explanation: First the code declared an array friends with value Alice, Bob, Charlie. Then inside the personalizedGreeting function accepting an array, it has a for loops that iterates the array. Then inside the for loops, it calls another function that returns a string "Hello, " + name + "!" then out to console log.
### Output: 
``` 
Hello, Alice!
Hello, Bob!
Hello, Charlie!
```

# CHALLENGE 4
```
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
```
|   VARIABLE       |    VALUE                                        |
|------------------|-------------------------------------------------|
| ` originalArray` | `10, 20, 30                                   ` |
| ` reversed     ` | `null                                         ` |
| ` i            ` | `2, 1, 0 ` |
| ` arr.length   ` | `3                                            ` |
| ` reversed     ` | `30, 20, 10                                   ` |

### Prediction: 
``` 
30, 20, 10
10, 20, 30
```
#### Explanation: This code reverse an array. Here it declares a variable originalArray with values 10, 20, 30. Then it calls the reverseArray that accepts array in the console log. Inside the reverseArray is has a reversed array variable with empty value. Then in for loops it iterates the arr backwards then it pushes the value of arr[i] to the array reversed. Then it returns the value of reversed. Than in the last console log it just output the value of the originalArray.  
### Output: 
``` 
30, 20, 10
10, 20, 30
```

# CHALLENGE 5
```
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
```
|VARIABLE  |VALUE               |
|----------|--------------------|
| `matrix` | `[[1, 2], [3, 4]]` |
| `i     ` | `0, 1            ` |
| `j     ` | `0, 1            ` |

### Prediction: 
``` 
[ 2, 4 ]
[ 6, 8 ]
```
#### Explanation: The function multiplyMatrix takes a 2D array (matrix) as input and multiplies each element by 2. It uses nested loops to iterate through each element of the matrix. The outer loop iterates over the rows (`i`), and the inner loop iterates over the columns (`j`). For each element matrix[i][j], it multiplies the value by 2. The modified matrix is then returned. So the initial matrix is: [[1, 2],[3, 4],]. After multiplying each element by 2, the resulting matrix is:[[2, 4],[6, 8],].
### Output: 
``` 
[ 2, 4 ]
[ 6, 8 ]
```
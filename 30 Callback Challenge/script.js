// task 1:  Custom Map Function ------------------------------------------
function task1() {
    // here i created a function where it accepts an array and the callback
    function customMap(numbersArray, callback) {
        // here i declared an empty array to push the doubled numbers here
        let doubledArray = [];

        // Then I created a for loops to iterate the numbersArray
        for (let i in numbersArray) {
            // Then i push the return of the callback
            doubledArray.push(callback(numbersArray[i]));
        }
        // Then return the doubledArray to output its values
        return doubledArray;
    }

    let numbers = [1, 2, 3];
    let doubled = customMap(numbers, function (num) { return num * 2; });
    console.log(doubled); // Should output: [2,4,6]
}
task1();

// task 2:  Filter Function ------------------------------------------
function task2() {
    // here i created a function where it accepts an array and the callback
    function filter(numbersArray, callback) {
        // here i declared an empty array to push the filtered numbers here
        let filteredArray = [];

        // Then I created a for loops to iterate the numbersArray
        for (let i in numbersArray) {
            // here i created a conditional statement where if the callback return true if the numberArray[i] is less than 10
            if (callback(numbersArray[i])) {
                // Then i push the return of the callback
                filteredArray.push(numbersArray[i]);
            }
        }
        // Then return the filteredArray to output its values
        return filteredArray;
    }

    let result = filter([1, 2, 3, 4, 15], function (val) { return val < 10; });
    console.log(result); // Should output: [1,2,3,4]

}
task2();


// task 3:  Some Function ------------------------------------------
function task3() {
    // here i created a function where it accepts an array and the callback
    function some(numbersArray, callback) {

        // Then I created a for loops to iterate the numbersArray
        for (let i in numbersArray) {
            // if the the callback returns to false it will return true
            if (!callback(numbersArray[i])) {
                return true;
            }
        }
        // then return to false if it didnt return true in the conditional statement
        return false;
    }
    let result = some([1, 2, 3, 4], function (val) { return val > 5; });
    console.log(result); // Should output: true
}

task3();


// task 4:  Every Function ------------------------------------------
function task4() {
    // here i created a function where it accepts an array and the callback
    function every(numbersArray, callback) {
        // Then I created a for loops to iterate the numbersArray
        for (let i in numbersArray) {
            // if the the callback returns to false it will return false
            if (!callback(numbersArray[i])) {
                return false;
            }
        }
        // then return to true if it didnt return false in the conditional statement
        return true;
    }

    let result = every([1, 2, 3], function (val) { return val > 0; });
    console.log(result); // Should output: true
}

task4();

// task 5:  Reduce Function ------------------------------------------
function task5() {
    // here i created a fucntion where it accepts an array and the callback
    function reduce(numbersArray, callback) {
        // then i declared a variable reduced to place the sum of the numbersArray
        let reduced = 0;
        // Then I created a for loops to iterate the numbersArray
        for (let i in numbersArray) {
            // here it will assign a value of sum (ex. 0+1)
            // reduced = 1 until it reaches the last index of the array
            reduced = callback(reduced, numbersArray[i]);
        }
        
        // then it will return the reduced and it should output the 6
        return reduced;
    }

    let sum = reduce([1, 2, 3], function (acc, num) { return acc + num; });
    console.log(sum); // Should output: 6
}

task5();

// task 6:  Includes Check ------------------------------------------
function task6() {
    // here i created a fucntion where it accepts an array and the callback
    function includes(numbersArray, callback){
        // Then I created a for loops to iterate the numbersArray
        for(let i in numbersArray){
            // Then If the callback returns true it will return the function true
            if(callback(numbersArray[i])){
                return true;
            }
        }
        // Then by default it will return false if the an element is not included in the array
        return false;
    }

    let result = includes([1, 2, 3], function (val) { return val === 2; });
    console.log(result); // Should output: true
}

task6();
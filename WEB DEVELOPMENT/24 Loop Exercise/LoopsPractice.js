// TASK 1 Multiplication Table Generator--------------------------------------

let number = 5;
for(let i = 1; i <= 10;i++){
    let result = number * i;
    console.log(`${number} * ${i} = ${result}`);
}

// TASK 2 Sum of First N Natural Numbers --------------------------------------
let n = 5;
let sum = 0;
for(let i = 1; i <= n; i++){
    sum += i;
}
console.log('The sum of the first 5 numbers is: ' + sum);

// TASK 3 Sum of First N Natural Numbers --------------------------------------
const integers = [12,1,62,90,34];

for(let i in integers){
    console.log("Array Element: " + integers[i]);
}

// TASK 4 Pattern Printer --------------------------------------

for(let x = 1; x <= 5; x++) {
    let stars = "";
    for(let y = 0; y < x; y++) {
        stars += "*";
    }
    console.log(stars);
}

// TASK 5 Reverse Array Elements --------------------------------------
const array = [1,2,3,4,5,6,7,8,9,10];

for(let i = array.length - 1; i >= 0; i--){
    console.log(array[i]);
}
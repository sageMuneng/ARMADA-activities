// TASK 1 Inventory Tracker-------------------------------------------------
let inventory = ["apple", "banana", "cherry", "date", "elderberry"];

let inventoryCount = [10, 15, 5, 20, 7];

for (let i = 0; i < inventory.length; i++) {
  console.log(`${inventory[i]}: ${inventoryCount[i]}`);
}

// OUTPUT
// apple: 10
// banana: 15
// cherry: 5
// date: 20
// elderberry: 7

// EXPLANATION: the array and the inventoryCount has the same length. Now in for loops we can use the same index to access the elements of inventory and inventoryCount.


// TASK 2 Alphabetical Sorting-------------------------------------------------
let words = ["zebra", "apple", "mango", "cherry", "banana"];

for (let i = 0; i < words.length; i++) {
  for (let j = i + 1; j < words.length; j++) {
    if (words[i] > words[j]) {
      let temp = words[i];
      words[i] = words[j];
      words[j] = temp;
    }
  }
}

console.log(words);

//OUTPUT: [ 'apple', 'banana', 'cherry', 'mango', 'zebra' ]
// EXPLANATION: This is a nested for loops, in the first loop it gets the first index of the array words,
// then in second loop it gets the next index of the array words. Then inside of the nested loops is a conditional 
// statement that if the words is greater than the next word, it will swap the position of the words by saving 
// the words[i] to a temp variable then assigning the words[j] to words[i] and then assigning the temp variable to words[j].
// This will continue until the loop is finished.

// TASK 3 Unique Array Builder -------------------------------------------------

let uniqueNumbers = [];

while (uniqueNumbers.length < 10) {
  let randomNumber = Math.floor(Math.random() * 20) + 1;

  // Check if the randomNumber already exists in the array
  let exists = false;
  for (let i = 0; i < uniqueNumbers.length; i++) {
    if (uniqueNumbers[i] === randomNumber) {
      exists = true;
      break;
    }
  }

  // If it doesn't exist, add it to the array
  if (!exists) {
    uniqueNumbers.push(randomNumber);
  }
}

console.log(uniqueNumbers);

// OUTPUT: [ 18,  7, 8, 9,  5, 4, 12, 6, 2, 10]
// EXPLANATION: this is a while loop that loops until the uniqueNumbers length is less than 10. 
// Inside the loop is a random number generator that generates a random number between 1 and 20. .
// Then there is a for loop that checks the whole uniqueNumbers array if the random number already exists in the 
// array. If it doesn't exist, it will add that random 
// number to the uniqueNumbers array. This will continue until the length 
// of the uniqueNumbers array is less than 10.

// TASK 4 Triangle Checker-------------------------------------------------
let sideA = 7;
let sideB = 10;
let sideC = 5;

if (sideA + sideB > sideC && sideB + sideC > sideA && sideA + sideC > sideB) {
  console.log(`The sides ${sideA}, ${sideB}, and ${sideC} form a valid triangle.`);
} else {
  console.log(`The sides ${sideA}, ${sideB}, and ${sideC} do not form a valid triangle.`);
}

// OUTPUT: The sides 7, 10, and 5 form a valid triangle.
// EXPLANATION: This conditional statement checks if the side a to b is a valid triangle
// inside the if, if the sideA + sideB (17) is greater than sideC (5) 
// and sideB + sideC (15) is greater than sideA(7) and sideA + sideC (12 )is greater than sideB (10)
// it will output the first console.log. If there is atleast 1 false in the conditional statement
//  it will output the second console.log.
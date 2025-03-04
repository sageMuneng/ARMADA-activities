// task 1---------------------------------------------
let item1 = 5;
let item2 = 10;
let item3 = 15;

let totalCost = item1 + item2 + item3;
console.log('The total cost of the items is: $'+ totalCost);

// task 2---------------------------------------------
let num1 = 4;
let num2 = 18;
let num3 = 9;

let average = (num1 + num2 + num3) / 3;
console.log('The average is '+ average);

// task 3---------------------------------------------
let number = 7;

if(number % 2 == 0) {
    console.log(number+ ' is an even number');
} else {
    console.log(number+ ' is an odd number');
}

// task 4---------------------------------------------
let itemPrice = 100;
let discount = 20;

let discountedPrice = (itemPrice * discount) / 100;
let finalPrice = itemPrice - discountedPrice;
console.log('The discounted price is: $'+ finalPrice);

// bonus task ---------------------------------------------
let originalPrice = finalPrice / (1-discount/100);
console.log('The original price is: $'+ originalPrice);

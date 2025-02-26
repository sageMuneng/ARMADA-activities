// Task 1: Grading System --------------------------------------

let score = 59

if(score >= 90 && score <= 100) {
    console.log("Grade A")
} else if(score >= 80 && score <= 89) {
    console.log("Grade B")
}else if(score >= 70 && score <= 79) {
    console.log("Grade C")
}else if(score >= 60 && score <= 69) {
    console.log("Grade D")
}else{
    console.log("Grade F")
}

// Task 2: Weather Advisor --------------------------------------

let temparature = 30

if(temparature < 0) {
    console.log("It's freezing outside! Bundle up!")
}else if(temparature >= 0 && temparature <= 15) {
    console.log("It's cold outside. Wear a jacket.")
}else if(temparature >= 16 && temparature <= 30){
    console.log("The weather is nice. Enjoy your day!")
}else{
    console.log("It's hot outside. Stay hydrated!")
}

// TASK 3: Elgiability Checker --------------------------------------

let age = 22

if(age < 13) {
    console.log("You are too young for this activity.")
}else if(age >= 13 && age <= 17) {
    console.log("You need parental permission.")
}else{
    console.log("You are eligible for this activity.")
}

// TASK 4: Ticket Price Calculator --------------------------------------

// i will reuse the variable age in task 3
let isMember = true

if(age < 12){
    console.log("Ticket price is free")
}else if(age >= 12 && isMember) {
    console.log("Ticket price is $10")
}else if(age >= 12 && !isMember){
    console.log("Ticket price is $15")
}

// TASK 5: Leap Year Checker --------------------------------------

function isLeapYear(year) {

    if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
        return true
    }else{
        return false
    }
}

console.log(isLeapYear(2024))
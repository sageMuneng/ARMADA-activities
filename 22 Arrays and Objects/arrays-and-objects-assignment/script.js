// task 1-------------------------------------
let book = {
    title: "The Hobbit",
    author: "J.R.R. Tolkien",
    pages: 310,
    isRead: false,
}

for(let key in book){
    console.log(key + ": " + book[key]);
}

book.isRead = true;
book.genre = "Fantasy";

console.log(book);

// task 2-------------------------------------

let movies = [
    {
        title: "In Bruges",
        director : "Martin McDonagh",
        year: 2008,
    },
    {
        title: "Interstellar",
        director : "Christopher Nolan",
        year: 2014,
    },
    {
        title: "Mad Max: Fury Road",
        director : "George Miller",
        year: 2015,
    }
]

console.log(movies[1].title)

let movie4 = {
    title: "The Dark Knight",
    director : "Christopher Nolan",
    year: 2008,
}

movies.push(movie4)

movies[0].year = 2023

console.log(movies)

// task 3-------------------------------------

let student = {
    name: "Gene Matthew Aban",
    age: 22,
    subjects: ["Web Developtment", "Advance Mobile Aapplication Development", "Mobile Development Application"],
}

console.log(student.subjects[0])

student.subjects.push("Data Structures and Algorithms")

console.log(student)

// task 4-------------------------------------

let recipe = {
    name: "Lasagna",
    ingredients:[
        {
            name: "Mozzarrella cheese",
            quantity: "1 lb."
        },
        {
            name: "Parmesan cheese",
            quantity: "1 cup"
        },
        {
            name: "lasagna",
            quantity: "1 lb."
        },
        {
            name: "ground beef",
            quantity: "1 lb."
        },
        {
            name: "chopped onions",
            quantity: "1/2 cup"
        },
        {
            name: "garlic chopped",
            quantity: "2 cloves"
        },
        {
            name: "crushed tomatoes",
            quantity: "28 ounces"
        },
        {
            name: "tomato sauce",
            quantity: "16 ounces"
        },
        {
            name: "tomato paste",
            quantity: "6 ounces"
        },
        {
            name: "Water",
            quantity: "1/2 cup"
        },
        {
            name: "cooking oil",
            quantity: "2 tbsp"
        },
        {
            name: "white sugar",
            quantity: "2 tbsp"
        },
        {
            name: "fresh parsley chopped",
            quantity: "3 tbsp"
        },
        {
            name: "fresh Basil leaves chopped",
            quantity: "3 tbsp"
        },
        {
            name: "salt",
            quantity: "1 tsp"
        },
        {
            name: "Italian Seasoning",
            quantity: "1 tsp"
        },
        {
            name: "ground pepper",
            quantity: "1/2 tsp"
        },
        {
            name: "fresh parsley chopped",
            quantity: "2 tbsp"
        },
        {
            name: "ricotta cheese",
            quantity: "1 1/2 lb."
        },
    ],
    isvegetarian: false
}

recipe.ingredients.push({
    name: "raw egg",
    quantity: "1 piece"
})

console.log(recipe.ingredients[1].name)

console.log(recipe)
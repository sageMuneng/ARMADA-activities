# TASK 1
|   VARIABLE          |   VALUE                                      |
|---------------------|----------------------------------------------|
| `inventory        ` | `apple, banana, cherry, date, elderberry   ` |
| `inventoryCount   ` | `10, 15, 5, 20, 7                          ` |
| `i                ` | `0, 1, 2, 3, 4                             ` |
| `inventory.length ` | `5                                         ` |
| `inventory[i]     ` | `apple, banana, cherry, date, elderberry   ` |
| `inventoryCount[i]` | `10, 15, 5, 20, 7                          ` |
### Output: 
``` 
    apple: 10 
    banana: 15
    cherry: 5
    date: 20
    elderberry: 7
```
#### EXPLANATION: the array and the inventoryCount has the same length. Now in for loops we can use the same index to access the elements of inventory and inventoryCount.

# TASK 2 
| VARIABLE        | VALUE                                                 |
|-----------------|-------------------------------------------------------|
| `words        ` | `zebra", "apple", "mango", "cherry", "banana        ` |
| `i            ` | `0, 1, 2, 3, 4                                      ` |
| `words.length ` | `5                                                  ` |
| `j            ` | `1 ,2, 3, 4, 5                                      ` |
| `temp         ` | `zebra, zebra, mango, cherry, zebra, mango, zebra   ` |
| `words[j]     ` | `apple, mango, cherry, banana, mango, cherry, mango ` |
| `words[j]     ` | `zebra, zebra, mango, cherry, zebra, mango, zebra   ` |
### Output: 
```
apple, banana, cherry, mango, zebra
```
#### EXPLANATION: This is a nested for loops, in the first loop it gets the first index of the array words, then in second loop it gets the next index of the array words. Then inside of the nested loops is a conditional statement that if the words is greater than the next word, it will swap the position of the words by saving the words[i] to a temp variable then assigning the words[j] to words[i] and then assigning the temp variable to words[j]. This will continue until the loop is finished.

# TASK 3
|VARIABLE                 |   VALUE                         |
|-------------------------|---------------------------------|
| `uniqueNumbers        ` | `null                         ` |
| `randomNumber         ` | `random number                ` |
| `exists               ` | `false                        ` |
| `i                    ` | `0, 1, 2, 3, 4, 5, 6, 7, 8, 9 ` |
| `uniqueNumbers.length ` | `10                           ` |
### Output: 
```
    12, 2, 15, 13, 16,
    20, 1,  6, 18, 11
```
#### EXPLANATION: this is a while loop that loops until the uniqueNumbers length is less than 10. Inside the loop is a random number generator that generates a random number between 1 and 20. Then there is a for loop that checks the whole uniqueNumbers array if the random number already exists in the array. If it doesn't exist, it will add that random number to the uniqueNumbers array. This will continue until the length of the uniqueNumbers array is less than 10.


# TASK 4
|VARIABLE  |VALUE  |
|----------|-------|
| `sideA ` | `7  ` |
| `sideB ` | `10 ` |
| `sideC ` | `5  ` |
|----------|-------|
### Output: 
```
    The sides 7, 10, and 5 form a valid triangle.
```
#### EXPLANATION: This conditional statement checks if the side a to b is a valid triangle inside the if, if the sideA + sideB (17) is greater than sideC (5) and sideB + sideC (15) is greater than sideA(7) and sideA + sideC (12 )is greater than sideB (10) it will output the first console.log. If there is atleast 1 false in the conditional statement it will output the second console.log.
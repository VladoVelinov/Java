# Object Oriented Programming in Java.

## Exercises:

### Exercise 1.1*
Write a method called **printSquare** that takes in two integer parameters, a **min** and a **max**, and prints the numbers 
in the range from min to max inclusive in a square pattern. The square pattern is easier to understand by example than 
by explanation, so take a look at the sample method calls and their resulting console output in the table below.

Each line of the square consists of a circular sequence of increasing integers between min and max. 
Each line prints a different permutation of this sequence. 
The first line begins with min, the second line begins with min + 1, and so on.
When the sequence in any line reaches max, it wraps around back to min.
You may assume the caller of the method will pass a min and a max parameter such that min is less than or equal to max.

### Exercise 1.2
Write a method named **printGrid** that accepts two integer parameters rows and cols. 
The output is a comma-separated grid of numbers where the first parameter (rows) represents the number of rows of the 
grid and the second parameter (cols) represents the number of columns. The numbers count up from 1 to (rows x cols). 
The output are displayed in column-major order, meaning that the numbers shown increase sequentially down each column 
and wrap to the top of the next column to the right once the bottom of the current column is reached. 
Assume that rows and cols are greater than 0.

### Exercise 1.3
Write a complete program called **"TheNameGame"**, where the user inputs a first and last name and a song in the following
format is printed about their first, then last, name. Use a method to avoid redundancy.

<details>
<summary>Output:</summary>

````````
What is your name? Fifty Cent
Fifty Fifty, bo-Bifty
Banana-fana fo-Fifty
Fee-fi-mo-Mifty
FIFTY!

Cent Cent, bo-Bent
Banana-fana fo-Fent
Fee-fi-mo-Ment
CENT!
````````
</details>

### Exercise 1.4
A certain bank offers 6.5% interest on savings accounts, compounded annually. Create a table that shows how much money 
a person will accumulate over a period of 25 years, assuming that the person makes an initial investment of $1000 and 
deposits $100 each year after the first. Your table should indicate for each year the current balance, the interest, 
the new deposit, and the new balance. The output of the program should like something like this:

<details>
<summary>Output:</summary>

````````
Year Current Balance Interest New Deposit New Balance
 1       1000,00       65,00       0,00     1065,00 
 2       1065,00       69,23     100,00     1234,23 
 3       1234,23       80,22     100,00     1414,45 
 ... 
25       9542,88      620,29     100,00    10263,16
````````
</details>

### Exercise 1.5*
Write a program that produces images of Christmas trees as output. It should have a method with two parameters: one
for the number of segments in the tree and one for the height of each segment. For example, the tree shown here on
the left has three segments of height 4 and the one on the right has two segments of height 5:

### Exercise 1.6
Write a method **maxLength** that takes an ArrayList of Strings as a parameter and that returns the length of the longest
string in the list. If your method is passed an empty list, it should return 0.

### Exercise 1.7
Write a method **minToFront** that takes an ArrayList of integers as a parameter and that moves the minimum value in the
list to the front, otherwise preserving the order of the elements. 

For example, if a variable called list stores the following values: {3, 8, 92, 4, 2, 17, 9} and you make this call: 
minToFront(list); it should store the following values after the call: {2, 3, 8, 92, 4, 17, 9} You may assume that the 
list stores at least one value.

### Exercise 1.8
Write a method **countCommon** that takes two Lists of integers as parameters and returns the number of unique integers that
occur in both lists. Use one or more Sets as storage to help you solve this problem.
For example, if one list contains the values [3, 7, 3, -1, 2, 3, 7, 2, 15, 15] and the other list contains the values
[-5, 15, 2, -1, 7, 15, 36], your method should return 4 (because the elements -1, 2, 7, and 15 occur in both lists).

### Exercise 1.9
Write a method **maxOccurrences** that accepts a List of integers as a parameter and returns the number of times the most
frequently occurring integer (the "mode") occurs in the list. Solve this problem using a Map as auxiliary storage.
If the list is empty, return 0.

### Exercise 1.10*
Write a method **rarest** that accepts a map whose keys are strings and whose values are integers as a parameter and returns
the integer value that occurs the fewest times in the map. If there is a tie, return the smaller integer value. If the
map is empty, throw an exception.

For example, suppose the map contains mappings from students' names (strings) to their ages (integers). Your method
would return the least frequently occurring age. Consider a map variable m containing the following key/value pairs:
{Alyssa=22, Char=25, Dan=25, Jeff=20, Kasey=20, Kim=20, Mogran=25, Ryan=25, Stef=22}

Three people are age 20 (Jeff, Kasey, and Kim), two people are age 22 (Alyssa and Stef), and four people are age 25
(Char, Dan, Mogran, and Ryan). So a call of rarest(m) returns 22 because only two people are that age.
If there is a tie (two or more rarest ages that occur the same number of times), return the youngest age among them.

For example, if we added another pair of Kelly=22 to the map above, there would now be a tie of three people of age 20
(Jeff, Kasey, Kim) and three people of age 22 (Alyssa, Kelly, Stef). So a call of rarest(m) would now return 20 because
20 is the smaller of the rarest values.

_Made By Vladislav Velinov._
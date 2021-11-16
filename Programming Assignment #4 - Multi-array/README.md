Multi-Dimensional Arrays

Create main class named MultiArray.    Create a method which outputs (prints) all the values in the array.  Call this method from each of the other methods to illustrate the data in the array.  Note:  Be sure to populate, and update the values in the multi-array, and then print the contents of the multi-array  (Don't just print the design patterns.)  The goal is to practice navigating the multi-array.

 

Declare a multi-dimensional array of integers, which is 10 rows of 10 columns ( 10 by 10).

In your code, set the initial values to ones’ such as this:

1 1 1 1 1 1 1 1 1 1

1 1 1 1 1 1 1 1 1 1

1 1 1 1 1 1 1 1 1 1

1 1 1 1 1 1 1 1 1 1

1 1 1 1 1 1 1 1 1 1

1 1 1 1 1 1 1 1 1 1

1 1 1 1 1 1 1 1 1 1

1 1 1 1 1 1 1 1 1 1

1 1 1 1 1 1 1 1 1 1


Create a method named “patternRow.”  Using control loops, (if , then /  then / else ) set the data values to 1’s and 0’s, alternating by rows, such as this:

 

0 0 0 0 0 0 0 0 0 0

1 1 1 1 1 1 1 1 1 1

0 0 0 0 0 0 0 0 0 0

1 1 1 1 1 1 1 1 1 1

0 0 0 0 0 0 0 0 0 0

1 1 1 1 1 1 1 1 1 1

0 0 0 0 0 0 0 0 0 0

1 1 1 1 1 1 1 1 1 1

0 0 0 0 0 0 0 0 0 0

1 1 1 1 1 1 1 1 1 1

 

Create a method named “patternCheckered.”  This method should set the values to alternative 1’s and 0’s, such as this:

 

0 1 0 1 0 1 0 1 0 1

1 0 1 0 1 0 1 0 1 0
0 1 0 1 0 1 0 1 0 1
1 0 1 0 1 0 1 0 1 0
0 1 0 1 0 1 0 1 0 1
1 0 1 0 1 0 1 0 1 0
0 1 0 1 0 1 0 1 0 1
1 0 1 0 1 0 1 0 1 0
0 1 0 1 0 1 0 1 0 1
1 0 1 0 1 0 1 0 1 0

 

Create a method named “userChoice.”  Prompt the user to enter three numbers.  Set the array data to be the sequence of numbers they enter, such as this:

Please enter your choice: 1

Please enter your choice: 7

Please enter your choice: 5

 

1 7 5 1 7 5 1 7 5 1
7 5 1 7 5 1 7 5 1 7 …

 

Create a method named “sumArray” which sums all the numbers together.  Output totals for each row, and a grand total.
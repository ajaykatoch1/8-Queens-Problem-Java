# 8-Queens-Problem-Java
This program is for my ECE466 Knowledge Systems and AI class. It solves the 8 queens problems given the first queens from the user using forward checking, recursion, and AI principles. This is coded in Java.

README File

This document is supposed to instruct and aid in how the program for homework “8 Queens” should run. Here is a list of steps on how to run the program.

1.Select the file Main.java within the Eclipse IDE
2.Navigate to Run>Run As>Java Application
3.Once this is done, a prompt in the console will appear asking for placement of the 1st queen within row 1
4.Enter in the desired column number to place the first queen in the first row
5.Once complete hit enter, this will initiate the functions and the solutions, queen placements and backtracks will all be displayed in order

Next I will show how the program runs on my machine along with how the program works. The program works recursively by taking user input and consistently updating an imaginary board with queen coordinates and placing their attacks on the board. When the next queen is being placed it can reference the previous queen placements and attacks and take a backtrack to place the piece in a proper place. Then once this process occurs the backtrack counter increments. Here is an example test run with queen1 in row 1 column 4 as the first placement.

Console output:

8 Queens Problem
----------------
Enter the position of the first queen within row 1(ex.columns 1-8): 4
You have placed the first queen in row 1, column 4


Solution 1:
The positions of the queens are: 
Queen 1: Row 1, Column 4
Queen 2: Row 2, Column 1
Queen 3: Row 3, Column 5
Queen 4: Row 4, Column 8
Queen 5: Row 5, Column 2
Queen 6: Row 6, Column 7
Queen 7: Row 7, Column 3
Queen 8: Row 8, Column 6
Total number of backtracks in this solution with forward checking: 12
Total number of backtracks in this solution with directional look ahead: 6

Solution 2:
The positions of the queens are: 
Queen 1: Row 1, Column 4
Queen 2: Row 2, Column 1
Queen 3: Row 3, Column 5
Queen 4: Row 4, Column 8
Queen 5: Row 5, Column 6
Queen 6: Row 6, Column 3
Queen 7: Row 7, Column 7
Queen 8: Row 8, Column 2
Total number of backtracks in this solution with forward checking: 4
Total number of backtracks in this solution with directional look ahead: 2

Solution 3:
The positions of the queens are: 
Queen 1: Row 1, Column 4
Queen 2: Row 2, Column 2
Queen 3: Row 3, Column 5
Queen 4: Row 4, Column 8
Queen 5: Row 5, Column 6
Queen 6: Row 6, Column 1
Queen 7: Row 7, Column 3
Queen 8: Row 8, Column 7
Total number of backtracks in this solution with forward checking: 35
Total number of backtracks in this solution with directional look ahead: 17

Solution 4:
The positions of the queens are: 
Queen 1: Row 1, Column 4
Queen 2: Row 2, Column 2
Queen 3: Row 3, Column 7
Queen 4: Row 4, Column 3
Queen 5: Row 5, Column 6
Queen 6: Row 6, Column 8
Queen 7: Row 7, Column 1
Queen 8: Row 8, Column 5
Total number of backtracks in this solution with forward checking: 10
Total number of backtracks in this solution with directional look ahead: 5

Solution 5:
The positions of the queens are: 
Queen 1: Row 1, Column 4
Queen 2: Row 2, Column 2
Queen 3: Row 3, Column 7
Queen 4: Row 4, Column 3
Queen 5: Row 5, Column 6
Queen 6: Row 6, Column 8
Queen 7: Row 7, Column 5
Queen 8: Row 8, Column 1
Total number of backtracks in this solution with forward checking: 2
Total number of backtracks in this solution with directional look ahead: 1

Solution 6:
The positions of the queens are: 
Queen 1: Row 1, Column 4
Queen 2: Row 2, Column 2
Queen 3: Row 3, Column 7
Queen 4: Row 4, Column 5
Queen 5: Row 5, Column 1
Queen 6: Row 6, Column 8
Queen 7: Row 7, Column 6
Queen 8: Row 8, Column 3
Total number of backtracks in this solution with forward checking: 5
Total number of backtracks in this solution with directional look ahead: 2

Solution 7:
The positions of the queens are: 
Queen 1: Row 1, Column 4
Queen 2: Row 2, Column 2
Queen 3: Row 3, Column 8
Queen 4: Row 4, Column 5
Queen 5: Row 5, Column 7
Queen 6: Row 6, Column 1
Queen 7: Row 7, Column 3
Queen 8: Row 8, Column 6
Total number of backtracks in this solution with forward checking: 16
Total number of backtracks in this solution with directional look ahead: 8

Solution 8:
The positions of the queens are: 
Queen 1: Row 1, Column 4
Queen 2: Row 2, Column 2
Queen 3: Row 3, Column 8
Queen 4: Row 4, Column 6
Queen 5: Row 5, Column 1
Queen 6: Row 6, Column 3
Queen 7: Row 7, Column 5
Queen 8: Row 8, Column 7
Total number of backtracks in this solution with forward checking: 6
Total number of backtracks in this solution with directional look ahead: 3

Solution 9:
The positions of the queens are: 
Queen 1: Row 1, Column 4
Queen 2: Row 2, Column 6
Queen 3: Row 3, Column 1
Queen 4: Row 4, Column 5
Queen 5: Row 5, Column 2
Queen 6: Row 6, Column 8
Queen 7: Row 7, Column 3
Queen 8: Row 8, Column 7
Total number of backtracks in this solution with forward checking: 12
Total number of backtracks in this solution with directional look ahead: 6

Solution 10:
The positions of the queens are: 
Queen 1: Row 1, Column 4
Queen 2: Row 2, Column 6
Queen 3: Row 3, Column 8
Queen 4: Row 4, Column 2
Queen 5: Row 5, Column 7
Queen 6: Row 6, Column 1
Queen 7: Row 7, Column 3
Queen 8: Row 8, Column 5
Total number of backtracks in this solution with forward checking: 10
Total number of backtracks in this solution with directional look ahead: 5

Solution 11:
The positions of the queens are: 
Queen 1: Row 1, Column 4
Queen 2: Row 2, Column 6
Queen 3: Row 3, Column 8
Queen 4: Row 4, Column 3
Queen 5: Row 5, Column 1
Queen 6: Row 6, Column 7
Queen 7: Row 7, Column 5
Queen 8: Row 8, Column 2
Total number of backtracks in this solution with forward checking: 7
Total number of backtracks in this solution with directional look ahead: 3

Solution 12:
The positions of the queens are: 
Queen 1: Row 1, Column 4
Queen 2: Row 2, Column 7
Queen 3: Row 3, Column 1
Queen 4: Row 4, Column 8
Queen 5: Row 5, Column 5
Queen 6: Row 6, Column 2
Queen 7: Row 7, Column 6
Queen 8: Row 8, Column 3
Total number of backtracks in this solution with forward checking: 26
Total number of backtracks in this solution with directional look ahead: 13

Solution 13:
The positions of the queens are: 
Queen 1: Row 1, Column 4
Queen 2: Row 2, Column 7
Queen 3: Row 3, Column 3
Queen 4: Row 4, Column 8
Queen 5: Row 5, Column 2
Queen 6: Row 6, Column 5
Queen 7: Row 7, Column 1
Queen 8: Row 8, Column 6
Total number of backtracks in this solution with forward checking: 10
Total number of backtracks in this solution with directional look ahead: 5

Solution 14:
The positions of the queens are: 
Queen 1: Row 1, Column 4
Queen 2: Row 2, Column 7
Queen 3: Row 3, Column 5
Queen 4: Row 4, Column 2
Queen 5: Row 5, Column 6
Queen 6: Row 6, Column 1
Queen 7: Row 7, Column 3
Queen 8: Row 8, Column 8
Total number of backtracks in this solution with forward checking: 9
Total number of backtracks in this solution with directional look ahead: 4

Solution 15:
The positions of the queens are: 
Queen 1: Row 1, Column 4
Queen 2: Row 2, Column 7
Queen 3: Row 3, Column 5
Queen 4: Row 4, Column 3
Queen 5: Row 5, Column 1
Queen 6: Row 6, Column 6
Queen 7: Row 7, Column 8
Queen 8: Row 8, Column 2
Total number of backtracks in this solution with forward checking: 5
Total number of backtracks in this solution with directional look ahead: 2

Solution 16:
The positions of the queens are: 
Queen 1: Row 1, Column 4
Queen 2: Row 2, Column 8
Queen 3: Row 3, Column 1
Queen 4: Row 4, Column 3
Queen 5: Row 5, Column 6
Queen 6: Row 6, Column 2
Queen 7: Row 7, Column 7
Queen 8: Row 8, Column 5
Total number of backtracks in this solution with forward checking: 14
Total number of backtracks in this solution with directional look ahead: 7

Solution 17:
The positions of the queens are: 
Queen 1: Row 1, Column 4
Queen 2: Row 2, Column 8
Queen 3: Row 3, Column 1
Queen 4: Row 4, Column 5
Queen 5: Row 5, Column 7
Queen 6: Row 6, Column 2
Queen 7: Row 7, Column 6
Queen 8: Row 8, Column 3
Total number of backtracks in this solution with forward checking: 9
Total number of backtracks in this solution with directional look ahead: 4

Solution 18:
The positions of the queens are: 
Queen 1: Row 1, Column 4
Queen 2: Row 2, Column 8
Queen 3: Row 3, Column 5
Queen 4: Row 4, Column 3
Queen 5: Row 5, Column 1
Queen 6: Row 6, Column 7
Queen 7: Row 7, Column 2
Queen 8: Row 8, Column 6
Total number of backtracks in this solution with forward checking: 21
Total number of backtracks in this solution with directional look ahead: 10

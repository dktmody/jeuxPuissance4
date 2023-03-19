# jeuxPuissance4

As part of my training at the efrei school, I set up the power of four game.
The challenge of the project is to practice using variables, functions in java without using objects. The names of variables and functions will be in French.
 

### Introduction to JAVA Project
The two-player strategy game where the objective is to align
four tokens of its own color horizontally, vertically or in
diagonal on a board of 6 rows and 7 columns.
To represent this plateau in our program, we can use a
matrix (a 2D array) 6x7, where each box can take different values ​​example:
- the caracter '+' || '.' if the box is empty
- the first letter token of player 1
- the first letter token of player 2

Functions to perform
Here is a list of functions that you can implement and use to achieve
this Connect 4 game:
Tray initialization function
Token placement function
A function that takes as input the column where the player wants to place their token, and
which modifies the game grid accordingly. The function should also check if
the move is valid (ie if there is room left in the chosen column).
Game turn management function
A function that manages game turns and calls the placement functions of
token, display and victory verification.
Victory Check Feature
A function that takes as input the game grid and checks if there is a line of
four tokens lined up. If so, the function returns the player who won
(red or yellow). If the grid is full without winning, the function returns
a draw.

Recommendation: do unit tests to test the functions when it is
possible.

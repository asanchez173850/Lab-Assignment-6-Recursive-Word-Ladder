#Lab-Assignment-6-Recursive-Word-Ladder


## Student Name
Andrew Sanchez

## Description
The program reads words from a file and uses a recursive method with backtracking to find a word ladder from a starting word to an ending word. Each step changes only one letter, and every word in the ladder must exist in the provided dictionary.

## Java Files
WordLadderApp
The main driver class. It loads the dictionary, prompts the user for input, validates the input, calls the recursive solver, and displays the results.
WordDictionary
Reads the dictionary from words_small.txt, stores the words, checks if a word exists, and returns words of a specified length.
WordLadderSolver
Performs the recursive search for a valid word ladder. It uses backtracking and a visited HashSet to avoid cycles while searching.
WordUtils
Contains a static helper method that determines whether two words differ by exactly one letter.

Test Results
Successful Test

Input

fish
mast

Output

Word ladder found:

fish
dish
dash
cash
case
care
card
cart
cast
fast
last
list
lost
most
mast
Invalid Input Test

Input

Fish
Stone



Output

The starting and ending words must have the same length.
Testing and Verification
I tested the program using successful and unsuccessful word pairs, verified that the dictionary loaded correctly, confirmed that invalid input was handled properly, and ensured that recursion, backtracking, and visited-word tracking all worked correctly.

My Explanation of the Recursive Method
The recursive method begins with the starting word and searches for neighboring words that differ by one letter. It continues calling itself until it either reaches the ending word or determines that the current path cannot succeed. When a path fails, it removes the current word and returns to try another possible path.

My Explanation of the Object-Oriented Design
The program separates responsibilities into multiple classes so each class performs one specific job. This makes the code easier to understand and test.
I used Google Gemini/AI as a learning tool while completing this assignment. I used it to better understand recursion, backtracking, and to review portions of my code. I also used AI to help me format and work on the README. I verified that I understood every part of the final program before submitting it.

## OnlineGDB Link
https://www.onlinegdb.com/s/as/390020
## GitHub Repository Link
https://github.com/asanchez173850/java-week8-futures-volatility


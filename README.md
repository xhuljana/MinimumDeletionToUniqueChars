Minimum Deletions to make the occurrence of each character unique.

Objective: Given a string, your task is to delete the minimum number of characters in the string so that the count of each character is unique.

Example:

Input = "aaaaabbbbb"
Output: 1 
Explanation: In the input string, characters 'a' and 'b', both occur 5 times. You can delete either one 'a' or one 'b' to make their count unique (4 and 5 or 5 and 4). 


Input = "abcaabbcdaab"
Output: 0 
Explanation: 
count of 'a' = 5 
count of 'b' = 4 
count of 'c' = c
Count of 'd' = 1
All characters count is already unique.

Input = "aaaabbbbccccdddd"
Output: 6 
Explanation: 
count of 'a' = 4 
count of 'b' = 4 
count of 'c' = 4
Count of 'd' = 4
Delete 1 'b', 2 'c' and 3 'd' to make unique counts as (4, 3, 2, 1)

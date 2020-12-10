You have been tasked to prepared as many burgers as possible given a limited set of ingredients. All burgers contain tomatoes and cheese. 

Write a function, 
```
class Solution { public int[] solution(int X, int Y); }
```
which given X tomatoes and Y cheese slices returns a tuple/list of the number of big burgers and mini burgers, can be prepared. All ingredients must be used up. In case there are any remainders ingredient, output an array with values [-1, -1]. 

In case there is one big burger and no mini burger, output for example [1,0] 

A big burger contains 4 tomatoes and 1 slice of cheese, 
whereby a mini burger contains 2 tomatoes and 1 slice of cheese.

Examples: 
* Cheese(X): 1 Tomatoes(Y): 2 Output: (1, 0) -> 1 Mini Burgers and 0 Big Burgers 
* Cheese(X): 7 Tomatoes(Y): 16 Output: (6, 1) -> 6 Mini Burgers and 1 Big Burgers 
* Cheese(X): 15 Tomatoes(Y): 40 Output: (10,5) -> 10 Mini Burgers and 5 Big Burgers 

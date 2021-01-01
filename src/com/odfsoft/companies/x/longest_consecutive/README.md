Write a function:
```
class Solution { public int solution(int[] A); }
```
which returns the longest number of consecutive numbers a given array. A consecutive run is a list of numbers which differ by one in either increasing or descending order. The numbers within a run must be direct neighbors in the original array. Create a function that takes a list of numbers and returns the length of the longest consecutive-run.

To illustrate: longest_run([1, 2, 3, 5, 6, 7, 8, 9]) -> 5

Two consecutive runs: [1, 2, 3] and [5, 6, 7, 8, 9] (longest).

Examples 
* longest_run([1, 2, 3, 10, 11, 15]) -> 3 
Longest consecutive-run: [1, 2, 3]. 
* longest_run([5, 4, 2, 1]) -> 2 
Longest consecutive-run: [5, 4] and [2, 1].
* longest_run([3, 5, 7, 10, 15]) -> 1 
No consecutive runs, so we return 1.

* longest_run([5, -3, -2, -1, 0, 1, 5, 6, 7]) -> 5 
Longest consecutive-run: [-3, -2, -1, 0, 1].

Additional Examples: 
* [3,4,5,-2,-1,0,1,6,7] -> 4 
* [2,3,12,11,10,9]->4 
* [4,5,6,-4,-3,-2,-1,0,2,3] ->5 
* [1,3,4,-7,-8,-9,-10,-11,12,11]-> 5 

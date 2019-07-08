# Lecture Notes: Merge Sort
Divide and conquer sorting algoritim.

# Learning Objectives
- What merge sort is
- How it works
- Why we use it

## Lecture Flow
- What is merge sort
    - sorting algorithm
    - has many different applications
    - fairly quick (hence the name)
- How it works
  - Divides array into smaller arrays
  - arrays pieces are then sorted back into a full sorted array
  - recursive
- Why we use it
  - many uses
  - good to use when dealing with a large datasets dataset

## Diagram
- ![whiteboard]()

## Algorithm
- create two methods
    - Mergesort
        - declare mid, left, right for dividing the array
        - recursive call left array pieces
        - recursive call right array pieces
    - Merge
        - declare i, j, k to keep track of where you are in the mergedArray, leftArrayPiece and rightArrayPiece
        - while loop
            - compare left array value and right array value
            - assign smaller value to mergedArray
            -end of while
        - append left over array piece (either left or right side if exists)

## Pseudocode
```  
ALGORITHM Mergesort(arr)
    DECLARE n <-- arr.length
           
    if n > 1
      DECLARE mid <-- n/2
      DECLARE left <-- arr[0...mid]
      DECLARE right <-- arr[mid...n]
      // sort the left side
      Mergesort(left)
      // sort the right side
      Mergesort(right)
      // merge the sorted left and right sides together
      Merge(left, right, arr)

ALGORITHM Merge(left, right, arr)
    DECLARE i <-- 0
    DECLARE j <-- 0
    DECLARE k <-- 0

    while i < left.length && j < right.length
        if left[i] <= right[j]
            arr[k] <-- left[i]
            i <-- i + 1
        else
            arr[k] <-- right[j]
            j <-- j + 1
            
        k <-- k + 1

    if i = left.length
       set remaining entries in arr to remaining values in right
    else
       set remaining entries in arr to remaining values in left
```
## Complexity
- Time
    - Big O(nlogn)
- Space
    - Big O(n)
## Code
- [merge sort]()
- [test code] ()
## Readings and References
### Watch
- [geek for geeks](https://www.youtube.com/watch?v=JSceec-wEyw)
### Read
- [geek for geeks](https://www.geeksforgeeks.org/merge-sort/)
- [wiki](https://en.wikipedia.org/wiki/Merge_sort)
- [medium](https://medium.com/karuna-sehgal/a-simplified-explanation-of-merge-sort-77089fe03bb2)
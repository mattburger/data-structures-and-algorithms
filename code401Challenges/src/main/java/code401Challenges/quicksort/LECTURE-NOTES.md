# Lecture Notes: Quick Sort
Sorting algorithm that sorts the array in place.

# Learning Objectives
- What quick sort is
- How it works
- Why we use it

## Lecture Flow
- What is quick sort
    - in place sorting algorithm
    - used for more complex sorts
    - fairly quick (hence the name)
- How it works
  - Uses a left, right, and pivot pointer
  - array is conceptually divided into smaller array using the pointers
  - recursive
- Why we use it
  - quick
  - good to use when dealing with a complex dataset

## Diagram
- ![whiteboard]()

## Algorithm
- create three methods
  - quicksort
    - use partition function to partition array by setting the pivot
    - Recursive call to quicksort for left side of array
    - Recursive call to quicksort for right side of array
  - partition
    - define pivot
    - for loop from left pointer to right
    - check if array value is less than or equal to pivot
    - swap function for current value and value at left pointer
    - end of if and for loops
    - swap function for value at right pointer and value at left pointer
  - swap
   - swap values using a tmp variable

## Pseudocode
```  
ALGORITHM QuickSort(arr, left, right)
    if left < right
        // Partition the array by setting the position of the pivot value 
        DEFINE position <-- Partition(arr, left, right)
        // Sort the left
        QuickSort(arr, left, position - 1)
        // Sort the right
        QuickSort(arr, position + 1, right)

ALGORITHM Partition(arr, left, right)
    // set a pivot value as a point of reference
    DEFINE pivot <-- arr[right]
    // create a variable to track the largest index of numbers lower than the defined pivot
    DEFINE low <-- left - 1
    for i <- left to right do
        if arr[i] <= pivot
            low++
            Swap(arr, i, low)

     // place the value of the pivot location in the middle.
     // all numbers smaller than the pivot are on the left, larger on the right. 
     Swap(arr, right, low + 1)
    // return the pivot index point
     return low + 1

ALGORITHM Swap(arr, i, low)
    DEFINE temp;
    temp <-- arr[i]
    arr[i] <-- arr[low]
    arr[low] <-- temp
```
## Code
- [quick sort]()
- [test code] ()
## Readings and References
### Watch
- [geek for geeks](https://www.youtube.com/watch?v=PgBzjlCcFvc)
### Read
- [geek for geeks](https://www.geeksforgeeks.org/quick-sort/)
- [wiki](https://en.wikipedia.org/wiki/Quicksort)
- [Hacker Earth](https://www.hackerearth.com/practice/algorithms/sorting/quick-sort/tutorial/)
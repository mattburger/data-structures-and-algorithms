# Lecture Notes: Merge Sort
Sorting algorithm that sorts the array in place.

# Learning Objectives
- What the insertion sort is
- How it works
- Why we use it

## Lecture Flow
- What is insertion sort
    - simple sorting algorithm
    - used for simple sorts
    - not the fastest sort of the bunch
- How it works
  - Treats the input array as two arrays
  - left side is considered sorted
  - right side is considered not sorted
- Why we use it
  - simple to use
  - good to use when dealing with a small dataset

## Diagram
- ![whiteboard](https://github.com/mattburger/data-structures-and-algorithms/blob/master/code401Challenges/src/main/resources/insertion_sort.jpg)

## Algorithm
- for loop through the length of the array using index i
- create a j index with i - 1
- create a temp
- while loop while j >= 0 and temp < array[j]
- assign value at index j to position j + 1
- decrement j
- end of while loop
- assign temp to position j + 1
- end of for loop

## Pseudocode
```  
InsertionSort(int[] arr)
  
    FOR i = 1 to arr.length
    
      int j <-- i - 1
      int temp <-- arr[i]
      
      WHILE j >= 0 AND temp < arr[j]
        arr[j + 1] <-- arr[j]
        j <-- j - 1
        
      arr[j + 1] <-- temp
```
## Readings and References
### Watch
- [geek for geeks](https://www.youtube.com/watch?v=OGzPmgsI-pQ)
### Read
- [geek for geeks](https://www.geeksforgeeks.org/insertion-sort/)
- [wiki](https://en.wikipedia.org/wiki/Insertion_sort)
- [Hacker Earth](https://www.hackerearth.com/practice/algorithms/sorting/insertion-sort/tutorial/)
# Challenge Summary
<!-- Short summary or background information -->
Find the first repeated word in a book.

## Challenge Description
<!-- Description of the challenge -->
- Write a function that accepts a lengthy string parameter.
- Without utilizing any of the built-in library methods available to your language, return the first word to occur more than once in that provided string.

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
### Approach
- Decided to store each word in a String array for my own sanity. 
- From there, iterate through the array and begin to add the words to a Hashtable.
  - Using a hashtable makes it conceptually simple to be able to track if and when a duplicate occurs
- Within the adding process, you'll check the key of your hashtable to see if there is a collision.
- If a collisions exists, check the value to see if it matches the incoming value to be added.
  - If so, return that value.
  - If not, add the value to the hashtable and keep on going.

### Complexity
- Time
  - Worst case: O(n^2) ( in the extreme case where every value is stored in one key.)
- Space
  - O(n)
## Solution
<!-- Embedded whiteboard image -->
![whiteboard](https://github.com/mattburger/data-structures-and-algorithms/blob/master/code401Challenges/src/main/resources/duplicate.jpg)
### Code
[solution] (https://github.com/mattburger/data-structures-and-algorithms/blob/master/code401Challenges/src/main/java/code401Challenges/firstDuplicate/FirstDuplicate.java)

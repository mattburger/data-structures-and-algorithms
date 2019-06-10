# Challenge Summary
<!-- Short summary or background information -->
Merge two linked lists.
## Challenge Description
<!-- Description of the challenge -->
Write a function called mergeLists which takes two linked lists as arguments. Zip the two linked lists together into one so that the nodes alternate between the two lists and return a reference to the head of the zipped list. Try and keep additional space down to O(1). You have access to the Node class and all the properties on the Linked List class as well as the methods created in previous challenges.
## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
- Utilized three pointers to merge two linked-lists within one loop. The merge is zipper style and doesn't sort or check if any of the linked lists are sorted.
- Big O
    - Time - Big O(n)
    - Space - Big O(n)
## Solution
<!-- Embedded whiteboard image -->

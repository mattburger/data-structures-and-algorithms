# Challenge Summary
<!-- Short summary or background information -->
Created method that will find the kth node from the last node in a Linked List.
## Challenge Description
<!-- Description of the challenge -->
Write a method for the Linked List class which takes a number, k, as a parameter. Return the node’s value that is k from the end of the linked list. You have access to the Node class and all the properties on the Linked List class as well as the methods created in previous challenges.
## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
Utilized two pointers set at HEAD within one while loop. The first pointer would traverse the linked list k nodes, then after that the first and second pointers will traverse together until the first pointer.next is equal to null. The second pointer would then be pointing to the node that is k nodes from the end.
## Solution
<!-- Embedded whiteboard image -->

![whiteboard](https://github.com/mattburger/data-structures-and-algorithms/blob/master/code401Challenges/src/main/resources/ll_kth_from_end.jpg)

## Code
- [LinkedList](https://github.com/mattburger/data-structures-and-algorithms/blob/master/code401Challenges/src/main/java/code401Challenges/LinkedList.java)
- [TestLinkedList](https://github.com/mattburger/data-structures-and-algorithms/blob/master/code401Challenges/src/test/java/code401Challenges/TestLinkedList.java)

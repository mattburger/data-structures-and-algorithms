# Challenge Summary
<!-- Short summary or background information -->
Implement a breadth-first traversal on a graph.

## Challenge Description
<!-- Description of the challenge -->
- Extend your graph object with a breadth-first traversal method that accepts a starting node. Without utilizing any of the built-in methods available to your language, return a collection of nodes in the order they were visited. Display the collection.

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
- Utilize a queue to store the input node and and store a copy of it in a List.
- Upon dequeueing a node, enqueue its neighbors and store them in the list.
- After all the nodes are traversed, return the List
### Big O
- Time
  - O(n)
- Space
  - O(n)
## Solution
<!-- Embedded whiteboard image -->
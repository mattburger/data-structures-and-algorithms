# Challenge Summary
<!-- Short summary or background information -->
Implement a queue using two stacks.
## Challenge Description
<!-- Description of the challenge -->
- Create a brand new PseudoQueue class. Do not use an existing Queue. Instead, this PseudoQueue class will implement our standard queue interface (the two methods listed below), but will internally only utilize 2 Stack objects. Ensure that you create your class with the following methods:
    - enqueue(value) which inserts value into the PseudoQueue, using a first-in, first-out approach.
    - dequeue() which extracts a value from the PseudoQueue, using a first-in, first-out approach.
- The Stack instances have only push, pop, and peek methods. You should use your own Stack implementation. Instantiate these Stack objects in your PseudoQueue constructor.
## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
### Approach
- The solution utilizes two stacks s1 and s2
- Both stacks start out empty
- For simulating enqueuing, When a node is initially added, s2 is first checked to see if there are any nodes
    - If nodes exist in s2, the nodes are popped out and pushed into s1
- The new node as added to s1.
- All nodes in s1 are popped and then pushed into s2
- s2 is not ready to be popped to simulate dequeueing 
### Efficicency
- Time - Big O(n)
- Space - Big O(n)


## Solution
<!-- Embedded whiteboard image -->
![whiteboardimg](https://github.com/mattburger/data-structures-and-algorithms/blob/master/code401Challenges/src/main/resources/queue_with_stacks.jpg)
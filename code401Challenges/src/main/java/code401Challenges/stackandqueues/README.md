# Stacks and Queues
<!-- Short summary or background information -->
Stack and Queue implementation.
## Challenge
<!-- Description of the challenge -->
- Create a Node class that has properties for the value stored in the Node, and a pointer to the next node.
- Create a Stack class that has a top property. It creates an empty Stack when instantiated.
    - This object should be aware of a default empty value assigned to top when the stack is created.
    - Define a method called push which takes any value as an argument and adds a new node with that value to the top of the stack with an O(1) Time performance.
    - Define a method called pop that does not take any argument, removes the node from the top of the stack, and returns the node’s value.
    - Define a method called peek that does not take an argument and returns the value of the node located on top of the stack, without removing it from the stack.
- Create a Queue class that has a front property. It creates an empty Queue when instantiated.
    - This object should be aware of a default empty value assigned to front when the queue is created.
    - Define a method called enqueue which takes any value as an argument and adds a new node with that value to the back of the queue with an O(1) Time performance.
    - Define a method called dequeue that does not take any argument, removes the node from the front of the queue, and returns the node’s value.
    - Define a method called peek that does not take an argument and returns the value of the node located in the front of the queue, without removing it from the queue.
- At no time should an exception or stack trace be shown to the end user. Catch and handle any such exceptions and return a printed value or operation which cleanly represents the state and either stops execution cleanly, or provides the user with clear direction and output.

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
- Create a Node class to be used by both Stack and Queue.
Stack
- Use one pointer 'top' to track the current node on top of the stack. As new nodes are pushed, the 'old top' is made the 'new top's' 'next' value. Reverse for pop.
Queue
- Use two pointer to track the front node and the back node. As new nodes are added, the back node faclitates the addition of new nodes and there relationship (next value).
Big O
- Stack
    - T - Big O(1)
    - Space - Big O(1)

- Queue
    - T - Big O(1)
    - Space - Big O(1)
## API
<!-- Description of each method publicly available to your Stack and Queue-->
Stack
- push - push new value on the top of the stack.
- pop - remove the top value from the stack.
- peek - returns the current value of top.

Queue
- enqueue - adds a new value to the 'back' of the queue.
- dequeue - removes the front node to the node behind it, and then removes the value.
- peek - returns the current value of 'front'.

# Trees
<!-- Short summary or background information -->
Implement a Binary Tree and Binary Search Tree
## Challenge
<!-- Description of the challenge -->
- Create a Node class that has properties for the value stored in the node, the left child node, and the right child node.
- Create a BinaryTree class
    - Define a method for each of the depth first traversals called preOrder, inOrder, and postOrder which returns an array of the values, ordered appropriately.
- At no time should an exception or stack trace be shown to the end user. Catch and handle any such exceptions and return a printed value or operation which cleanly represents the state and either stops execution cleanly, or provides the user with clear direction and output.
- Create a BinarySearchTree class
     - Define a method named add that accepts a value, and adds a new node with that value in the correct location in the binary search tree.
     - Define a method named contains that accepts a value, and returns a boolean indicating whether or not the value is in the tree at least once.
## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
For the following methods and their runtimes, recursion was used. For depth first methods have flow well with recursive funcitons. 
- Preorder Big O
    - time O(n)
    - space O(1)
- In order Big O
    - time O(n)
    - space O(1)
- Post order Big O
    - time O(n)
    - space O(1)

- add Big O
    - time O(n)
    - space O(1)

- contains Big O
    - time O(logn)
    - space O(1)
## API
<!-- Description of each method publicly available in each of your trees --->
### BinaryTree
- preorderTraversal 
    - check if current node is null
    - stores data before
    - traverse left
    - traverse right
- inOrderTraversal
    - check if current node is null
    - traverse left
    - store data
    - traverse right
- postOrderTraversal
    - check if current node is null
    - traverse left
    - traverse right
    - store data
### Binary Search Tree
- add
    - check if current node is null
        - if so, assign new value
    - check if current node is less than new value
        - if so traverse right
    - check if current node is greater than new value
        - if so traverse left
- contains
    - follows a similar pattern as the add method
    - returns a boolean if the value exists
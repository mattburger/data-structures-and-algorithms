# Singly Linked List
<!-- Short summary or background information -->
Implement a Singly Linked List Data Structure
## Challenge
<!-- Description of the challenge -->
- Create a Node class that has properties for the value stored in the Node, and a pointer to the next Node.
- Within your LinkedList class, include a head property. Upon instantiation, an empty Linked List should be created.
- This object should be aware of a default empty value assigned to head when the linked list is instantiated.
- Define a method called insert which takes any value as an argument and adds a new node with that value to the head of the list with an O(1) Time performance.
- Define a method called includes which takes any value as an argument and returns a boolean result depending on whether that value exists as a Node’s value somewhere within the list.
- Define a method called print which takes in no arguments and returns a collection all of the current Node values in the Linked List.
- At no time should an exception or stack trace be shown to the end user. Catch and handle any such exceptions and return a printed value or operation which cleanly represents the state and either stops execution cleanly, or provides the user with clear direction and output.
- Be sure to follow your language/frameworks standard naming conventions (e.g. C# uses PascalCasing for all method and class names).
## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
- Created two classes 'LinkedList' and 'Node'. Node is a child of 'LinkedList'. To create the linked list, Node instantiations were used to make up the nodes of the list and the data held within. The LinkedList class acted as a wrapper class to contain all the nodes together within on instance of LinkedList.
- Big O
  - Insertioin O(1)
  - includes O(n)
  - print O(n)
## API
<!-- Description of each method publicly available to your Linked List -->
- insertAtHead
- printLinkeList
- linkedListIncludes

## Solution
![Whiteboard](https://github.com/mattburger/data-structures-and-algorithms/blob/master/code401Challenges/src/main/resources/ll_insertions.jpg)
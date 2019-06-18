# Challenge Summary
<!-- Short summary or background information -->
Conduct “FizzBuzz” on a tree while traversing through it. Change the values of each of the nodes dependent on the current node’s value
## Challenge Description
<!-- Description of the challenge -->
- Write a function called FizzBuzzTree which takes a tree as an argument.
- Without utilizing any of the built-in methods available to your language, determine weather or not the value of each node is divisible by 3, 5 or both, and change the value of each of the nodes:
    - If the value is divisible by 3, replace the value with “Fizz”
    - If the value is divisible by 5, replace the value with “Buzz”
    - If the value is divisible by 3 and 5, replace the value with “FizzBuzz”
- Return the tree with its new values.
- For explicitly-typed languages: Ensure your node values are of type Object, to hold either strings or integers.
## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
### Big O
- Time - O(n)
- Space - O(n)
### Approach
- I decided to traverse this tree depth first using recursion. The traversal uses a pre-order traversal and checks the value of the node for divisibility by 3, 5 or 3 & 5. The node values are changed based on their divisibility, or left unchanged if divisiblity requirements are not met.
## Solution
<!-- Embedded whiteboard image -->
![whiteboardpic](https://github.com/mattburger/data-structures-and-algorithms/blob/master/code401Challenges/src/main/resources/fizzbuzz_tree.jpg)
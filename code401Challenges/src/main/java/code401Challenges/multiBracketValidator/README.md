# Challenge Summary
<!-- Short summary or background information -->
- Multi-bracket Validations
## Challenge Description
<!-- Description of the challenge -->
- Your function should take a string as its only argument, and should return a boolean representing whether or not the brackets in the string are balanced. There are 3 types of brackets:
    - Round Brackets : ()
    - Square Brackets : []
    - Curly Brackets : {}
## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
- Used two stacks. One stack to hold open braces, and another to hold closed braces. After traversal through the string is complete, the closed bracket stack is fliped, then compared to the open braces stack. There should be matching pairs and no left overs.
- Big O
    - Time - O(n)
    -Space - O(n)

## Solution
<!-- Embedded whiteboard image -->



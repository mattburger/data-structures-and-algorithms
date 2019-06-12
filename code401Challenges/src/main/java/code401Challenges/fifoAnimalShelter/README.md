# Challenge Summary
<!-- Short summary or background information -->
Create a FIFO Animal Shelter data structure
## Challenge Description
<!-- Description of the challenge -->
- Create a class called AnimalShelter which holds only dogs and cats. The shelter operates using a first-in, first-out approach.
- Implement the following methods:
    - enqueue(animal): adds animal to the shelter. animal can be either a dog or a cat object.
    - dequeue(pref): returns either a dog or a cat. If pref is not "dog" or "cat" then return null.
## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
- Animal Shelter implemented as queue
- write Animal Shelter ```enqueue()``` to use queue's enqueue method specifically for animals
- write Animal Shelter ```dequeue()``` to use queue's dequeue method specifically for animals
    - pref is an Animal instance
    - return pref

### Big O
- Space is O(1)
- Time is O(1)
## Solution
<!-- Embedded whiteboard image -->
![Whiteboard img](https://github.com/mattburger/data-structures-and-algorithms/blob/master/code401Challenges/src/main/resources/fifo_animal_shelter.jpg)
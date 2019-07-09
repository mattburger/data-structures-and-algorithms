# Hash Table
Data structure that stores key/value pairs in a table abstraction. These pairs are stored at indices of the hash of its key.

## Challenge
<!-- Description of the challenge -->
Implement a Hashtable with the following methods:

- add: takes in both the key and value. This method should hash the key, and add the key and value pair to the table, handling collisions as needed.
- get: takes in the key and returns the value from the table.
- contains: takes in the key and returns a boolean, indicating if the key exists in the table already.
- hash: takes in an arbitrary key and returns an index in the collection.

###Testing
Write tests to prove the following functionality:

- Adding a key/value to your hashtable results in the value being in the data structure
- Retrieving based on a key returns the value stored
- Successfully returns null for a key that does not exist in the hashtable
- Successfully handle a collision within the hashtable
- Successfully retrieve a value from a bucket within the hashtable that has a collision
- Successfully hash a key to an in-range value

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
Utilized an array for the base model of the hashtable out of tradition. A node class is used to  store the key value pairs within the map. A hash method is used to hash the key into an index within the bounds of the array.

- Complexity
  - Time: O(1) average case
  - Space: O(n) average case

## API
<!-- Description of each method publicly available in each of your hashtable -->
- add(key, value) - adds a key/value pair to the hashtable
- get(key) - retrieves the value stored at the specified key
- contains(key) - returns true or false depending on if the key exists

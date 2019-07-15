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

# Hashmap LEFT JOIN
<!-- Short summary or background information -->
Implement a simplified LEFT JOIN for 2 Hashmaps.

## Challenge
<!-- Description of the challenge -->
- Write a function that LEFT JOINs two hashmaps into a single data structure.
- The first parameter is a hashmap that has word strings as keys, and a synonym of the key as values.
- The second parameter is a hashmap that has word strings as keys, and antonyms of the key as values.
- Combine the key and corresponding values (if they exist) into a new data structure according to LEFT JOIN logic.
- LEFT JOIN means all the values in the first hashmap are returned, and if values exist in the “right” hashmap, they are appended to the result row. If no values exist in the right hashmap, then some flavor of NULL should be appended to the result row.
- The returned data structure that holds the results is up to you. It doesn’t need to exactly match the output below, so long as it achieves the LEFT JOIN logic.
- Avoid utilizing any of the library methods available to your language.

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
- leftJoin method uses 3 hashmaps hm1, hm2, hm3
- hm1 and hm2 have String keys and values
- hm3 has a String key and List<String> value
- copy hm1 to hm2
- join hm2 to hm3

## Solution
<!-- Embedded whiteboard image -->
- ![whiteboard]()
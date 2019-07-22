# Graphs
<!-- Short summary or background information -->
Implement a graph.

## Challenge
<!-- Description of the challenge -->
 - Implement your own Graph. The graph should be represented as an adjacency list, and should include the following methods:

  - AddNode()
    - Adds a new node to the graph
    - Takes in the value of that node
    - Returns the added node
  - AddEdge()
    - Adds a new edge between two nodes in the graph
    - Include the ability to have a “weight”
    - Takes in the two nodes to be connected by the edge
    - Both nodes should already be in the Graph
- GetNodes()
  - Returns all of the nodes in the graph as a collection (set, list, or similar)
- GetNeighbors()
  - Returns a collection of nodes connected to the given node
  - Takes in a given node
  - Include the weight of the connection in the returned collection
- Size()
  - Returns the total number of nodes in the graph


## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
- Classes created
  - Graph
    - utilizes a HashSet to store nodes.
  - Node
    - holds a value.
    - utilizes a HashSet to store Edges.
  - Edge
    - contains a destination node.
    - contains a weight for the edge.
### Big O
- Time
  - Nodes are added in O(1)
  - all nodes are returned in O(1)
  - Edges are added in O(1)
- Space
  - O(1)

## API
<!-- Description of each method publicly available in your Graph -->
  - AddNode()
    - Adds a new node to the graph
    - Takes in the value of that node
    - Returns the added node
  - AddEdge()
    - Adds a new edge between two nodes in the graph
    - holds a weight value
    - Takes in the two nodes to be connected by the edge
    - Both nodes should already be in the Graph
- GetNodes()
  - Returns all of the nodes in the graph as a collection (set, list, or similar)
- GetNeighbors()
  - Returns a collection of nodes connected to the given node
  - Takes in a given node
  - Include the weight of the connection in the returned collection
- Size()
  - Returns the total number of nodes in the graph
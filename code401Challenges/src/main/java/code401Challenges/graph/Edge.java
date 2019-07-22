package code401Challenges.graph;

public class Edge {
    private Node destination;
    private int weight;

    public Edge(Node destination, int weight) {
        this.destination = destination;
        this.weight = weight;
    }

    //Getters
    public Node getDestination() { return this.destination; }

    public int getWeight() {
        return this.weight;
    }

    //Setters
    public void setDestination(Node destination) { this.destination = destination; }

    public void setWeight(int weight) { this.weight = weight; }
}

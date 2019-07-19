package code401Challenges.graph;

public class Edge {
    private Graph destination;
    private int weight;

    public Edge(Graph destination, int weight) {
        this.destination = destination;
        this.weight = weight;
    }

    //Getters
    public Graph getDestination() { return this.destination; }

    public int getWeight() {
        return this.weight;
    }

    //Setters
    public void setDestination(Graph destination) { this.destination = destination; }

    public void setWeight(int weight) { this.weight = weight; }
}

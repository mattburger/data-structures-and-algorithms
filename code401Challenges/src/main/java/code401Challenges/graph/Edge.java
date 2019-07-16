package code401Challenges.graph;

public class Edge {
    private Graph source;
    private Graph destination;
    private int weight;

    public Edge(Graph source, Graph destination, int weight) {
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }

    //Getters
    public Graph getSource() {
        return this.source;
    }

    public Graph getDestination() {
        return this.destination;
    }

    public int getWeight() {
        return this.weight;
    }

    //Setters
    public void setSource(Graph source) {
        this.source = source;
    }

    public void setDestination(Graph destination) {
        this.destination = destination;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}

package code401Challenges.graph;

public class Edge {
    private GraphNode vertixA;
    private GraphNode vertixB;
    private Weight weight;

    public Edge(GraphNode vertixA, GraphNode vertixB, Weight weight) {
        this.vertixA = vertixA;
        this.vertixB = vertixB;
        this.weight = weight;
    }

    //Getters
    public GraphNode getVerticeA() {
        return this.vertixA;
    }

    public GraphNode getVerticeB() {
        return this.vertixB;
    }

    public Weight getWeight() {
        return this.weight;
    }

    //Setters
    public void setVerticeA(GraphNode verticeA) {
        this.vertixA = verticeA;
    }

    public void setVerticeB(GraphNode verticeB) {
        this.vertixB = verticeB;
    }

    public void setWeight(Weight weight) {
        this.weight = weight;
    }
}

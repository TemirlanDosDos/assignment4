public class Main {

    public static void main(String[] args) {

        Graph smallGraph = createGraph(10);

        System.out.println("SMALL GRAPH");
        smallGraph.printGraph();

        Experiment experiment = new Experiment();

        experiment.runTraversals(smallGraph);

        System.out.println("\n---------------------\n");


        Graph mediumGraph = createGraph(30);

        System.out.println("MEDIUM GRAPH");

        experiment.runTraversals(mediumGraph);

        System.out.println("\n---------------------\n");


        Graph largeGraph = createGraph(100);

        System.out.println("LARGE GRAPH");

        experiment.runTraversals(largeGraph);

        experiment.printResults();
    }

    public static Graph createGraph(int size) {

        Graph graph = new Graph();

        for (int i = 0; i < size; i++) {
            graph.addVertex(new Vertex(i));
        }

        for (int i = 0; i < size - 1; i++) {

            graph.addEdge(i, i + 1);

            if (i + 2 < size) {
                graph.addEdge(i, i + 2);
            }
        }

        return graph;
    }
}
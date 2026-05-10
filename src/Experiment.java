public class Experiment {

    public void runTraversals(Graph g) {

        System.out.println("BFS Traversal:");

        long startBfs = System.nanoTime();

        g.bfs(0);

        long endBfs = System.nanoTime();

        System.out.println("BFS Time: " + (endBfs - startBfs) + " ns");


        System.out.println();


        System.out.println("DFS Traversal:");

        long startDfs = System.nanoTime();

        g.dfs(0);

        long endDfs = System.nanoTime();

        System.out.println("DFS Time: " + (endDfs - startDfs) + " ns");
    }

    public void printResults() {

        System.out.println();
        System.out.println("Traversal experiments completed.");
    }
}
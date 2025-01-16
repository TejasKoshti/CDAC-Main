package day11.ads.java;

public class day11App {

	public static void testTraversal() {
//		Graph g = new AdjacencyMatrix(4, false);
//		//Graph g = new AdjListGraph(4, false);
//		g.addEdge(0, 1);
//		g.addEdge(0, 2);
//		g.addEdge(0, 3);
//		g.addEdge(1, 3);

//		System.out.print("BFS - ");
//		g.printBFS(0);
//
//		System.out.print("DFS - ");
//		g.printDFS(0);

		Graph g2 = new AdjListGraph(4,false);
		g2.addEdge(0, 1);
		g2.addEdge(0, 2);
		g2.addEdge(0, 3);
		g2.addEdge(1, 3);
		g2.printBFS(0);
	}

	public static void testDijkstra() {
	//	Graph g = new AdjacencyMatrix(6, true);
//
//		g.addEdge(0, 1, 1); // S -> A weight 1
//		g.addEdge(0, 3, 2); // S -> C weight 2
//		g.addEdge(1, 2, 6); // A -> B weight 6
//		g.addEdge(2, 4, 1); // B -> D weight 1
//		g.addEdge(2, 5, 2); // B -> E weight 2
//		g.addEdge(3, 1, 4); // C -> A weight 4
//		g.addEdge(3, 4, 3); // C -> D weight 3
//		g.addEdge(4, 5, 1); // D -> E weight 1
//
//		g.dijkstraShortestPath(0, 5);
	}

	public static void main(String[] args) {
		testTraversal();

		//testDijkstra();
	}

}

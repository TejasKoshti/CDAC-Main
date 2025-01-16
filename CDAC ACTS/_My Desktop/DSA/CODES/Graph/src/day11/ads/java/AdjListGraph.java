package day11.ads.java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AdjListGraph implements Graph {
	class EdgeInfo {
		int adjVertex;
		int weight;
		
		public EdgeInfo(int v, int w) {
			adjVertex = v;
			weight = w;
		}
	}

	List<List<EdgeInfo>> adjList;
	int vertexCount;
	boolean isDirected;

	public AdjListGraph(int n, boolean isDirected) {
		this.isDirected = isDirected;
		
		vertexCount = n;
		
		adjList = new ArrayList<>(vertexCount);
		for (int i = 0; i < vertexCount; ++i) {
			adjList.add(new ArrayList<>());
		}
	}

	@Override
	public void addEdge(int u, int v) {
		addEdge(u, v, 1);
	}

	@Override
	public void addEdge(int u, int v, int w) {
		adjList.get(u).add(new EdgeInfo(v, w));

		if (!isDirected) {
			adjList.get(v).add(new EdgeInfo(u, w));
		}
	}

	private void dfsHelper(int startVertex, boolean[] isVisited) {
		if (isVisited[startVertex]) {
			return;
		}
		
		isVisited[startVertex] = true;
		System.out.print(startVertex + " ");
		
		for (EdgeInfo edgeInfo : adjList.get(startVertex)) {
			if (!isVisited[edgeInfo.adjVertex]) {
				dfsHelper(edgeInfo.adjVertex, isVisited);
			}
		}
	}

	@Override
	public void printDFS(int startVertex) {
		boolean[] isVisited = new boolean[vertexCount];
		for (int i = 0; i < vertexCount; ++i) {
			isVisited[i] = false;
		}
		
		dfsHelper(startVertex, isVisited);
		System.out.println("");
	}

	@Override
	public void printBFS(int startVertex) {
		// TODO: Assignment
		ArrayList<Integer> bfs = new ArrayList<>();
		Queue<Integer> q = new LinkedList<>();
		boolean[] isVisited = new boolean[vertexCount];
		for (int i = 0; i < vertexCount; ++i) {
			isVisited[i] = false;
		}
		q.add(0);
		isVisited[0] = true;
		while(!q.isEmpty()){
			// int vi = q.remove();
			// if(!isVisited){
			// 	isVisited[vi] = true;
			// 	bfs.add(vi);
			// }
			 int currentVertex = q.remove(); // Get the front vertex using remove()
		        bfs.add(currentVertex);
			 for (EdgeInfo edgeInfo : adjList.get(currentVertex)) {
		            if (!isVisited[edgeInfo.adjVertex]) {
		                isVisited[edgeInfo.adjVertex] = true; // Mark as visited
		                q.add(edgeInfo.adjVertex); // Add to the queue for further exploration
		            }
		        }

		}
		for (int vertex : bfs) {
	        System.out.print(vertex + " ");
	    }
	    System.out.println("");
	}

	@Override
	public void dijkstraShortestPath(int startVertex, int destVertex) {
	}
}

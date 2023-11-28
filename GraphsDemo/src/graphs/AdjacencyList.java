package graphs;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;


public class AdjacencyList {
	
	
	public static void DFS(ArrayList<ArrayList<Integer>> adjList,
			int src, boolean[] visited) {
		visited[src] = true;
		System.out.println(src);
		for(int neighbour : adjList.get(src)) {
			if(!visited[neighbour]) {
				DFS(adjList, neighbour, visited);
			}
		}
		
		
	}
	
	public static boolean hasCycle(ArrayList<ArrayList<Integer>> adjList,
			int src, int par, boolean[] visited) {
		visited[src] = true;
		for(int neighbour : adjList.get(src)) {
			if(!visited[neighbour]) {
				return hasCycle(adjList, neighbour, src, visited) ;
			}
			else {
				if(neighbour != par)
				return true;
			}
		}
		return false;
		
		
	}

	public static void main(String[] args) {
		
		int v = 8;
		int e = 6;
		ArrayList<ArrayList<Integer>> adjList = new ArrayList<>(v);
		Scanner sc = new Scanner(System.in);
//		for(List<Integer> list : adjList) {
//			for(Integer num : list) {
//				System.out.println(num);
//				
//			}
//		}
//		System.out.println(adjList);
		
		for(int i =0; i < v; i++) {
			ArrayList<Integer> list = new ArrayList<>();
			adjList.add(list);
			
		}
		
		for(int i = 0; i < e; i++) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			adjList.get(v1).add(v2);
			adjList.get(v2).add(v1);		
		}
		
		for(int i = 0; i < adjList.size(); i++) {
			System.out.print(i + " -> ");
			for(int j = 0; j < adjList.get(i).size(); j++) {
				System.out.print(adjList.get(i).get(j) + ", ");
			}
			System.out.println();
		}
		boolean visited [] = new boolean[v];
		int count = 0;
		for(int i = 0 ; i < v; i++) {
			if(visited[i] == false) {
				++count;
				//DFS(adjList, i, visited);
			}
		}
		System.out.println("number of components = " + count);
		
		for(int i = 0 ; i < v; i++) {
			
			if(visited[i] == false) {
				System.out.println(hasCycle(adjList, i, -1,  visited));
				

			}
		}
		System.out.println("************************");
		
		boolean vis[] = new boolean [v];
		for(int i = 0; i < v; i++) {
			if(!vis[i])
			BFS(adjList, vis, i);
		}
		
	}

	private static void BFS(ArrayList<ArrayList<Integer>> adjList, boolean[] vis, int src) {
			Queue<Integer> queue = new LinkedList<>();
			queue.offer(src);
			vis[src] = true;
			while(!queue.isEmpty()) {
				int curr = queue.poll();
				System.out.println(curr);
				for(int neighbour : adjList.get(curr)) {
					if(!vis[neighbour]) {
						queue.offer(neighbour);
						vis[neighbour] = true;

					}
				}
			}
		
	}
}
	/*
	0 4
	1 4
	1 5
	2 5
	2 3
	1 3
	6 7
	3 4
	*/
	
	
	/*
	    0 4
		4 1
		5 1
		3 1
		3 2
		6 7
	  
	 * */
	 




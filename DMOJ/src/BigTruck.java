import java.util.*;
public class BigTruck {
	boolean [][] adjMatrix;
	int [][] adjWeight;
	static int V;
	static int [] itemsCollected;
	public BigTruck() {
		adjMatrix = null;
		adjWeight = null;
	}
	public BigTruck(int nodes) {
		V = nodes;
		adjMatrix = new boolean[nodes][nodes];
		adjWeight = new int [nodes][nodes];
	}
	public void addWeight(int a, int b, int weight) {
		adjMatrix[a][b] = true;
		adjMatrix[b][a] = true;
		adjWeight[a][b] = weight;
		adjWeight[b][a] = weight;
	}
	  public int minDistance(int dist[], boolean sptSet[])
	    {
	        // Initialize min value
	        int min = Integer.MAX_VALUE;
	        int min_index = 0;
	 
	        for (int v = 0; v < V; v++)
	        {
	         if (sptSet[v] == false && dist[v] <= min)
	         {    min = dist[v];
	            min_index = v;
	         }
	        }
	       return min_index;
	    }
	     public int[] dijkstra(int src, int [] items)
	{
	     int [] idealOutcome = new int [2];
	     int[] dist = new int [V] ;    
	    // The output array.  dist[i] will hold the shortest
	    // distance from src to i
	 
	     boolean [] sptSet = new boolean[V]; 
	// sptSet[i] will true if vertex i is included in shortest
	// path tree or shortest distance from src to i is finalized
	 
	     // Initialize all distances as INFINITE and stpSet[] as false
	     for (int i = 0; i < V; i++)
	     { dist[i] = Integer.MAX_VALUE; 
	        sptSet[i] = false;
	     }
	     // Distance of source vertex from itself is always 0
	     dist[src] = 0;
	 
	     // Find shortest path for all vertices
	     for (int count = 0; count < V-1; count++)
	     {
	       // Pick the minimum distance vertex from the set of vertices not
	       // yet processed. u is always equal to src in first iteration.
	       int u = minDistance(dist, sptSet);
	       // Mark the picked vertex as processed
	       sptSet[u] = true;
	 // Update dist value of the adjacent vertices of the picked vertex.
	       for (int v = 0; v < V; v++)
	       {
	         // Update dist[v] only if is not in sptSet, there is an edge from 
	         // u to v, and total weight of path from src to  v through u is 
	         // smaller than current value of dist[v]
	         
	       if ((!sptSet[v] && adjWeight[u][v]>0 && dist[u] 
	               != Integer.MAX_VALUE )&& (dist[u]+adjWeight[u][v] 
	               < dist[v]))
	            dist[v] = dist[u] + adjWeight[u][v];
	       }
	     }
	     int min = Integer.MAX_VALUE;
	     for (int i = 0; i < V; i++) {
	    	 if (dist[i] <= min) min = dist[i];
	     }
	     
	     return idealOutcome;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int nodes = sc.nextInt();
		itemsCollected = new int[V];
		BigTruck city = new BigTruck(nodes);
		for (int i = 0; i < nodes; i++) {
			itemsCollected[i] = sc.nextInt();
		}
		
		
		
	}

}

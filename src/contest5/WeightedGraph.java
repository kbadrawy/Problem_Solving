package contest5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
public class WeightedGraph {

	
 static class Edge {
	        int source;
	        int destination;
	        int weight;

	        public Edge(int source, int destination, int weight) {
	            this.source = source;
	            this.destination = destination;
	            this.weight = weight;
	        }
	    }

	  public static class Graph {
	        int vertices;
	        LinkedList<Edge> [] adjacencylist;

	        Graph(int vertices) {
	            this.vertices = vertices;
	            adjacencylist = new LinkedList[vertices];
	            //initialize adjacency lists for all the vertices
	            for (int i = 0; i <vertices ; i++) {
	                adjacencylist[i] = new LinkedList<>();
	            }
	        }

	        public void addEgde(int source, int destination, int weight) {
	            Edge edge = new Edge(source, destination, weight);
	            adjacencylist[source].addFirst(edge); //for directed graph
	        }

	        public void printGraph(){
	            for (int i = 0; i <vertices ; i++) {
	                LinkedList<Edge> list = adjacencylist[i];
	                for (int j = 0; j <list.size() ; j++) {
	                    System.out.println("vertex-" + i + " is connected to " +
	                            list.get(j).destination + " with weight " +  list.get(j).weight);
	                }
	            }
	        }
	    }
	  
		
//		public static void main(String[] args) throws IOException {
//			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//			String []a=br.readLine().split(" ");
//			int n= Integer.parseInt(a[0]);
//			int m= Integer.parseInt(a[1]);
//			String []cats=br.readLine().split(" ");
//			for (int i =0;i<n;i++) {
//				
//			}
//			
//		}
	

	

	}


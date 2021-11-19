package GraphRepresentation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class Graphs {

	static ArrayList<Integer>[]adj;
	static int V;
	
	public static class Node {
		Node left,right;
		
	}
	
	static ArrayList<Integer>[]adjList;
	static boolean [] visited;
	static int [][] adjMatrix;
	static void dfs1(int node) {
		visited[node]=true;
		for (int i:adjList[node]) {
			if (!visited[i])
			  dfs1(i);
		}
		}
	static void dfs2(int node) {
		visited[node]=true;
		
		for (int i=0;i<node;i++) {
			if (!visited[i]&&adjMatrix[node][i]==1)
			  dfs2(i);
		}
	}
	
//	 this code may help in the problem you solved wrong
//	 visited=  new boolean [V];
//	 int cc=0;
//	 for (int i =0;i<V;i++){
//		if (!visited[i]){
//			dfs1(i);
//			cc++;}
//	}
	
	
	public static void main(String[] args) {
//		V=5;
//		Scanner sc= new Scanner(System.in);
//		boolean[] vis = new boolean[V];
//		Queue<Integer>q= new LinkedList<>();
//		int [] dis= new int [V];
//		for (int i =0;i<7;i++) {
//			int n = sc.nextInt();
//			int m = sc.nextInt();
//			adj[n].add(m);
//		}
//		q.add(node);
//		vis[node]=true;
//		while(!q.isEmpty()) {
//			int cur=q.remove();
//			
//			for(int i =0;i<adj[cur].size();i++) {
//				if(!vis[i]) {
//				q.add(i); 
//				dis[i]=dis[cur]+1;
//				  }
//			}
//		}
		
	}
	
	//DepthFirstSearch
	// zai el binary search tree kedda in cs3 (in a normal tree we have two calls however in graph we will replace it with a for loop)
	static void dfsBinaryTree(Node n ) { 
		if (n==null)return;
		dfsBinaryTree(n.right);
		dfsBinaryTree(n.left);
	}
//	adjacencyMatrix:-
	public static void adjMatrix() throws IOException {
		Scanner sc = new Scanner (System.in);
		int V = sc.nextInt(); // v--> the number of vertices
		int [][] adj=new int [V][V];
		
		
		for (int i =0;i<V;i++) {
			int u=sc.nextInt();
			int v=sc.nextInt();
			adj[u][v]=1;  //if the graph is directed else we will also say adj[v][u]=1; 
//			if the graph is weighted it wont be 1 it will be the weight between those edges
//		     removing an edge in O(1)	space is V^2 (DrawBack)
			
		}
		for (int i =0;i<V;i++) {   ///////CHECK AGAIN THE VIDEO AND SEE WHAT HE DID THAT WAS DIFFERENT
			System.out.println(Arrays.toString(adj[i]));
		}
	}
//	adjacencyList:-
    public static void adjList() throws IOException {     // not Weighted so we dont need class pairs
		Scanner sc = new Scanner (System.in);
		int V = sc.nextInt(); 
		ArrayList[] adjList= new ArrayList [V]; //list of arrayLists the size is equal to the number of nodes which means that each node has its own list
		
		for (int i =0;i<V;i++) { // initializing the arrays 
			adjList[i]=new ArrayList();
		}
		int m = sc.nextInt();
		for (int i =0;i<m;i++) { // taking our input  
			int u = sc.nextInt()-1;
			int v = sc.nextInt()-1;
			adjList[u].add(v); // i am inserting in the list of a specific node 
			adjList[v].add(u); // in case of an indirected graph as said before
			
		}
		for (int i =0;i<V;i++) {   ///////CHECK AGAIN THE VIDEO AND SEE WHAT HE DID THAT WAS DIFFERENT
			System.out.println(adjList[i]);
		}
		
	}
	public static void adjListW() throws IOException {     // Weighted 
		Scanner sc = new Scanner (System.in);
		int V = sc.nextInt(); 
		ArrayList<Pair>[] adjList= new ArrayList[V];  
		
		for (int i =0;i<V;i++) {  
			adjList[i]=new ArrayList<Pair>();
		}
		int m = sc.nextInt();
		for (int i =0;i<m;i++) {  
			int u = sc.nextInt()-1;
			int v = sc.nextInt()-1;
			int w = sc.nextInt()-1;
			adjList[u].add(new Pair(u,w));
			adjList[v].add(new Pair(v,w)); 
			
		}
		for (int i =0;i<V;i++) {  
			System.out.println(adjList[i]);
		}
		
	}
	public static class Pair implements Comparable<Pair>{
     int v , edge;
		
     
     public Pair(int v , int edge) {
    	 this.v=v;
    	 this.edge=edge; 
     }
		public int compareTo(Pair p) {
			
			return this.v-p.v;
		}
		
	}
    
	public static class Edge {
		int s;
		int dest;
		int w;
		public Edge(int s, int dst, int w) {
			this.s=s;
			this.dest=dest;
			this.w=w;
		}
		
	}
	public static class graph{
		int V;
		ArrayList<Edge>[] adjList;
		
		public graph(int V ) { // constructor
			this.V=V;
			adjList = new ArrayList[V];
			for (int i =0;i<V;i++) {
				adjList[i]= new ArrayList<Edge>();
			}
		}
		
		public void addEdge(int s, int dest, int w) {
			Edge e = new Edge(s,dest,w);
			Edge e2 = new Edge(dest,s,w);
			adjList[s].add(e); 
			adjList[dest].add(e); 
			
		}
	}
	
	
	//----------------------------------------------------shortests path bfs-------------------------------------------
	public static void bfs(int node) {
		
		boolean[] vis = new boolean[V];
		Queue<Integer>q= new LinkedList<>();
		int [] dis= new int [V];
		q.add(node);
		vis[node]=true;
		while(!q.isEmpty()) {
			int cur=q.remove();
			
			for(int i =0;i<adj[cur].size();i++) {
				if(!vis[i]) {
				q.add(i); 
				dis[i]=dis[cur]+1;
				  }
			}
		}
	}
	
	
	public static void dfs(int node) {
		int v=5;
		boolean[] vis = new boolean[v];
		Stack<Integer>s= new Stack();
		s.add(node);
		vis[node]=true;
		while(!s.isEmpty()) {
			int cur=s.pop();
			for(int i =0;i<adj[cur].size();i++) {
				if(!vis[i]) s.push(i); 
			}
		}
		
		
	}
	static class Scanner {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public Scanner(FileReader r) {
            br = new BufferedReader(r);
        }

        public String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        public long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        public String nextLine() throws IOException {
            return br.readLine();
        }

        public double nextDouble() throws IOException {
            String x = next();
            StringBuilder sb = new StringBuilder("0");
            double res = 0, f = 1;
            boolean dec = false, neg = false;
            int start = 0;
            if (x.charAt(0) == '-') {
                neg = true;
                start++;
            }
            for (int i = start; i < x.length(); i++)
                if (x.charAt(i) == '.') {
                    res = Long.parseLong(sb.toString());
                    sb = new StringBuilder("0");
                    dec = true;
                } else {
                    sb.append(x.charAt(i));
                    if (dec)
                        f *= 10;
                }
            res += Long.parseLong(sb.toString()) / f;
            return res * (neg ? -1 : 1);
        }
        public long[] nextlongArray(int n) throws IOException {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }

        public Long[] nextLongArray(int n) throws IOException {
            Long[] a = new Long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }

        public int[] nextIntArray(int n) throws IOException {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        public Integer[] nextIntegerArray(int n) throws IOException {
            Integer[] a = new Integer[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }


        public boolean ready() throws IOException {
            return br.ready();
        }

    }
}

package GraphRepresentation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.StringTokenizer;

public class TheForestForTheTres {

	static boolean []vis;
	static ArrayList<Integer>[] adjList;
	public static void main(String[] args) throws IOException {
		/// Number of connected components in a graph (using dfs)
		
		Scanner sc= new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		int n = sc.nextInt();
		for (int i=0;i<n;i++) {
			vis=new boolean[26];
			int t=0;
			int c=0;
			int count=0;
			adjList= new ArrayList[26];
			for (int j =0;j<adjList.length;j++) {
				adjList[j]=new ArrayList();
			}
			String x = sc.nextLine();
			HashSet<Integer>h = new HashSet();
			while(x.charAt(0)!='*') {
				int u = x.charAt(1)-'A';
				int v = x.charAt(3)-'A';
				adjList[u].add(v);
				adjList[v].add(u);
				h.add(u);
				h.add(v);
				x = sc.nextLine();
			}
			
			String[] line=sc.nextLine().split(",");
			
			for (int k=0;k<line.length;k++) {
				
				if (!vis[line[k].charAt(0)-'A']) {
					dfs(line[k].charAt(0)-'A');
					count++;
				}
			}
			c=line.length-h.size();
			t=count-c;
			pw.println("There are "+ t+" tree(s) and "+c+" acorn(s).");
		}
		pw.flush();pw.close();
		
	}
	 static void dfs(int u) //using adjMatrix 
	    {
	        vis[u] = true;
	        for(int i = 0; i < adjList[u].size(); i++) {
	        	if(!vis[adjList[u].get(i)])
	        		dfs(adjList[u].get(i));
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


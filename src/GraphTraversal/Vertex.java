package GraphTraversal;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Vertex {
	static ArrayList<Integer>[]adj;
	static boolean [] vis;
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);

		int n = sc.nextInt();
		while(n!=0) {
		adj= new ArrayList[n+1];
		for(int i =0;i<n+1;i++) {
			adj[i]=new ArrayList();
		}
		String[]x=sc.nextLine().split(" ");
		while(Integer.parseInt(x[0])!=0) {
			for(int i=1;i<x.length-1;i++) {
				adj[Integer.parseInt(x[0])].add(Integer.parseInt(x[i]));
			}
			x=sc.nextLine().split(" ");
		}
		String [] check = sc.nextLine().split(" ");

		for(int i=1;i<check.length;i++) {
			int count=0;
			ArrayList<Integer>out= new ArrayList<>();
			vis= new boolean[n+1];
			dfs(Integer.parseInt(check[i]));
			for(int j=1;j<n+1;j++) {
				if(!vis[j]) {
					out.add(j);
					count++;
				}
			}
			pw.print(count);
			for(int j =0;j<out.size();j++) {
				pw.print(" " + out.get(j));
			}
			pw.println();


		}
		n=sc.nextInt();
		}
		pw.flush();
		pw.close();
	}
	public static void dfs (int a) {
		
		for(int i =0;i<adj[a].size();i++) {
			if(!vis[adj[a].get(i)]) {
				vis[adj[a].get(i)]=true;
				dfs(adj[a].get(i));
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




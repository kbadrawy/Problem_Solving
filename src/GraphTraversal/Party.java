package GraphTraversal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Party {

	
	static ArrayList<Integer>[]adj;
	static boolean [] vis;
	
	public static void main(String[] args) throws IOException {
		// kool employees f nfs el level will be in the same group so we need to get the maximum depth of all and this will be the number of groups
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer>node= new ArrayList(); // employees who have no immediate manager
		adj = new ArrayList[n+1];
		for (int i=0;i<n+1;i++ ){
			adj[i]=new ArrayList();
		}
		for(int i=0;i<n;i++) {
			int temp=sc.nextInt();
			if(temp!=-1) {
				adj[temp-1].add(i);
			}
			else {
				node.add(i);
			}
		}
		int max=-1;
		
		
		for(int i =0;i<node.size();i++) { //ben loop 3ala el nodes 34an neshoof el maximum beta3 kool tree w na5od el maximum benhom 
			vis= new boolean [n+1];
			max=Math.max(max, dfs(node.get(i)));  //we will get maximum height using DFS
         }
		System.out.println(max);
	}
	
	
	public static int dfs (int u ) {
		int max=0;
		vis[u]=true;
		for (int i =0;i<adj[u].size();i++) {
			if(!vis[adj[u].get(i)]) {
				max=Math.max(max, dfs(adj[u].get(i)));
			}
		}
		return max+1;
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

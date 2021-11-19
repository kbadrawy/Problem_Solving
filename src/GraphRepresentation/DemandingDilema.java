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

public class DemandingDilema {

	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		int t = sc.nextInt();
		
		while (t-->0) {
			
		int n=sc.nextInt();
		int m=sc.nextInt();
		boolean flag=true;
		int edges[]=new int[m];
		int[][]ed= new int[2][m];
		HashSet<String>h = new HashSet();
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++){
					int temp=sc.nextInt();
					edges[j]+=temp;
					if(temp==1) {
						if(ed[0][j]==0) {
							ed[0][j]=i+1;
						}
						else {
							ed[1][j]=i+1;
						}
					}}}
		for(int i=0;i<m;i++) {
			if(edges[i]!=2) {
				flag=false;
				break;
				
			}}
		
		if(flag) {
				for(int j=0;j<m;j++) {
					h.add(ed[0][j]+""+ed[1][j]);
				}
			
		}
		if(h.size()<m) {
			flag=false;
		}

		if(flag)
		    pw.println("Yes");
		else {
			pw.println("No");
		}
		}
		
		pw.flush();
		pw.close();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	boolean flag = true;
//	int n = sc.nextInt();
//	int m = sc.nextInt();
//	ArrayList[]edjList= new ArrayList[n];
//	for (int i =0;i<n;i++) {
//		edjList[i]=new ArrayList();
//	}
//	for (int i =0;i<n;i++) {
//		for(int j =0;j<m;j++) {
//			int input=sc.nextInt();
//			if (input==1)
//				edjList[j].add(i);
//		}
//	}
//	for (int i =0;i<n;i++) {
//		if (edjList[i].size()>2) {
//			pw.println("NO");
//			flag=false;
//			break;
//		}
//		else {
//		for (int j =0;j<n;j++) {
//			if (edjList[j].size()>2) {
//				pw.println("NO");
//				flag=false;
//				break;
//			}
//			if (i!=j&&j<m&&i<m) {
//				if (edjList[i].get(0)==edjList[j].get(0)&&edjList[i].get(1)==edjList[j].get(1))
//					{pw.println("NO");
//					flag=false;
//					break; }
//			}
//		}
//		}
//		
//	}
//	if (flag) {
//		pw.println("YES");
//	}
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


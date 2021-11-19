 package Round710Div3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class RestoringThePermutation {

	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-->0) {
			int n = sc.nextInt();
			int [] a = sc.nextIntArray(n);
			Queue<Integer>formin= new LinkedList<>(); //store el minmum elemetns el momken asta3mila w ha poll w insert tool ma ana mashia
			Stack<Integer>formax= new Stack<>(); //same but for the maximum last in first out
			StringBuilder min= new StringBuilder();
			StringBuilder max= new StringBuilder();
			min.append(a[0]+" ");
			max.append(a[0]+" ");
			int minm=0;
			for(int i =1;i<a[0];i++) {
				minm++;
				formin.add(minm);
				formax.add(minm);
			}
			for(int i=0;i<n-1;i++) {
				if(a[i+1]==a[i]) {
					min.append(formin.poll()+" ");
					max.append(formax.pop()+" ");
				}else {
					if(a[i+1]-a[i]==1) {
						min.append(a[i+1]+" ");
						max.append(a[i+1]+" ");
						continue;
					}
					 minm=a[i]+1;
					for(int j =0;j<a[i+1]-a[i]-1;j++) {
						formin.add(minm);
						formax.add(minm);
						minm++;
					}
					min.append(a[i+1]+" ");
					max.append(a[i+1]+" ");
				}
			}
			System.out.println(min.toString());
			System.out.println(max.toString());
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
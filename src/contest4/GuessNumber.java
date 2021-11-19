package contest4;

import java.io.*;
import java.util.StringTokenizer;

public class GuessNumber {

	
	public static void main(String[] args) throws  IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long max = 2000000000;
		long min = -2000000000;

		// written nicely with the help of tutorial
//		for (int i =0;i<n;i++) {
//			String op = sc.next();
//			Long x = sc.nextLong();
//			String ans = sc.next();
//			if(ans.equals("N")){
//				switch(op){
//					case ">=": op= "<"; break;
//					case ">":  op= "<="; break;
//					case "<=": op= ">"; break;
//					case "<":  op= ">="; break;
//				}
//			}
//			switch(op){
//				case ">=": if (min<=x) min=x; break;
//				case ">": 	if (min<=x) {min=x+1;} ; break;
//				case "<=": if (x<=max) max=x; break;
//				case "<": if (x<=max) max=x-1 ;break;
//			}
//		}

		//My Solution

		for (int i =0;i<n;i++) {
			String op = sc.next();
			Long no = sc.nextLong();
			String ans = sc.next();

			if (ans.equals("Y")) {
				switch(op) {
					case ">":
						if (min<=no) {
							min=no+1;
						}
						break;
					case "<":if (no<=max) {
						max=no-1;
					}
						;break;
					case ">=":
						if (min<=no) {
							min=no;
						}  ; break;
					case "<=":
						if (no<=max) {
							max=no;
						} ;break;
					default:;break;
				}
			}else{
				switch(op) {
					case ">":
						if (max>=no) {
							max=no;
						}
						break;
					case "<":if (no>=min) {
						min=no;
					}
						;break;
					case ">=":
						if (max>=no) {
							max=no-1;
						}  ; break;
					case "<=":
						if (no>=min) {
							min=no+1;
						} ;break;
					default:;break;
				}
			}

		}
		if (min>max) {
		     System.out.println("Impossible");
		}
		else {
			System.out.println(min);
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

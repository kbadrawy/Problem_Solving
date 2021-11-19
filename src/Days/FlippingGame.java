package Days;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class FlippingGame {
	static int [] a;
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		int n = sc.nextInt(); //the n is small with maximum value 100 , lets try brute force
		a= sc.nextIntArray(n);
		int max=0;
		for(int i =0;i<n;i++){
			for(int j =i;j<n;j++){
				max=Math.max(max,count(i,j));
			}
		}
		pw.println(max);
		pw.close();



		//   ----------------------------First Solution -->Wrong Answer ----------------------------
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int [] a = sc.nextIntArray(n);
//		ArrayList<Integer>ones= new ArrayList(); //store the positions of ones //then will print the maximum distance
//		for(int i =0;i<a.length;i++) {
//			if(a[i]==1) {
//				ones.add(i);
//			}
//		}
//		if(n==ones.size()) {
//			System.out.println(0);
//			return;
//
//		}
//		if(ones.size()==0) {
//			System.out.println(n);return;
//		}
//		int max=Math.max(0, ones.get(0)+1);
//		for(int i =0;i<ones.size()-1;i++) {
//			max= Math.max(max,ones.get(i+1)-ones.get(i)+1);
//		}
//		max=Math.max(max, n-ones.get(ones.size()-1));
//		System.out.println(max);
	}
	static int count(int i , int j ){
			int sum=0;
			for(int k =0;k<a.length;k++){
				if(k>=i&&k<=j){
					sum+=1-a[k];
				}else{
					sum+=a[k];
				}
			}
			return sum;
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




package Ladder1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class SuperCentralPoint {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int l =0;
		int r=0;
		int u=0;
		int d=0;
		int count=0;
		ArrayList<pair> p = new ArrayList();
		for (int i =0;i<n;i++) {
			p.add(new pair(sc.nextInt(),sc.nextInt()));
		}
		for (int i=0;i<n;i++) {
			for (int j =0;j<n;j++) {
				if (j!=i) {
				if (p.get(i).a>p.get(j).a && p.get(i).b==p.get(j).b) {
					l++;
				}
				else if (p.get(i).a<p.get(j).a && p.get(i).b==p.get(j).b) {
					r++;
				}
				else if (p.get(i).a==p.get(j).a && p.get(i).b>p.get(j).b) {
					u++;
				}
				else if (p.get(i).a==p.get(j).a && p.get(i).b<p.get(j).b) {
					d++;
				}
				}
			}
			if (l>=1&&r>=1&&u>=1&&d>=1) {
				count++;
			}
			l=0;
			r=0;
			u=0;
			d=0;
		}
		System.out.println(count);
		
	}
	public  static class pair implements Comparable<pair>{
		   int a;
		   int b;
		   
		   
		   public pair(int a,int b) {
			   this.a=a;
			   this.b=b;
		   }
		   
		   
		   
		   
		   public int compareTo(pair p) {
			   if (this.a==p.a) {
				   return this.b-p.b;
			   }
			   return this.a-p.a;
			   
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
	


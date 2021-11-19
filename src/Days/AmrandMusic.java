package Days;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;


public class AmrandMusic {

	
	
	public static void main(String[] args) throws IOException {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();

		ArrayList<pair>a = new ArrayList<pair>();
		for(int i =0;i<n;i++) {
			int tmp= sc.nextInt();
			a.add(new pair(tmp,i));
		}
		Collections.sort(a);
		int sum=0;
		int count=0;
		StringBuilder s= new StringBuilder();
		for(int i =0;i<a.size();i++) {
			
			pair p = a.get(i);
			int days= p.a;
			
			sum+=days;
			if(sum<=k) {
				count++;
				s.append((p.b+1)+" ");
			}
			else break;
			
		}
		if(s.length()==0) {
			System.out.println(0);
			return;
		}
		System.out.println(count);
//		System.out.println(s.length());
		System.out.println(s.toString());
	}
	
	
	
	public  static class pair implements Comparable<pair>{
		   int a;
		   int b;
		   
		   
		   public pair(int a,int b) {
			   this.a=a;
			   this.b=b;
		   }
		   
		   
		   
		   
		   public int compareTo(pair p) {
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






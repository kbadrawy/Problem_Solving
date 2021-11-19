package contest2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Heaters {

	// not finished yet
	public static void main(String[] args) throws IOException {
		
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int r = sc.nextInt();
		int [] a = sc.nextIntArray(n);
		ArrayList<pair>ranges= new ArrayList<pair>();
		for(int i =0;i<n;i++) {
			if(a[i]==1) {
				int left=i-r+1;
				if(left<0)left=0;
				int right=i+r-1;
				if(right>n-1)right=n-1;
				ranges.add(new pair(left,right));
			}
		}
		int count=0;
		int min=0;
		int max=0;
		int start=0;
		if(ranges.size()==0||ranges.get(ranges.size()-1).b<n-1||ranges.get(0).a>0) {
			System.out.println(-1);
			return;
		}
		for(int i =0;i<ranges.size()-1;i++) {
			if(!(ranges.get(i).a==ranges.get(i+1).a)) {
				min=ranges.get(i).a;
				max=ranges.get(i).b;
				count++;
				start=i+1;
				break;
			}
		}
		
		
		for(int i = start;i<ranges.size();i++) {
			if(ranges.get(i).a>min&&ranges.get(i).a<max) {
				continue;
			}else {
				min=ranges.get(i-1).a;
				max=ranges.get(i-1).b;
				
				count++;
				
				break;
			}
			
		
		}
		if(count==0) {
			System.out.println(-1);
		}
		else {
			System.out.println(count);
		}

	}
	
	static class pair implements Comparable<pair > {
		int a;
		int b;
	  pair(int a , int b) {
			this.a=a;
			this.b=b;
		}
		@Override                    
		public int compareTo(pair p) {  //sort ascendingly but if two are equal then sort the second range descendingly 
			if(this.a==p.a) {
				return p.b-this.b;
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






























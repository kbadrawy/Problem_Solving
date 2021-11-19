package RandomContest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class RecursiveQueiries {

	static HashMap<Integer,Integer>h ;
	public static void main(String[] args) throws IOException {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		h= new HashMap<>();
		
		int[][]a= new int[10][1000001];
		int[]prefix= new int[10];
		for(int i =0;i<1000001;i++) {
			int temp = g(i);
			prefix[temp]++;
			a[0][i]=prefix[0];
			a[1][i]=prefix[1];
			a[2][i]=prefix[2];
			a[3][i]=prefix[3];
			a[4][i]=prefix[4];
			a[5][i]=prefix[5];
			a[6][i]=prefix[6];
			a[7][i]=prefix[7];
			a[8][i]=prefix[8];
			a[9][i]=prefix[9];
		}
		for (int i=0;i<n;i++) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			int k = sc.nextInt();
			System.out.println(-a[k][l-1]+a[k][r]);
		}
	}
	
	
	
	// First solution : resulting in TLE ....
	public static int g(int n ) {
		if (n<10)
			return n;
		if (h.containsKey(n))
			return h.get(n);
		h.put(n,g(f(n)));
		return h.get(n);
	}
	public static int f (int n ) {
		int ans=1;
		   while (n!=0)
		    {
		        if (n % 10!=0)
		            ans *= n % 10;

		        n /= 10;
		    }
		return ans;
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









package Days;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Cakeminator {

	public static void main(String[] args) throws IOException {
		Scanner sc= new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int count=0;
		boolean [][] vis = new boolean [r][c];
		int [][] input = new int [r][c];
		
		for(int i =0;i<r;i++) {
			String  a =sc.nextLine();
				for(int j=0;j<c;j++) {
					if(a.charAt(j)=='S') {
					input[i][j]=1;
					}}}
	
		
		for(int i =0;i<r;i++) {
			boolean evil=false;
			for(int j=0;j<c;j++) {
				if(input[i][j]==1) {
					evil=true;
					break;
				}}
			if(!evil) {
				for(int k =0;k<c;k++) {
					if(!vis[i][k]) {
						count++;
						vis[i][k]=true;
					}}}}
		for(int j=0;j<c;j++) {
			boolean evil=false;
			for(int i =0;i<r;i++) {
				if(input[i][j]==1) {
					evil=true;
					break;
				}
			}
			if(!evil) {
				for(int k =0;k<r;k++) {
					if(!vis[k][j]) {
						count++;
						vis[k][j]=true;
					}
					}}}
		System.out.println(count);
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









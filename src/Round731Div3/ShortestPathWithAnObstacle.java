package Round731Div3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ShortestPathWithAnObstacle {

	
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int t= sc.nextInt();
		while(t-->0) {
			int ax=sc.nextInt();
			int ay=sc.nextInt();
			int bx=sc.nextInt();
			int by=sc.nextInt();
			int cx=sc.nextInt();
			int cy=sc.nextInt();
			
			if(ax==bx&&ax==cx) {
				int min=Math.min(ay, by);
				int max= Math.max(ay, by);
				if(cy>=min&&cy<=max) {
					System.out.println(max-min+2);
				}
				else {
					System.out.println(max-min);
				}
				continue;
			}
			if(ay==by&&ay==cy) {
				int min=Math.min(ax, bx);
				int max= Math.max(ax, bx);
				if(cx>=min&&cx<=max) {
					System.out.println(max-min+2);
				}
				else {
					System.out.println(max-min);
				}
				continue;
			}
			System.out.println(Math.abs(ax-bx)+Math.abs(ay-by));
			
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















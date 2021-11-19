package Round739Div3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class WhoIsTheOpposite {

	
	//we need to check if a circle like this exists first 
	//maximum number of node = 2 x diff
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		int t = sc.nextInt();
		while(t-->0) {
			long a= sc.nextLong();
			long b = sc.nextLong();
			long c = sc.nextLong();
			long diff = Math.abs(a-b);
			long maxm = 2*diff;
			
			if(a>maxm||b>maxm) {
				pw.println(-1);
				continue;
			}
			if(diff==1) {
				if(c==1) {
					pw.println(2);
					continue;
					}
				if(c==2) {
					pw.println(1);
					continue;
					}
				pw.println(-1);
				continue;
			}
			if(c>maxm) {
				pw.println(-1);
				continue;
			}
			if(a==c) {
				pw.println(b);
				continue;
			}
			if(b==c) {
				pw.println(a);
				continue;
			}
			
			if((c+diff)>maxm) {
				if((c-diff)<1||(c-diff)==a||(c-diff)==b) {
					pw.println(-1);
				}else {
					pw.println(c-diff);
				}
				
			}
			else {
				pw.println(c+diff);
			}
			
		}
		pw.flush();
		pw.close();
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



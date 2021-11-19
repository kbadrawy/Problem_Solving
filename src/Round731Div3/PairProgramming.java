package Round731Div3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PairProgramming {

	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int l = sc.nextInt();
			int n =sc.nextInt();
			int m =sc.nextInt();
			int[] nn= sc.nextIntArray(n);
			int []mm= sc.nextIntArray(m);
			int i =0;
			int j=0;
			boolean flag=true;
			StringBuilder s = new StringBuilder();
			while(i<n&&j<m) {
				if(nn[i]==0) {
					l++;
					s.append(0);
					s.append(" ");
					i++;
				}
				else if(nn[i]<=l) {
					s.append(nn[i]);
					s.append(" ");
					i++;
				}
				else {
					if(mm[j]==0) {
						l++;
						s.append(0);
						s.append(" ");
						j++;
					}
					else if(mm[j]<=l) {
						s.append(mm[j]);
						s.append(" ");
						j++;
					}
					else {
						
					flag=false;
					break;
					}
				}
			}
			while(i<n) {
				if(nn[i]==0) {
					l++;
					s.append(0);
					s.append(" ");
					i++;
				}
				else if(nn[i]<=l) {
					s.append(nn[i]);
					s.append(" ");
					i++;
				}
				else {
					flag=false;
					break;
				}
			}
			
			while(j<m) {
				if(mm[j]==0) {
					l++;
					s.append(0);
					s.append(" ");
					j++;
				}
				else if(mm[j]<=l) {
					s.append(mm[j]);
					s.append(" ");
					j++;
				}
				else {
					flag=false;
					break;
				}
			}
			if(!flag) {
				System.out.println(-1);
			}
			else {
			    System.out.println(s.toString());
			}
			
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

















package RandomContest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class XORorOR {

	
	
	public static void main(String[] args) throws IOException {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		for (int i=0;i<n;i++) {
//			boolean flag=true;
			String[] line=sc.nextLine().split(" ");
			long a=Long.parseLong(line[0]);
			long b=Long.parseLong(line[1]);
			long dif =Math.abs( a-b);
			if ((a|dif)==(b^dif))
				System.out.println(dif);
			else 
				System.out.println(-1);
		
			}
//			String x = String.format("%1000000s",Long.toBinaryString(a));
//			String y = String.format("%1000000s",Long.toBinaryString(b));
//			StringBuilder output = new StringBuilder();
//			for (int j =0;j<x.length();j++) {
//				if (x.charAt(j)==y.charAt(j)) {
//					output.append(0);
//				}
//				else {
//					if (y.charAt(i)=='1') {
//						System.out.println(-1);
//						flag=false;
//						break;
//					}
//					else output.append(x.charAt(i));
//				}
//				}
//			if (flag) {
//				System.out.println(Integer.parseInt(output.toString(),2));
//			}
//			}
//			int dif = Math.abs(x.length()-y.length());
//			StringBuilder output = new StringBuilder();
//			int idx=0;
//			while(dif>0) {
//				if (x.length()>y.length()) {
//					output.append(x.charAt(idx));
//				}
//				else  {
//					if (y.charAt(idx)=='1') {
//						System.out.println(-1);
//						flag=false;
//						break;
//						}
//					else output.append(0);
//				}
//
//				idx++;
//				dif--;
//			}
//			if (!flag)
//				continue;
//			if(x.length()>=y.length()) {
//				for (int j=0;j<y.length();j++) {
//					if (x.charAt(idx)==y.charAt(j))
//						output.append(0);
//					else if (y.charAt(j)=='1') {
//						System.out.println(-1);
//						flag=false;
//						break;
//					}
//					else output.append(1);
//					idx++;
//				}
//				}
//			else {
//				for (int j=0;j<x.length();j++) {
//					if (x.charAt(j)==y.charAt(idx))
//						output.append(0);
//					else if (y.charAt(idx)==1) {
//						System.out.println(-1);
//						flag=false;
//						break;
//					}
//					else output.append(1);
//					idx++;
//				}
//			}
//			if (flag)
//			System.out.println(Integer.parseInt(output.toString(),2));
//		}
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






package Days;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SpreadSheets {

	public static void main(String[] args) throws IOException {
		Scanner sc= new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			boolean type1=true;
			char[]a= sc.nextLine().toCharArray();
			if(a[0]=='R'&&Character.isDigit(a[1])) {
				for(int i=2;i<a.length;i++) {
					if(a[i]=='C') {
						type1=false;
						break;
					}
				}
			}
			StringBuilder br = new StringBuilder();
			if(type1) {
				String col="";
				String r="";
				for(int i=0;i<a.length;i++) {
					if(Character.isDigit(a[i])) {
						r+=a[i];
					}
					else {
						col+=a[i];
					}
				}
				int row= Integer.parseInt(r);
				
				//will do the conversion
				int mag=1;
				int sum=0;
				for(int i =col.length()-1;i>=0;i--) {
					sum+=((col.charAt(i)-'A'+1)*mag);
					mag*=26;
				}
				System.out.println("R"+r+"C"+sum);
				
			}
			else {
				String r ="";
				String c ="";
				boolean found=false;
				for (int i =1;i<a.length;i++) {
					if(a[i]=='C') {
						found=true;
						continue;
						}
					if(found)c+=a[i];
					else r+=a[i];
				}
				int row= Integer.parseInt(r);
				int col = Integer.parseInt(c);
				int num=col;
				String ans="";
				

		        while (num > 0) {
		            int nextCharIndex = num % 26;
		            if (nextCharIndex == 0) {
		                nextCharIndex += 26;
		                num -= 26;
		            }
		            char nextChar = (char) ('A' + nextCharIndex - 1);
		            ans = nextChar + ans;
		            num /= 26;
		        }

				  System.out.println(ans+row);
				  

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









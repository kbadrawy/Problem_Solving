package EducationalRound112;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Twotables {

	// "we can move only the first table"
	// Find the minimum distance 
	// THINK SIMPLY YA GEGO 
	public static void main(String[] args) throws IOException {
		Scanner sc= new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			
			// dimensions of the grid 
			int w= sc.nextInt();
			int h = sc.nextInt();
			// coordinates of the first triangle
			int x1=sc.nextInt(); 
			int y1=sc.nextInt();
			int x2=sc.nextInt(); 
			int y2=sc.nextInt();
			// dimensions of the first triangle
			int h1=y2-y1;
			int w1= x2-x1;
			// dimensions of the second triangle
			int w2=sc.nextInt();
			int h2= sc.nextInt();
			
			
			if(w1+w2<=w||h1+h2<=h) {
				if((h2<=y1||h2<=(h-y2))||(w2<=x1||w2<=(w-x2))) // the second rectangle already has free space to fit in 
				System.out.println(0);
				else {
					// four cases to handle :- left right above below 
					
					double dis= Double.POSITIVE_INFINITY;
					
					if(h2+h1<=h) { //putting the second rectangle above or below the first 
						dis=Math.min(dis, Math.min(y2-(h-h2), h2-y1));
					}
					if(w2+w1<=w) { //putting the second rectangle to the left or the right of the first
						// w2-x1 :- lw 7atena el table 3al shemal hayetba2a mino ad eh w de hatkoon el distance 
						// x2-(w-w2) :- lw 7atena el table 3al yemeen hayetb2a mino ad eh w de hatkoon el distance 
						dis=Math.min(Math.min(x2-(w-w2), w2-x1), dis);
					}
					System.out.println(dis);
//					dis=Math.min(1,2);
				}
				continue;
			}
			else { // mahma 3mlt el grid esta7ala tekafi both rectangles
				System.out.println(-1);
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








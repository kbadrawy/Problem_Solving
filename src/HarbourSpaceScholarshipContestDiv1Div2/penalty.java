package HarbourSpaceScholarshipContestDiv1Div2;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class penalty {

// with some help 
	public static void main(String[] args) throws IOException  {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		while(n-->0) {
			int first=0;
			int second=0;
			String x =sc.nextLine();
			char[] a =x.toCharArray();
			
			//counting the number of predictions for each of the two players
			
			// if the first player will get all the predictions
			int ansf=10;
			for(int i =0;i<10;i++) {
				if(i%2==0) {
					if(a[i]=='?') {
						first++;        //number of predictions for the first player
					}
					else {
						first+=Integer.parseInt(a[i]+"");  //number of ordinary goals
					}
					
					if((10-i)/2+second<first) {  //if the number of left possible plays for the second player + what he has already scored < what first player has scored 
						ansf=i+1; //first player will win and break; 
						break;
					}else {
						if((10-i)/2-1+first<second) { // the number what the first player already have  + number of shots remaining < second
							ansf=i+1; //second player will win then break;
							break;
						}
					}
				}
				else {
				if(a[i]!='?') {
					second+=Integer.parseInt(a[i]+"");
				}
				if((10-i)/2+first<second) { 
					ansf=i+1;
					break;
				}else {
					if((10-i)/2+second<first) {
						ansf=i+1;
						break;
					}
				}
				}}
			
			
			// if the second player gets all the predictions
			int anss=10;
			first=0;
			second=0;
			for(int i =0;i<10;i++) {
				if(i%2!=0) {
					if(a[i]=='?') {
						second++;
					}
					else {
						second+=Integer.parseInt(a[i]+"");
					}
					
					if((10-i)/2+first<second) {
						anss=i+1;
						break;
					}else {
						if((10-i)/2+second<first) {
							anss=i+1;
							break;
						}
					}
					
				}
				else {
				if(a[i]!='?') {
					first+=Integer.parseInt(a[i]+"");
				}
				if((10-i)/2+second<first) {
					anss=i+1;
					break;
				}else {
					if((10-i)/2-1+first<second) {
						anss=i+1;
						break;
					}
				}
				}}
			
			System.out.println(Math.min(ansf, anss));

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















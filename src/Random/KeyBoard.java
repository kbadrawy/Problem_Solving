package Random;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.StringTokenizer;

public class KeyBoard {

	public static void main(String[] args) throws IOException {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int m =sc.nextInt();
		int x = sc.nextInt();
		HashSet<Character>h = new HashSet();
		boolean possible [] = new boolean [26];
		char [][] input= new char[n][m];
		ArrayList<pair>shift = new ArrayList<>();
		for (int  i=0;i<n;i++) {
			char [] a= sc.nextLine().toCharArray();
			
			for(int j =0;j<m;j++) {
				if(a[j]=='S') {
					shift.add(new pair(i,j));
				}
				h.add(a[j]);
				input[i][j]=a[j];
			}
		}
		for(int i =0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(!(input[i][j]=='S')) {
				for(int k=0;k<shift.size();k++) {
					int x1= shift.get(k).a;
					int y1= shift.get(k).b;
					
					double dis = Math.sqrt((Math.abs(x1-i))*(Math.abs(x1-i))+(Math.abs(y1-j))*(Math.abs(y1-j)));
					if(dis<=x) {
						possible[input[i][j]-'a']=true;
					break;
					}}}}}

		int count=0;
		int len= sc.nextInt();
		char [] a= sc.nextLine().toCharArray();
		for(int i =0;i<a.length;i++) {
			if(Character.isLowerCase(a[i])) {
				if(!h.contains(a[i])) {
					System.out.println(-1);
					return;
				}
				continue;
			}
			char tmp = Character.toLowerCase(a[i]);
			if(!h.contains(tmp)) {
				System.out.println(-1);
				return;
			}
			if(shift.size()==0) {
				System.out.println(-1);
				return;
			}
			if(!possible[tmp-'a']) {
				count++;
			}
		}
		System.out.println(count);
	}
	
	
	public  static class pair implements Comparable<pair>{
		   int a;
		   int b;
		   
		   
		   public pair(int a,int b) {
			   this.a=a;
			   this.b=b;
		   }
		   
		   
		   
		   
		   public int compareTo(pair p) {
			   if (this.a==p.a) {
				   return this.b-p.b;
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









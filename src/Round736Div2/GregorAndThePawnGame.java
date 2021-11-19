package Round736Div2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GregorAndThePawnGame {

	
	public static void main(String[] args) throws IOException {
		Scanner sc= new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			char [][] rows = new char[2][n];
			int countg=0;
			int counte=0;
			for(int i=0;i<2;i++) {
				char[] row= sc.nextLine().toCharArray();
				for(int j=0;j<n;j++) {
					if(i==0&&row[j]=='0') {
						counte++;
					}
					if(i==1&&row[j]=='0') {
						countg++;
					}
					rows[i][j]=row[j];
				}
			}
			if(countg==n) {
				System.out.println(0);
				continue;
			}
			if(counte==n) {
				System.out.println(n-countg);
				continue;
			}
			
			
			int count=0;
				for(int j=0;j<n;j++) {
					if(rows[1][j]=='1') {
						if(rows[0][j]=='0') {
							count++;
						}
						else {
							if(j==0) {
								if(rows[0][j+1]=='1') {
									count++;
									rows[0][j+1]='0';
								}
								continue;
							}
							if(j==n-1) {
								if(rows[0][j-1]=='1') {
									count++;
									rows[0][j-1]='0';
								}
								continue;
							}
							if(rows[0][j-1]=='1') {
								count++;
								rows[0][j-1]='0';
							}
							else if(rows[0][j+1]=='1') {
								rows[0][j+1]='0';
								count++;
							}
						}
					}
				}
				System.out.println(count);
			
			
			
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



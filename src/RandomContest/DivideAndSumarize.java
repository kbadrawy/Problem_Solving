package RandomContest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class DivideAndSumarize {

	static HashSet<Long>x;
	
	public static void main(String[] args) throws IOException {
		
		main2();

		
	}
	
	
	public static void gSum(ArrayList<Integer>a) {
		
		long sum=0;
		for (int i =0;i<a.size();i++) {
			sum+=a.get(i);
			}
		x.add(sum);
		int min = a.get(0);
		
		int max= a.get(a.size()-1);

		if (min==max)return;
		
		long mid=(min+max)/2;
		
		ArrayList<Integer>temp1=new ArrayList();
		ArrayList<Integer>temp2=new ArrayList();
	
		for (int i =0;i<a.size();i++) {
			if (a.get(i)<=mid) temp1.add(a.get(i));
			else temp2.add(a.get(i));
		}
	
		gSum(temp1);
		gSum(temp2);
	}
	 
	public static void main2() throws IOException {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0) {
			int n= sc.nextInt();
			int q= sc.nextInt();
			ArrayList<Integer>a =new ArrayList<Integer>();
			for (int i =0;i<n;i++) {
				a.add(sc.nextInt());
			}
			x=new HashSet<Long>();
			Collections.sort(a);
			gSum(a);
			for (int i =0;i<q;i++) {
				long sum=sc.nextInt();
				if(x.contains(sum)) {
					System.out.println("YES");
				}
				else {
					System.out.println("NO");
				}
			}
		}
	}
	

	public static int binary(long x , long [] a, int min , int max) {
	
		int mid=(min+max)/2;
		while(min<=max) {
			mid=(min+max)/2;
			if (a[mid]<=x) {
				min=mid+1;
			}
			else {
				max=mid-1;
			}
		}
		return min;
	}
	public static int sum(ArrayList<Integer> a) {
		int sum=0;
		for (int i =0;i<a.size();i++)
			sum+=a.get(i);
		return sum;
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











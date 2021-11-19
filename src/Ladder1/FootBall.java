package Ladder1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FootBall {

	public static void main(String[] args) throws IOException {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int team1=0;
		int team2=0;
		String t1="";
		String t2="";
		t1=sc.nextLine();
		team1++;
		for (int i =1;i<n;i++) {
			String t=sc.nextLine();
			if(t.equals(t1))team1++;
			else {team2++;
			t2=t;}
		}
		if(team1>team2) {
			System.out.println(t1);
			return;
		}
		System.out.println(t2);
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

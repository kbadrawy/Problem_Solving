package TeamContest1;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class JummpingAlongTheHummocks {

	static int n ;
	static int memo[]; //count the number of ways
    static int [] next;
    static int []a;
    static int [] before;
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        n = sc.nextInt();
        memo = new int [200002];
        next = new int [n+1];
        before = new int [200002];
        Arrays.fill(memo,-1);
        Arrays.fill(next,-1);
        Arrays.fill(before,-1);
        a = sc.nextIntArray(n);
        for(int i =n-1;i>=0;i--){
            if(before[a[i]]==-1){
                next[i]=-1;
                before[a[i]]=i;
            }else{
                next[i]=before[a[i]];
                before[a[i]]=i;
            }
        }
        System.out.println(dp(0));
		
	}

	static int dp(int i){
	    if(i==n-1){
	        return 0;
        }
	    if(memo[i]!=-1){
	        return memo[i];
        }
	    int res=(int)(Double.POSITIVE_INFINITY);
        if(next[i]!=-1){
            res=dp(next[i])+1;
        }
         res=Math.min(res,dp(i+1)+1);
	    return memo[i]=res;
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






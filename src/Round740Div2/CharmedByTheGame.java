package Round740Div2;

import java.io.*;
import java.util.StringTokenizer;

public class CharmedByTheGame {
    //Upsolving:-
    // we will notice a pattern
    // we need to get total number of games played and the number of serves for each player
    // there is a chance that one player will play that the other player with one game and that if the total number of games was odd

    public static void main(String[] args) throws IOException {
        Scanner sc= new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int d = Math.abs(a-b); //difference
            int n = a+b; //total number of games played
            // we will assume that A-->p , B-->q number of games
            int p =(int) Math.ceil((n*1.0)/(2*1.0));
            int q = n/2;
            d/=2;
            int count=0;
            StringBuilder br = new StringBuilder();
            if(n%2==0){ //number of games are even ; A&B played the same number of games
                for(int i=0;i+d<=n-d;i+=2){
                         br.append((d+i)+" ");
                         count++;
                }
            }else{
                for(int i=0;i+d<=n-d;i++){
                         br.append((d+i)+" ");
                         count++;
                }
            }
            pw.println(count);
            pw.println(br.toString());
}
        pw.flush();
        pw.close();
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

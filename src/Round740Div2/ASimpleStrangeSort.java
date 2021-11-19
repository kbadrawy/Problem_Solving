package Round740Div2;

import java.io.*;
import java.util.StringTokenizer;

public class ASimpleStrangeSort {
    static int [] a;
    public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    PrintWriter pw = new PrintWriter(System.out);
    int t = sc.nextInt();
    while(t-->0){
        int n = sc.nextInt();
        a = sc.nextIntArray(n);

        int idx=0;
        while(true){
          if(sorted())break;
//            boolean stop= true;
           if(idx%2==0){
               for(int i =0;i<n-1;i+=2){
//                   stop&=cond(i);
                   if(!cond(i)){
                       int tmp = a[i];
                       a[i]=a[i+1];
                       a[i+1]=tmp;
                   }
               }
           }else{
               for(int i =1;i<n-1;i+=2){
//                   stop&=cond(i);
                    if(!cond(i)){
                        int tmp = a[i];
                        a[i]=a[i+1];
                        a[i+1]=tmp;
                    }
               }
 }
//            if(stop)break;
           idx++;
        }
        pw.println(idx);
    }
    pw.flush();
    pw.close();
    }
    public static boolean sorted(){
        for(int i=0;i<a.length-1;i++){
            if(a[i+1]<a[i]){
                return false;
            }
        }
        return true;
    }
    public static boolean cond(int i ){
        if(a[i+1]>a[i]){
            return true;
        }
        return false;
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

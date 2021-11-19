package EducationalRound114;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
//SLAY THE DRAGON
public class C {
    static long [] a;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = sc.nextInt();
        a = sc.nextlongArray(n);
        long sum = 0;
        Arrays.sort(a);
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            long x = sc.nextLong();
            long y = sc.nextLong();
            int idx = binary(x);
            long ansfinal = (int) Double.POSITIVE_INFINITY;
            if ((idx!=a.length&& a[idx] == x )|| idx == 0) { //the perfect one
                if ((sum - a[idx]) < y) {
                    ansfinal = y - (sum - a[idx]);
                } else {
                    pw.println(0);
                    continue;
                }
            } else {
                if (idx == a.length) {
                    idx--;
                    long tmp = 0;
                    if (a[idx] < x) {
                        tmp += (x - a[idx]);
                    }
                    if ((sum - a[idx]) < y) {
                        tmp += (y - (sum - a[idx]));
                    }
                    ansfinal = Math.min(ansfinal, tmp);
                    if(ansfinal==(int)Double.POSITIVE_INFINITY){
                        ansfinal=tmp;
                    }
                } else {
                    long ans1=0;
                    long ans2=0;
                    if((a[idx])<x){
                        ans1=(x-a[idx]);
                    }
                    if((sum-a[idx])<y){
                        ans1+=(y-(sum-a[idx]));
                    }
                    ansfinal=Math.min(ansfinal,ans1);
                    if(ansfinal==(int)Double.POSITIVE_INFINITY){
                        ansfinal=ans1;
                    }
                    if(idx!=0){
                        idx--;

                        if((a[idx])<x){
                            ans2=(x-a[idx]);
                        }
                        if((sum-a[idx])<y){
                            ans2+=(y-(sum-a[idx]));
                        }
                        ansfinal=Math.min(ansfinal,ans2);
                        if(ansfinal==(int)Double.POSITIVE_INFINITY){
                            ansfinal=ans2;
                        }
                    }
                }
            }
            pw.println(ansfinal);
        }
        pw.flush();
        pw.close();

    }
    public static int binary(long x ) {
        int min =0;
        int max=a.length-1;
        int mid=(min+max)/2;
        while(min<=max) {
            mid=(min+max)/2;
            if (a[mid]<x) {
                min=mid+1;
            }
            else {
                max=mid-1;
            }
        }
        return min;
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


/*
115294727238 342974296362040972
942262912263 978481223766764846
816830171693 411165238131334192
650579085185 473791809345237268
20797702227 759306511771246314
38616883543 191330383167450003
321539777778 42748526076694221
990193119376 22478394446199701
62499599595 750031267008884168
413480644236 643746137959017996
832194108049 469298010418212848
305280623537 842928722444660305
427466066813 758448540678334976
905325478888 628551397696073377


 */
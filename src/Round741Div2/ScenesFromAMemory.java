package Round741Div2;

import java.io.*;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.StringTokenizer;

public class ScenesFromAMemory {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = sc.nextInt();
        boolean [] prime = new boolean[10];
        prime[2]=true;
        prime[3]=true;
        prime[5]=true;
        prime[7]=true;
        while(t-->0){
            ArrayList<Integer>p= new ArrayList<>();
            Hashtable<Integer,Integer>pp= new Hashtable<>();
            String ans="";
            int x = sc.nextInt();
            char[] n = sc.nextLine().toCharArray();
            for(int i =0;i<n.length;i++){
                if(prime[Integer.parseInt(n[i]+"")]==true){
                    if(!p.contains(Integer.parseInt(n[i]+"")))
                        p.add(Integer.parseInt(n[i]+""));
                    if(!pp.containsKey(Integer.parseInt(n[i]+""))){
                        pp.put(Integer.parseInt(n[i]+""),1);
                    }else{
                        int tmp = pp.get(Integer.parseInt(n[i]+""));
                        tmp++;
                        pp.put(Integer.parseInt(n[i]+""),tmp);
                    }
                }else{
                    ans+=n[i];
                    break;
                }
            }
            if(ans.length()!=0){
                pw.println(1);
                pw.println(ans);
                continue;
            }
            // if any of the prime numbers is repeated then print any of them twice
            if(pp.containsKey(2)){
                if(pp.get(2)>1){
                    ans="22";
                    pw.println(2);
                    pw.println(22);
                    continue;
                }
                else{
                    int idx=p.indexOf(2);
                    if(idx>0){
                        ans=p.get(0)+"2";
                        pw.println(2);
                        pw.println(ans);
                        continue;
                    }
                }
            }
            if(pp.containsKey(5)) {
                if (pp.get(5) > 1) {
                    ans = "55";
                    pw.println(2);
                    pw.println(55);
                    continue;
                }
                else{
                    int idx=p.indexOf(5);
                    if(idx>0){
                        ans=p.get(0)+"5";
                        pw.println(2);
                        pw.println(ans);
                        continue;
                    }
                }
            }
          if(pp.containsKey(7)){
              if(pp.get(7)>1){
                  ans="77";
                  pw.println(2);
                  pw.println(77);
                  continue;
              }
          }
          if(pp.containsKey(3)){
              if(pp.get(3)>1){
                  ans="33";
                  pw.println(2);
                  pw.println(33);
                  continue;
              }
          }

            ArrayList<String>not= new ArrayList<>();
            not.add("27");
            not.add("25");
            not.add("52");
            not.add("57");
            not.add("32");
            not.add("35");
            not.add("72");
            not.add("75");
            boolean flag=false;
            for(int i =0;i<p.size();i++){
                for(int j=0;j<p.size();j++){
                    if(i==j)continue;
                    String tmp = p.get(i)+""+p.get(j)+"";
                    if(not.contains(tmp)){
                        ans=tmp;
                        flag=true;
                        break;

                    }
                }
                if(flag)break;
            }
          pw.println(2);
          pw.println(ans);


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

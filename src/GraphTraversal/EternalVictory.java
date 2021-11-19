package GraphTraversal;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class EternalVictory {
    //Required: Minimal length of traversal such that you can reach all destinations
    // we need to get the maximum road length
    static ArrayList<pair>[]adj;
    static boolean [] vis;
    static long max;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans=0;
        max=0;
        int t = n-1;
        adj = new ArrayList[n+1];
        for(int i =0;i<n+1;i++){
            adj[i]=new ArrayList<pair>();
        }
        while(t-->0){

            int x = sc.nextInt();
            int y=  sc.nextInt();
            int w = sc.nextInt(); //length of the road so we have a weighted graph
            adj[x].add(new pair(y,w));
            adj[y].add(new pair(x,w));
            ans+=(2*w);

        }
        vis = new boolean[n+1];
        dfs(1,0);
        ans-=max;
        System.out.println(ans);
}

    public static void dfs(int u , int s){
        vis[u]=true;
        for(int i =0;i<adj[u].size();i++){
            if(!vis[adj[u].get(i).x]) {
//                max = Math.max(max, adj[u].get(i).w + s);
                dfs(adj[u].get(i).x, adj[u].get(i).w + s);
            }
        }
        max = Math.max(max,  s);
    }
    static class pair implements  Comparable<pair>{
        int x, w;

         pair(int x , int w){
            this.x=x;
            this.w=w;
        }
        @Override
        public int compareTo(pair o) { //in ascending order
            return this.w-o.w;
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

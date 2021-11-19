package GraphTraversal;

import java.io.*;
import java.util.*;

public class LinovaAndTheKingdom {

    static ArrayList<Integer>[]adj;
    static boolean []vis;
    static ArrayList<Integer>dis;


    /* Required to save :-
    *  the level of each node (can be easily achieved using dfs) stored in an array
    *  the number of nodes in each subtree created  stored in an array
    * */

    static int [] level;
    static int [] nodes;
    static PriorityQueue<pair>q;
    public static void main(String[] args) throws IOException {
        Scanner sc= new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        q = new PriorityQueue<pair>(Collections.reverseOrder());
        int n = sc.nextInt();
        int k = sc.nextInt(); //industry
        int t = n-1;
        adj= new ArrayList[n+1];
        for(int i =0;i<n+1;i++){
            adj[i]=new ArrayList<>();
        }
        vis = new boolean[n+1];
        level= new int[n+1];
        nodes = new int[n+1];
        while(t-->0){
            int u = sc.nextInt();
            int v = sc.nextInt();
            adj[u].add(v);
            adj[v].add(u);
        }
        dfs(1);
        for(int i =1;i<n+1;i++){
            q.add(new pair(i,level[i]+1-nodes[i]));
        }
        long count =0;
        for(int j=0;j<k;j++){
            count+=q.peek().y;
            q.poll();
        }
        pw.println(count);
        pw.flush();
        pw.close();
    }
    //to get the level of each node + its parent + size of the subtree;
    public static void dfs(int u ){ //input node and its parent
        vis[u]=true;
        nodes[u]=1;
        for(int i =0;i<adj[u].size();i++){
            if(!vis[adj[u].get(i)]){
                vis[adj[u].get(i)]=true;
                level[adj[u].get(i)]=level[u]+1;
                nodes[u]+=nodes[adj[u].get(i)];
                dfs(adj[u].get(i));
                nodes[u]+=nodes[adj[u].get(i)];

            }
        }
}



    static class pair implements Comparable<pair>{
        long x,y;
        pair(long x, long y){
            this.x=x;
            this.y=y;
        }
        @Override
        public int compareTo(pair o) {
            return (int) (this.y-o.y);
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


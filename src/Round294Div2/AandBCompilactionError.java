package Round294Div2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.StringTokenizer;

public class AandBCompilactionError {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashMap<Integer,Integer>h= new HashMap<Integer,Integer>();
		HashMap<Integer,Integer>h1= new HashMap<Integer,Integer>();
		HashMap<Integer,Integer>h2= new HashMap<Integer,Integer>();
		
		for (int i=0;i<n;i++) {
			int k= sc.nextInt();
			if(!h.containsKey(k)) {
				h.put(k, 1);
			}
			else {
				int v = h.get(k);
				v+=1;
				h.put(k, v);
				}
		}
		
		for (int i=0;i<n-1;i++) {
			int k= sc.nextInt();
			if(!h1.containsKey(k)) {
				h1.put(k, 1);
			}
			else {
				int v = h1.get(k);
				v+=1;
				h1.put(k, v);
				}
		}
		
		for (int i=0;i<n-2;i++) {
			int k= sc.nextInt();
			if(!h2.containsKey(k)) {
				h2.put(k, 1);
			}
			else {
				int v = h2.get(k);
				v+=1;
				h2.put(k, v);
				}
		}
		Iterator it = h.entrySet().iterator();
		while (it.hasNext()) {
		     Map.Entry pair = (Map.Entry)it.next();
		     int k = (int)pair.getKey();
		     if(h1.containsKey(k)) {
		    	 int v = (int)pair.getValue();
		    	 int v1 =h1.get(k);
		    	 if (v==v1) {
		    		 continue;
		    	 }
		    	 else {
		    		 System.out.println(k);
		    		 break;
		    		
		    	 }
		    	 
		     }
		     else {
		    	 System.out.println(k);
		    	 break;
		     }
		}
		
		it = h1.entrySet().iterator();
		while (it.hasNext()) {
		     Map.Entry pair = (Map.Entry)it.next();
		     int k = (int)pair.getKey();
		     if(h2.containsKey(k)) {
		    	 int v = (int)pair.getValue();
		    	 int v1 =h2.get(k);
		    	 if (v==v1) {
		    		 continue;
		    	 }
		    	 else {
		    		 System.out.println(k);
		    		break;
		    	 }
		    	 
		     }
		     else {
		    	 System.out.println(k);
		    	break;
		     }
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



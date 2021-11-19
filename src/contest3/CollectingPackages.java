package contest3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class CollectingPackages {

	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
	
		for (int i =0;i<n;i++) {
			int p=Integer.parseInt(br.readLine());
			ArrayList<pair>coord=new ArrayList<pair>();
			String res="";
			boolean flag=true;
			int right=0;
			int up=0;
			for (int j =0;j<p;j++) {
				String [] c = br.readLine().split(" ");
				int x=Integer.parseInt(c[0]);
				int y=Integer.parseInt(c[1]);
				coord.add(new pair(x,y));
				
			}
			Collections.sort(coord);
			
			for (int j=0;j<coord.size();j++) {
				if (right>coord.get(j).a) {
					flag=false;
					break;
				}
				else {
				while(right<coord.get(j).a) {
					res+="R";
					right++;
				}
				}
				if (up>coord.get(j).b) {
					flag=false;
					break;
				}
				else {
				while(up<coord.get(j).b) {
					res+="U";
					up++;
				}
				
			}
				}
			if (flag) {
				System.out.println("YES");
				System.out.println(res);
			
			}
			else {
				System.out.println("NO");
			}
		}
	}
	public  static class pair implements Comparable<pair>{
		   int a;
		   int b;
		   
		   
		   public pair(int a,int b) {
			   this.a=a;
			   this.b=b;
		   }
		   
		   
		   
		   
		   public int compareTo(pair p) {
			   if (this.a==p.a) {
				   return this.b-p.b;
			   }
			   return this.a-p.a;
			   
		   }
		   
		   
		}
}

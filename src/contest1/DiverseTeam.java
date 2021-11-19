package contest1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Enumeration;
import java.util.Hashtable;

public class DiverseTeam {

	
	public static void main(String[]args) throws IOException {
		
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 String[]x= br.readLine().split(" ");
		 String[]y= br.readLine().split(" ");
		 Hashtable<Integer,Integer>distinct=new Hashtable<Integer,Integer>();
		 int n = Integer.parseInt(x[0]);
		 int k = Integer.parseInt(x[1]);
		 for (int i =0;i<n;i++) {
			 int rating=Integer.parseInt(y[i]);
			 distinct.put(rating,i+1);
		 }
		 
		 Enumeration<Integer> values = distinct.elements();
		
		if (distinct.size()<k) {
			System.out.println("NO");
			return;
		}
		System.out.println("YES");
		for (int i =0;i<k;i++) {
			if (i==k-1)
			   System.out.print(((values).nextElement()));
			else
				System.out.print(((values).nextElement())+" ");
		}
		

	}
	

}

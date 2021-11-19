package contest5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;


public class Dragons {

	
public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String []a=br.readLine().split(" ");
	int s= Integer.parseInt(a[0]);
	int n= Integer.parseInt(a[1]);
	ArrayList<pair>p=new ArrayList<pair>();
	for (int i =0;i<n;i++) {
		a=br.readLine().split(" ");
		int ds= Integer.parseInt(a[0]);
		int b= Integer.parseInt(a[1]);
		p.add(new pair(ds,b));
		
	}
	Collections.sort(p);
	for (int i =0;i<n;i++) {
		if(s<=p.get(i).strength) {
			System.out.println("NO");
			return;
		}
		s+=p.get(i).bonus;
	}
	System.out.println("YES");
}


public  static class pair implements Comparable<pair>{
	   int strength;
	   int bonus;
	   
	   
	   public pair(int a,int b) {
		   this.strength=a;
		   this.bonus=b;
	   }
	   
	   
	   
	   
	   public int compareTo(pair p) {
		 return this.strength-p.strength;
		}
	   
	   
	}
	
}

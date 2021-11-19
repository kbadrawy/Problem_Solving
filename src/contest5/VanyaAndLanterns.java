package contest5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class VanyaAndLanterns {

	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String []a=br.readLine().split(" ");
		int n= Integer.parseInt(a[0]);
		long l= Integer.parseInt(a[1]);
		ArrayList<Long>x=new ArrayList<Long>();
		
		String []line=br.readLine().split(" ");
		for (int i =0;i<n;i++) {
			x.add(Long.parseLong(line[i]));
		}
		Collections.sort(x);
		double max=x.get(0);
		double r=0;
		double last= x.get(x.size()-1);
		max=Math.max(max, l-last);
		for (int i =0;i<n-1;i++) {
		     r=(double)(x.get(i+1)-x.get(i))/2;
		     max=Math.max(max, r);
		     
		}
		System.out.println(max);
	}
}

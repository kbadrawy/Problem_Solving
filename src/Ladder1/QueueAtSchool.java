package Ladder1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QueueAtSchool {

	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String [] x= br.readLine().split(" ");
		int n = Integer.parseInt(x[0]);
		int t = Integer.parseInt(x[1]);
		String q= br.readLine();
		String [] a =new String [n]; 
		for (int i =0;i<n;i++) {
			a[i]=q.charAt(i)+"";
		}
		
		for(int i =0;i<t;i++) {
			for (int j=0;j<n;j++) {
				if (a[j].equals("B")) {
					if (j==n-1) {
						continue;
					}
					if (a[j+1].equals("G")) {
						a[j]="G";
						a[j+1]="B";
						j++;
						
					}
						
				}
			}
		}
		for (int i =0;i<a.length;i++)
		System.out.print(a[i]);
		
	}
}

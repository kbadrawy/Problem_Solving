package Ladder1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StonesOnTable {

	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	  int n = Integer.parseInt(br.readLine()); // i comment it so that the warning would go hut i'm not quit sure if its important or not
		String x= br.readLine();
		int  count =0;
		while(true) {
			for (int i =0;i<x.length()-1;i++) {
				if(x.charAt(i)==x.charAt(i+1)) {
					count++;
				
			}
		} 
			break;
			}
		
		System.out.println(count);
	}
}

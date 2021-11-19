package Ladder1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NearlyLuckyNumber {

	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());
		String number=n+"";
		int count=0;
		for (int i =0;i<number.length();i++) {
			if(number.charAt(i)=='4'||number.charAt(i)=='7')
				count++;
		}
		
		boolean flag=true;
		for (int i =0;i<(count+"").length();i++) {
			if((count+"").charAt(i)=='4'||(count+"").charAt(i)=='7') {
				
			}
			else flag=false;
			
				
		}
		if (flag) {
			System.out.println("YES");
		}
		else System.out.println("NO");
	}
}

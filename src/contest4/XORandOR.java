package contest4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class XORandOR {

	
	public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a= br.readLine();
		String b =br.readLine();
		long zeroA=0;
		long zeroB=0;
		if (a.length()!=b.length()) {
			System.out.println("NO");
			return;
		}
		if(a.equals(b)) {
			System.out.println("YES");
			return;
		}
		else {
			for (int i =0;i<a.length();i++) {
				if ((a.charAt(i)+"").equals("0")) {
					zeroA++;
				}
				if ((b.charAt(i)+"").equals("0")) {
					zeroB++;
				}
					
			}
			if (zeroA==a.length()||zeroB==b.length()) {
				System.out.println("NO");
			}
			else {
				System.out.println("YES");
			}
		}
	}
}

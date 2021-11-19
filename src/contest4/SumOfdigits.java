package contest4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfdigits {

	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int count=0;
		int temp=0;
		String s = br.readLine();
		while(s.length()>1) {
			for (int i =0;i<s.length();i++) {
				temp+=(s.charAt(i)-'0');
			}
			s=temp+"";
			count++;
			temp=0;
		}
		System.out.println(count);
	}
}

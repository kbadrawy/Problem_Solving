package Ladder1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BeautifulYear {

	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x= Integer.parseInt(br.readLine());
		while (true) {
			x++;
			if (checkD(x)) {
				System.out.println(x);
				return;
			}
		}
	}
	public static boolean checkD(int x) {
		String in=x+"";
		for (int i =0;i<in.length()-1;i++) {
			for (int j =0;j<in.length();j++) {
				if (i!=j) {
					if (in.charAt(i)==in.charAt(j)) {
						return false;
					}
				}
			}
		}
		return true;
	}
}

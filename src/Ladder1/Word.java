package Ladder1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Word {

	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word= br.readLine();
		int lower=0;
		for (int i =0;i<word.length();i++) {
			if (Character.isLowerCase(word.charAt(i))) {
				lower++;
			}
		}
		if (lower>=(double)word.length()/2)
			System.out.println(word.toLowerCase());
		else 
			System.out.println(word.toUpperCase());
	}
}

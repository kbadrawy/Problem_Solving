package Ladder1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WordCapitalization {

	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word= br.readLine();
		String output="";
		for (int i =0;i<word.length();i++) {
			if (i==0){
				output+=(word.charAt(i)+"").toUpperCase();
			}
			else 
				output+=word.charAt(i)+"";
		}
		System.out.println(output);
	}
}

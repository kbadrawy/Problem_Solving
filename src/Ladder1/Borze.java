package Ladder1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Borze {

	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String x= br.readLine();
		String output="";
		for (int i =0;i<x.length();i++) {
			if (x.charAt(i)=='.') {
				output+="0";
			}
			else if (x.charAt(i)=='-') {
				if (x.charAt(i+1)=='.') {
					output+="1";
					i++;
				}
				else {
					output+="2";
				    i++;
				    }
			}
		}
		System.out.println(output);
	}
}

package contest4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Drinks {

	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Double n = Double.parseDouble(br.readLine());
		String [] x= br.readLine().split(" ");
	    Double sum =0.0;
		Double total=n;
		for (int i =0;i<x.length;i++) {
			sum+=Double.parseDouble(x[i]);
		}
		System.out.println((sum/total));
	}
}

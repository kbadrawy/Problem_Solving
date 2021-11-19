package Ladder1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class beautifulMatrix {

	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int i =0;i<5;i++) {
			String [] a= br.readLine().split(" ");
			for (int j =0;j<a.length;j++) {
				if (a[j].equals("1")) {
					System.out.println(Math.abs(2-i)+Math.abs(2-j));
					return;
				}
			}
		}
	}
}

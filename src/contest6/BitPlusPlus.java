package contest6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BitPlusPlus {

	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n =Integer.parseInt(br.readLine());
		int x=0;
		for (int i =0;i<n;i++) {
			switch(br.readLine()) {
			case "--X":--x;break;
			case "++X":++x;break;
			case "X++":x++; break;
			case "X--": x--;break;
			}
		}
		System.out.println(x);
	}
}

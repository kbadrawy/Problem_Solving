package Random;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExtremleyBasic {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new FileReader("hello.in"));
		int t = Integer.parseInt(br.readLine());
		for (int i =0;i<t;i++) {
			String [] a = br.readLine().split(" ");
			int n = Integer.parseInt(a[0]);
			int q = Integer.parseInt(a[1]);
			System.out.println("sum = "+(n+q));
		}
	}
}


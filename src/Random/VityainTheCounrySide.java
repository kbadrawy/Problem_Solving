package Random;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VityainTheCounrySide {

public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int n = Integer.parseInt(br.readLine());
	String[] a =br.readLine().split(" ");
	if (n==1) {
		System.out.println("-1");
		return;
	}
	if (a[n-1].equals("15")){
		System.out.println("DOWN");
		return;
	}
	if (a[n-1].equals("0")){
		System.out.println("UP");
		return;
	}
	if (Integer.parseInt(a[n-2])<Integer.parseInt(a[n-1])){
		System.out.println("UP");
		return;
	}
	
	System.out.println("DOWN");
}
}

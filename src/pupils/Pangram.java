package pupils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pangram {
	
public static void main (String[]args) throws IOException {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int n = Integer.parseInt(br.readLine());
	String x=br.readLine();
	x=x.toLowerCase();
	if (n<26) {
		System.out.println("NO");
		return;
		}
	String a="abcdefghijklmnopqrstuvwxyz";
	for (int i=0;i<a.length();i++) {
        if(!(x.contains(a.charAt(i)+""))) {
        System.out.println("NO");
         return;
		}
	}
	System.out.println("YES");
	
}
}
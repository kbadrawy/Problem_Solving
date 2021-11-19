package pupils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hulk {

	public static void main (String[]args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String x="";
		int n = Integer.parseInt(br.readLine());
		for (int i =1;i<=n;i++) {
			if(i%2==1) {
				if(i==n)
				x+="I hate it";
				else 
			    x+="I hate that ";
			}
			else {
				if(i==n)
					x+="I love it";
					else 
				    x+="I love that ";
			}
		}
		System.out.println(x);
	}
	
}

package contest5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MarkingScheme {

	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for (int i =0;i<n;i++) {
			String []a=br.readLine().split(" ");
			int r= Integer.parseInt(a[0]);
			int l= Integer.parseInt(a[1]);
			if (r<(double)(l+1)/2) {
				System.out.println("NO");
				
			}
			else
				System.out.println("YES");
			
		}
}
}

package contest3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayWithOddSum {

	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int odd=0;
		int even=0;
		for (int i =0;i<n;i++) {
			int len = Integer.parseInt(br.readLine());
			String[]line=br.readLine().split(" ");
			for (int j=0;j<len;j++) {
				int a= Integer.parseInt(line[j]);
				if (a%2==0)
					even++;
				else odd++;
			}
			if (odd==0) {
				System.out.println("NO");
				
			}
			else if (even==0) {
				if (odd%2==0) {
					System.out.println("NO");
					
				}else {
					System.out.println("YES");
					
				}
			}
			else {
				System.out.println("YES");
			}
			even=0;
			odd=0;
		}
		
	}
}

package contest3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CollectingCoin {

	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int len = Integer.parseInt(br.readLine());
		
		int sum=0;
		
		for (int i =0;i<len;i++) {
			String[]x= br.readLine().split(" ");
			int a = Integer.parseInt(x[0]);
			int b = Integer.parseInt(x[1]);
			int c = Integer.parseInt(x[2]);
			int n = Integer.parseInt(x[3]);
			int max=Math.max(a, Math.max(b, c));
			sum=sum+(max-a);
			sum=sum+(max-b);
			sum=sum+(max-c);
			if (n>=sum) {
				if ((n-sum)%3==0) {
					System.out.println("YES");
				}
				else {
					System.out.println("NO");
				}
			}
			else {
				System.out.println("NO");
			}
			sum=0;
		}
	}
}

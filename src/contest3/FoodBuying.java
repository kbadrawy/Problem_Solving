package contest3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FoodBuying {

	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for (int i =0;i<n;i++) {
			int out=0;
			int s = Integer.parseInt(br.readLine());
			while(s>9)
			{
				out+=((s/10)*10);
				s=s%10+s/10;
			}
			System.out.println(s+out);
		}
	}
}

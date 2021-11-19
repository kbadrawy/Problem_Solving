package pupils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class InfiniteSequence {

	public static void main (String[]args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] x=(br.readLine().split(" "));
		int a =Integer.parseInt(x[0]+"");
		int b =Integer.parseInt(x[1]+"");
		int c =Integer.parseInt(x[2]+"");
		//int sum=a;
		
		if(c==0) {
			if(a==b)
			System.out.println("YES");
			else {
				System.out.println("NO");
				return;
			}
			}
		
		else if (b<a&&c>0){
			System.out.println("NO");
			return;
		}
		else if (b>a&&c<0){
			System.out.println("NO");
			return;
		}
		else 
		
			
		 if((b-a)%c==0)
			System.out.println("YES");
		else
			System.out.println("NO");
			
//		while(true) {
//			sum+=c;
//			if(b==sum) {
//				System.out.println("YES");
//				return;
//			}
//			if(b<sum) {
//				System.out.println("NO");
//				return;
//			}
//		}
	}
	
}

package contest3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class YetAnotherBrokenKeyboard {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String []size=br.readLine().split(" ");
		int a =Integer.parseInt(size[0]);
		int b =Integer.parseInt(size[1]);
		long count=0;
		long sum=0;
		ArrayList<String>key= new ArrayList<String>();
		String s =br.readLine();
		String []keyboard =br.readLine().split(" ");
		
		for (int i =0;i<b;i++) {
			key.add(keyboard[i]);
		}
		
		
		for (int i =0;i<a;i++) {
			
			if (key.contains(s.charAt(i)+"")) {
				count++;
				if (i==a-1) {
					sum=sum+(count)*(count+1)/2;
				}
			}
			else {
				sum=sum+(count)*(count+1)/2;
				count=0;
			}
			
		}
		
		System.out.println(sum);
		}
	
}

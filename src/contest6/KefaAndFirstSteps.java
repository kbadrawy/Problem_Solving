package contest6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KefaAndFirstSteps {
public static void main(String[] args) throws NumberFormatException, IOException {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int n = Integer.parseInt(br.readLine());
	String []line=br.readLine().split(" ");
	
	int ans=1;
	int count=1;
	for (int i=0;i<n-1;i++) {
		int a =Integer.parseInt(line[i]);
		int b =Integer.parseInt(line[i+1]);
		if (b>=a) {
			count=count+1;
			
		}
		else {
			//System.out.println(count);
			ans=Math.max(count, ans);
			count=1;
		}
		if (i==n-2) {
			ans=Math.max(count, ans);
		}
		
	}
	System.out.println(ans);
}
}

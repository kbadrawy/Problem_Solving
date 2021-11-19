package contest4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class aWayTooLongWord {

	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		for (int i =0;i<n;i++) {
			String l = br.readLine();
			if (l.length()<=10) {
				System.out.println(l);
			}
			else 
				System.out.println(l.charAt(0)+""+(l.length()-2)+""+l.charAt(l.length()-1)+"");
		}
		
	}
}

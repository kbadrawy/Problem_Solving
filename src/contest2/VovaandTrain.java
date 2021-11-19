package contest2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VovaandTrain {

	
	
	public static void main (String[]args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x= Integer.parseInt(br.readLine());
		for (int i =0;i<x;i++) {
			String [] line = br.readLine().split(" ");
			int L = Integer.parseInt(line[0]);
			int v = Integer.parseInt(line[1]);
			int l = Integer.parseInt(line[2]);
			int r = Integer.parseInt(line[3]);
			int count=L/v;
			
			
			if (l%v==0) {
				count= count-(r/v-l/v+1);
			}
			else {
				count= count-(r/v-l/v);
			}
			System.out.println(count);
		}
	}
}

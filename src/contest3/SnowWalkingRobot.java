package contest3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class SnowWalkingRobot {

	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		for (int i =0;i<n;i++) {
			StringBuilder res=new StringBuilder();
			int d=0;
			int u=0;
			int r=0;
			int l=0;
			String x = br.readLine();
			for (int j=0;j<x.length();j++) {
				switch(x.charAt(j)) {
				case 'D':d++;break;
				case 'U':u++;break;
				case 'R':r++;break;
				case 'L':l++;break;
				default:break;
				}
			}
			
			d=Math.min(d, u);
			r=Math.min(r, l);
			if(d==0) {
				if (r>=1)
				  res.append("LR");
			}
			else if(r==0) {
				if (d>=0) {
					res.append("UD");
				}
			}
			else {
			for (int j =0;j<d;j++) {
				res.append("U");
			}
			for (int j =0;j<r;j++) {
				res.append("R");
			}
			for (int j =0;j<d;j++) {
				res.append("D");
			}
			for (int j =0;j<r;j++) {
				res.append("L");
			}
			
			}
			System.out.println(res.length());
			System.out.println(res);
			
		}
	}

}

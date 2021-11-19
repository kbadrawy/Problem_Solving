package Ladder1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LightsOut {

	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int [][] temp= new int [3][3];
		for (int i =0;i<3;i++) {
			String [] a= br.readLine().split(" ");
			for (int j =0;j<3;j++) {
				int num=Integer.parseInt(a[j]);
				while(num!=0) {
					temp[i][j]++;
				   if (i<2) {
						temp[i+1][j]++;
					}
					if (j<2) {
						temp[i][j+1]++;
					}
					if (j>0) {
						temp[i][j-1]++;
					}
					if (i>0) {
						temp[i-1][j]++;
					}
					num--;
				}
			}
		}
		String output="";
		for (int i =0;i<3;i++) {
			for (int j =0;j<3;j++) {
				if (temp[i][j]%2==0)
					output+="1";
				else 
					output+="0";
			}
			output+="\n";
		}
		System.out.println(output);
	}
	
}

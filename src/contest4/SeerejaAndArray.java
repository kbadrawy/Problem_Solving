package contest4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SeerejaAndArray {

	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[]line= br.readLine().split(" ");
		int n = Integer.parseInt(line[0]);
		int m = Integer.parseInt(line[1]);
		String[]a= br.readLine().split(" ");
		int addonAll=0;
		int [] sub=new int [a.length+1];
		for (int i =0;i<m;i++) {
			String[]op= br.readLine().split(" ");
			switch(op[0]) {
			case"1":
			{
				sub[Integer.parseInt(op[1])-1]=addonAll;
				a[Integer.parseInt(op[1])-1]= op[2];
				break;
			}
			case"2":
			{
				addonAll=addonAll+Integer.parseInt(op[1]);
				break;
				}
			case"3": 
				System.out.println(Integer.parseInt(a[Integer.parseInt(op[1])-1])+addonAll-sub[Integer.parseInt(op[1])-1]);
			default:break;
			}
		}
	}
}

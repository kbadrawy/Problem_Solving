package contest6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class XeniaAndRingRoad {

	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String []line=br.readLine().split(" ");
		long n = Long.parseLong(line[0]);
		long m = Long.parseLong(line[1]);
		long count=0;
		String []t=br.readLine().split(" ");
		if (Integer.parseInt(t[0])!=1) {
			count=Integer.parseInt(t[0])-1;
		}
		for (int i=0;i<m-1;i++) {
			int a= Integer.parseInt(t[i]);
			int b= Integer.parseInt(t[i+1]);
			if (b>a) {
				count+=(b-a);
			}
			else if (b<a) {
				count+=(n+b-a);
			}
			
		}
		System.out.println(count);
		
	}
}

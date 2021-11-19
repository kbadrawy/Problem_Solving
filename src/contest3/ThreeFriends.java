package contest3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThreeFriends {

	
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		for (int i =0;i<n;i++) {
			int min = (int) Double.POSITIVE_INFINITY;
			String []q =br.readLine().split(" ");
			int a=Integer.parseInt(q[0]);
			int b=Integer.parseInt(q[1]);
			int c=Integer.parseInt(q[2]);
			int []aa=new int [3];
			aa[0]=a-1;
			aa[1]=a;
			aa[2]=a+1;
			int []bb=new int [3];
			bb[0]=b-1;
			bb[1]=b;
			bb[2]=b+1;
			int []cc=new int [3];
			cc[0]=c-1;
			cc[1]=c;
			cc[2]=c+1;
			for (int j =0;j<3;j++) {
				for (int k=0;k<3;k++) {
					for (int l=0;l<3;l++) {
						min=Math.min(min, Math.abs(aa[j]-bb[k])+Math.abs(aa[j]-cc[l])+Math.abs(cc[l]-bb[k]));
					}
				}
			}
			System.out.println(min);
		}
		
	}
}

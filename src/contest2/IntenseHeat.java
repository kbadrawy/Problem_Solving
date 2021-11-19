package contest2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class IntenseHeat {

	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String []x= br.readLine().split(" ");
		int n = Integer.parseInt(x[0]);
		int k = Integer.parseInt(x[1]);
		String [] days= br.readLine().split(" ");
		int [] presum= new int [n];
		
		int sum_so_far=0;
		double maximum=0.0;
		for (int i =0;i<n;i++) {
			int temp = Integer.parseInt(days[i]);
			sum_so_far+=temp;
			presum[i]=sum_so_far;
		}
		
		for (int i =0;i<n;i++) {
			
			for (int j=i;j<n;j++) {
				if ((j-i+1)>=k) {
					double sum =presum[j]-presum[i]+Integer.parseInt(days[i]);
					double av= sum/(j-i+1);
					maximum = Math.max(maximum, av);
					
				}
				
			}
		}
		
		System.out.println(maximum);
	}
	
}

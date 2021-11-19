package contest6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class IntrestingDrink {
//using binary search
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n =Integer.parseInt(br.readLine());
		String [] line= br.readLine().split(" ");
		long [] a= new long [n];
		for (int i =0;i<n;i++) {
			a[i]=Integer.parseInt(line[i]);
		}
		
		int x =Integer.parseInt(br.readLine());
	    Arrays.sort(a);
		for (int i =0;i<x;i++) {
			
			long money=Integer.parseInt(br.readLine());
			
			if (money<a[0]) {
				System.out.println(0);
				continue;
			}
			else if(money>=a[n-1]) {
				System.out.println(n);
				continue;
			}
			else {
				int num=binary(money,a);
				if (a[num]<=money) {
					System.out.println(num+1);
				}
				else {
					
				System.out.println(num);
				}}}}
	public static int binary(long x , long [] a) {
		int min =0;
		int max=a.length-1;
		int mid=(min+max)/2;
		while(min<=max) {
			mid=(min+max)/2;
			if (a[mid]<=x) {
				min=mid+1;
			}
			else {
				max=mid-1;
			}
		}
		return min;
	}
}

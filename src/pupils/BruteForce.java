package pupils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.TreeSet;

public class BruteForce {

//	Remember the array of toys 
	public static void bitMask (int []a) {
		TreeSet<Long>ts= new TreeSet<Long>();
		int n = a.length;
		for (int i =0;i<(1<<n);i++) {
			long sum =0;
			for (int j =0; j < n;j++) {
				if ((i&(1<<j))!=0) {
					sum+=a[j];
				}
			}
			ts.add(sum);
		}
		while (!(ts.isEmpty()))
			System.out.println(ts.pollFirst());
		
		
	}
//	 get different permutations of a given array ; 
//	using in main method :-
//	Stack <Integer> s = new Stack <Integer> ();
//	int n = 3;
//	int [] a = {1,2,3};
//	boolean []vis=new boolean [n];
//	permutation(a,s,vis,n);
	public static void permutation (int[]a,Stack<Integer >s,boolean[]vis,int n ) {
		
		boolean done = true;
		for (int i =0;i<n;i++) {
			if (!vis[i]) {
				done=false;
				s.add(a[i]);
				vis[i]=true;
				permutation(a,s,vis,n);
				vis[i]=false;
				s.pop();
			}
		}
		if (done) {
			
				System.out.println(s);
			
		}
	}

//	get max sum of k consecutive elements in an array of length n
//	First way : nested for ; with complexity of O n^2 first for till n-k+1 , second for till k 
//	Second way: prefix Sum ; you will get the sum of each segment in O(1)*(n-k)
//	Third way: Sliding window ;  
//	using in the main method:
//	int [] a = {90,2,3,4,5,6,3,56};
//	int k =3;
//	System.out.println(maxSum(a,k));
	public static long maxSum(int[]a,int k ) {
		long ans=0;
		int sum=0;
		int n =a.length;
		for (int i =0;i<k;i++) {
			sum+=a[i];
		}
		ans=Math.max(sum, ans);
		for (int i=k;i<n;i++) {
			sum+=a[i];
			sum-=a[i-k];
			ans=Math.max(sum, ans);
			
		}
		return ans;
	}
	
// same as above but we now want to get the consecutive sum it self to be = k 	
//	using in main method:
//	int [] a = {1,2,3,4,5,6};
//	int k =17; //sum that i want to reach
//	maxSumEqual(a,k);
	public static void maxSumEqual(int[]a,int k ) {
		boolean found=false;
		int sum=0;
		int n =a.length;
		int j =0;
		for(int i =0;i<n;) {
//			System.out.println(i+" "+j);
			while (sum<k&&j<n)
				sum+=a[j++];
			if (sum==k) {
				found=true;
				break;
				}
			else {
				if (sum>k) {
				while(sum>k&&i<j) {
					sum-=a[i++];
				}
				if (sum==k) {
					found=true;
					break;
					}
				}
				else {
					if (j==n)
						break;
				}
			}
		}
	    System.out.println(found?"YES":"NO");
		return ;
	}
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
}
}

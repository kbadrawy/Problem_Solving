package Random;

import java.util.ArrayList;
import java.util.Scanner;

public class BachGold {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer>a= new ArrayList();
		System.out.println(n/2);
		
			for (int i =0;i<(n/2)-1;i++) {
				System.out.print(2+" ");
			}
			
			if (n%2!=0) {
				System.out.println(3);
				return;
			}
			System.out.println(2);
		
//		System.out.println(bestSum(n,a));
	}
//	public static ArrayList<Integer> bestSum(int targetSum, ArrayList<Integer>a) {
//		if(targetSum==0) return new ArrayList<Integer>();
//		if(targetSum<0) return null;
//		
//		ArrayList<Integer>shortest= null ;
//		for(int i =0;i<a.size();i++) {
//			
//			ArrayList<Integer>  result=bestSum(targetSum-a.get(i),a); //remainder combination
//			if (result!=null) { // means that its possible to generate the remainder
//				result.add(a.get(i));
//				shortest= (shortest==null||shortest.size()<result.size())? result:shortest;
//			}
//		}
//		return shortest;
//	}
}

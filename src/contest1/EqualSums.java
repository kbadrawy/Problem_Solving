package contest1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;



public class EqualSums {

	
	public static void main (String[]args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x= Integer.parseInt(br.readLine());
		ArrayList<pairs> output=new ArrayList<pairs>();
		boolean flag = false;
		for (int i =0;i<x;i++) 
		{
			int len= Integer.parseInt(br.readLine());
			int [] a = new int [len];
			String[]input=br.readLine().split(" ");
			int sum=0;
			for (int j =0;j<len;j++) {
				sum+=Integer.parseInt(input[j]);
			}
			
			for (int j =0;j<len;j++) {
				output.add(new pairs(sum-Integer.parseInt(input[j]), i,j));
			
			}
			sum=0;
			
		}
		Collections.sort(output);
		int count=0;
		for (int i=0;i<output.size()-1;i++) {
			if (output.get(i).value==output.get(i+1).value&&output.get(i).index!=output.get(i+1).index) {
				System.out.println("YES");
				System.out.println(output.get(i).index+1+" "+((output.get(i).i)+1));
				System.out.println(output.get(i+1).index+1+" "+((output.get(i+1).i)+1));
				flag=true;
				return;
			
			}
			
			}
		if (!flag) {
			System.out.println("NO");
		}
			
		}

	
	public  static class pairs implements Comparable<pairs>{
		   int value ;
		   int index ;
		   int i;
		   
		   public pairs(int value,int index,int i ) {
			   this.value=value;
			   this.index=index;
			   this.i=i;
		   }
		   
		   public int compareTo(pairs p) {
			   return p.value-this.value;
			   
		   } 
		}
	
}


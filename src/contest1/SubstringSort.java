package contest1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class SubstringSort {

	public static void main(String[]arg) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x= Integer.parseInt(br.readLine());
		ArrayList<pair>strings=new ArrayList();
		
		boolean flag=true;
		for (int i =0;i<x;i++) {
			String temp=br.readLine();
			strings.add(new pair(temp,temp.length()));
		}
		Collections.sort(strings);
		
		//String maxm=strings.get(strings.size()-1).value;
		for (int i=0;i<strings.size()-1;i++) {
			if ((strings.get(i+1).value).contains(strings.get(i).value)) {
				continue;
				}
			else {
				flag=false;
				break;
				}
			
		}
		if (flag) {
			System.out.println("YES");
			for (int i =0;i<strings.size();i++) {
				System.out.println(strings.get(i).value);
			}
		}
		else 
			System.out.println("NO");

}
	

		public  static class pair implements Comparable<pair>{
			   String value ;
			   int length ;
			   
			   
			   public pair(String value,int length) {
				   this.value=value;
				   this.length=length;
			   }
			   
			   
			   
			   
			   public int compareTo(pair p) {
				   return this.length-p.length;
				   
			   }
			   
			   
			}
		
	}

package contest4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Enumeration;
import java.util.Hashtable;


public class KString {

	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder s= new StringBuilder();
		String x = br.readLine();
		Hashtable<String,Integer>h=new Hashtable<String,Integer>();
		boolean flag=true;
		
		
		if (n==1) {
			System.out.println(x);
		}
		else {
			
		for (int i =0;i<x.length();i++) {
			if (h.containsKey(x.charAt(i)+"")) {
				h.put(x.charAt(i)+"", h.get(x.charAt(i)+"")+1);
			}
			else {
				h.put(x.charAt(i)+"",1);
			}
		}
		
		 Enumeration<String> na = h.keys();
		 Enumeration<Integer> v = h.elements();
		 
		for (int i=0;i<h.size();i++) {
			int number=v.nextElement();
			String ele=na.nextElement();
			 if (number%n!=0) {
				 System.out.println("-1");
				 flag=false;
				 break;
			 }
			 else {
				 for (int j =0;j<number/n;j++) {
					 s.append(ele);
				 }
			 }
		}
		if (flag) {
			String temp=s.toString();
			for (int i =1;i<n;i++) {
				s.append(temp);
			}
			System.out.println(s);
		
		}
		}
	}

}

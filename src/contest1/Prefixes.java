	package contest1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Prefixes {
 
	public static void main (String[]args) throws NumberFormatException, IOException {
		
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 int n = Integer.parseInt(br.readLine());
		 String x = br.readLine();
		 StringBuilder output= new StringBuilder();
		 
		 int count=0;
		 for (int i =0;i<x.length();i+=2) {
			
			 String [] sub = new String[2];
			 sub[0]=x.charAt(i)+"";
			 sub[1]=x.charAt(i+1)+"";
			 if (checker (sub)) {
				 if (sub[0].equals("a"))
					 output.append("b");
				 else 
					 output.append("a");
				 output.append(sub[1]);
				 count++;
			}
			 else {
				 output.append(sub[0]);
				 output.append(sub[1]);
			 }
			 
			
		 }
		 System.out.println(count);
		 System.out.println(output);
		
		

	}
	public static boolean checker(String[]x) {
		if (x[0].equals(x[1]))
				return true;
		return false;
	}
	
	
}

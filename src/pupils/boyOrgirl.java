package pupils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class boyOrgirl {

	public static void main(String[]args) throws IOException {
		
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 String x= br.readLine();
		 int count=0;
		 ArrayList<String>a= new ArrayList<>();
		 a.add(x.charAt(0)+"");
		 for (int i=1;i<x.length();i++) {
			 String temp=x.charAt(i)+"";
			 if (a.contains(temp)) {
				 continue;
			 }
			 else 
				 a.add(temp);
		 }
		 
		 if (a.size()%2==0)
			 System.out.println("CHAT WITH HER!");
		 else 
			 System.out.println("IGNORE HIM!");
	}
	
}

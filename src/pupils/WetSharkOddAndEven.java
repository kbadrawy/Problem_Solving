package pupils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class WetSharkOddAndEven {

	public static void main (String[]args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int m=0;
		long output=0;
		ArrayList a= new ArrayList();
		String[] x=(br.readLine().split(" "));
		for (int i=0;i<n;i++) {
			m=Integer.parseInt(x[i]);
			if(m%2==0)
				output+=m;
			else {
				a.add(m);
			}
				
		}
		int size=a.size();
		long last[]= new long [size];
		for(int i=0;i<a.size();i++) {
			m=Integer.parseInt(a.get(i)+"");
			last[i]=m;
			output+=m;
		}
		if(size%2!=0)
			output-=getMin(last);
		System.out.println(output);
	
	}
	 public static long getMin(long[] inputArray){ 
		    long minValue = inputArray[0]; 
		    for(int i=1;i<inputArray.length;i++){ 
		      if(inputArray[i] < minValue){ 
		        minValue = inputArray[i]; 
		      } 
		    } 
		    return minValue; 
		  }
	
}

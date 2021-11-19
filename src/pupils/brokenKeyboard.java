package pupils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class brokenKeyboard {

	public static void main (String[]args) throws IOException {
		
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String x = "";
    StringBuilder gego=new StringBuilder();
    int open=0;
    StringBuilder inter=new StringBuilder();
    while( (x=br.readLine())!=null && x.length()!=0) {
    	for (int i=0;i<x.length();i++) {
    		switch(x.charAt(i)) {
    		case '[':{
    			open++;
    			
    		}break;
    		case ']':{
    			open--;
    		}break;
    		default:{
    			if(open!=0)
    				inter.append(x.charAt(i)+"");
    			else {
					gego=(inter.append(gego).append(x.charAt(i)+""));
					inter=new StringBuilder();
    			}break;
    		}
    			
    		}
    	}
    	System.out.println(gego);
    	inter=new StringBuilder();
    	gego=new StringBuilder();
	
 
    }

}
	}

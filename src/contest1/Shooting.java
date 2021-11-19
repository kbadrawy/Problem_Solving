package contest1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Shooting {

	public static void main (String[]args) throws IOException {
		
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 int x= Integer.parseInt(br.readLine());
		 String[]y= br.readLine().split(" ");
		 ArrayList<pair> list= new ArrayList<pair>();
		 int cost=0;
		 int count=0;
		 StringBuilder s= new StringBuilder();
		 for (int i=0;i<y.length;i++) {
			 list.add(new pair(Integer.parseInt(y[i]),i+1)); 
		    }
		 
		Collections.sort(list);
		
		
		for (int i=0;i<list.size();i++) {
			cost+= (list.get(i).value*count)+1;
			s.append(list.get(i).index);
			if (!(i==list.size()-1))
			    s.append(" ");
			count++;
		}

		
		System.out.println(cost);
		System.out.println(s);
		 
	}
	

	public  static class pair implements Comparable<pair>{
		   int value ;
		   int index ;
		   
		   
		   public pair(int value,int index) {
			   this.value=value;
			   this.index=index;
		   }
		   
		   
		   
		   
		   public int compareTo(pair p) {
			   return p.value-this.value;
			   
		   }
		   
		   
		}
	
}



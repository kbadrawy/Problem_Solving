package pupils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class throwingCardsAway {

	
	public static void main (String[]args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 int x = Integer.parseInt(br.readLine());
		 ArrayList<Integer>list = new ArrayList<>();
		 ArrayList<Integer>thrown = new ArrayList<>();
		 while (x!=0) {
			 for (int i =x;i>=1 ;i--) {
				 list.add(i);
			 }
			 while(list.size()!=1) {
				 thrown.add( list.remove(list.size()-1));
				 int temp=list.get(list.size()-1);
				 list.remove(list.size()-1);
				 list.add(0,temp);
			 }
			 
			 System.out.println("Discarded cards: "+thrown.toString().substring(1, thrown.toString().length()-1));
			 System.out.println("Remaining card: "+list.toString().substring(1, list.toString().length()-1));
			 list.clear();
			 thrown.clear();
			 x=Integer.parseInt(br.readLine());
		 }
	}
	
	
	
}

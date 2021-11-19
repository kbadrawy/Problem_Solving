package GraphRepresentation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;


public class StudentsAndShoeLaces {

	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String []line=br.readLine().split(" ");
		int v= Integer.parseInt(line[0]);
		int n= Integer.parseInt(line[1]);
		
		int [][] adjM=new int[v][v];
		for (int i =0;i<n;i++) {
			String []l=br.readLine().split(" ");
			int u= Integer.parseInt(l[0])-1;
		    int  k= Integer.parseInt(l[1])-1;
		     adjM[u][k]=1;
		     adjM[k][u]=1;
		}
		boolean f=true;
		int count=0;
		while(f ) {
			f=false;
			Queue<Integer>qu= new LinkedList<>();
		for (int i=0;i<v;i++) {
			int sum=0;
			int indx=0;
			
			for(int j=0;j<v;j++) {
				sum+=adjM[i][j];
				if (adjM[i][j]==1) {
					indx=j;
				}
				
			}
			if (sum==1) {
				qu.add(i);
				qu.add(indx);
				
				f=true;
			}
		}
		while (!qu.isEmpty()) {
			int a=qu.poll();
			int b =qu.poll();
			adjM[a][b]=0;
			adjM[b][a]=0;
			
			
		}
		if (f)
			count++;
		
	}
		System.out.println(count);
	}
	

		
}

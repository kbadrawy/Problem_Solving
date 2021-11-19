package pupils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BearAndFindCriminals {
public static void main (String[]args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String[] x=(br.readLine().split(" "));
	int n =Integer.parseInt(x[0]+"");
	int p =Integer.parseInt(x[1]+"");
	String[] a=(br.readLine().split(" "));
	int s1=0;
	int s2=0;
	for(int i =0;i<n;i++) {
		if(i<=p)
			s1+=Integer.parseInt(a[i]+"");
		else
			s2+=Integer.parseInt(a[i]+"");
	}
	if (s1>s2)
	System.out.println(s1);
	else 
		System.out.println(s2);
}
}

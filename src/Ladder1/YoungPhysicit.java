package Ladder1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class YoungPhysicit {
public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int n =Integer.parseInt(br.readLine());
	int x=0;
	int y=0;
	int z=0;
	for (int i =0;i<n;i++) {
		String [] line= br.readLine().split(" ");
		x+=Integer.parseInt(line[0]);
		y+=Integer.parseInt(line[1]);
		z+=Integer.parseInt(line[2]);
	}
	if ((x==0)&&(y==0)&&(z==0)) {
		System.out.println("YES");
	}
	else System.out.println("NO");
	
}
}

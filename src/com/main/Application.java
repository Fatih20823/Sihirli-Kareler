package com.main;

public class Application {

	public static void main(String[] args) {
		int n=5;
		int i=1;
		int x=0, y=n/2;
		int[][] sihirliMatris = new int[n][n];
	     	do {
	     		sihirliMatris[x][y]=i;
	     		if(i%n==0) {
	     			x++; if(x==n) x=0;
	     		} else {
	     			x = x-1; if(x<0) x=n-1;
	     			y = y+1; if(y==n) y=0;
	     		}
	     		i++;	     	
	     	} while(i<=n*n);
		for (int j = 0; j < sihirliMatris.length; j++) {
			for (int j2 = 0; j2 < sihirliMatris.length; j2++) {
				System.out.printf("%3d",sihirliMatris[j][j2]);				
			}
			System.out.println();
		}
	}

}

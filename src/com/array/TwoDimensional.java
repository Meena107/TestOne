package com.array;

public class TwoDimensional {

	public static void main(String[] args) {
		int a[][] = new int[5][3];
		a[0][0] = 50;
		a[1][0] = 60;
		a[2][0] = 70;
		a[3][0] = 200;
		a[4][0] = 110;
		a[0][1] = 80;
		a[1][1] = 90;
		a[2][1] = 100;
		a[3][1] = 10;
		a[4][1] = 20;
		a[0][2] = 30;
		a[1][2] = 40;
		a[2][2] = 45;
		a[3][2] = 55;
		a[4][2] = 60;
		
		System.out.println("Nested For Loop" + "\n" + "----------------");
		for(int i=0; i<5; i++) {
			for (int j=0; j<3; j++) {
				System.out.println(a[i][j]);
				}		
		}
		
		System.out.println("Nested For Each Loop" + "\n" + "----------------");
		for (int s[]:a) {
			for( int c:s) {
				System.out.println(c);
			}
		}	
	}
}

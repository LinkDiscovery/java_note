package com.ruby.java.ch04;

import java.util.Random;

public class Test38_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int [5][5];
		Random rand = new Random();
		for(int i=0; i < arr.length; i++) {
			for(int j = 0 ; j < arr[0].length;j++)
				arr[i][j] = rand.nextInt(100);
		}
		
		for(int i=0 ; i < arr.length;i++) {
			for(int j = 0 ; j < arr[i].length; j++) {

				System.out.print(arr[i][j]);
				System.out.print("\t");
			}
			
			System.out.println("\n");
		}

		
		
	}
	
	}

	

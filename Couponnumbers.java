package com.bridgelabz;
import java.util.Scanner;
import java.util.Random;
public class Couponnumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number for generate coupons");
		int range = sc.nextInt();
		boolean[] arr = new boolean[range];
		int count = 0;
		int distinct = 0;
		Random r=new Random();
		while (distinct < range) {
			int value = (int) (Math.random() * range);
			System.out.print(value + " ");
			if (!arr[value]) {
				distinct++;
				arr[value] = true;
				System.out.print(arr[value] + " ");
			}

			count++;
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print("index " + i + " values " + arr[i] + "\n");
		}
		System.out.println(count + " N times loop runs for finding distinct");
        
	}

}

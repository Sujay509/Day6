package com.bridgelabz;
import java.util.Scanner;
public class Reversenumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		int n,r;
		int x=0;
		n= s.nextInt();
		while(n>0)
		{
			r=n%10;
			n=n/10;
			
			x=x*10+r;
		}
			System.out.println( "reversed number is : " +x);
		s.close();
		

	}

}

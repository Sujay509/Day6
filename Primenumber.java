package com.bridgelabz;
import java.util.Scanner;
public class Primenumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		int i,n,flag;
		n=s.nextInt();
		
		flag = 0;
		for (i=2;i<n;i++)
		{
			if (n%i==0)
			{
					flag=1;
					break;
			}	
				}
		if(flag==1|| n==0 || n==1 )
		{
			System.out.println("Number is not prime");
		}
		else 
		{
			System.out.println("Number is prime");
		}
       s.close();
	}

}

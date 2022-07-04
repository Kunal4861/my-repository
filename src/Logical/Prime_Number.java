package Logical;

import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {
		
//		Scanner sc=new Scanner(System.in);// if you want to provide input while run
//		System.out.println("enter number");
//		int num=sc.nextInt();
		
		
		
		int num=23;
		int count=0;//take any variable begin with 0
		//prime number is number which can be devided by 1 or own number 
		
		for(int i=2;i<=num-1;i++)//start division from 2 to 6
		{
			if (num%i==0) //if remender is 0 then its not a prime number
			{
				count++;//just type count++
			}
		}

		if (count==0)//only if count is 0 by own number division
		{
			System.out.println("number "+num+" is prime number");
		}
		
	else {
		System.out.println("number "+num+" is not prime number");
	}

	}
	}

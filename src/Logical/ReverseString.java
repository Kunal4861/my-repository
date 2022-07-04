package Logical;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter String value");
		String s=sc.next();//to provide input string
		String Rev="";
		System.out.println("given String is "+s);
		
		for(int i=s.length()-1;i>=0;i--) 
		{
			Rev=Rev+s.charAt(i);
		}
		System.out.println("reverse String is "+Rev);
		
		
		
		
		
	}

}

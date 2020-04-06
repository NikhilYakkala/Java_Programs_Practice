package com.java.programs.practice;

import java.util.Scanner;

public class ReadStringsPrintStrings {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int i;
		
		boolean found = false;
		
		String s;
		
		System.out.println("Enter number of names:");
		
		int numberOfNames = sc.nextInt();
		
		String names[] = new String[numberOfNames];
		
		for(i=0;i<names.length;i++)
		{ 	 	
			System.out.println("Enter name" +(i+1)+ " : ");
			names[i]=sc.next();
		}
		
		System.out.println("Below are given names:");
		for(i=0;i<names.length;i++)
		{
			System.out.println(names[i]);
		}
		
		System.out.println("Enter the string to search:");
		
		s = sc.next();
		
		for(i=0;i<names.length;i++)
		{
			if(s.equals(names[i]))
			{
				found=true;
				break;
			}
		}
		 if(found)
		 {
			 System.out.println("Given String is found");
		 }
		 else
		 {
			 System.out.println("Given String is not found");
		 }
	}

}

package com.java.programs.practice;

import java.util.*;

public class ReverseStringPalindrome {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String originalString,reverseString="";
		
		int i,n;
		
		System.out.println("Enter String:");
		
		originalString = sc.nextLine();
		
		System.out.println("Given String: "+originalString);
		
		for(i=originalString.length()-1;i>=0;i--)
		{
			reverseString = reverseString + originalString.charAt(i);
		}
		System.out.println("Reverse String: "+reverseString);
		
		if(originalString.equals(reverseString))
		{
			System.out.println("Both Strings are equal");
		}
		else
		{
			System.out.println("Both Strings are Not Equal");
		}
		
		//alternate method for reverse string using stringbuilder
		System.out.println( originalString.equals( new StringBuilder(originalString).reverse().toString()) 
			    ? "Yes" : "No" );
		
	}

}

package com.java.programs.practice;
import java.util.Scanner;


public class CharFrequency
{
   public static void main(String args[])
   {
        int  i, j, k=0;
        String str;
        char c, ch;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter a String : ");
        str=scan.nextLine();
        
        i=str.length();
        for(c='A'; c<='z'; c++)
        {
            k=0;
            for(j=0; j<i; j++)
            {
                ch = str.charAt(j);
                if(ch == c)
                {
                    k++;
                }
            }
            if(k>0)
            {
                System.out.println("The character " + c + " has occurred for " + k + " times");
            }
        }
   }
}
package Week1.day2;

import java.util.Scanner;

public class palindrome {
	 
		public static void main(String[] args) {
		  System.out.println("Enter the word :");
          Scanner scan= new Scanner(System.in);
          String str=scan.next();
          String reverse="";
          for(int i= str.length()-1;i>=0;i--)
        	  reverse+=str.charAt(i);
          if (reverse.equalsIgnoreCase(str))
        	  System.out.println("palindrome");
          else
        	  System.out.println("Not palidrome");
          
		}
		
    	
    		
    	
    }





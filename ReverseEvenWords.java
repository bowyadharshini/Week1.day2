package Week1.day2;

import java.util.Scanner;

public class ReverseEvenWords {

	 
		public static void main(String[] args) {
			 
				// TODO Auto-generated method stub
				String test = "tester";
				String[] split = test.split(" ");
				for (int i=0;i<split.length;i++) {
					if(i%2==0) {
						String str=split[i].toString();
						char[] charArray=str.toCharArray();
						for(int j=charArray.length-1;j>=0;j--) {
							System.out.println(charArray[j]);
						}
						System.out.println(" ");
					}
					else {
						System.out.println(split[i]+ " ");
					}
				}



	}
		  
		 

	


}


package Week1.day2;
public class ChangeoddIndexTouppercase {

	public static void main(String[] args) {
		 String text=new String("testleaf");
		 char[] charArray =text.toCharArray();
		 for(int i=0;i<text.length();i++) {
			 char ch=charArray[i];
			 if(i%2!=0) {
				 System.out.print( Character.toUpperCase(ch));
			 }
			 else {
				 System.out.print(ch);
				 }
			 }
		 }
					  

			
		}
		
		

	



package Week1.day2;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[]num= {12,25,12,56,89,25,56};
		Arrays.sort(num);
		for(int i=0;i<num.length-1;i++)
			if(num[i]==num[i+1]) {
				System.out.println(num[i]);
	}


}
}
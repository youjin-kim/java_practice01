package practice01.prob4;

import java.util.Scanner;

public class Prob4 {
	public static void main (String args[]) {
		Scanner scanner = new Scanner( System.in );
		
		System.out.print("문자열을 입력하세요: ");
		String str = scanner.nextLine();
		
		char[] arrayString = new char[str.length()];
		
		int j = 0;
		
		while(j < arrayString.length) {
			for(int i=0; i<=j; i++) {
				arrayString[i] = (str.charAt(i));
				System.out.print(arrayString[i]);
			}
			j++;
			System.out.println();
		}
		
	}
}

package practice01.prob3;

import java.util.Scanner;

public class Prob3 {
	public static void main (String args[]) {
Scanner input = new Scanner(System.in);
		
		while(true) {
		
			System.out.print("숫자를 입력하세요: ");
			
			int num = input.nextInt();
			int sum = 0;
			
			if(num % 2 == 0) {
				for(int i=0; i<=num; i++) {
					if(i % 2 == 0 ) {
						sum += i;
					}
				}
				System.out.print("결과 값: " + sum);
				System.out.println();
			}
			
			else {
				for(int j=1; j<=num; j++) {
					if(j % 2 != 0) {
						sum += j;
					}
				}
				System.out.print("결과 값: " + sum);
				System.out.println();
			}
			
		}

	}

}


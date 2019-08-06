package practice01.prob2;

public class Prob2 {
	public static void main (String args[]) {
		int j = 11;
		int i = 1;
		while(i < 10) {
			for(int k = i; k<j; k++)
			{
				System.out.print(k + " ");
			}
			i++;
			j++;
			System.out.println();
		}
	}
}

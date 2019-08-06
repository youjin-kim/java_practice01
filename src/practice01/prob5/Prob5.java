package practice01.prob5;

public class Prob5 {
	public static void main (String args[]) {
		for(int i=1; i<100; i++) {
			if(i<10) {
				if(i%3==0) {
					System.out.println(i + " 짝");
				}
			}
			else if(i>10) {
				int j=i/10;
				int k=i%10;
				if(j%3==0 && k%3==0) {
					System.out.println(i + " 짝짝");
				}
				if(k%3!=0 && j%3==0) {
					System.out.println(i + " 짝");
				}
				if(j%3!=0 && k!=0 && k%3==0) {
					System.out.println(i + " 짝");
				}
			}
		}
	}
}

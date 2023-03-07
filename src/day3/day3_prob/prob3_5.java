package day3.day3_prob;

public class prob3_5 {

	public static void main(String[] args) {
		int a = (int)(Math.random() * 100) + 1;
		
		System.out.println("a = " + a);
		
		if(20 <= a && 80 > a) {
			System.out.println("20以上80未満です");
		}
	}
}

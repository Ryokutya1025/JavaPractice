package day3.day3_prob;

public class prob3_9 {

	public static void main(String[] args) {
		int a = (int)(Math.random() * 100) + 1;
		System.out.println("a = " + a);
		
		if(a < 50)
			System.out.println("50未満です");
		else
			System.out.println("50以上です");
	}
}

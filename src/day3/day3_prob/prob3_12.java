package day3.day3_prob;

public class prob3_12 {

	public static void main(String[] args) {
		int a = (int)(Math.random() * 20) - 9;
		System.out.println("a = " + a);
		
		if(a >= 1)
			System.out.println("正の数です");
		else if(a <= -1)
			System.out.println("負の数です。");
		else
			System.out.println("0です");
	}
}

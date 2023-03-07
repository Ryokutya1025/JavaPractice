package day3.day3_prob;

public class prob3_8 {

	public static void main(String[] args) {
		int a = (int)(Math.random() * 10) + 1;
		System.out.println("a = " + a);
		
		if(a != 1)
			System.out.println("1ではありません");
		else
			System.out.println("1です。");
	}
}

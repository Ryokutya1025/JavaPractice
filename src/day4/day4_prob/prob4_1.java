package day4.day4_prob;

public class prob4_1 {

	public static void main(String[] args) {
		int a = (int)(Math.random() * 10) + 1;
		
		System.out.println("数：" + a);
		
		for(int i = 0; i < a; i++) {
			System.out.print("■ ");
		}
	}
}

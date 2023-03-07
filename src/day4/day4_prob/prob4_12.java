package day4.day4_prob;

public class prob4_12 {

	public static void main(String[] args) {
		int min = 1000;
		for(int i = 0; i < 5; i++) {
			int a = (int)(Math.random() * 100) + 1;
			System.out.println(a);
			if(a < min) {
				min = a;
			}
		}
		System.out.println("最小値：" + min);
	}
}

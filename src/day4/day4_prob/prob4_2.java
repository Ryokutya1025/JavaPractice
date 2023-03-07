package day4.day4_prob;

public class prob4_2 {

	public static void main(String[] args) {
		int a = (int)(Math.random() * 10) + 1;
		
		System.out.println("数：" + a);
		
		int i = 0;
		while(i < a) {
			System.out.print("■ ");
			i++;
		}
	}

}

package day4.day4_prob;

public class prob4_14 {

	public static void main(String[] args) {
		int a = (int)(Math.random() * 10) + 1;
		if(a % 2 == 0) {
			for(int i = 0; i < a; i++) {
				System.out.print("★");
			}
		}else {
			for(int i = 0; i < a; i++) {
				System.out.print("☆");
			}
		}
	}

}

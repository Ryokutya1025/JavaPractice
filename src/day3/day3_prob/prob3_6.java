package day3.day3_prob;

public class prob3_6 {

	public static void main(String[] args) {
		int num = (int)(Math.random() * 6) + 1;
		System.out.println("数値：" + num);
		if(num >= 3) {
			System.out.println("3以上です。");
		}
	}

}

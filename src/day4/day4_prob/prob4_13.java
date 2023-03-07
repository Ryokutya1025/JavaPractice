package day4.day4_prob;

public class prob4_13 {

	public static void main(String[] args) {
		int a = (int)(Math.random() * 10) + 1;
		if(a >= 5) {
			for(int i = 0; i < a; i++)
				System.out.print("★");
		}else{
			System.out.println("発生した数値：" + a);
		}
	}

}

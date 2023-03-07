package day3.day3_prob;

public class prob3_18 {

	public static void main(String[] args) {
		int a = (int)(Math.random() * 45) - 9;
		System.out.println("a = " + a);
		
		if(a >= 30)
			System.out.println("真夏日です");
		else if(a >= 25 && a < 30)
			System.out.println("夏日です");
		else if(a < 0)
			System.out.println("真冬日です");
	}
}

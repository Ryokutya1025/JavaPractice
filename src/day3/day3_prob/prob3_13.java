package day3.day3_prob;

public class prob3_13 {

	public static void main(String[] args) {
		int a = (int)(Math.random() * 3) + 1;
		
		if(a == 1)
			System.out.println("グー");
		else if(a == 2)
			System.out.println("チョキ");
		else
			System.out.println("パー");
	}

}

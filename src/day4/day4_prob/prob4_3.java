package day4.day4_prob;

public class prob4_3 {

	public static void main(String[] args) {
		int a = (int)(Math.random() * 10) + 1;
		
		System.out.println("数：" + a);
		
		int i = 0;
		do{
			System.out.print("■ ");
			i++;
		}while(i < a);
	}

}

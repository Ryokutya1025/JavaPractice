package ex_day1.exDay1_prob;

public class ExProb1_1 {

	public static void main(String[] args) {
		int a = (int)(Math.random() * 10) + 1;
		int b = (int)(Math.random() * 10) + 1;
		int result1 = add(a, b);
		int result2 = sub(a, b);
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println(a + " + " + b + " = " + result1);
		System.out.println(a + " - " + b + " = " + result2);
	}
	
	static int add(int a, int b) {
		return a + b;
	}
	
	static int sub(int a, int b) {
		return a - b;
	}
}

package day6.day6_prob;

public class prob6_3 {

	public static void main(String[] args) {
		Circle c = new Circle();
		c.r = 4.0;
		System.out.println("半径" + c.r + "の円の円周の長さは" + c.circumference());
		
		System.out.println("半径" + c.r + "の円の面積の大きさは" + c.area());
	}
}

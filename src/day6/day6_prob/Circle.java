package day6.day6_prob;

public class Circle {
	public double r;
	
	public double circumference() {
		return 2 * 3.14 * r;
	}
	
	public double area() {
		return Math.pow(r, 2) * 3.14;
	}
}

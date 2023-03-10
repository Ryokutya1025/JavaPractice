package ex_day1.exDay1_prob;

public class ExProb1_3 {

	public static void main(String[] args) {
		int height = (int)(Math.random() * 10) + 1;
		int width = (int)(Math.random() * 10) + 1;
		System.out.println("height = " + height);
		System.out.println("width = " + width);
		square(height, width);
	}
	
	static void square(int height, int width) {
		if(height != 0 && width != 0) {
			for(int h = 1; h < width + 1; h++) {
				System.out.print("\t"+h);
			}
			System.out.println();
			for(int i = 0; i < height; i++) {
				System.out.print(i + 1);
				for(int j = 0; j < width; j++) {
					System.out.print("\t■");
				}
				System.out.println();
			}
		}
	}
}
package day5.day5_prob;

public class prob5_10 {

	public static void main(String[] args) {
		int[] data = new int[7];
		for(int i = 0; i < data.length; i++) {
			data[i] = (int)(Math.random() * 10) + 1;
			System.out.print(data[i] + " ");
		}
		
		System.out.println();
		
		for(int j = 0; j < data.length; j++) {
			for(int k = 0; k < data[j]; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

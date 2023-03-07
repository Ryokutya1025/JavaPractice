package day5.day5_prob;

public class prob5_9 {

	public static void main(String[] args) {
		int[] data = new int[10];
		for(int i = 0; i < data.length; i++) {
			data[i] = (int)(Math.random() * 100) + 1;
			System.out.print(data[i] + " ");
		}
		System.out.print("\n50以上の数：");
		for(int j = 0; j < data.length; j++) {
			if(data[j] >= 50) {
				System.out.print(data[j] + " ");
			}
		}
		System.out.print("\n50未満の数：");
		for(int k = 0; k < data.length; k++) {
			if(data[k] < 50) {
				System.out.print(data[k] + " ");
			}
		}
	}
}

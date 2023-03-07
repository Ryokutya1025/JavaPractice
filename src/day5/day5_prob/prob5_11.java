package day5.day5_prob;

public class prob5_11 {

	public static void main(String[] args) {
		int[] data = new int[10];
		for(int i = 0; i < data.length; i++) {
			data[i] = (int)(Math.random() * 100) + 1;
			System.out.print(data[i] + " ");
		}
		System.out.print("\n0以上60未満：");
		for(int j = 0; j < data.length; j++) {
			if(data[j] >= 0 && data[j] < 60) {
				System.out.print(data[j] + " ");
			}
		}
		
		System.out.print("\n60以上80未満：");
		for(int k = 0; k < data.length; k++) {
			if(data[k] >= 60 && data[k] < 80) {
				System.out.print(data[k] + " ");
			}
		}
		
		System.out.print("\n80以上：");
		for(int l = 0; l < data.length; l++) {
			if(data[l] >= 80) {
				System.out.print(data[l] + " ");
			}
		}
	}

}

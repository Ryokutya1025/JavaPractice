package day5.day5_prob;

public class prob5_3 {

	public static void main(String[] args) {
		int[] data = new int[10];
		for(int i = 0; i < data.length; i++) {
			data[i] = (int)(Math.random() * 100) + 1;
			System.out.print(data[i] + " ");
		}
		System.out.println("\n");
		
		System.out.print("奇数：");
		for(int j = 0; j < data.length; j++) {
			if(data[j] % 2 == 1)
				System.out.print(data[j] + " ");
		}
		System.out.println("\n");
		
		System.out.print("偶数：");
		for(int k = 0; k < data.length; k++) {
			if(data[k] % 2 == 0)
				System.out.print(data[k] + " ");
		}
	}

}

package day5.day5_prob;

public class prob5_4 {

	public static void main(String[] args) {
		int[] data = new int[10];
		for(int i = 0; i < data.length; i++) {
			int a = (int)(Math.random() * 100) + 1;
			data[i] = a;
			System.out.print(data[i] + " ");
		}
		
		System.out.println("\n");
		
		System.out.print("50以上の数：");
		for(int j = 0; j < 10; j++) {
			if(data[j] >= 50)
				System.out.print(data[j] + " ");
		}
		
		System.out.println("\n");
		
		System.out.print("50未満の数：");
		for(int j = 0; j < 10; j++) {
			if(data[j] < 50)
				System.out.print(data[j] + " ");
		}
	}

}

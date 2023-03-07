package day5.day5_prob;

public class prob5_5 {

	public static void main(String[] args) {
		int[] data = new int[10];
		for(int i = 0; i < data.length; i++) {
			int a = (int)(Math.random() * 10) + 1;
			data[i] = a;
			System.out.print(data[i] + " ");
		}
		
		System.out.println("\n");
		
		System.out.print("3の倍数：");
		for(int j = 0; j < 10; j++) {
			if(data[j] % 3 == 0)
				System.out.print(data[j] + " ");
		}
		
		System.out.println("\n");
		
		System.out.print("3の倍数以外の数：");
		for(int k = 0; k < 10; k++) {
			if(data[k] % 3 != 0)
				System.out.print(data[k] + " ");
		}
	}

}

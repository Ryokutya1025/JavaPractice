package day5.day5_prob;

public class prob5_8 {

	public static void main(String[] args) {
		int[] data = new int[5];
		int sum_high = 0;
		int sum_low = 0;
		int sum_zero = 0;
		
		for(int i = 0; i < data.length; i++) {
			int a = (int)(Math.random() * 21) - 10;
			data[i] = a;
			System.out.print(data[i] + " ");
		}
		
		System.out.println("\n");
		
		for(int j = 0; j < data.length; j++) {
			if(data[j] > 0) {
				sum_high++;
			}else if(data[j] < 0) {
				sum_low++;
			}else{
				sum_zero++;
			}
		}
		System.out.println("0より大きい数：" + sum_high);
		System.out.println("0より小さい数：" + sum_low);
		System.out.println("0の個数：" + sum_zero);
	}

}

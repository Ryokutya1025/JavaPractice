package day5.day5_prob;

public class prob5_7 {

	public static void main(String[] args) {
		int[] data = new int[5];
		int max = 0;
		int min = 100;
		int sum = 0;
		int avg = 0;
		
		for(int i = 0; i < data.length; i++) {
			int a = (int)(Math.random() * 10) + 1;
			data[i] = a;
			sum += data[i];
			System.out.print(data[i] + " ");
		}
		
		for(int j = 0; j < data.length; j++) {
			if(data[j] > max)
				max = data[j];
		}
		
		for(int k = 0; k < data.length; k++) {
			if(data[k] < min)
				min = data[k];
		}
		
		avg = sum / data.length;
		System.out.println();
		System.out.println("合計値：" + sum);
		System.out.println("平均値：" + avg);
		
		System.out.print("平均値より大きい数：");
		for(int k = 0; k < data.length; k++) {
			if(data[k] > avg) {
				System.out.print(data[k] + " ");
			}
		}
		
		System.out.println();
		
		System.out.print("平均値より小さい数：");
		for(int l = 0; l < data.length; l++) {
			if(data[l] < avg) {
				System.out.print(data[l] + " ");
			}
		}
	}

}

package day5.day5_prob;

public class prob5_6 {

	public static void main(String[] args) {
		int[] data = new int[10];
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
		
		for(int j = 0; j < 10; j++) {
			if(data[j] > max)
				max = data[j];
		}
		
		for(int k = 0; k < 10; k++) {
			if(data[k] < min)
				min = data[k];
		}
		
		avg = sum / data.length;
		System.out.println();
		System.out.println("最大値：" + max);
		System.out.println("最小値：" + min);
		System.out.println("平均値：" + avg);
	}
}

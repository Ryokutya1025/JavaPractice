package day4.day4_prob;

public class prob4_16 {

	public static void main(String[] args) {
		int mul = 0;
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				mul = i * j;
				String mul_st = String.valueOf(mul);
				
				if(mul / 10 == 0) {
					mul_st = " " + mul_st;
				}
				
				if(j == 9) {
					System.out.println(i + " × " + j + " = " + mul_st + "\t");
				}else{
					System.out.print(i + " × " + j + " = " + mul_st + "\t");
				}
			}
		}
	}

}

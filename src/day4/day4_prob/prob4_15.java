package day4.day4_prob;

public class prob4_15 {

	public static void main(String[] args) {
		for(int i = 1; i <= 100; i++) {
			int a = (int)(Math.random() * 100) + 1;
			String st = String.valueOf(a);
			
			switch(st.length()) {
				case 1:
					st = "  " + st;
					break;
				case 2:
					st = " " + st;
					break;
			}
			
			if(i % 10 == 0) {
				System.out.println("\t" + st);
			}else {
				System.out.print("\t" + st);
			}
		}
	}
}

package day5;

public class Sample504 {

	public static void main(String[] args) {
		int a[][] = {{0,1},{2},{3,4,5,6}};
		for(int m = 0; m < a.length; m++) {
			for(int n = 0; n < a[m].length; n++) {
				System.out.print(a[m][n]+" ");
			}
			System.out.println();
		}
	}

}

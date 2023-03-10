package ex_day1.exDay1_prob;

public class Counter {
	private int count = 0;
	private static int totalCount = 0;
	
	public void reset() {
		totalCount -= count;
		count = 0;
	}
	public void count() {
		count++;
		totalCount++;
	}
	public int getCount() {
		return count;
	}
	static int getTotalCount() {
		return totalCount;
	}
}
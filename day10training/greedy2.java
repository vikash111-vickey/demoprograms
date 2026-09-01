package day10training;
public class greedy2 {
	public static void main(String[] args) {
		int[] start = {1,2,3,5,6};
		int[]end= {3,4,5,7,8};
		int lastEnd=end[0];
		System.out.println("selected activity:A");
		for (int i=1;i<start.length;i++) {
			if(start[i]>=lastEnd) {
				System.out.println("selected activity:"+(char)('A'+1));
				lastEnd=end[i];
			}
		}
	}
}

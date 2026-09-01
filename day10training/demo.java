package day10training;
//jumping
public class demo {
	public static void main(String[] args) {
		int[] num= {2,1,1,0,4};
		int maxreacher =0;
		for(int i=0;i<num.length;i++) {
			if(i>maxreacher) {
			break;
			}
			maxreacher=Math.max(maxreacher, i+num[i]);
		}
		if(maxreacher>=num.length-1) {
			System.out.println("can reach the last position");
		}else {
			System.out.println("cannot reach the last position");
		}
	}
}
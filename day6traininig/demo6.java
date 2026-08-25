package day6traininig;

public class demo6 {

	
	public static void main(String[] args) {
		int[] p = {5,3,-2,4,-10,6,2};
		int cp=0;
		int bp=0;
		for(int i =0;i<p.length;i++) {
			cp=cp+p[i];
			if(cp<0) {
				cp=0;
			}
			if(cp>bp) {
				bp=cp;
			}
		}
		System.out.println("max profit:"+bp);
	}}
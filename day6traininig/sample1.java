package day6traininig;

public class sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] e= {100,200,150,300,590};
		int[] p=new int[e.length];
		 p[0]=e[0];
		for (int i=1;i<e.length;i++) {
			p[i]=p[i-1]+e[i];
		}
		int sum=p[3]-p[0];
		System.out.println("total "+sum);
	}

}

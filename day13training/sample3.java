package day13training;

public class sample3 {

	public static void main(String[] args) {
		int[] a= {25000,40000,30000,50000};
		int highest=0;
		for(int i=0;i<=a.length;i++) {
			for(int j=i;j<a.length;j++) {
				if(a[i]<a[j]) {
					highest=a[j];
				}
			}
		}
		System.out.println("highest salary "+ highest);
	}

}



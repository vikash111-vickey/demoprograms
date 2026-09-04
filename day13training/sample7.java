package day13training;

public class sample7 {

	public static void main(String[] args) {
		int[] a= {50000,30000,70000,60000};
		int highest=0;
		for(int i=0;i<=a.length;i++) {
			for(int j=i;j<a.length;j++) {
				if(a[i]>a[j]) {
					highest=a[j];
				}
			}
		}
		System.out.println("second highest salary "+ highest);
	}

}
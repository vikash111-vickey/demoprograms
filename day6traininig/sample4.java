package day6traininig;

public class sample4 {

	public static void main(String[] args) {
		String[] array1= {"vikash","vikas","thilak"};
		String[] array2= {"ullas","yashwanth","yeshas"};
		String[]merged =new String[array1.length+array2.length];
		for(int i=0;i<array1.length;i++) {
			merged[i]=array1[i];	
		}
		for(int i=0;i<array2.length;i++) {
			merged[array1.length+i]=array2[i];
			}
		System.out.println("merged array:");
		for(int i=0;i<merged.length;i++) {
			System.out.print(merged[i]+" ");
		}
		

	}

}

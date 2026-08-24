package day5training;

public class naive {

	public static void main(String[] args) {
		String text ="I love java proramming :";
		String pattern =" java";
		int position = search(text,pattern);
		if (position!=-1) {
			System.out.println("pattran founf at the index"+ position);
		}else {
			System.out.println(" not found");
		}
	}
	static int search(String text, String Pattern) {
		int n=text.length();
		int m=Pattern.length();
		for (int i=0;i<=m;i++) {
			int j;
			for ( j=0;j<m;j++) {
				if (text.charAt(i+j)!= Pattern.charAt(j)) {
					break;
				}
			}
			if(j==m) {
				return i;
			}
		}
		return -1;
	}

}

package day5training;

public class sample1 {

	public static void main(String[] args) {
		String n = "programming";
		for(int i=0;i<=n.length();i++) {
			for(int j=i+1;i<=n.length();j++) {
				if (n.charAt(i) == n.charAt(j)) {
                    System.out.println(n.charAt(i));
                    break;
	  }
	}
  }
 }
}

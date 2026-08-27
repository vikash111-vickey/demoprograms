package day7training;

public class backtracking2 {
	static String c="123";
 static void trycall(String p) {
	 System.out.println("trying:"+p);
	 if(p==c) {
		 System.out.println("correct passward"+p);
		 return;
	 }
	 else {
		 System.out.println("wrong passward: "+p);
		 return;
	 }
}
 
	public static void main(String[] args) {
	  trycall("321");
	  trycall("312");
	  trycall("123");
	  trycall("231");
	}

}


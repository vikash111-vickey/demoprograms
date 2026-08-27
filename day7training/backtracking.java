package day7training;

public class backtracking {
static String correctpassward ="231";
static void trypassward(String passward) {
	System.out.println("trying:"+passward);
	if(passward.equals(correctpassward)) {
		System.out.println("passward found : "+passward);
		return;
	}
	System.out.println("wrong passward.go back and try another.");
}
	public static void main(String[] args) {
	trypassward("123");
	trypassward("231");
	trypassward("213");
	trypassward("132");

	}

}


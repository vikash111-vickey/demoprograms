package day9training;
import java.util.*;
public class lexialsearch {

public static void main(String[] args) {
	
 
		String[] names=
			{
					"ravi","rahul","vikash","vikas","thilak","samsung"
			};
		String search="ra";
		ArrayList<String>result=new ArrayList<>();
		for(String name:names) {
			if(name.contains(search)) {
				result.add(name);
			}
		}
		System.out.println("search results: ");
		for(String name:result) {
			System.out.println(name);
		}
	}
}

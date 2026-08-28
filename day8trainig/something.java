package day8trainig;
import java.util.Stack;
public class something {
	public static void main(String[] args) {
		Stack<Integer>stack=new Stack<>();
		stack.push(2);
		stack.push(3);
		int  b=stack.pop();
		int  a=stack.pop();
		stack.push(a+b);
		stack.push(4);
		b = stack.pop();
		System.out.println("result= "+b);
		a=stack.pop();
		System.out.println("result ="+a);
		stack.push(a*b);
		System.out.println("result ="+stack.pop());
	} 

}


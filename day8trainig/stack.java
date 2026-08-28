package day8trainig;

import java.util.Stack;

public class stack {

	public static void main(String[] args) {
		Stack<Integer>stack=new Stack<>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		System.out.println("stack: "+stack);
		System.out.println("top element : "+stack.peek());
		System.out.println("removed:"+stack.pop());
		System.out.println("stack after pop "+stack);
		System.out.println("is stack empty?"+stack.empty());
		
	}

}
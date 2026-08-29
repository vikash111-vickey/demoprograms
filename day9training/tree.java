package day9training;
public class tree {
	static class node{
		int data;
		node left;
		node right;
		node(int data){
			this.data=data;			
		}
	}static void preorder (node root) {
		if(root==null) {
			return;
		}
		System.out.println(root.data+" ");
		preorder(root.left);
		preorder(root.right);
	}
	public static void main(String[] args) {
		node root=new node(1);
		root.left=new node(2);
		root.right=new node(3);
		root.left.left=new node(4);
		root.left.right =new node(5);
		preorder(root);	
	}
}


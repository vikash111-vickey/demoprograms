package day9training;

	class node {
		int data;
		node left,right;
		node (int data){
			this.data=data;
		}
	}
	public class diameater {
		static int diameter=0;
		static int height(node root) {
			if(root==null)
				return 0;
			int leftheight=height(root.left);
			int rightheight=height(root.right);
			diameter=Math.max(diameter, leftheight+rightheight);
			return 1+Math.max(leftheight, rightheight);
		}
	public static void main(String[] args) {
		node root=new node(1);
		root.left=new node(2);
		root.right=new node(3);
		root.left.left=new node(4);  
		root.left.right=new node(5);
		height(root);
		System.out.println("diameter = "+diameter);
	}
}

	
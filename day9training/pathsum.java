package day9training;
public class pathsum {

    static class node {
        int data;
        node left, right;

        node(int data) {
            this.data = data;
        }
    }

    static boolean haspathsum(node root, int target) {

        if (root == null)
            return false;

        target = target - root.data;

        if (root.left == null && root.right == null)
            return target == 0;

        return haspathsum(root.left, target) ||
               haspathsum(root.right, target);
    }

    public static void main(String[] args) {

        node root = new node(1);

        root.left = new node(2);
        root.right = new node(3);

        root.left.left = new node(4);
        root.left.right = new node(5);

        root.right.left = new node(6);
        root.right.right = new node(7);

        int target = 5;

        if (haspathsum(root, target))
            System.out.println("Path with sum " + target + " exists");
        else
            System.out.println("Path does not exist");
    }
}
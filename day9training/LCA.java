package day9training;

public class LCA {

    static class node {
        int data;
        node left, right;

        node(int data) {
            this.data = data;
        }
    }

    static node findCA(node root, int n1, int n2) {

        if (n1 < root.data && n2 < root.data) {
            return findCA(root.left, n1, n2);
        }

        if (n1 > root.data && n2 > root.data) {
            return findCA(root.right, n1, n2);
        }

        return root;
    }

    public static void main(String[] args) {

        node root = new node(10);

        root.left = new node(5);
        root.right = new node(15);

        root.left.left = new node(2);
        root.left.right = new node(7);

        int n1 = 2;
        int n2 = 7;

        node result = findCA(root, n1, n2);

        System.out.println("LCA = " + result.data);
    }
}
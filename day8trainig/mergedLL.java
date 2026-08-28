package day8trainig;

public class mergedLL {
    static class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {

       
        node first = new node(10);
        node second = new node(30);
        node third = new node(50);

        first.next = second;
        second.next = third;

        
        node first2 = new node(20);
        node second2 = new node(40);
        node third2 = new node(60);

        first2.next = second2;
        second2.next = third2;

        
        node current1 = first;
        node current2 = first2;

        node dummy = new node(0);
        node current = dummy;

        while (current1 != null && current2 != null) {

            if (current1.data < current2.data) {
                current.next = current1;
                current1 = current1.next;
            } else {
                current.next = current2;
                current2 = current2.next;
            }

            current = current.next;
        }

        
        if (current1 != null) {
            current.next = current1;
        }

        if (current2 != null) {
            current.next = current2;
        }

      
        current = dummy.next;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    
}}

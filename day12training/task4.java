package day12training ;

public class task4 {

    public static void main(String[] args) {

        int[] a = {0, 1, 0, 3, 12};

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                for (int j = i + 1; j < a.length; j++) {
                    a[j - 1] = a[j];
                }
                a[a.length - 1] = 0;
            }
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
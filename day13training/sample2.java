package day13training;

public class sample2 {

    public static void main(String[] args) {

        int[] a = {3, 0, 1};

       
        for (int i = 0; i < a.length - 1; i++) {

            for (int j = 0; j < a.length - 1 - i; j++) {

                if (a[j] > a[j + 1]) {

                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < a.length; i++) {

            if (a[i] != i) {

                System.out.println(i);
                break;
            }
        }
    }
}
package day4training;
public class sample3 {

    public static void main(String[] args) {

        int sum = 0;
        int[] a = {10000, 15000, 12000, 18000, 20000};

        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }

        System.out.println("Sum = " + sum);
    }
}


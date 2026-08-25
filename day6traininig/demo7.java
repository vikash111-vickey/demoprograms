package day6traininig;

public class demo7 {

    public static void main(String[] args) {

        int[] p = {590, 600, 320, 400, 320, 560};

        int highest = 0;

        for (int i = 0; i < p.length; i++) {

            if (p[i] < 350) {
                System.out.println(p[i] + " = fail");
            }
            else if (p[i] > 550) {
                System.out.println(p[i] + " = top");

                if (p[i] > highest) {
                    highest = p[i];
                }
            }
            else {
                System.out.println(p[i] + " = pass");
            }
        }

        System.out.println("highest: " + highest);
    }
}
package day5training;

public class String4 {
    public static void main(String[] args) {
        String n = "ram";

        for (int i = 0; i < n.length(); i++) {
            for (int j = i + 1; j <= n.length(); j++) {
                System.out.println(n.substring(i, j));
            }
        }
    }
}
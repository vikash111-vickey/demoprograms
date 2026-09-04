package day13training;
public class sample9 {
    public static void main(String[] args) {
        String a = "ANAND";
        String[] n = {"A", "E", "I", "O", "U"};
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            String p = String.valueOf(a.charAt(i));
            for (int j = 0; j < n.length; j++) {
                if (p.equals(n[j])) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
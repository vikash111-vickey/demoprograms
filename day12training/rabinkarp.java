package day12training;
public class rabinkarp {

    static void search(String text, String pattern) {

        int n = text.length();
        int m = pattern.length();

        int d = 256;
        int q = 101;

        int patternHash = 0;
        int textHash = 0;
        int h = 1;

        for (int i = 0; i < m - 1; i++)
            h = (h * d) % q;

        for (int i = 0; i < m; i++) {
            patternHash = (d * patternHash + pattern.charAt(i)) % q;
            textHash = (d * textHash + text.charAt(i)) % q;
        }

        for (int i = 0; i <= n - m; i++) {

            if (patternHash == textHash) {

                int j = 0;

                while (j < m && text.charAt(i + j) == pattern.charAt(j))
                    j++;

                if (j == m)
                    System.out.println("Pattern found at index " + i);
            }

            if (i < n - m) {
                textHash = (d * (textHash
                        - text.charAt(i) * h)
                        + text.charAt(i + m)) % q;

                if (textHash < 0)
                    textHash = textHash + q;
            }
        }
    }

    public static void main(String[] args) {

        String text = "ABABCABAB";
        String pattern = "ABAB";

        search(text, pattern);
    }
}
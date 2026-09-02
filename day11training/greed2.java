package day11training;
public class greed2 {

    public static void main(String[] args) {

        int[][] matrix = {
            {1, 3, 2},
            {1, 5, 1},
            {4, 2, 1}
        };

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] dp = new int[rows][cols];

        
        dp[0][0] = matrix[0][0];

        
        for (int j = 1; j < cols; j++) {
            dp[0][j] = dp[0][j - 1] + matrix[0][j];
        }

        
        for (int i = 1; i < rows; i++) {
            dp[i][0] = dp[i - 1][0] + matrix[i][0];
        }

        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {

                dp[i][j] = matrix[i][j]
                        + Math.min(dp[i - 1][j], dp[i][j - 1]);
            }
        }

        System.out.println("Minimum path sum = " + dp[rows - 1][cols - 1]);
    }
}
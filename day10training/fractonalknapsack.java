package day10training;

public class fractonalknapsack {

	public static void main(String[] args) {
        int[] weight = {10, 20, 30};
        int[] value = {60, 100, 120};
        int capacity = 50;
        double totalValue = 0;
        double[] ratio = new double[weight.length];
        for (int i = 0; i < weight.length; i++) {
            ratio[i] = (double) value[i] / weight[i];
        }

        for (int i = 0; i < ratio.length - 1; i++) {
            for (int j = i + 1; j < ratio.length; j++) {

                if (ratio[i] < ratio[j]) {

                    double temp = ratio[i];
                    ratio[i] = ratio[j];
                    ratio[j] = temp;

                    int t = weight[i];
                    weight[i] = weight[j];
                    weight[j] = t;

                    t = value[i];
                    value[i] = value[j];
                    value[j] = t;
                }
            }
        }
        for (int i = 0; i < weight.length; i++) {
            if (capacity >= weight[i]) {
                capacity = capacity - weight[i];
                totalValue = totalValue + value[i];
                System.out.println("Taken full item: " + (i + 1));
            } else {
                double fraction = (double) capacity / weight[i];

                totalValue = totalValue + value[i] * fraction;

                System.out.println("Taken " + (fraction * 100) + "% of item: " + (i + 1));

                capacity = 0;
                break;
            }
        }

        System.out.println("Maximum Value = " + totalValue);
    }
}
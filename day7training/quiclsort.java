package day7training;

public class quiclsort {
    static void quicksort(int[] a, int low, int high) {

        if (low < high) {

            int pI = partition(a, low, high);

            quicksort(a, low, pI - 1);
            quicksort(a, pI + 1, high);
        }
    }

    static int partition(int[] a, int low, int high) {

        int pivot = a[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (a[j] < pivot) {
                i++;

                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }

        int temp = a[i + 1];
        a[i + 1] = a[high];
        a[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {

        int[] marks = {80, 45, 60, 30, 90, 70, 50};

        quicksort(marks, 0, marks.length - 1);

        for (int mark : marks) {
            System.out.print(mark + " ");
        }
    }
}
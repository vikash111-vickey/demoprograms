package day7training;

public class meargsort {

    static void mergesort(int[] a, int left, int right) {

        if (left >= right)
            return;

        int mid = (left + right) / 2;

        mergesort(a, left, mid);
        mergesort(a, mid + 1, right);

        int[] temp = new int[right - left + 1];

        int i = left;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= right) {
            temp[k++] = a[i] < a[j] ? a[i++] : a[j++];
        }

        while (i <= mid) {
            temp[k++] = a[i++];
        }

        while (j <= right) {
            temp[k++] = a[j++];
        }

        for (int x = 0; x < temp.length; x++) {
            a[left + x] = temp[x];
        }
    }

    public static void main(String[] args) {

        int[] marks = {80, 45, 60, 30, 90, 70, 50};

        mergesort(marks, 0, marks.length - 1);

        for (int mark : marks) {
            System.out.print(mark + " ");
        }
    }
}
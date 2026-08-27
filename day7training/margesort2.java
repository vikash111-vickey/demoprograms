
package day7training;

public class margesort2 {

    static void mergesort(String[] a, int left, int right) {

        if (left >= right)
            return;

        int mid = (left + right) / 2;

        mergesort(a, left, mid);
        mergesort(a, mid + 1, right);

        String[] temp = new String[right - left + 1];

        int i = left;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= right) {
            if (a[i].compareTo(a[j]) <= 0) {
                temp[k++] = a[i++];
            } else {
                temp[k++] = a[j++];
            }
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

        String[] names = {"Rahul", "Anita", "Kiran", "Deepak", "Arun"};

        mergesort(names, 0, names.length - 1);

        for (String name : names) {
            System.out.print(name + " ");
          
        }
    }
}
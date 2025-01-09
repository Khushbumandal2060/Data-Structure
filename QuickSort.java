public class Quicksort {
    public static void main(String[] args) {
        int[] a = {5, 7, 10, 2, 3, 6, 8, 23, 1, 4};
        int n = a.length;
        quicksort(a, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }

    static void quicksort(int[] a, int start, int end) {
        if (start < end) {
            int index = partition(a, start, end);
            quicksort(a, start, index - 1);
            quicksort(a, index + 1, end);
        }
    }

    static int partition(int[] a, int start, int end) {
        int pivot = a[start];
        int i = start;
        int j = end;
        while (i < j) {
            while (i < j && a[i] <= pivot) {
                i++;
            }
            while (a[j] > pivot) {
                j--;
            }
            if (i < j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        a[start] = a[j];
        a[j] = pivot;
        return j;
    }
}

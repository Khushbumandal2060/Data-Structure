public class Quicksort2 {
    
    static int partition(int a[], int start, int end) {
        int pivot = a[end];
        int i = (start - 1); // Index of smaller element
        for (int j = start; j < end; j++) {
            if (a[j] < pivot) {
                i++;
                // swap a[i] and a[j]
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        // swap a[i+1] and a[end] (or pivot)
        int temp = a[i + 1];
        a[i + 1] = a[end];
        a[end] = temp;
        return i + 1;
    }

    static void Quicksort(int a[], int start, int end) {
        if (start < end) {
            int index = partition(a, start, end);
            Quicksort(a, start, index - 1);
            Quicksort(a, index + 1, end);
        }
    }

    public static void main(String[] args) {
        int a[] = {5, 7, 10, 2, 3, 1, 20};
        int n = a.length;
        Quicksort(a, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}

public class Searching {

    // Linear Search Method
    public static void LinearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Element " + target + " found at index " + i);
                return; // Element found, exit the method
            }
        }
        System.out.println("Element " + target + " not found in the array.");
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 10, 23, 11};
        // Perform linear search for the element 10
        LinearSearch(arr, 10);
    }
}

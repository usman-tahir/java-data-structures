
public class QuickSort {

    public static void swap(int[] data, int i, int j) {
        // pre: 0 <= i, j < data.length
        // post: data[i] and data[j] are exchanged
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    private static int partition(int[] data, int left, int right) {
        // pre: left <= right
        // post: data[left] placed in the correct (returned) location
        while(true) {
            // move the "right" pointer toward the "left"
            while (left < right && data[left] < data[right]) {
                right--;
            }

            if (left < right) {
                swap(data, left++, right++);
            } else {
                return left;
            }

            // move the "left" pointer toward the "right"
            while (left < right && data[left] < data[right]) {
                left++;
            }

            if (left < right) {
                swap(data, left, right--);
            } else {
                return right;
            }
        }
    }

    public static void quickSort(int[] data, int n) {
        quickSortRecursive(data, 0, n - 1);
    }

    private static void quickSortRecursive(int[] data, int left, int right) {
        // pre: left <= right
        // post: data[left..right] is in ascending order
        int pivot;

        if (left >= right) {
            return;
        }

        // place the pivot
        pivot = partition(data, left, right);

        // sort the small values
        quickSortRecursive(data, left, pivot - 1);

        // sort the large values
        quickSortRecursive(data, pivot + 1, right);
    }

    public static void printArray(int[] array) {
        int length = array.length;
        int i;

        for (i = 0; i < length; i += 1) {
            System.out.print(i == length - 1 ? array[i] : array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 56, 934, -100, 99};
        printArray(numbers);

        quickSort(numbers, numbers.length);
        printArray(numbers);
    }
}
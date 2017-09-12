
public class MergeSort {
    
    private static void merge(int[] data, int[] temp, int low, int middle, int high) {
        // pre: data[middle..high] are in ascending order, temp[low..middle - 1] are in ascending order
        // post: data[low..high] contain all values in ascending order
        int resultIndex = low;
        int tempIndex = low;
        int destinationIndex = middle;

        while (tempIndex < middle && destinationIndex <= high) {
            if (data[destinationIndex] < temp[tempIndex]) {
                data[resultIndex++] = data[destinationIndex++];
            } else {
                data[resultIndex++] = temp[tempIndex++];
            }
        }
        // values left in the temp array
        while (tempIndex < middle) {
            data[resultIndex++] = temp[tempIndex++];
        }
    }

    private static void mergeSortRecursive(int[] data, int[] temp, int low, int high) {
        // pre: 0 <= low <= high < data.length
        // post: values in data[low..high] are in ascending order
        int n = high - low + 1;
        int middle = low + n / 2;
        int i;

        if (n < 2) {
            return;
        }

        for (i = low; i < middle; i++) {
            temp[i] = data[i];
        }

        // sort lower half of array
        mergeSortRecursive(temp, data, low, middle - 1);
        
        // sort upper half of the array
        mergeSortRecursive(data, temp, middle, high);

        // merge the sorted halves together
        merge(data, temp, low, middle, high);
    }

    public static void mergeSort(int[] data, int n) {
        // pre: 0 <= n <= data.length
        // post: values in data[0..n - 1] are in ascending order
        mergeSortRecursive(data, new int[n], 0, n - 1);
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
        int[] numbers = {24, 54, 90, 1, -23, 34, 1102};
        printArray(numbers);

        mergeSort(numbers, numbers.length);
        printArray(numbers);
    }
}
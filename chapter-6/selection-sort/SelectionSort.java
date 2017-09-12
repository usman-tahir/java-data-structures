
public class SelectionSort {

    public static void swap(int[] data, int i, int j) {
        // pre: 0 <= i, j < data.length
        // post: data[i] and data[j] are exchanged
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    public static void selectionSort(int[] data, int n) {
        // pre: 0 <= n <= data.length
        // post: values in data[0..n - 1] are in ascending order
        int numUnsorted = n;
        int index, max;

        while (numUnsorted > 0) {
            max = 0;
            for (index = 0; index < numUnsorted; index += 1) {
                if (data[max] < data[index]) {
                    max = index;
                }
            }
            swap(data, max, numUnsorted - 1);
            numUnsorted -= 1;
        }
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
        int[] numbers = {1, 43, 65, 77, 23, 98, 199, 12};
        printArray(numbers);

        selectionSort(numbers, numbers.length);
        printArray(numbers);
    }
}
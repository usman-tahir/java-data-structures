
public class BubbleSort {
    
    public static void swap(int[] data, int i, int j) {
        // pre: 0 <= i, j < data.length
        // post: data[i] and data[j] are exchanged
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    public static void bubbleSort(int[] data, int n) {
        // pre: 0 <= n <= data.length
        // post: values in data[0..n - 1] in ascending order
        int numSorted = 0;
        int index;

        while (numSorted < n) {
            for (index = 1; index < n - numSorted; index += 1) {
                if (data[index - 1] > data[index]) {
                    swap(data, index - 1, index);
                }
            }
            numSorted += 1;
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
        int[] numbers = {23, 16, 14, 1, 90, 0, 23, 53};
        printArray(numbers);

        bubbleSort(numbers, numbers.length);
        printArray(numbers);
    }
}
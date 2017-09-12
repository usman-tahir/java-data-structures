
public class InsertionSort {
    
    public static void insertionSort(int[] data, int n) {
        // pre: 0 <= n <= data.length
        // post: values in data[0..n - 1] are in ascending order
        int numSorted = 1;
        int index;

        while (numSorted < n) {
            int temp = data[numSorted];
            for (index = numSorted; index > 0; index -= 1) {
                if (temp < data[index - 1]) {
                    data[index] = data[index - 1];
                } else {
                    break;
                }
            }
            // re-insert the value
            data[index] = temp;
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
        int[] numbers = {1, 54, 23, 76, 324, 65, -100, -101, 25};
        printArray(numbers);

        insertionSort(numbers, numbers.length);
        printArray(numbers);
    }
}
import java.util.Arrays;

public class QSort {

    public static void main(String[] args) {
        int[] input = {44, 1, 43, 22, 8, 39};
        int size = input.length;
        System.out.println("Unsorted Array");
        System.out.println(Arrays.toString(input));
        quickSort(input, 0, size - 1);
        System.out.println("Sorted Array in Ascending Order ");
        System.out.println(Arrays.toString(input));

    }

    private static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pi = getPartitionIndex(array, low, high);
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }

    }

    private static int getPartitionIndex(int[] array, int low, int high) {
        int pivot = array[high];
        int pIndex = (low - 1);
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                pIndex++;
                swap(array, j, pIndex);
            }
        }
        swap(array, high, pIndex + 1);
        return (pIndex + 1);
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp;
        temp = arr[index2];
        arr[index2] = arr[index1];
        arr[index1] = temp;
    }

}

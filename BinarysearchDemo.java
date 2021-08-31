import java.util.Arrays;
import java.util.Scanner;

public class BinarysearchDemo {

    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 4, 5, 6};
        System.out.println("Enter the Key to search");
        Scanner scn  = new Scanner(System.in);
            int key  = scn.nextInt();
        Arrays.sort(arr);
        int loc = binarySearch(arr, arr.length, key);
        if (loc == -1) {
            System.out.println("Key not Found!");
        } else {
            System.out.println("Key found at index " + loc);
        }
    }

    private static int binarySearch(int[] array, int n, int key) {
        int start = 0;
        int end = n - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (array[mid] == key) {
                return mid;
            } else if (array[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }

    private static int binarySearchWithRecursion(int[] arr, int low, int high, int key) {
        if (high < low) {
            return -1;
        }
        int mid = (low + high) / 2;
        if (key == arr[mid]) {
            return mid;
        }
        if (key > arr[mid]) {
            return binarySearchWithRecursion(arr, mid + 1, high, key);
        }
        return binarySearchWithRecursion(arr, low, mid - 1, key);
    }

}

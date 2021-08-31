import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7,8};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void reverse(int[] arr) {
        int startIndex = 0;
        int endIndex = arr.length -1;
        while (startIndex <= endIndex ){
            swap(arr,startIndex,endIndex);
            startIndex++;
            endIndex--;

        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}

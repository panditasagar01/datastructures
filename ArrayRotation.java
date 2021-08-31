import java.util.Arrays;

public class ArrayRotation {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int d = 3;
        int n = arr.length;
        reverseArray(arr,0,d-1);
        reverseArray(arr,d,n-1);
        reverseArray(arr,0,n-1);
    Arrays.stream(arr).forEach(System.out::println);
    }

    private static void reverseArray(int[] arr, int start, int end) {
        int temp;
        while (start < end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end]=temp;
            start++;
            end--;
        }

    }
}

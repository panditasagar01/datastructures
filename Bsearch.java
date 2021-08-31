import java.util.Arrays;

public class Bsearch {

    public static void main(String[] args) {
        int[] input = {5, 6, 7, 2, 1, 76};
        int key = 76;
        Arrays.sort(input);
        int index = findKey(key, input,0,input.length-1);
        if (index == -1) {
            System.out.println("Value not found");
        } else {
            System.out.println("Value found at Index " +index);
        }

    }

    private static int findKey(int key, int[] in, int startIndex, int endIndex) {

        if (endIndex < startIndex) {
            return -1;
        }
        int mid = (endIndex + startIndex) / 2;
        if (key == in[mid]) {
            return mid;
        }
        if (key > in[mid]) {
            return findKey(key, in, mid + 1, endIndex);
        } else {
            return findKey(key, in, startIndex, mid - 1);
        }
    }

}

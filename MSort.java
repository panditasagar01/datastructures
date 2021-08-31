import java.util.Arrays;

public class MSort {

    public static void main(String[] args) {
        int[] arr = {9, 5, 8};
        int n = arr.length;
        mergeSort(arr, 0, n - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int mid = (l + r) / 2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);
            merge(arr, l, mid, r);
        }
    }

    private static void merge(int[] arr, int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r -mid;
        int[] L = new int[n1];
        int[] R = new int[n2];

        for(int i = l ; i < n1 ; i++){
            L[i] = arr[l+i];
        }
        for(int j = 0 ; j < n2 ; j++){
            R[j] = arr[mid+1+j];
        }

        int i,j,k;
        i =0; j=0; k=l;
        while (i < n1 && j < n2){
            if(L[i] <= R[j]){
                arr[k] = L[i];
                i++;
            }else{
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1){
                arr[k] = L[i];
                i++;
                k++;
        }
        while (j < n2){
                arr[k] = R[j];
                j++;
                k++;
            }
        }

    }

import java.util.Arrays;

public class PrintArrayPairs {

    public static void main(String[] args) {
        int[] array = {1,2,-3,4};
        //printPairs(array);
        findSumWithPrefixSum(array);
    }

    private static void printPairs(int[] array) {
        int lSum = 0;
        for(int i = 0 ; i < array.length ; i++){
            for(int j = i+1; j < array.length; j++){
                int sum = 0;
                for(int k=i; k <= j;k++){
                    sum +=array[k];
                    System.out.print(array[k]);
                    if(sum > lSum){
                        lSum = sum;
                    }
                }
                System.out.println("");
            }
        }
        System.out.println("Largest Sum is "+lSum);
    }

    private static void findSumWithPrefixSum(int[] array){
        int[] prefix = new int[array.length];
        int largestSum= 0;
        int subarraySum =0;
        prefix[0] = array[0];
        for(int i = 1; i <= array.length-1;i++){
            prefix[i] = prefix[i-1] + array[i];
        }
        for(int i = 0 ; i < array.length; i++){
            for(int j =i; j < array.length; j++){
                subarraySum = i < 0 ? prefix[j] - array[i-1]:prefix[j];
                largestSum = Math.max(subarraySum,largestSum);
            }
        }
        System.out.println(largestSum);
    }

}

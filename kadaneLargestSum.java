public class kadaneLargestSum {

    public static void main(String[] args) {
        int[] array = {-2,1,4,-5,6,3,-19,4,5,6,-1,2 ,-2};
        System.out.println(findLargestSubarraySum(array));
    }

    private static int findLargestSubarraySum(int[] array) {
        int currentSum = 0;
        int largestSum = 0;
        for(int i =0 ; i < array.length; i++){
            currentSum += array[i];
            if(currentSum < 0){
                currentSum = 0;
            }
            largestSum = Math.max(largestSum,currentSum);
        }
    return largestSum;
    }

}

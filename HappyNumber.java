import java.util.Arrays;

public class HappyNumber {

    public static void main(String[] args) {
        int[] input ={31,32,33,34};
        System.out.println(checkHappyNumber(7,7));
    }

    private static int checkHappyNumber(int l, int r) {
        int res = 0;
        for(int i = l ; i <=r;i++){
            if(extracted(i))
                res = res + i;

        }
        return res;
    }

    private static boolean extracted(int n) {
        if (n == 1 || n == 7)
            return true;
        int sum = n, x = n;
        while(sum > 9) {
            sum = 0;
            while (x > 0) {
                int d = x%10;
                sum += d*d;
                x/=10;
            }
            if (sum == 1)
                return true;
            x = sum;
        }
        return sum == 7;
    }


}

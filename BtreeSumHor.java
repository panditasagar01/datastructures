import java.util.Arrays;

public class BtreeSumHor {

    static class Node{
        int data;
        Node left;
        Node right;
    }
    static Node newNode(int item){
        Node temp = new Node();
        temp.data = item;
        temp.left = temp.right = null;
        return temp;
    }

    public static void main(String[] args) {
        Node root = newNode(5);
        root.left = newNode(10);
        root.right = newNode(23);
        root.left.left = newNode(7);
        root.left.right = newNode(9);
        root.left.right.left = newNode(1);
        root.right.left = newNode(20);
        root.right.right = newNode(26);
        int levels = getHeight(root) + 1;
        int[] sum = new int[levels];
        calculateSum(root,0,sum);
        printSum(sum);
    }

    private static void printSum(int[] sum) {
        Arrays.stream(sum).forEach(System.out::println);
    }

    private static void calculateSum(Node root, int levels, int[] sum) {
        if(root == null)
            return;
        sum[levels] += root.data;
        calculateSum(root.left,levels+1,sum);
        calculateSum(root.right,levels+1,sum);
    }

    private static int getHeight(Node root) {
        if(root == null)
            return -1;
        int lHeight = getHeight(root.left);
        int rHeight = getHeight(root.right);

        return Math.max(lHeight,rHeight) + 1;

    }

}

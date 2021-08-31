public class BTreeDemo {
    static int height = -1;
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
        root.right = newNode(15);
        root.left.left = newNode(12);
        root.left.right = newNode(13);
        root.left.right.right = newNode(34);
        root.right.left = newNode(20);
        root.right.right = newNode(25);
        int k= 10;
      //  System.out.println(findHeight(root,k));
        System.out.println(findDepth(root));
    }

    private static int findHeight(Node root, int k) {
        findHeightUtil(root,k);
        return height;
    }

    private static int findHeightUtil(Node root, int k) {
        if(root == null)
            return -1;

        int leftHeight = findHeightUtil(root.left,k);
        int rightHeight = findHeightUtil(root.right,k);
        int ans = Math.max(leftHeight,rightHeight) +1;
    if(root.data == k)
        height=ans;
    return ans;
    }

    static int findDepth(Node root, int x)
    {
        if (root == null)
            return -1;
        int dist = -1;
        if ((root.data == x)|| (dist = findDepth(root.left, x)) >= 0 || (dist = findDepth(root.right, x)) >= 0){
            return dist + 1;
        }
        return dist;
    }

    static int findDepth(Node root)
    {
        if (root == null)
            return -1;
        int lDepth = findDepth(root.left);
        int rDepth = findDepth(root.right);
        return (Math.max(lDepth,rDepth))+1;
    }

}

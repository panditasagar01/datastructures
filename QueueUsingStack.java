import java.util.Stack;

public class QueueUsingStack {

    static class queue {

        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        static void enQueue(int x) {

            while (!s1.empty()) {
                s2.push(s1.pop());
            }
            s1.push(x);
            while(!s2.empty()){
                s1.push(s2.pop());
            }
        }

        static int deQueue() {
            if (s1.empty()) {
                return -1;
            }
            return s1.pop();
        }
        static void print(){
            System.out.println(s1.toString());
        }


    }

    public static void main(String[] args) {
        queue.enQueue(1);
        queue.print();
        queue.enQueue(2);
        queue.print();
        queue.enQueue(3);
        queue.print();
        queue.enQueue(4);
        queue.print();
        queue.enQueue(5);
        queue.print();
        System.out.println(queue.deQueue());
    }

}

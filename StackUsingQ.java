import java.util.*;
public class StackUsingQ {

    static class stack {
        static Queue<Integer> q1 = new LinkedList();
        static Queue<Integer> q2 = new LinkedList();

        static int currSize;

        stack() {
            currSize = 0;
        }
        static void push(int x){
            q2.add(x);
            while (!q1.isEmpty()){
                q2.add(q1.peek());
                q1.remove();
            }
            Queue<Integer> q = q1;
            q1 = q2;
            q2 = q;
            currSize++;
        }

        static void pop(){
            if(q1.isEmpty())
                return;
            q1.remove();
            currSize--;
        }

        static int top(){
            if(q1.isEmpty())
                return -1;
           return q1.peek();
        }
        static  int size(){
            return currSize;
        }
    }

    public static void main(String args[]) {
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.pop();
        stack.pop();
        System.out.println( stack.top());
        stack.pop();
        System.out.println( stack.top());

        System.out.println( stack.size());
    }

}

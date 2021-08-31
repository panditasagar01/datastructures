import java.util.*;
public class StackUsingOneQ {
    static class stack{
        static Queue<Integer> q = new LinkedList();

        static void push(int x){
            q.add(x);
            for(int i = 0; i < q.size()-1;i++){
                q.add(q.peek());
                q.remove();
            }
        }
        static void pop(){
            if(q.isEmpty())
                return;
            q.remove();
        }
        static int top(){
            if(q.isEmpty())
                return -1;
            return  q.peek();
        }
        static int size(){
            return q.size();
        }
        static void print(){
            System.out.println(q.toString());
        }
    }

    public static void main(String[] args) {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.top());
        stack.print();
        stack.pop();
        System.out.println(stack.top());
        stack.pop();
        stack.pop();
        System.out.println(stack.top());
        stack.pop();
        System.out.println(stack.size());
    }

}

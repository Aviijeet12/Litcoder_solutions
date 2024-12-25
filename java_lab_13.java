import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

public class java_lab_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueUsingTwoStacks queue = new QueueUsingTwoStacks();
        String input = sc.nextLine();
        String[] queries = input.split(",");
        for (String query : queries) {
            String[] parts = query.trim().split(" ");
            if (parts[0].equals("1")) {
                int x = Integer.parseInt(parts[1]);
                queue.enqueue(x);
            } else if (parts[0].equals("2")) {
                queue.dequeue();
            } else if (parts[0].equals("3")) {
                queue.printFront();
            }
        }
        sc.close();
    }
}

class QueueUsingTwoStacks {
    Stack<Integer> st1;
    Stack<Integer> st2;
    public QueueUsingTwoStacks() {
        st1 = new Stack<>();
        st2 = new Stack<>();
    }
    public void enqueue(int x) {
        st1.push(x);
    }
    public void dequeue() {
        if (st2.isEmpty()) {
            while (!st1.isEmpty()) {
                st2.push(st1.pop());
            }
        }
        if (!st2.isEmpty()) {
            st2.pop();
        }
    }
    public void printFront() {
        if (st2.isEmpty()) {
            while (!st1.isEmpty()) {
                st2.push(st1.pop());
            }
        }
        if (!st2.isEmpty()) {
            System.out.println(st2.peek());
        }
    }
}

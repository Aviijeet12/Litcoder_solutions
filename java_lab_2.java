import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

public class java_lab_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        if(a<4){
            System.out.println("Invalid Input");
        }
        else{
            int s = doSomething(a,b);
            System.out.println(s);
            System.out.println(b - s);
        }
    }

    public static int doSomething(int a, int b)
    {
        int t = 4;
        int r = a / t;

        return Math.min(r, b);
    }
}

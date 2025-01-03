import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class java_lab_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = findLargestSpecialPrime(n);
        System.out.println(result);
    }
    public static int findLargestSpecialPrime(int n) {
        for (int i = n - 1; i > 1; i--) {
            if (isSpecialPrime(i)) {
                return i;
            }
        }
        return -1;
    }
    public static boolean isSpecialPrime(int num) {
        String numStr = String.valueOf(num);
        for (int i = 1; i <= numStr.length(); i++) {
            int prefix = Integer.parseInt(numStr.substring(0, i));
            if (!isPrime(prefix)) {
                return false;
            }
        }
        return true;
    }
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}

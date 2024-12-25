import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class java_lab_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] charlieIn = sc.nextLine().split(" ");
        int[] charlie = new int[charlieIn.length];
        for (int i = 0; i < charlieIn.length; i++) {
            charlie[i] = Integer.parseInt(charlieIn[i]);
        }
        String[] daveIn = sc.nextLine().split(" ");
        int[] dave = new int[daveIn.length];
        for (int i = 0; i < daveIn.length; i++) {
            dave[i] = Integer.parseInt(daveIn[i]);
        }
        int charliePoints = 0;
        int davePoints = 0;
        for (int i = 0; i < charlie.length && i < dave.length; i++) {
            if (charlie[i] > dave[i]) {
                charliePoints++;
            } else if (charlie[i] < dave[i]) {
                davePoints++;
            }
        }
        System.out.println(charliePoints + " " + davePoints);
    }
}

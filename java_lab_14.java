import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

public class java_lab_14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String start = sc.nextLine();
        String end = sc.nextLine();
        boolean result = Trans(start, end);
        System.out.println(result ? "true" : "false");
        sc.close();
    }

    public static boolean Trans(String st, String end) {
        if (!st.replace("X", "").equals(end.replace("X", ""))) {
            return false;
        }
        int i = 0, j = 0;
        int n = st.length();
        while (i < n && j < n) {
            while (i < n && st.charAt(i) == 'X') {
                i++;
            }
            while (j < n && end.charAt(j) == 'X') {
                j++;
            }
            if (i < n && j < n) {
                if (st.charAt(i) != end.charAt(j)) {
                    return false;
                }
                if (st.charAt(i) == 'L' && i < j) {
                    return false;
                }
                if (st.charAt(i) == 'R' && i > j) {
                    return false;
                }
                i++;
                j++;
            }
        }
        while (i < n && st.charAt(i) == 'X') {
            i++;
        }
        while (j < n && end.charAt(j) == 'X') {
            j++;
        }
        return i == n && j == n;
    }

}

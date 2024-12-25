import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class Plus_minus {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = input.nextInt();
        }
        int pcnt = 0;
        int ncnt = 0;
        int zcnt = 0;

        for(int i=0;i<n;i++){
            if(arr[i]>0){
                pcnt++;
            }
            else if(arr[i]<0){
                ncnt++;
            }
            else{
                zcnt++;
            }
        }
        System.out.printf("%.3f%n",(double) pcnt/n);
        System.out.printf("%.3f%n", (double) ncnt/n);
        System.out.printf("%.3f%n", (double) zcnt/n);

    }


}
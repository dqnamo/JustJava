import java.util.*;

public class Solution {
    public static void main(String args[] ) throws Exception
    {
        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        int avg= (num1+num2+num3)/3;

        int OneDiff = Math.abs(num1 - avg);
        int TwoDiff = Math.abs(num2 - avg);
        int ThreeDiff = Math.abs(num3 - avg);

        if (OneDiff > TwoDiff && OneDiff > ThreeDiff) {
            System.out.println(num1);
        }
        else if (TwoDiff > OneDiff && TwoDiff > ThreeDiff) {
            System.out.println(num2);
        }
        else if (ThreeDiff > TwoDiff && ThreeDiff > OneDiff) {
            System.out.println(num3);
        }
        else {
            System.out.println("NA");
        }
    }
}



Find the xth biggest number (courtesy of Manyiu Lam)



import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int[] a = new int[in.nextInt()];

            for(int i = 0; i < a.length; i++) {
                a[i] = in.nextInt();
            }
            a = insertion(a);
        System.out.println(a[a.length-in.nextInt()]);

    }

    public static int[] insertion(int[] a) {
        for(int i = 0; i < a.length; i++) {
            for(int j = i+1; j < a.length; j++) {
                if(a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }

}

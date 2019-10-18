import java.util.*; 

public class Solution {

    public static void main(String args[] ){

        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine()), rank = Integer.parseInt(in.nextLine());

        String[] b = new String[n];

        int[] a = new int[n];



        for(int i = 0; i < n; i++) {

            b[i] = in.nextLine();

            a[i] = Integer.parseInt(in.nextLine());

        }



        insertion(a, b);



        System.out.println(b[n-rank]);

    }



    public static void insertion(int[] a, String[] b) {

        for(int i = 0; i < a.length-1; i++) {

            for(int j = i+1; j < a.length; j++) {

                if(a[i] > a[j]) {

                    swap(i, j, a);

                    swap(i, j, b);

                }

            }

        }

    }



    public static void swap(int x, int y, int[] a) {

        int temp = a[x];

        a[x] = a[y];

        a[y] = temp;

    }



    public static void swap(int x, int y, String[] a) {

        String temp = a[x];

        a[x] = a[y];

        a[y] = temp;

    }



}

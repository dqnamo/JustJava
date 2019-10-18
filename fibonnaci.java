public class Solution {

    public static long[] answers = new long[70];



    public static void main(String args[] ) throws Exception {



        Scanner input = new Scanner(System.in);

        int n = input.nextInt();



        System.out.println(tribonnaci(n));

    }



    public static long tribonnaci(int n) {

        if (n<2) {

            answers[n]=0;

            return 0;

        } else if (n==2){

            answers[n]=1;

            return 1;

        } else if (answers[n]!=0) {

            return answers[n];

        } else {

            answers[n]=tribonnaci(n-1)+tribonnaci(n-2)+tribonnaci(n-3);

            return answers[n];

        }

    }



}

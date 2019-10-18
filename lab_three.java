import java.util.*;



public class Solution {



    public static void main(String args[] ){



        Scanner myScanner = new Scanner(System.in);

        int number = myScanner.nextInt();

        int[] arr =  new int[number];

        double sum=0;



        for(int x = 0; x < arr.length; x++){



            arr[x] = myScanner.nextInt();

            sum = arr[x] + sum;



        }

        double average = (sum/arr.length);

        double closest= Math.abs(arr[0]-average);

        int index = 0;



        for (int j=0; j<arr.length; j++){

            if (Math.abs(arr[j]-average)< closest){

              closest = Math.abs(arr[j]-average);

              index = j;

            }

        }

        System.out.println(arr[index]);

    }

}



FIND THE MODE

import java.util.*;



public class Solution {

    public static void main(String args[] ){

        Scanner myscanner = new Scanner(System.in);

        int number = myscanner.nextInt();

        int[] data = new int[number];

        for(int i=0;i<number;i++){

            data[i]=myscanner.nextInt();

        }

        int record=0;

        int recordnumber=0;

        for(int i=0;i<number;i++){

            int count=0;

            for(int j=0;j<number;j++){

                if(data[i]==data[j])

                    count++;

            }

            if(count>record){

                record=count;

                recordnumber=data[i];

            }

        }

        System.out.println(recordnumber);

    }

}

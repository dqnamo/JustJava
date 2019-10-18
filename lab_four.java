public class Solution {

	public static void main(String args[] ) throws Exception {

    		Scanner in = new Scanner(System.in);

    		int c = 0;



        		for(int i = in.nextInt()-1; i >= 2; i--) {

           			if(isPrime(i)) c++;

       			}



    			System.out.print(c);

    	}



    	public static boolean isPrime(int x) {

        	for(int i = 2; i <= Math.sqrt(x); i++) {

         	   if(x%i == 0) return false;

        	}

       	 	return true;

    	}



}

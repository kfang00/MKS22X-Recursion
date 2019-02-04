import java.util.ArrayList;

public class Recursion{
    /*You may write additional private methods */

    /*Recursively find the sqrt using Newton's approximation
     *tolerance is the allowed percent error the squared answer is away from n.
     *precondition: n is non-negative

    */
    public static double sqrt(double n, double tolerance){
      return sqrtH(n, tolerance, 1.0);
    }

    private static double sqrtH(double n, double tolerance, double guess){
      if (Math.abs((guess * guess) - n) < (tolerance * n)) {
	return guess;
      }
      return sqrtH(n, tolerance, (((n / guess) + guess) / 2));
    }

    /*Recursively find the n'th fibbonaci number in linear time
     *fib(0) = 1; fib(1) = 1; fib(5) = 5
     *precondition: n is non-negative
     */
    public static int fib(int n){
      return 0;
    }

    private static int fib(int n, int sum){
      if (n == 0) {
	return 0;
      }
      if (n == 1) {
	return 1;
      }
      if (n > 1) {
	return fib(n - 2) + fib(n - 1);
      }
      return n;
    }

    /*As Per classwork*/
    public static ArrayList<Integer> makeAllSums(){
      ArrayList<Integer> hold = new ArrayList<Integer>();
      return hold;
    }

}


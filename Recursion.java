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
      if (n == 0) {
	return 0;
      }
      return sqrtH(n, tolerance, (((n / guess) + guess) / 2));
    }

    /*Recursively find the n'th fibbonaci number in linear time
     *fib(0) = 1; fib(1) = 1; fib(5) = 5
     *precondition: n is non-negative
     */
    public static int fib(int n){
      return fibH(n, 0, 1);
    }

    private static int fibH(int n, int sum1, int sum2){
      if (n == 0) {
	return sum1;
      }
      if (n == 1) {
	return sum2;
      }
      if (n > 1) {
	return fibH((n - 1), sum2, sum1 + sum2 );
      }
      return n;
    }

    /*As Per classwork*/
    public static ArrayList<Integer> makeAllSums(int n){
      return mASH(n);
    }

    private static ArrayList<Integer> mASH(int n, int sum) {
      int a = 1;
      ArrayList<Integer> hold = new ArrayList<Integer>();
      if (n == 0) {
	hold.add(sum);
      }
      if (a == 1) {
	return mASH(n - 1, sum + n);
      }
      a = 0;
      return mASH(n - 1, sum);
    }

public static void main(String[] args) {
        System.out.println("sqrt()");
        System.out.println("-----------------------\n");

        System.out.println("sqrt(4, 0.00001)");
        System.out.println("EXPECTED: 2");
        System.out.println(sqrt(4, 0.00001));         // 2

        System.out.println("----");

        System.out.println("sqrt(8, 0.00001)");
        System.out.println("EXPECTED: ~2.8284");
        System.out.println(sqrt(8, 0.00001));         // ~2.8284

        System.out.println("----");

        System.out.println("sqrt(0, 0.00001)");
        System.out.println("EXPECTED: 0");
        System.out.println(sqrt(0, 0.00001));         // 0

        System.out.println("\n");

        System.out.println("fib()");
        System.out.println("-----------------------\n");

        System.out.println("fib(0)");
        System.out.println("EXPECTED: 0");
        System.out.println(fib(0));                   // 0

        System.out.println("----");

        System.out.println("fib(1)");
        System.out.println("EXPECTED: 1");
        System.out.println(fib(1));                   // 1

        System.out.println("----");

        System.out.println("fib(7)");
        System.out.println("EXPECTED: 13");
        System.out.println(fib(7));                   // 13

        System.out.println("makeAllSums()");
        System.out.println("-----------------------\n");

        System.out.println("makeAllSums(0)");
        System.out.println("EXPECTED: [0]");
        System.out.println(makeAllSums(0));           // [0]

        System.out.println("----");

        System.out.println("makeAllSums(1)");
        System.out.println("EXPECTED: [1, 0]");
        System.out.println(makeAllSums(1));           // [1, 0]

        System.out.println("----");

        System.out.println("makeAllSums(3)");
        System.out.println("EXPECTED: [0, 3, 2, 5, 1, 4, 3, 6]");
        System.out.println(makeAllSums(3));           // [0, 3, 2, 5, 1, 4, 3, 6]
}

}



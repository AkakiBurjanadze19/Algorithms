public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        long result = factorial(n);
        System.out.println(result);
    }

    public static long factorial(int n) {
        // handle edge cases for negative input
        if (n < 0) {
            System.out.println("factorial is not defined for negative numbers!");
            return -1;
        }

        // initialize product variable to 1 (factorial of 0 is 1. 0! = 1)
        long product = 1;
        // iterate to multiply numbers from 1 to n [1, n]
        for (int i = 1; i <= n; i++) {
            // multiply the current product by i
            product *= i;
        }

        // return the calculated factorial
        return product;
    }
}
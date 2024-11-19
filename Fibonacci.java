public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;
        printFibonacciSequence(n);
    }

    public static void printFibonacciSequence(int n) {
        // handle edge cases for n <= 0
        if (n <= 0) {
            System.out.println("Please provide a positive integer");
            return;
        }

        // initialize the first two fibonacci numbers
        int first = 0; // the first fibonacci number
        int second = 1; // the second fibonacci number

        // iterate in the range [1, n)
        for (int i = 1; i < n; i++) {
            // print the current fibonacci number
            System.out.println(second + " ");

            // update variables for the next fibonacci number
            int next = first + second; // calculate the next number in the sequence
            first = second; // shift second to first
            second = next; // update second to the new value
        }

        // print a newline for better readability
        System.out.println();
    }
}
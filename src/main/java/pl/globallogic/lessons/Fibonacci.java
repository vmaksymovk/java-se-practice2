package pl.globallogic.lessons;

public class Fibonacci {
    // generate fibonacci(n)
// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144 - fibonacci row
    public static void main(String[] args) {
        int number = 8;
        System.out.printf("%sth number in Fibonacci row is: %s \n", number, fibonacciRecursive(number));
        System.out.printf("%sth number in Fibonacci row is: %s \n", number, fibonacciIterative(number));
    }

    private static int fibonacciRecursive(int number) {
        if (number < 2) {
            return number;
        } else {
            return fibonacciRecursive(number - 1) + fibonacciRecursive(number - 2);
        }
    }

    private static int fibonacciIterative(int number) {
        int last = 0, next = 1;
        for (int i = 0; i < number; i++) {
            int oldLast = last;
            last = next;
            next = oldLast + next;
        }
        return last;
    }
}

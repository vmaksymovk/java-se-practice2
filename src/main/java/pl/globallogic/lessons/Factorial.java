package pl.globallogic.lessons;

import java.util.stream.Stream;

public class Factorial {
    // base case - 0! == 1, 1! == 0
// recursive case - n! = n * (n - 1)!


    public static void main(String[] args) {
        int base = 5;
        int result = 120;
        System.out.println(factorialIterative(base) == result);
        System.out.println(factorialRecursive(base) == result);
        System.out.println(factorialStreams(base) == result);
    }

    private static int factorialStreams(int base) {
        return Stream.iterate(1, i -> ++i)
                .limit(base)
                .mapToInt(i -> i)
                .reduce(1, (n1, n2) -> n1 * n2);
    }

    private static int factorialRecursive(int base) {
        if (base == 0 || base == 1) {
            return 1;
        }
        return base * factorialRecursive(base - 1);
    }



    private static int factorialIterative(int base) {
        int acc = 1;
        for (int i = 1; i <= base; i++) {
            acc *= i;
        }
        return acc;
    }
}

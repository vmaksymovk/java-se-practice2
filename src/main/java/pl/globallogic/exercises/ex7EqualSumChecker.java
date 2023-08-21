package pl.globallogic.exercises;

public class ex7EqualSumChecker {
    public static void main(String[] args) {
        System.out.println(hasEqualSum(1, 1, 1));
        System.out.println(hasEqualSum(1, 1, 2));
        System.out.println(hasEqualSum(1, -1, 0));
    }

    public static boolean hasEqualSum(int num1, int num2, int sum) {
        return num1 + num2 == sum; // check if var a is sum of num1 and num2
    }
}

package pl.globallogic.lessons;

import java.util.Scanner;


public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the target base: ");
        double base = scanner.nextDouble();
        System.out.print("Enter target power ");
        int exponent = scanner.nextInt();
        double result = calculatePower(base, exponent);
        System.out.println("Result: " + result);
        scanner.close();
    }

    public static double calculatePower(double base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        double result = 1;
        int absExponent = Math.abs(exponent);
        for (int i = 1; i <= absExponent; i++) {
            result *= base;
        }
        return exponent < 0 ? 1 / result : result;
    }
}

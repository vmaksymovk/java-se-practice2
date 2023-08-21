package pl.globallogic.exercises;

public class ex6DecimalComparator {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));
    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        int precision = 1000;
        int num1Scaled = (int) (num1 * precision);
        int num2Scaled = (int) (num2 * precision);

        return num1Scaled == num2Scaled;
    }
}

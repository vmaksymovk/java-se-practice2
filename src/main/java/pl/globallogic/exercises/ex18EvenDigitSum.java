package pl.globallogic.exercises;

public class ex18EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }

        int sum = 0;

        while (number > 0) {
            int digit = number % 10; // check last digit
            if (digit % 2 == 0) {
                sum += digit;
            }
            number /= 10; // delete last digit
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
    }
}

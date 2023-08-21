package pl.globallogic.exercises;

public class ex17FirstLastDigitsCalc {
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        int lastDigit = number % 10; // found last digit
        while (number >= 10) {
            number /= 10;
        }
        int firstDigit = number; // found first digit
        return firstDigit + lastDigit;
    }
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));
    }
}

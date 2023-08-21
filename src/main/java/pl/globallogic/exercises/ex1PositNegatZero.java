package pl.globallogic.exercises;

public class ex1PositNegatZero {

    public static void main(String[] args) {
        int number1 = 5;
        int number2 = -3;
        int number3 = 0;

        checkNumber(number1); // Output: positive
        checkNumber(number2); // Output: negative
        checkNumber(number3); // Output: zero
    }

    public static void checkNumber(int number) {
        if (number > 0) {
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }
    }
}

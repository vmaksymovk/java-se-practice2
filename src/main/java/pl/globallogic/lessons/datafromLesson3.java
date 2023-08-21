package pl.globallogic.lessons;

public class datafromLesson3 {
    public static int countDigits(int number) {
        if (number == 0) {
            return 1;
        }

        int count = 0;
        while (number != 0) {
            count++;
            number = number / 10;
        }

        return count;
    }

    public static void main(String[] args) {
        int number = 1234567890;
        int digitCount = countDigits(number);
        System.out.println("Count in number " + number + " = " + digitCount);
    }
}

package pl.globallogic.exercises;

public class ex10MinutesToYearsAndDaysCalc {
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long years = minutes / (60 * 24 * 365);
            long remainingMinutes = minutes % (60 * 24 * 365);
            long days = remainingMinutes / (60 * 24);

            System.out.println(minutes + " min = " + years + " year(-s) and " + days + " day(-s)");
        }
    }
    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }
}

package pl.globallogic.exercises;

public class ex2SpeedConverter {
        public static void main(String[] args) {
            //zmienne
            double kilometersPerHour1 = 1.5;
            double kilometersPerHour2 = 10.25;
            double kilometersPerHour3 = -5.6;
            double kilometersPerHour4 = 25.42;
            double kilometersPerHour5 = 75.114;
            // wywolanie metody
            System.out.println(toMilesPerHour(kilometersPerHour1));
            System.out.println(toMilesPerHour(kilometersPerHour2));
            System.out.println(toMilesPerHour(kilometersPerHour3));
            System.out.println(toMilesPerHour(kilometersPerHour4));
            System.out.println(toMilesPerHour(kilometersPerHour5));
            // metoda 2
            printConversion(kilometersPerHour1);
            printConversion(kilometersPerHour2);
            printConversion(kilometersPerHour3);
            printConversion(kilometersPerHour4);
            printConversion(kilometersPerHour5);
        }
    //  przeliczenie na miles, jesli < 0 to bedzie -1
        public static long toMilesPerHour(double kilometersPerHour) {
            if (kilometersPerHour < 0) {
                return -1;
            }
            return Math.round(kilometersPerHour / 0.621371); // przeliczenie nam mile
        }

        public static void printConversion(double kilometersPerHour) {
            long milesPerHour = toMilesPerHour(kilometersPerHour); // wywolanie poprzedniej metody
            if (milesPerHour == -1) {
                System.out.println("Invalid Value");
            } else {
                System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
            }
        }

}

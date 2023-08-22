package pl.globallogic.exercises;

public class ex26LargestPrime {
    public static int getLargestPrime(int number) {
        if (number <= 1) {
            return -1;
        }
        int largestPrime = 2;
        while (number > 1) {
            if (number % largestPrime == 0) {
                number /= largestPrime;
            } else {
                largestPrime++;
            }
        }
        return largestPrime;
    }
    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
    }
}

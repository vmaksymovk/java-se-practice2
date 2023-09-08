package pl.globallogic.exercises;


import java.util.Scanner;
    public class ex41MinimumElement {
        public static void main(String[] args) {
            int count = readInteger();
            int[] elements = readElements(count);
            int minValue = findMin(elements);

            System.out.println("Minimum value in the array: " + minValue);
        }

        public static int readInteger() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number of elements: ");
            return scanner.nextInt();
        }

        public static int[] readElements(int count) {
            Scanner scanner = new Scanner(System.in);
            int[] elements = new int[count];
            System.out.println("Enter " + count + " elements:");
            for (int i = 0; i < count; i++) {
                elements[i] = scanner.nextInt();
            }
            return elements;
        }

        public static int findMin(int[] array) {
            int min = Integer.MAX_VALUE;
            for (int value : array) {
                if (value < min) {
                    min = value;
                }
            }
            return min;
        }

}

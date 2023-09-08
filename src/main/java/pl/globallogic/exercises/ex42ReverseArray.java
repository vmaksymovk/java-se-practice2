package pl.globallogic.exercises;

public class ex42ReverseArray {
        public static void main(String[] args) {
            int[] originalArray = {1, 2, 3, 4, 5};

            System.out.print("Array = ");
            printArray(originalArray);

            reverse(originalArray);

            System.out.print("Reversed array = ");
            printArray(originalArray);
        }

        public static void reverse(int[] array) {
            int length = array.length;
            int temp;

            for (int i = 0; i < length / 2; i++) {
                temp = array[i];
                array[i] = array[length - 1 - i];
                array[length - 1 - i] = temp;
            }
        }

        public static void printArray(int[] array) {
            System.out.print("[");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i]);
                if (i < array.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }

}

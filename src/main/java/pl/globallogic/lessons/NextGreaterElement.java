package pl.globallogic.lessons;

public class NextGreaterElement {
        // input: {1,3,4,2,5,3,2,10,5,11}
        // return next greater element for each array element
        public static void main(String[] args) {
            int[] input = {1, 3, 4, 2, 5, 3, 2, 10, 5, 11};
            findNextGreaterElementFor(input);

        }

        private static void findNextGreaterElementFor(int[] input) {
            int nextGreaterElement;
            for (int i = 0; i < input.length; i++) {
                nextGreaterElement = -1;
                for (int j = i + 1; j < input.length; j++) {
                    if (input[i] < input[j]) {
                        nextGreaterElement = input[j];
                        break;

                    }
                }
                System.out.printf("For %s greater is %s \n", input[i], nextGreaterElement);
            }
        }
}

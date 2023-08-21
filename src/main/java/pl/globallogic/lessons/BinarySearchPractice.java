package pl.globallogic.lessons;

public class BinarySearchPractice {
        public static void main(String[] args) {
            int[] sortedArray = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
            int target = 7;
            int index = binarySearch(sortedArray, target);
            if (index != -1) {
                System.out.println("Target: " + index);
            } else {
                System.out.println("Target not found");
            }
        }
        public static int binarySearch(int[] array, int target) {
            int left = 0;
            int right = array.length - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (array[mid] == target) {
                    return mid;
                } else if (array[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            return -1;
        }
}

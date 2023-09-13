package pl.globallogic.lessons;

public class StringReverseWithRecursive {
    public static void main(String[] args) {
        String original = "abcd123345";
        String reversed = reverseString(original);
        System.out.println("Reverse: " + reversed);
    }

    public static String reverseString(String str) {

        if (str.isEmpty() || str.length() == 1) {
            return str;
        }

        return reverseString(str.substring(1)) + str.charAt(0);
    }
}

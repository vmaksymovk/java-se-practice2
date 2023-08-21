package pl.globallogic.lessons;

public class CapitalizeText {

    public static void main(String[] args) {
        String originalText = "i love cats";
        String capitalizedText = capitalizeWords(originalText);
        System.out.println(capitalizedText);
    }

    public static String capitalizeWords(String text) {
        String[] words = text.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                char firstChar = Character.toUpperCase(word.charAt(0));
                String restOfWord = word.substring(1).toLowerCase();
                result.append(firstChar).append(restOfWord).append(" ");
            }
        }

        return result.toString().trim();
    }
}

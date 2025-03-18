package chapter8;

public class TextProcessor {

    public static void main(String[] args) {
        countWords("I Love Test Automation University");
        reverseString("Hello camel!");
        addSpaces("HeyWorld!It'sMePablo");

    }

    public static void countWords(String text) {
        var words = text.split(" ");
        int numberofWords = words.length;
        String message = String.format("The number of words are: %d", numberofWords);
        System.out.println(message);
        for (var i = 0; i < numberofWords; i++) {
            System.out.println(words[i]);
        }
    }

    public static void reverseString(String text) {
        for (var i = text.length() - 1; i >= 0; i--) {
            System.out.print(text.charAt(i));
        }
    }

    public static void addSpaces(String text) {

        var modifiedText = new StringBuilder(text);

        for (int i = 0; i < modifiedText.length(); i++) {
            if (i != 0 && Character.isUpperCase(modifiedText.charAt(i))) {
                modifiedText.insert(i, " ");
                i++;
            }
        }

        System.out.println(modifiedText);
    }
}

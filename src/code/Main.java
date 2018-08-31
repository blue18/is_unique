// August 30, 2018
// Description - A function that determines whether a string has unique chars.
package code;

public class Main {
    private static Boolean isUnique(String phrase) {
        // Outer loop char
        Character firstChar;
        // Inner loop char
        Character otherChar;
        // Empty String
        String empty = "";

        try {
            // If phrase is null, return a false value
            if (phrase == null || phrase == empty) {
                System.out.println("String is empty");
            }

            for (int i = 0; i < phrase.length(); i++) {

                // Get first char for comparison
                firstChar = phrase.charAt(i);

                for (int j = i + 1; j < phrase.length(); j++) {

                    // Get second char for comparison
                    otherChar = phrase.charAt(j);

                    if (firstChar == otherChar) {
                        return false;
                    }
                }
            }
        } catch (NullPointerException e) {
            System.out.println("NullPointerException Caught");
        }
        return true;
    }

    public static void main(String[] args) {

        String phrase = "hello";
        boolean answer = isUnique(phrase);
        if (answer) {
            System.out.println("There are unique chars in the string.");
        } else {
            System.out.println("There are NOT unique chars in the string.");
        }
    }

}

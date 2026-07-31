public class WordUtils {

    public static boolean differsByOneLetter(String firstWord, String secondWord) {

        if (firstWord.length() != secondWord.length()) {
            return false;
        }

        int differences = 0;

        for (int i = 0; i < firstWord.length(); i++) {

            if (firstWord.charAt(i) != secondWord.charAt(i)) {
                differences++;
            }

        }

        return differences == 1;
    }

}
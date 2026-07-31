import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class WordDictionary {

    private ArrayList<String> words;
    private HashSet<String> wordLookup;

    public WordDictionary(String fileName) throws IOException {

        words = new ArrayList<>();
        wordLookup = new HashSet<>();

        Scanner input = new Scanner(new File(fileName));

        while (input.hasNextLine()) {

            String word = input.nextLine().trim().toLowerCase();

            words.add(word);
            wordLookup.add(word);

        }

        input.close();

    }

    public boolean contains(String word) {
        return wordLookup.contains(word);
    }

    public ArrayList<String> getWordsOfLength(int length) {

        ArrayList<String> result = new ArrayList<>();

        for (String word : words) {

            if (word.length() == length) {
                result.add(word);
            }

        }

        return result;
    }

}
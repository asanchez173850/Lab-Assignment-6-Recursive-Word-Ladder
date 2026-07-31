import java.util.ArrayList;
import java.util.HashSet;

public class WordLadderSolver {

    private WordDictionary dictionary;
    private HashSet<String> visited;
    private ArrayList<String> ladder;

    public WordLadderSolver(WordDictionary dictionary) {
        this.dictionary = dictionary;
        visited = new HashSet<>();
        ladder = new ArrayList<>();
    }

    public ArrayList<String> findLadder(String startWord, String endWord) {

        visited.clear();
        ladder.clear();

        ArrayList<String> candidates =
                dictionary.getWordsOfLength(startWord.length());

        boolean found = search(startWord, endWord, candidates);

        if (found) {
            return ladder;
        }

        return new ArrayList<>();
    }

    private boolean search(String currentWord,
                           String endWord,
                           ArrayList<String> candidates) {

        ladder.add(currentWord);
        visited.add(currentWord);

        if (currentWord.equals(endWord)) {
            return true;
        }

        for (String nextWord : candidates) {

            if (!visited.contains(nextWord)
                    && WordUtils.differsByOneLetter(currentWord, nextWord)) {

                if (search(nextWord, endWord, candidates)) {
                    return true;
                }

            }

        }

        ladder.remove(ladder.size() - 1);
        return false;
    }

}
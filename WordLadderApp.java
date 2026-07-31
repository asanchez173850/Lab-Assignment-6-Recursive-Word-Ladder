import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class WordLadderApp {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        try {

            WordDictionary dictionary =
                    new WordDictionary("words_small.txt");

            WordLadderSolver solver =
                    new WordLadderSolver(dictionary);

            System.out.print("Enter the starting word: ");
            String startWord = keyboard.nextLine().trim().toLowerCase();

            System.out.print("Enter the ending word: ");
            String endWord = keyboard.nextLine().trim().toLowerCase();

            if (startWord.isEmpty() || endWord.isEmpty()) {
                System.out.println(
                        "The starting and ending words cannot be empty.");
                return;
            }

            if (startWord.length() != endWord.length()) {
                System.out.println(
                        "The starting and ending words must have the same length.");
                return;
            }

            if (!dictionary.contains(startWord)) {
                System.out.println(
                        "The starting word does not exist in the dictionary.");
                return;
            }

            if (!dictionary.contains(endWord)) {
                System.out.println(
                        "The ending word does not exist in the dictionary.");
                return;
            }

            ArrayList<String> ladder =
                    solver.findLadder(startWord, endWord);

            if (ladder.isEmpty()) {
                System.out.println("No word ladder could be found.");
            } else {

                System.out.println("\nWord ladder found:\n");

                for (String word : ladder) {
                    System.out.println(word);
                }

            }

        } catch (IOException e) {

            System.out.println(
                    "Error: Unable to open words_small.txt.");

        }

        keyboard.close();
    }

}
import java.util.*;
import java.util.HashSet;

public class StringMethods {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a paragraph or text:");
        String stringInput = input.nextLine();

        System.out.println("Total number of characters: " + charCount(stringInput));
        System.out.println("Total number of words: " + wordCount(stringInput));
        System.out.println("Most common character: " + getMostCommonCharacter(stringInput));

        System.out.println("Enter a character to check frequency:");
        char character = input.next().charAt(0);
        System.out.println("Frequency of character '" + character + "': " + charFrequency(stringInput, character));

        input.nextLine();
        System.out.println("Enter a word to check frequency:");
        String wordChecked = input.nextLine();
        System.out.println("Frequency of word '" + wordChecked + "': " + wordFrequency(stringInput, wordChecked));

        System.out.println("Unique words count: " + getUniqueWords(stringInput).size());

        input.close();
    }

    private static int charCount(String stringInput) {
        int count = 0;
        String string = stringInput.trim();
        for (int i = 0; i < string.length(); i++) {
            if (stringInput.charAt(i) != ' ') {
                count++;
            }
        }
        return count;
    }

    private static int wordCount(String stringInput) {
        String[] words = stringInput.trim().split("\\s+");
        return words.length;
    }

    public static char getMostCommonCharacter(String str) {
        HashSet<Character> processedChars = new HashSet<>();
        char mostCommonChar = '\0';
        int maxCount = 0;

        for (char c : str.toCharArray()) {
            if (processedChars.contains(c)) {
                continue;
            }

            int count = 0;
            for (char ch : str.toCharArray()) {
                if (ch == c) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                mostCommonChar = c;
            }

            processedChars.add(c);
        }

        return mostCommonChar;
    }

    private static int charFrequency(String stringInput, char character) {
        int count = 0;
        String string = stringInput.trim();
        character = Character.toLowerCase(character);

        for (int i = 0; i < string.length(); i++) {
            if (Character.toLowerCase(stringInput.charAt(i)) == character) {
                count++;
            }
        }
        return count;
    }

    private static int wordFrequency(String stringInput, String wordChecked) {
        String[] words = stringInput.trim().split("\\s+");
        int count = 0;
        for (String word : words) {
            if (word.equalsIgnoreCase(wordChecked)) {
                count++;
            }
        }
        return count;
    }

    public static HashSet<String> getUniqueWords(String str) {
        HashSet<String> uniqueWords = new HashSet<>();
        String[] words = str.split("\\s+");

        for (String word : words) {
            uniqueWords.add(word.toLowerCase());
        }

        return uniqueWords;
    }
}

import java.util.Scanner;

public class RemoveAndReverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt for user input
        System.out.println("Enter a sentence: ");
        String str = input.nextLine();

        // Split the string into words based on spaces
        String[] words = str.split("\\s+"); // Split by one or more spaces

        // StringBuilder for efficient string construction
        StringBuilder output = new StringBuilder();

        // Reverse the array of words and construct the output
        for (int i = words.length - 1; i >= 0; i--) {
            output.append(words[i]); // Append the word

            if (i > 0) { // Add a space after each word except the last
                output.append(" ");
            }
        }

        // Print the reversed sentence
        System.out.println("Reversed sentence: " + output);

        input.close(); // Close the scanner
    }
}

/*my code*
import java.util.Scanner;
public class countVowel{
    
 
public static void countVowels() {
    char[] vowels = {'a', 'e', 'i', 'o', 'u'};
    Scanner input = new  Scanner(System.in);
    char[] vowelsFound = new char[50];
    int foundIndex = 0;
    int count = 0;
    
    System.out.println("Enter  a string ");
     String userInput  = input.nextLine();
     for (int i = 0; i<  userInput.length(); i++ ){
         for (char vowel:vowels){
             
         
         char currChar = userInput.charAt(i);
         if(currChar ==  vowel){
             vowelsFound[foundIndex] = currChar;
             foundIndex++;
             count += 1;
             
         }
        
         }
    }
     System.out.print("Vowels found: ");
        for (int i = 0; i < foundIndex; i++) {
            System.out.print(vowelsFound[i] + " ");
        }
     System.out.println();
    System.out.println("The number of vowels is : "+ count);
}
    public static void main(String[] args){
    

   countVowels();
}
}
*/
/***improved code**/
import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        // Set up scanner to take input
        Scanner input = new Scanner(System.in);

        // Prompt for user input
        System.out.print("Enter a string: ");
        String userInput = input.nextLine().toLowerCase(); // Convert input to lowercase
        
        int count = 0;
        StringBuilder vowelsFound = new StringBuilder();

        // Check for vowels
        for (char c : userInput.toCharArray()) {
            if ("aeiou".indexOf(c) != -1) { // Check if character is a vowel
                count++;
                vowelsFound.append(c).append(" "); // Add to vowels found
            }
        }

        // Output results
        System.out.println("Vowels found: " + vowelsFound.toString().trim());
        System.out.println("The number of vowels is: " + count);

        input.close(); // Close the scanner
    }
}

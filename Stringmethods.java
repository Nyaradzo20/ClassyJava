/*Print Length of a String Write a program to:

Take a string input from the user.
Print the length of the string using .length() method.*/

import java.util.Scanner;
public class Stringmethods{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Write a word or sentence");
        String user = input.nextLine();
        System.out.println("The length of  the string is" + " " + user.length());
        
    }
}

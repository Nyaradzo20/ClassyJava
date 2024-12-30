//Create a simple student grade calculator program that:
//Takes a student's name as input
//Takes marks for 3 subjects (Math, Science, English) as input
//Calculates the average score
//Displays a personalized message with the results

import java.util.Scanner;

public class grades{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String studentName;
        double Maths, Science,English;
        System.out.println("STUDENT GRADE CALCULATOR");
        
        System.out.println("Your name");
         studentName = in.nextLine();
        System.out.println("Enter Your Maths grade");

       Maths= in.nextDouble();
        System.out.println("Enter you Science grade");
         Science = in.nextDouble();
        System.out.println("Enter your English grade");
          English = in.nextDouble();
         System.out.printf();

    }
}
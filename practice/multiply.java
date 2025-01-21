/*Intermediate
4. Loops (for, while, do-while): Repetition in control flow.
Exercise: Multiplication Table
Write a program to generate a multiplication table for a number input by the user using a for loop.*/
import java.util.Scanner;

public class multiply{
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        
      //prompting user to  enter an integer
      System.out.println("Enter an integer:");
      
       //sccanner to get input
       int  n = num.nextInt();
        
        //do-while loop to create a timetable multiplying the input from 1 - 10
        int i = 0;

        do{
            int ans = n * i;
              // prin    tin loop
         System.out.println(n + "x" + i + "=" + ans);
         
          i++;
        
        }
        while(i <= 10);
        //multiplication equation
        
        //close scanner
        num.close();  

    }
}

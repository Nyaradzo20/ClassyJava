import java.util.Scanner;
public class charAt{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Write a word or sentence");
        String user = input.nextLine();
        System.out.println("Enter int");
        int num  = input.nextInt();
        //printds character at  num 
        System.out.println(user.charAt(num));
        
    }
}

    public class findOddEven {
    public static void main(String[] args) {
        double[] numbers = {10, 20, 30, 40, 50, 99, 77};
        
        if (numbers.length == 0) {
            System.out.println("Array is empty!");
            return;
        }

        // Print even numbers
        System.out.print( "Even numbers:" + " ");
        for (double num : numbers) {
            if (num % 2 == 0) {
                System.out.print((int) num + " ");
            }
        }

        // Print a new line between even and odd numbers
        System.out.println(); 
        
         System.out.print( "Odd numbers:" + " ");
        // Print odd numbers
        for (double num : numbers) {
            if (num % 2 != 0) {
                System.out.print(  (int) num + " ");
            }
        }
    }
}

    public static void main(String[] args) {
       
        double[]  numbers =  {10, 20, 30, 40 ,50} ;   
        double max  = numbers[0];
      double min  = numbers[0];
      for( int  i = 0; i <= numbers.length-1; i++){
          
          
         
         if(numbers[i] >  max ){
             max = numbers[i];
          
             
             // System.out.println(numbers[i]);
         }
          
          if(numbers[i] <  min ){
             min = numbers[i];
          
             
             // System.out.println(numbers[i]);
         }
    
      }
        
      System.out.println(max + "\n"+ min);


         

        //input.close(); // Close the scanner
    }
/****  REDEFINED CODE*

public class FindMinMax {
    public static void main(String[] args) {
        double[] numbers = {10, 20, 30, 40, 50};
        
        if (numbers.length == 0) {
            System.out.println("Array is empty!");
            return;
        }

        double max = numbers[0];
        double min = numbers[0];

        for (double num : numbers) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
*/


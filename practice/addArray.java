
public class addArray {
    public static void main(String[] args) {

       //add elements to array
        double[]  numbers =  {10, 20, 30, 40 ,50} ;   
        
        double sum = 0;
      
      for( int  i = 0; i <= numbers.length-1; i++){
          
          sum += numbers[i];
          
          
    }
        
        System.out.println(sum);


         

        //input.close(); // Close the scanner
    }
}

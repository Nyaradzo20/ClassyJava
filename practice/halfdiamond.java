public class halfdiamond{
    public static void main(String[] args){
        //make 6 rows
         for(int rows = 0; rows<= 6; rows++){
             //execute as long as j isx smaller or equals  to the number of rows
               for (int j = 1; j <= rows; j++) 

             {
                 System.out.print("*");

                 
             }
             //print lines between rows
                 System.out.println(" ");
}

      for(int i = 6; i >= 1; i--){
             //execute as long as j isx smaller or equals  to the number of rows
                   for(int n = 0; n<= i; n++)                                                
             {
                 System.out.print("*");

                 
             }
             //print lines between rows
                 System.out.println(" ");
      }

}
}

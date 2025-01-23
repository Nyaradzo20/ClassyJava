public class loopArray
{
public static void countVowels() {
    //array containing vowela to be counted
   
    char[] vowels = {'a', 'e', 'i', 'o', 'u'};
   //the ‘totalCount’ variable increments to keep track of the number of elements
   
    int totalCount = 0;
   
    for (int j = 0; j < vowels.length;
    j++) {
    totalCount++;
}
//we output the total count to the console.
System.out.println("Number of elements in the array: " + totalCount);

// loop through array and print o
    
    for(char vowel : vowels){
        System.out.print(vowel + " ");
    }
}
public static void main(String[] args){
    

countVowels();
}
}

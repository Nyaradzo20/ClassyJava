/*Modify Access Modifiers:

Change the name and age fields in your Person class to private.
Implement Setters:

Write setName() and setAge() methods to allow controlled modification of the fields.
Enhance Validation:

Add validation logic in the setAge() method to ensure the age is non-negative.
Print an error message if an invalid age is provided.
Test in main():

Create a Person object, update its attributes using the setter methods, and confirm they are correctly modified.
*/
public class Person{
    private  int Age;
    private String name;
    
   public Person( int Age, String name ){
       if (Age > 0) { // Initialize only if valid
            this.Age = Age;
        } 
        else {
            System.out.println("Age cannot be negative. Defaulting to unchanged.");
        }
        this.name = name;
    }
        
    
    
    public void setAge(int Age)
    {
        
     if (Age <= 0) { 
        
            System.out.println("Age cannot be negative. Defaulting to unchanged.");
            return;
        }
        this.Age = Age;
    }
    
    
    
    public void setName(String name) {
        this.name = name;
    }
    
    
     public int getAge() {
        return Age;
    }
    
    public String getName() {
        return name;
    }
    
    public void disPlay(){
        System.out.println("Age:" + getAge() + "\n"+"Name:" + getName());
    }
    public static void main(String[] args){
        Person kris = new Person(50 ,"luke");
        kris.setName("love");
       // kris.setAge(59);
        
        kris.disPlay();
    }
}

/*Create a class Person with the following:
Attributes: String name, int age.
A method displayInfo() that prints the person's name and age.*/
//create classs  Person
public class Person
{
    
    //variables to store name and age
    private String name;
     private  int age;
    
    
    // Constructor to initialize the person's attributes
    Person( String name,int age){
        this.name = name;
        this.age = age;
    }
    
    //name getter method 
    public String getName() { 
      return name; 
    }
    
    //age getter method
     public int getAge() { 
      return age; 
    }
    
    //display info method without declarations
  public void displayInfo()
    {
        System.out.println("Name is: " +  getName() + "\n" + "Age: " + getAge() );
    }
    
 
    
    public  static void main(String []args){
        //create new person object
           Person  nari = new Person("Nyari", 27);
          
          //display details
        nari.displayInfo();
    }
}

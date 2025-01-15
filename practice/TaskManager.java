/*
Step 1: Define the Enum
Create an enum called TaskPriority that has the constants:
LOW, MEDIUM, HIGH, CRITICAL.
Add a field for priorityLevel (int) and a description (String) to the enum.
Write a constructor to initialize these fields for each enum constant.
Include a method to retrieve both the description and level.

Step 2: Use the Enum in a Class
Create a Task class with:
String name (task name).
TaskPriority priority (to specify the priority level).

Step 3: Implement a Task Manager
Create methods to:
Add tasks to a list.
Sort tasks based on priority using Comparator.
Display all tasks, their name, and associated priority.

Step 4: Experiment with Enum-Specific Methods
Demonstrate usage of:
values(): Iterate through all priorities.
valueOf(): Convert a string to a TaskPriority.
Use an enhanced switch to output custom messages for each priority when listing tasks.
*/




public class TaskManager {
    
    //create an enum

enum taskPriority{
    LOW(1, "Low urgency"), 
    MEDIUM(2, "Moderate urgency"), 
    HIGH(3, "High urgency"), 
    CRITICAL(4, "Requires immediate action");
    
    
    // variables to represent the prioritylevel and description, they shold be final
    
    private final int priorityLevel;
    private  final String description;
    
    //create a constructor
    
    taskPriority(int priorityLevel, String description){
        this.priorityLevel = priorityLevel;
        this.description = description;
    }
    
    //make getters to access the final variables
     public int getPriorityLevel() {
        return priorityLevel;
    }
    
    public String getDescription(){
        return description;
    }
    

 //method to retrieve the descriptio ans prioritylevel
 
 public static void myMethod() {
     for(taskPriority priority :  taskPriority.values())
     {
    System.out.println(priority + ": " + priority.getDescription() + " (Level " 
    + priority.getPriorityLevel() + ")");

     }
     
     
 }
 
}
//test code
 public static void main(String[] args) {
        System.out.println("Displaying all task priorities:");
        /// Call the method to display all task priorities
        taskPriority.myMethod(); 

        // Example of accessing specific constants
        taskPriority priority = taskPriority.HIGH;
        System.out.println("\nExample usage:");
        System.out.println("Selected priority: " + priority);
        System.out.println("Description: " + priority.getDescription());
        System.out.println("Priority Level: " + priority.getPriorityLevel());
    }
}

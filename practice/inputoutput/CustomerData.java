import java.io.*;

public class CustomerData{
    public static void main(String[] args) {
        // Try-with-resources to auto-close resources
        try (
            BufferedReader Reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter Writer = new BufferedWriter(new FileWriter("customers.txt", true));
        ) {
            System.out.println("Enter your details");

            while (true) {
                
                System.out.print("Name: ");
                String name = Reader.readLine();
                if ("Exit".equalsIgnoreCase(name)) break;

                String customerData = "Name: " + name;
                Writer.write(customerData);
                Writer.newLine();
                Writer.flush();  

                System.out.println("Customer saved!\n");

                System.out.print("Do you want to add another customer? (yes/no): ");
                String response = Reader.readLine();
                if ("no".equalsIgnoreCase(response)) break;
            }

            System.out.println("Data collection complete.");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
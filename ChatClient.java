import java.io.*;
import java.net.*;

public class ChatClient {
    private Socket socket;
    private BufferedReader userInput;
    private PrintWriter out;
    private BufferedReader in;

    public ChatClient(String address, int port) {
        try {
            // Connect to the chat server
            socket = new Socket(address, port);
            System.out.println("Connected to the chat server on port " + port);

            // Setup input/output streams
            userInput = new BufferedReader(new InputStreamReader(System.in));
            out = new PrintWriter(socket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            // Enter username
            System.out.print("Enter your username: ");
            String username = userInput.readLine();
            out.println(username);

            // Thread to listen for messages from the server
            new Thread(() -> {
                try {
                    String serverMessage;
                    while ((serverMessage = in.readLine()) != null) {
                        // Avoid printing messages that this client has sent
                        if (!serverMessage.startsWith(username + ": ")) {
                            System.out.println(serverMessage);
                        }
                    }
                } catch (IOException e) {
                    System.out.println("Disconnected from server.");
                }
            }).start();
            

            // Read user input and send messages to the server
            String message;
            while (!(message = userInput.readLine()).equalsIgnoreCase("exit")) {
                out.println(message);
            }

            // Close resources when user exits
            socket.close();
            userInput.close();
            out.close();
            in.close();
        } catch (IOException e) {
            System.out.println("Connection error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        new ChatClient("127.0.0.1", 9999);
    }
}
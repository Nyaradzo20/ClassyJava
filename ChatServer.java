import java.io.*;
import java.net.*;
import java.util.*;

public class ChatServer {
    // List to track connected clients
    private static final List<ClientHandler> clients = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        // Set up the server socket on port 9999
        try (ServerSocket serverSocket = new ServerSocket(9999)) {
            System.out.println("Server started on port 9999. Waiting for clients...");

            while (true) {
                // Accept incoming client connections
                Socket clientSocket = serverSocket.accept();
                System.out.println("New client connected: " + clientSocket);

                // Create a handler for the new client and start a thread
                ClientHandler clientThread = new ClientHandler(clientSocket, clients);
                clients.add(clientThread);
                new Thread(clientThread).start();
            }
        } catch (IOException e) {
            System.err.println("Error with the server socket: " + e.getMessage());
        }
    }


// Handles communication for each client
static class ClientHandler implements Runnable {
    private final Socket clientSocket;
    private final List<ClientHandler> clients;
    private final PrintWriter out;
    private final BufferedReader in;
    private String username = "";

    public ClientHandler(Socket socket, List<ClientHandler> clients) throws IOException {
        this.clientSocket = socket;
        this.clients = clients;
        this.out = new PrintWriter(clientSocket.getOutputStream(), true);
        this.in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
    }

    private void broadcast(String message) {
        for (ClientHandler client : clients) {
            client.out.println(message);
        }
    }

    @Override
    public void run() {
        try (BufferedReader localIn = this.in; PrintWriter localOut = this.out) {
            // Ask for username once and store it
            localOut.println("Enter your username:");
            username = localIn.readLine();
            if (username == null) {
                return; // Prevents a null username from breaking things
            }
    
            System.out.println(username + " has joined the chat.");
            broadcast(username + " has joined the chat.");
    
            String message;
            while ((message = localIn.readLine()) != null) {
                if (!message.isEmpty()) {
                    broadcast(username + ": " + message);
                }
            }
        } catch (IOException e) {
            System.out.println(username + " disconnected.");
        } finally {
            clients.remove(this);
            broadcast(username + " has left the chat.");
            try {
                clientSocket.close();
            } catch (IOException e) {
                System.err.println("Error closing client socket: " + e.getMessage());
            }
        }
    }
}
}  
    
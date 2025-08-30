package chatapp;

import java.io.*;
import java.net.*;

public class ChatClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 12345)) {
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

            // Thread for receiving messages
            new Thread(() -> {
                try {
                    String msg;
                    while ((msg = in.readLine()) != null) {
                        System.out.println(msg); // only server/others' messages
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }).start();

            // Thread for sending messages
            String userMsg;
            while ((userMsg = userInput.readLine()) != null) {
                out.println(userMsg); // send to server
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

A simple terminal-based chat application built using Java Sockets. Multiple clients can connect to a single server and chat with each other in real-time.


🚀 Features  
    •	Multi-client support (many users can chat together)  
    •	Each user has a username displayed before their messages  
    •	Messages are sent and received in real-time  
    •	Simple terminal-based interface (no Swing/GUI)  
    •	Lightweight and easy to run  


🛠️ Technologies Used  
    •	Java  
    •	Socket Programming (TCP/IP)  
    •	Multithreading (to handle multiple clients)  


📂 Project Structure  
    ChatApp/  
    │── src/  
    │   ├── chatapp/  
    │   │   ├── ChatServer.java   # Server code  
    │   │   ├── ChatClient.java   # Client code  
    │── README.md  


⚙️ How It Works  
    1.	Start the server (ChatServer) → It listens for client connections.  
    2.	Clients (ChatClient) connect to the server.  
    3.	Each client sets a username.  
    4.	Messages are broadcast to all connected clients with the format: User1: Hello!



▶️ How to Run  
    1. Compile the code:  
       cd src  
       javac chatapp/*.java   
    2. Run the server:  
       java chatapp.ChatServer  
    3. Run clients (in new terminal windows):  
       java chatapp.ChatClient  
    4. Example Output:


        Client 1:
        Enter your username: User1
        Connected to chat server
        User2: Hi
        User1: Hello!


        Client 2:
        Enter your username: User2
        Connected to chat server
        User1: Hello!
        User2: Hi

   
🧩 Future Improvements  
    •	Add private messaging (/msg User2 Hello!)  
    •	Add timestamps to messages  
    •	Add chat room names / groups  
    •	Save chat logs to a file  
    •	Build a GUI (JavaFX or WebSocket frontend)  

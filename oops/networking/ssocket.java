// package
package oops.networking;
// import classes
import java.io.*;
import java.net.*;
// server side class
public class ssocket {
     // main method : entry point of execution
     public static void main(String[] args) {
          // try block 
          try{
                // creates a server socket ss listening on port 666
                ServerSocket ss = new ServerSocket(666);
                // prints a message indicating the server is ready
                System.out.println("server is waiting for a client");
               // blocks execution until a client connects;
               // once connected it returns a socket s representing the client connection sfter acceptenace
                Socket c = ss.accept();
               // creates  datainputstream  dis  to read incoming data from socket s
                DataInputStream dis = new DataInputStream(c.getInputStream());
                // reads UTF -encoded string sent from the client
                String str = dis.readUTF();
               // dispalys the received message on the server console
                System.out.println("message received "+ str);
               //  closes
                dis.close(); // input stream
                c.close();   // client socket
                ss.close(); // server socket
          } 
          // catch block 
          catch (Exception e ){
               // prints satck trace
                e.printStackTrace(); 
          }  
            
     }
}
//server is waiting for a client
// Message received: Hello, World!


// networking -> socket programming  -> tCP sockets -> server
// package
package oops.networking;
//impot classes
import java.io.*;
import java.net.*;
// client side class
public class csocket {
    // main method - entry point of execution
    public static void main(String[] args) {
       // try block  
       try{ 
            // connects the client to the server at localhost 666
             Socket c = new Socket("local host ",666);
             // data output stream to send data in UTF format to server
             DataOutputStream dout = new  DataOutputStream(c.getOutputStream());
            // say hello world to server
             dout.writeUTF ("hello , world");
            //  ensure all data is sent before closing he stream
             dout.flush();
            // closes 
             dout.close(); // output stream
             c.close();   // client socket
       }
       // catch block 
       catch (Exception e){
             e.printStackTrace();
       }  
    }
}

// networking -> socket programming  -> tCP sockets -> client
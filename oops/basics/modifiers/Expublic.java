package oops.basics.modifiers;

// public class
public class Expublic{
    
    // public variable
    public String message = "this is a public varaible";
    
    // public method
    public void display(){
        System.out.println("public method");
        System.out.println(message);
    }
    
    // main method
    public static void main(String[] args) {
       
        // object declaration nad intialization
        Expublic e1 = new Expublic();
        // accessing public variable
        System.out.println(e1.message);
        // accessing public method
        e1.display();

    }
}
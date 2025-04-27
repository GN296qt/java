package oops.basics.modifiers;

// public class
public class Exprivate {
    // private variable
    private String message = "this is a private variable";
    //private method
    private void display(){
        System.out.println("private method");
        System.out.println(message);
    }
    //public  method
    public static void main(String[] args) {
        //  object declaration and intialization
        Exprivate e1 = new Exprivate();
        //accessing private varibale
        System.out.println(e1.message);
        //accessing private method
        e1.display();
    }
}
// this is a private variable
// private method
// this is a private variable
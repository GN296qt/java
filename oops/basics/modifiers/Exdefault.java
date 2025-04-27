package oops.basics.modifiers;
//default class
class example{ 

    // default variable
    String message = "this is a default variable";
    //default method
    void dispaly(){
        System.out.println("default method");
        System.out.println(message);
    }

}
//main class
public class Exdefault {
    //main method
    public static void main(String[] args) {
        //default class object
        example e1 = new example();
        // accessing default variable
        e1.dispaly();
        // accessing default method
        System.out.println(e1.message);
    }
}
// default method
// this is a default variable
// this is a default variable
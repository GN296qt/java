package oops.concept_inherit;

interface Animal{ //interface
   //abstract methods
    void eat();
    void sleep();
}

class Dog implements Animal{

    @Override //annotation
    public void eat(){
        System.out.println("dog eats");
    }

    @Override //annotation
    public void sleep(){
        System.out.println("dog sleeps");
    }
}
public class interface2 {//main class
     public static void main(String[] args) { // main method 
            Animal mydog = new Dog(); //upcasting
            //callimg methods of interface
            mydog.eat();
            mydog.sleep();
     }
}
// not able to run



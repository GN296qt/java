package oops.concept_inherit;

abstract class Animal{//abstract class (parent class)

    abstract void sound(); //abstract method
    void control(){//concrete method
        System.out.println("animals are controlled by humans");
    }

}

class Dog extends Animal{ // child class

    @Override //annotation
    void sound(){//overriding method
        System.out.println("dog barks");
    }

}

public class abstracts { // main class
    public static void main(String[] args) { //main method
        Animal animal = new Dog(); //upcasting : treat dog object as Animal object
        animal.sound();// calling abstract method 
        animal.control();//calling concrete method
    }
}

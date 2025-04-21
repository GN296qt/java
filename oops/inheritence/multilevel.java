package oops.inheritence;

class Animal{ //parent class

    void eat(){ 
        System.out.println("animal eats food");
    }

}

class Dog extends Animal{ // parent class as well as child class

    void bark(){
        System.out.println("the dog barks");
    }

}

class Puppy extends Dog{ // child class
    
    void weep(){
        System.out.println("puppy weeps ");
    }

}

public class multilevel { // main class
    public static void main(String[] args) {

        // object declration of
        Animal animal = new Animal(); // parent class
        Dog dog = new Dog(); // parent & child class
        Puppy puppy = new Puppy(); // child class
        
        // methods that can be access by objects of 
        // parent class
        animal.eat();
        // parent & child class
        dog.eat();
        dog.bark();
        // child class
        puppy.eat();
        puppy.bark();
        puppy.weep();

    }
}

// animal eats food
// animal eats food
// the dog barks
// animal eats food
// the dog barks
// puppy weeps
package oops.inheritance.types;

class Animal{ // parent class

    void eat(){
        System.out.println("animal eats food");
    }

}

class Dog extends Animal { // child1 class

    void bark(){
         System.out.println(" the dog barks ");
    }

}

class Cat extends Animal{ // child2 class

    void meow(){
        System.out.println("the cat meow ");
    }

}

public class hierarchical { // main class
    public static void main(String[] args) {
          
       // object declaration by 
        Animal animal = new Animal(); // parent class
        Dog dog = new Dog(); // child1 class
        Cat cat = new Cat(); // child2 class

        // methods that can be access by objects of
        // parent class
        animal.eat();
        // child1 class
        dog.eat();
        dog.bark();
        //child2 class
        cat.eat();
        cat.meow();

        }
}

// animal eats food
// animal eats food
// the dog barks
// animal eats food
// the cat meow
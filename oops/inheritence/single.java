package oops.inheritence;

class Animal{   // parent class : Animal
     
    void eat(){ //parent method
        System.out.println("animal eats food");
    }

}

class Dog extends Animal{ //child class  : Dog

    void bark(){ // child method
        System.out.println("the dog barks");
    }

}

public class single { // main class : single
      public static void main(String[] args) {

        // object declaration for 
        Animal animal = new Animal(); //parent class
        Dog dog = new Dog(); // child class

        // accessing methods by object of
        animal.eat();//parent class
        dog.eat();//child class
        dog.bark(); //cild class

      }
}

// animal eats food
// animal eats food
// the dog barks

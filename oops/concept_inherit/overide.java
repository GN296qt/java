package oops.concept_inherit; // folder oops subfolder concept_inherit

class Animal{ // parent class

    void sound(){ //parent method(will be overriden)
        System.out.println("animal makes sound ");
    }

}

class Dog extends Animal{ // child1 class
   
    @Override // annotation
    void sound(){ //overriding method
        System.out.println("dog barks");
    }

}

class Cat extends Animal{ // child2 class
    
    @Override //annotation
    void sound(){ //overriding method
        System.out.println("cat meows");
    }

}

public class overide { // main class
    public static void main(String[] args) { // main method

        Animal animal; // parent class reference 
        
        animal = new Animal(); // assingning parent class object
        animal.sound();// calls sound method '
        animal = new Dog();// assigning child1 class object
        animal.sound();// calls child1 's overidden method '
        animal = new Cat(); // assinghing child2 class object
        animal.sound();// calls child2 's overriden method'

    }
}

// animal makes sound 
// dog barks
// cat meows
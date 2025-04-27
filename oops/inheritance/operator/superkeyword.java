package oops.inheritance.operator;
// superclass
class Animal{
    // superclass variable
    String name;
    //superclass constructor
    Animal(String name){
        this.name = name;
    }
    //superclass method
    void displayname(){
        System.out.println("animal name : "+name);
    }
}

//subclass
class Dog extends Animal{
    //subclass variable
     String breed;
     //subclass constructor
     Dog(String name,String breed){
        super(name);// accessing superclass constructor
        this.breed = breed;
     }
     //subclass method
     void displaydetails(){
        System.out.println("dog breed : "+breed);
        super.displayname();//accessing superclass method
     }
}

//main class
public class superkeyword{
    //main method
    public static void main(String[] args) {
        Dog dog = new Dog("leo","German shephered");
        dog.displaydetails();
    }
}

// dog breed : German shephered
// animal name : leo



// through superclass constructor passing parameyter name

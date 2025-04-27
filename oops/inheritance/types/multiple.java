package oops.inheritance.types;

interface Flyable{ //interface1
    void fly();// abstractmethod
}

interface swimmable{ //interface2
    void swim(); //abstractmethod
}

class Duck implements Flyable,swimmable{ // multiple inheritenance

    @Override //annotation
     public void fly(){ //
         System.out.println("Duck can fly ");
     }

    @Override //annotation
     public void swim(){
         System.out.println("Duck is swim");
     }

}

public class multiple { //main class
        
        public static void main(String[] args) { //main method

               Duck duck = new Duck(); //upcasting
               duck.fly(); // calling method of interface1
               duck.swim(); //calling method of interafce2
               
        }

}

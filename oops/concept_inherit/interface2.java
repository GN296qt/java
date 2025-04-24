package oops.concept_inherit;

interface Animal{

    void eat();
    void sleep();
}

class Dog implements Animal{
    public void eat(){
        System.out.println("dog eats");
    }
    public void sleep(){
        System.out.println("dog sleeps");
    }
}
public class interface2 {
     public static void main(String[] args) {
            Animal mydog = new Dog();
            mydog.eat();
            mydog.sleep();
     }
}
// not able to run



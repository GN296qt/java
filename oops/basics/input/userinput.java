package oops.basics.input; // input is a subfolder of oops folder
import java.util.Scanner; // import module for taking input
class Car{ // class nmae is car
    
    // attributes of class car
    String brand ;
    String colour;
    
    // method of class car
    void drive(){
        System.out.println(brand +" in "+ colour +" colour is driving .");
    }

}

public class userinput { // main class is userinput
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);// Scanner class object is sc

        Car c1 = new Car();// declaration of object c1 // default constructor
        System.out.println("Enter details of car  ");
        System.out.print("brand is : ");
        c1.brand = sc.nextLine(); // input for attribute brand
        System.out.print("colour is : ");
        c1.colour = sc.nextLine(); // input for attribute colour
         
        c1.drive();// accessing drive method
    
        sc.close();

    }
}
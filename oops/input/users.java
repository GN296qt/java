package oops.input;
import java.util.Scanner;
class Car{

    String brand ;
    String colour;
    
    void drive(){
        System.out.println("the car brand is " +brand + " and the colour is : "+colour);
    }
}

public class users {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        Car c1 = new Car();
        
        System.out.println("Enter details of car  ");
        System.out.print("brand is : ");
        c1.brand = sc.nextLine();
        System.out.print("colour is : ");
        c1.colour = sc.nextLine();
        
        c1.drive();
    
        sc.close();
    }
}


// input is a subfloder of oops folder
package oops.input ;

//class name is car
class Car{
    
    //attributes of car class
    String brand;
    String colour;
    
    // method of car class
    void drive(){
          System.out.println("car is driving");
    }

}

// main class
public class hardcore {
    public static void main(String[] args) {
        
        // declaration of car class objects
        Car c1 = new Car(); // object name is c1
        Car c2 = new Car(); // object name is c2

        //intializing attributes of object c
        
        //c1
        c1.brand ="bmw";
        c1.colour ="black";

        //c2
        c2.brand = "meceedes";
        c2.colour = "white";
        
        //accessing attributes and methods of car class using object

        //c1
        System.out.println("About first car :");
        System.out.println("brand : "+ c1.brand);
        System.out.println("colour : "+ c1.colour);
        System.out.print("feature : ");
        c1.drive();
        
        //c2
        System.out.println();
        System.out.println("About second car :");
        System.out.println("brand "+c2.brand);
        System.out.println("colour "+c2.colour);
        System.out.print("feature: ");
        c2.drive();
        
        }
    }

// About first car :
// brand : bmw
// colour : black
// feature : car is driving

// About second car :
// brand meceedes
// colour white
// feature: car is driving
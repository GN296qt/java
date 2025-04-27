package oops.concept_inherit; // subfolder : constructor , folder : oops

class Car{ // car class
    
    // instance variables
    String brand;
    String colour;
    
    //methods

    Car(String brand , String colour){ // parametrized constructors
        this.brand = brand;
        this.colour = colour; 
    }

    void drive(){
        System.out.println(brand +" in "+colour+" colour is driving");
    }
}

public class pconstructor { // main class
     public static void main(String[] args) {
         
        //objects declaration // parametrized constructor call
         Car c1 = new Car(null, null); // parametrs are not passed
         Car c2 = new Car("texla","blue");  // parameters are passed
        
        // calling method drive 
        c1.drive(); // by object c1
        c2.drive(); // by object c2
        

        
     }
    }

// null in null colour is driving
// texla in blue colour is driving
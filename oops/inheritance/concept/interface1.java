package oops.inheritance.concept;



// Interface 
interface Vechicle{
    ///abstract methods
    void start();
    void stop();
    void fuel_type();
}
class Car implements Vechicle{ 

    @Override //annotaion
    public void start(){
         System.out.println("car starts with a key ignition");
    }
    
    @Override //annotaion
    public void stop(){
         System.out.println("car stops using hydraulic breaks");
    }
    
    @Override //annotaion
    public void fuel_type(){
          System.out.println("car runs on gasoline");
    }

}

public class interface1{ //main class
    public static void main(String[] args) { //main method
        Vechicle mycar = new Car();//upcasting
        // calling methods of interface
        mycar.start();
        mycar.stop();
        mycar.fuel_type();
    }
}


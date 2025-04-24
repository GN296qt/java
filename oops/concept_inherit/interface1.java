package oops.concept_inherit;
// Interface definition
interface Vechicle{
    void start();
    void stop();
    void fuel_type();
}
class Car implements Vechicle{
    public void start(){
         System.out.println("car starts with a key ignition");
    }
    public void stop(){
         System.out.println("car stops using hydraulic breaks");
    }
    public void fuel_type(){
          System.out.println("car runs on gasoline");
    }
}

public class interface1{
    public static void main(String[] args) {
        Vechicle mycar = new Car();
        mycar.start();
        mycar.stop();
        mycar.fuel_type();
    }
}


package oops.constructor;
    class Car{ // car class

              // instance variables
                String brand;
                String colour;

              // methods

                Car(String brand , String colour ){//constructor1 - parametrized
                          this.brand = brand ;
                          this.colour = colour ;
                  }

               Car(String brand){ // constructor 2 - parametrized
                     this.brand = brand ;
                     this.colour = "black";
                }

               Car(){ // constructor 3 - default
                    this.brand  = "toyoto";
                    this.colour = "blue";
               }

               void drive(){
                        System.out.println(brand +" in "+ colour +" colour is driving");
                }

     }

     public class overloading {
           public static void main(String[] args) {

            // object declaration // calling of
                Car c1 = new Car("mercedees","brown"); // constructor 1
                Car c2 = new Car();// constructor 3
                Car c3 = new Car("tesla");// constructor 2
                
                c1.drive();
                c2.drive();
                c3.drive();

          }
    }

// mercedees in brown colour is driving
// toyoto in blue colour is driving
// tesla in black colour is driving
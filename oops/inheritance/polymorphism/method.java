package oops.inheritance.polymorphism;

class Addition{

    int add(int a, int b){
        return  a + b;
    }

    double add(double a, double b){
        return a + b;
    }

    int add(int a , int b , int c){
        return a + b + c;
    }
}
public class method {
    public static void main(String[] args) {

        Addition a = new Addition();
        System.out.println("addition of numbers : " + a.add(2,3));
        System.out.println("addition of numbers : " + a.add(3,4,5));        
        System.out.println("addition of numbers : " + a.add(2.3,4.5));        
    }
}

// addition of numbers : 5
// addition of numbers : 12
// addition of numbers : 6.8



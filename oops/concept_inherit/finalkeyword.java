package oops.concept_inherit;

final class myanimal{

    void property(){
        System.out.println("can't perform inheritence ");
    }

}

// class Dog extends Animal{  -> compilation error
//
// }

public class finalkeyword {
    public static void main(String[] args) {

        myanimal animal = new myanimal();
        animal.property();
        
    }
}

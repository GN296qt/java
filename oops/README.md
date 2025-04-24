object oriented programming sysytem 

class
- is a blueprint/template that defines attributes and methods of objects.
- it follows uniformity across objects i.e all the objects of one class have same attributes and same methods.
- there are 2 types of classes in a code one is user defined and other is main class(file name ) .here we are primarily considering user defined class
- conventionally class name first letter to be capital 
objects 
- instance of class
-  declaration means creating objects
- intialization means assigning values to attributes of objects

attrributes 
-are properties/datafields that define state of the objects in a class

methods 
- defines behaviours /actions that objects of a class can perform.



constructor  

-it is a special method that invoke at the time of object declration.
-it's name is same as of user defined class name

-constructor types  : 
1.default constructor
 -created automatically by java if no constructor is explicitely defined
 -it has not parameters and assigns default value to attributes
2.Parametrized constructor
-defined by the programmer
-accepts parameters to set custom values for object fields

this keyowrd
-refers to current object being created or used
in parametrized constructor it is used to -differentiate the instance variables and local variables

instance variable - refers to attributes of object
local varibles - refers to the parameters passed to the constructor
this.instancevariable = localvariable

constructor overloading
- refers to a single class having muliple constructors with the same name but diffeent parameter lists
- it is example of compiletime/static polymorphism because constructor to be invoked is determined at compile time based on hte argumnets provided

Method signature into
method name - identifies the function
parameter list - specifies the types and order of arguments.
return type - defines the type of value returned

inheritance

- it is a mechanism where one class (called child class / sub class) derives or inherits the attributes and methods  of another class (called parent or superclass)
- it promote code reusability 
- parent class called superclass and childclass called subclass
- parent class syntax
             class parentclassname{

             }
- child class syntax(extends keyword is used)
         class childclassname extends parentclassname{

         }      
- main class syntax(public keyword is used)
    public class mainclassname{
          public static void main(Stirng[] args){
              parentclassname objectname = new parentclassname();
              childclassname objectname = new childclassname();
              // rest of the body

          }
      }         
- in main class objects declaration and intialization
  classname objectname = new classname();//together
  or
  classname objectname; // declaration
  objectname = new classname(); // intialization
                    


types of inheritence
1.single inheritenance
- one child class inherits from one parent class 
- parent -> child

2.multilevel inheritence
- a class is inherited from another class which is further inherited by another class
- grandparent -> parent -> child

3.herichical inheritence
-  multiple child class inherited from same parent class
-  child1 , child2 ....,child n -> parent class

concepts related to inheritence
- final keyword
- method overriding
- abstract class
- interface

final keyword
-> it is used to restricts inheritance
-> syntax
   final class classname{
       //body
   }

 method overidding
 - refers to ability of subclass to either eplace or provide a specific implementation for a method that is already defined in its superclass
 - inheritence is prerequiste
 - example of run time polymorphisim as which method to be called is determined at runtime based on actualobject being referred to  
 - @Override annotation is used which is optional but recommeneded which indicate that the method is overridng a method in its superclass
- it often involves upcasting (assigning a child class object to a parent class reference) i.e
parentclassname objectname; // declaration 
objectname = new childclassname(); // intialization
- syntax(for both the methods of parent and child class methodsignature should be same only)
class parentclassname{
     returntype methodname(){
          //body
     }
}
class childclassname extends parentclassname{
      @override
      returntype methodname(){
           //body
      }
}
public class mainclassname{
       public static void main(String[] args){
             parentclassname objectname; 
             objectname = new childclassname(); 
             objectname.methodname();
       }
}

Abstract class

- it is a type of a class that is designed to be the blueprint for other classes.
- it can't be intialised on its own means can't create objects.
- it include abstract methods as well as concrete methods.(compulsory)
- syntax(both abstractmethod of parent class and override method of childclass have same methodsignature )
abstract class classname{//parentclass
    abstract returntype methodname(); 
    returntype concretemethodname(){
         //body
      }
}  
class childclassname extends parentclassname{
      @override
      returntype methodname(){
             //body
      }
}
public class mainclassname{
     public static void main(String[] args){
             parentclassname objectname; 
             objectname = new childclassname(); 
             objectname.methodname();
             objectname.concretemethodname();
     }
}


Abstract method
- a method that is declared without a body
- it only specifies the method signature but doesn't provide implemntation
- can only be defined inside abstract class and interface
- it is implemented in a subclass by overriding it unless the subclass is also abstract
- syntax 
    abstract returntype methodname();

Concrete method
- A regular method with a complete implemntation inside a class
- it contains executable code.
- can only be defined in abstract class and regular class
- does not require overriding (but can be overriden if needed) as it is fully functional their own
- syntax
   returntype concretemethodname(){
         //body
      }

interface
- defined as set of abstract method
- it is implemented in subclass by overidding th abstract method 
- it syntax 
interface interfacename{
    returntype methodname1();     
    returntype methodname2();    
}
class childclassname implemnts interfacename{
    @override
    public returntype methodnmae1(){
       //body
    }
    @override
    public returntype methodnmae2(){
      //body
    }
}
public class mainclassname{
     public static void main(String[]arg){
          parentclassname objectname  
          objectname = new childclassname(); 
          objectname.methodname1();
          objectname.methodname2();

     }
}

functional interface
- it refers to interface that contains exactly one abstract method
- @functionalInterface is aannotation which is optional but recommnded to use as it prevents mutiple abstarct method
- it is commonly used in lambda expressions to implemnt behavior concisly
- in java there is built-in functional interface like predicate,consumer and supplier


comparision btw abstarct class and interface

- similarity
both doesn't require inheritenace but they are designed to be used in inheritance - based structures

- difference

abstract class
1. both concrete and abstract method
2. syntax 
       abstract class classname{
            abstract returnType methodName();
            returnType concreteMethod() { 
               
            }
       }
3. astract method declaration 
        abstarct returntype metdhname();
4. subclass declaration uses extends keyword
  class childclassname extends classname{

  }
5. override method declaration
      returntype methodname(){
          
      }
    
            

interface
1. set or only one abstract methods
2. syntax 
       interface interfacename{
           returnType methodName1();  
           returnType methodName2();
       }
3. abstract method declaration
       returntype methodname();
4.  subclass declaration uses implemnts keyword
    class childclassname implements interfacename{  

    }
5. override method declaration
          public returntype methodnmae(){

          }


types of inheritence
4.multiple inheritance
- defined as a subclass is inheriting from multiple super class
- can be achieved through interface thus avoid ambiguity issues eg class car has two attributes that too string are brand and colour are aand lets make two constructor each one having exactly one attribute then while calling object inialization then there will be confusion which constructor is calling string or colour one ?

5.hybrid inheritenance
- refers to comination of two or more types of inheritenance
- Java doesn't directly support hybrid inheritance with classes because it avoids ambiguity and the diamond problem. Instead, Java achieves similar results using interfaces.

Access specifiers
- known as acess modifiers
- they are keywords that controlthe visibility and accessibility of classes ,methods and variables.
- ensure that the code adheres to priciples of encapsulation and modularity
- types are
1.public
-  accessible eveywhere i.e inside same class ,package and from other packages
- widest visibility
2.protected
- accessible within the same package and (in subclasses in other packages through inhritenance only)
3.default
- refers to no modifier specified
- accessible only whithin the same package so also referred to as package-private visibility
4.private
- accessible within same class only
- most restricted access somused for sensitive data




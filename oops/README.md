object oriented programming sysytem 

class
- is a blueprint/template that defines attributes and methods of objects.
- it follows uniformity across objects i.e all the objects of one class have same attributes and same methods.
- there are 2 types of classes in a code one is user defined and other is main class(file name ) .here we are primarily considering user defined class

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

inheritance

- it is a mechanism where one class (called child class / sub class) derives or inherits the attributes and methods  of another class (called parent or superclass)
- it promote code reusability 
- parent class syntax
             class parentclassname{

             }
- child class syntax(extends keyword is used)
         class childclassname extends parentclassname{

         }             


types of inheritence
1.single inheritenance
one child class inherits from one parent class 
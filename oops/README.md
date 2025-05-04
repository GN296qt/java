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

this operator
- also called this keyword
- it is a reference to the current object within an instance method
- not it can be used (any purpose) in normla method or contructor.
- purpose
 1. refers to current object being created 
- differentiate the instance variables and local variables when a method or constructor has local variables with the same name as instance variables
- instance variable (refers to attributes of object)and local varibles (refers to the parameters passed to the constructor)
- this.instancevariable = localvariable
 2. invoke curent class methods 
- call methods of the current class 
3. Accessing Current Class Constructor
- call a constructor from another constructor within the same class
4. Passing the Current Object as a Parameter
- pass the current object to other methods or constructors
5. Returning the Current Object
- returned to enable method chaining
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

visibility table
access      same    same      subclass       other
modifier    class   package   diffpackage    package
public      yes     yes       yes            yes  
protected   yes     yes       yes            no
default     yes     yes       no             no
private     yes     no        no             no

private method and varible can be access within the class by public method


super operator
- refer to members (variables,methods) of superclass
- purpose 
1. Accessing Superclass Variables or Methods
- syntax 
        super.methodname()
        super.variablename

2. Calling Superclass Constructors 
- syntax 
        super(parentclassname)

method overloading
- define as multiple methods with same anme but different parameter lists(number,type or both) within same class
- enaches code readability and reusability
- example of comiple time polymorphism as which method to be executed is determined at compile time based on the arguments passed.




Applet
- special type of java program
- no longer supported by modern browsers
- Features
1. java-enabled 
-> designed to be executed within a web browser or an applet viewer that supports java
2. small application
-> light weight programs
-> suitabble for client side tasks (games or animations)
3. window-based
-> applets rely on graphical interfaces for user interaction
4. embedded in html files
-> applets are integrated into html using the <applet> tag or <object> tag depending on the browser or tool


lifecycle of an applet
1. init()
- called once when the applet is first loaded
- used to intialize th applet
- eg setting up resources or variables
2. start()
- called each time the applet becomes active
- eg when the page containing the applet is visited
- used to strat animations or threads
3. paint(Graphics g)
- invoked to redraw the applet's interface.
- it takes graphics object as an argument
- used for all graphical output
4. stop()
- called when the applet becomes inactive
- eg the user navigates away from the page containing it
- used to stop animations or threads to conserve system resources
5. destroy()
- invoked when the applet is about to be unloaded permanently
- eg browser is closed
- used to release resources or perform cleanup

AWT(Abstract Window Toolkit)
-> java GUI(Graphical User Interface) library which provides tools for building  interactive user interfaces .
-> features
- platform independence
- heavyweight (uses resources of underlined operating system)
- window based applications

AWT Architecture
-> containers 
- hold and organized other components
- eg  frame(top level window) ,panel(grouping components within a container)
-> layout Managers
- arranging components within containers
- eg 
1. FlowLayout - arranges components left to right in sequence ,wrapping to the next line when needed 
- default to pannel
2. BorderLayout - components are arranged into 5 predefined positions as  the container divides into 5 regions(north,south,east,west,center)
- default to frame
3. GridLayout - arranges components in agrid with equal -sized rows and columns
4. CardLayout -  allows switching between multiple pannels dynamically
5. GridBagLayout - flexible layout as it provides advanced control over positioning & resizing components.
-> Event Handling
-> gui components (also called awt controllers)
1. button - a clickable button created using button class
2. Label - dispaly static text
3. TextField - a single line text input field
4. TextArea - a multi line text input area
5. Choice - dropdown list for selecting one option
6. List - a scrollable list of items(single or multiple selection)
7. Scrollbars -  scroll horizontally or vertically in any container where content exceeds the visible area
8. Checkbox - a box that can be checked or unchecked




AWT Syntax

// import packages
// import all awt components
import java.awt.*; 
// -> import all event handling classes
import java.awt.event.*;

// class declaration
// Classnmae is a public class
// Classname is inheriting from ContainerName for making gui compomnents
// ClassName ia slao implementing 
//EvnetHandlerClassName
public class classame extends ContainerName implements Eventhandlerclassname{

    //awt controllers  instance variables declaration
    awtcontrollername variablename;

    //constructor
    public classname(){
       
       //set layout manager
       setLayout(new LayoutName());

       //awt controller intialization
       VariableName = new awtcontollername();
       
       //registers
       VariableName.addeventhandlerclassname(this);

       // add components to containername
       add(variablename);

       //  event handler for closing
       addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                 System.exit(0);//closes windowapp
            }
       } );

      // setting window properties
      //dimensions to be in pixels
       setSize(xdimension,ydimension); 
       // window title
       setTitle("title name");
       // visibilty of window if true
       setVisible(true);//requires true or fasle as an argumnet
    }

    //handling evnet
    public void actionPerformed(ActionEvent e){
         variableName.setText("message to be displyed");
    }   

    //main method - entry point of execution
    public static void main(String[] args){
        //creates an instance of classname to        display gui
        new classname();
    }
}



Event Handling
- mechanism to handle events(actions or occurrences triggered by user interactions or system generated inputs) like clicking button
- core concepts

-> delegation event model 
 - mecchanism for seprating event source and lister
 - Steps:
1. An event source registers an event listener.
2. When an event occurs, the source delegates it to the listener.
Example: A button generates a click event, which is handled by a method in the listener object.

-> event sources 
- objects that generate events
- eg button

-> event classes - define the type of event occuring

-> Event listeners - define who will handle the event and what action to perform
- Each listener is registered with a component using addEventListener()
How Listeners Work:
1. The listener object must be registered with the event source.
2. The listener interface methods are called automatically when an event occurs.                                               
-> adapter classes 
-  provide default implementations of event listener 


-> inner class 
- define event handlers within another class
-  allow access to outer class variables without neding to make them global
- types 
1. regular innner class
- a class with a name 
- reusabilty at multiple times
- structured evnt handling as code more structured
2.  anonymous iner class
- a class without a name
- used only once
- quick evnt handling as code is more compact
eg

Event Class   - Triggered When...
1. ActionEvent - A button is clicked or   a menu item is selected
2. MouseEvent- The mouse is clicked, moved, or released.
3. keyEvent - A key is pressed or released.
4. Windowevent - A window is opened, closed, activated, or deactivated.
5. itemevent - A checkbox or list selection changes.
6. FocusEvent - A component gains or loses focus.

Event Listener  -  Handles Events From(same those of  triggered when - event class)
1. ActionListener - 
2. MouseListener -
3. keyListner -
4. WindowListener - 
5. itemListener - 

Adapter class - implements
1. WindowAdapter - Windowlistener (7 methods)
2. MouseAdapter - MouseListener (5 methods)
3. KeyAAdapter - Key listener(3 methods)

    
Swing
- part of JFC(java Foundation Classes) used for building rich GUIs(graphical User Interface)

comparison of awt and swing

feature              
- component type
- package used
- performance
- event handling model
- performance
- thread safety
- advanced components
- look and feel

AWT
- heavyweight(os dependent)
- java.awt
- slower(os calls)
- delegation event model
- not thread safe
- limited eg button ,Label
- native to os

swing
- lightweight(pure java)
- javax.swing
- faster(pure java rendering)
- mostly thread safe
- provides rich ui elemnts eg jTabbedpane,JTable,JTree
- customizable(via UIManager)





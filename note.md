# To accept user input in Java
- import java.util.Scanner;
- nextLine()  reads the input from user
- 
//The following code is about using scanner

import java.util.Scanner;
public class Main {

    public static void main (String[]args){

        Scanner scanner=new Scanner(System.in);
System.out.println("What is your name ");
        //accepting string data type
String  name=scanner.nextLine();
        System.out.println("What is your age ");
// accepting int data type
        int age=scanner.nextInt();

        //to proceed with our further input request our scanner should be cleared
        scanner.nextLine(); //clears our scanner
        System.out.println("What is your favorite food? ");
        String food=scanner.nextLine();
System.out.println("hello" + name);
        System.out.println("your age is "+ age +" and your favorite food is "+food);

                //express =operands and operators
                // operands = values, variables, numbers, quantity

                //double commands keeps the float numbers
                double friends = 10;
                friends=(double) friends / 3;
                System.out.println(friends);

}
}



import java.awt.Color; 
import javax.swing.ImageIcon; import javax.swing.JFrame; 

public class Main { 

public static void main(String[] args) { 

    // JFrame = a GUI window to add components to 

    JFrame frame = new JFrame(); //creates a frame 
    frame.setTitle("JFrame title goes here"); //sets title of frame 
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit from application 
    frame.setResizable(false); //prevent frame from being resized 
    frame.setSize(420,420); //sets the x-dimension, and y-dimension of frame 
    frame.setVisible(true); //make frame visible 
    ImageIcon image = new ImageIcon("logo.png"); //create an ImageIcon 
    frame.setIconImage(image.getImage()); //change icon of frame
    frame.getContentPane().setBackground(new Color(0x123456)); //change color of background }

 }



//


#-------------USER INPUT--------------------
import javax.swing.JOptionPane;
   String name = JOptionPane.showInputDialog("Enter Your Name");
        JOptionPane.showMessageDialog(null, "hello" + name);
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter Your age"));
        JOptionPane.showMessageDialog(null, "You are " + age + "years old");

        //if we want to parse a double value
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter Your Height"));
        JOptionPane.showMessageDialog(null, "You are " + height + "CM");
        
#.........MATHS....

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //calculation parts

        double x;
        double y;
        double z;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side x: ");
        x = scanner.nextDouble();
        System.out.println("Enter side y: ");
        y = scanner.nextDouble();
     z= Math.sqrt((x * x) + (y*y));
        System.out.println("The hypotenuse is:" +z);

        // always is good to close the scanner

        scanner.close();
    }
}
----------------------------------------------------------------
----Generating random numbers, boolean and Double numbers
----------------------------------------------------------------
import java.util.Random;

//generating random numbers from negative 2 billion to plus 2 billion
public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        //generating random integer value
        int x = random.nextInt();
        System.out.println(x);
        //generating random double value
        Double y = random.nextDouble();
        System.out.println(y);
        //generating random boolean value
        boolean z = random.nextBoolean();
        System.out.println(z);


    }
}

----------------Switch case statements------------------------------------------------

public class Main {
    public static void main(String[] args) {

       //switch statement in Java:it is statement that allows a variable to be tested for equality against a list of values
        String day="Friday";

        switch(day){
            case "Monday":System.out.println("It is Monday");
            break;
            case "Tuesday":System.out.println("It is Tuesday");
                break;
            case "Wednesday":System.out.println("It is Wednesday");
                break;

                // default test if the case is not in the lists of comparison
                default:System.out.println("It is not day or not available");



        }

    }
}


#------------....--------While loop--------------------------------------------

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       //while loop=executes a block of code as long as its condition remains true.
        //here until the user enters his name the code keeps asking name input.
      Scanner scanner =new Scanner(System.in);
      String name="";
      while(name.isBlank()){
          System.out.print("Enter Your name:");
          name=scanner.nextLine();
                  }
System.out.println("Hello" + name);
    }
}

" -------------------DO loop---------------------------------------------


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       //DO loop=executes a block of codes as long as its condition remains true.
       //It is  another form of while loop but it checks for the while loop only once
        //here until the user enters his name the code keeps asking for name input.
      Scanner scanner =new Scanner(System.in);
      String name="";
      do{
          System.out.print("Enter Your name:");
          name=scanner.nextLine();
      }while(name.isBlank());
System.out.println("Hello" + name);
    }
}


# ----------------------For Loop-------------------------------------------

public class Main {
    public static void main(String[] args) {
//for loop=executes a block of code a limited amount of times
//common for loop for counting numbers from 1-10
        for (int i = 0; i <= 5; i++) {
            System.out.println(i);
        }
        System.out.println("..................");
        //common for loop for counting numbers from 1-10
        //(i-=2) this decrement by two
        for (int i = 10; i >= 0; i -= 2) {
            System.out.println(i);

        }
        System.out.println("..................");
        System.out.println("Happy New Year");
    }
}

# ----------------------Nested Loop------------------------------------------

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Nested loops= a loop inside a loop

        Scanner scanner=new Scanner(System.in);
        int rows;
        int columns;
        String symbol ="";
        System.out.println("Enter Number of rows: ");
        rows =scanner.nextInt();
        System.out.println("Enter Number of columns: ");
        columns=scanner.nextInt();
        System.out.println("Enter Number of Symbol to use: ");
        symbol=scanner.next();
        for (int i=1;i<=rows;i++){
            System.out.println();
            for(int j=1;j<=columns;j++){
                System.out.print(symbol);
            }
        }
    }
}
OUTPUT:using symbol &.
&&&&&&
&&&&&&
&&&&&&
&&&&&&
&&&&&&

# ----------------------Array-----------------------------------------

public class Main {
    public static void main(String[] args) {

        //Array=used to store multiple values in a single variable
        //We can define the content of the array as String or int as what we want

        String[] cars ={"Camaro","Honda","Tesla"};
        //integer containing array
        int[] num ={1,2,3,4};
        System.out.println(cars[0]);
        System.out.println(num[1]);
        System.out.println("----------------");
      //another way of assigning array first by defining the array and the number of elements it contains
        // String[] Electronics=new String[3] implies array name Electronics and number of element is 3.
        String[] Electronics=new String[3];
        Electronics[0]="Laptop";
        Electronics[1]="Iphone";
        Electronics[2]="DELL";

//if we want to loop through elements of electronics
        for (int i=0;i<=2;i++){
            System.out.println(Electronics[i]);
        }
        }
    }

# ------------------------Working with Strings----------------------------------------

public class Main {
    public static void main(String[] args) {
    //String= a reference data type that can store one or more characters
    // reference data types have access to useful methods
        String name ="Nathan";

     //names.equals methods check if the string is identical. if only want  to ignore the case sensitiveness ,
     //We use name.equals.ignoreCase method
        boolean result =name.equals("nathan");
        boolean result2 =name.equalsIgnoreCase("nathan");
     //checking characters position
        char result3=name.charAt(0);//character in index at 0
     //checking index of a character indexOf
        int result4=name.indexOf("n");
                System.out.println(result);//out put is false
         System.out.println(result2);//out put is true
         System.out.println(result3);//out put is N
        System.out.println(result4);//out put is 5
     //checking if a character or string is empty isEmpty method
        boolean result5=name.isEmpty(); //out put is boolean false
        System.out.println(result4);//out put is 5
     //change to uppercase and lowercase.
        String result6=name.toUpperCase();//to lower case works teh same way.
        System.out.println(result6);//out put is NATHAN
     //trim method also removes empty space
        String name2= "   ABEBE ";
        String result7=name2.trim();
        System.out.println(result7);//removes empty space before and after the mark
     //replace option replace specific characters

        String result8=name2.replace('A','a');
        System.out.println(result8);//out put aBEBE
    }

}


# ---------------------Two dimension array-------------------------------------------

String[][] cars = new String[3][3];//:allocating two dimensional array memory with


+public class Main {
+    public static void main(String[] args) {
+
+        //2D array =an array of arrays
+
+        String[][] cars = new String[3][3];
+        cars[0][0] = "Camaro";
+        cars[0][1] = "Pajaro";
+        cars[0][2] = "Numero";
+        cars[1][0] = "Tesla";
+        cars[1][1] = "Hilux";
+        cars[1][2] = "XC40";
+        cars[2][0] = "KIA";
+        cars[2][1] = "Skoda";
+        cars[2][2] = "Hyundai";
+        for (int i = 0; i < cars.length; i++) {
+            //moving our cursor to new line with "System.out.println();"
+            System.out.println();
+            for (int j = 0; j < cars[i].length; j++) {
+                System.out.print(cars[i][j]+ " ");
+            }
+        }
+
+        }}
+----------------------------------------------------------------
+----Another way of creating two dimension array------------
+------------------------------------------------------------
+//2D array =an array of arrays by assigning the two D array elements when we declare it
+
+public class Main {
+    public static void main(String[] args) {
+
+        //2D array =an array of arrays by assigning the two D array elements when we declare it
+
+        String[][] cars = {{"Camaro","Pajaro","Numero"}, { "Camaro","Pajaro","Numero"},
+        { "Tesla","Hilux","XC40"},{"KIA","Skoda","Hyundai"}};
+
+        for (int i = 0; i < cars.length; i++) {
+            //moving our cursor to new line with "System.out.println();"
+            System.out.println();
+            for (int j = 0; j < cars[i].length; j++) {
+                System.out.print(cars[i][j]+ " ");
+            }
+        }
+
+        }}
+
+------------------------------------------------------------
+----Working with string methods------------
+------------------------------------------------------------
+public class Main {
+    public static void main(String[] args) {
+//String= a reference data type that can store one or more characters
+        // reference data types have access to useful methods
+        String name ="Nathan";
+        //names.equals methods check if the string is identical. if only want to ignore teh case sensetiviness ,
+        // we use name.equals.ignoreCase method
+        boolean result =name.equals("nathan");
+        boolean result2 =name.equalsIgnoreCase("nathan");
+        //checking characters position
+        char result3=name.charAt(0);//character in index at 0
+        //checking index of a charcter indexOf
+        int result4=name.indexOf("n");
+                System.out.println(result);//out put is false
+        System.out.println(result2);//out put is true
+        System.out.println(result3);//out put is N
+        System.out.println(result4);//out put is 5
+        //checking if a character or string is empty isEmpty method
+        boolean result5=name.isEmpty(); //out put is boolean false
+        System.out.println(result4);//out put is 5
+        //change to uppercase and lower case.
+        String result6=name.toUpperCase();//to lower case works teh same way.
+        System.out.println(result6);//out put is NATHAN
+        //trim method also removes empty space
+        String name2= "   ABEBE ";
+        String result7=name2.trim();
+        System.out.println(result7);//removes empty space before and after the mark
+//replace option replace specific characters
+
+        String result8=name2.replace('A','a');
+        System.out.println(result8);//out put aBEBE
+
+
+    }
+
+}
+------------------------------------------------------------
+----Working 2D arrays------------
+------------------------------------------------------------
+import java.util.*;

//import  java.util.*; for creating 2D ArrayList.
//2D ArrayList= a dynamic list of lists
//we can change the size of these list during run time.

public class Main {
    public static void main(String[] args) {
        //creating a string wrapper
        ArrayList<String> bakeryList=new ArrayList();
        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");

    System.out.println(bakeryList);//output [pasta, garlic bread, donuts]
        //getting the first element of the array
        System.out.println(bakeryList.get(0));//output pasta
    }

    }
+------------------------------------------------------------
+----Working 2D arraysList------------
+------------------------------------------------------------
import java.util.*;

//import  java.util.*; for creating 2D ArrayList.
//2D ArrayList= a dynamic list of lists
//we can change the size of these list during run time.
// it is a container of arraylists
public class Main {
    public static void main(String[] args) {
        //creating a string wrapper
        ArrayList<String> bakeryList=new ArrayList();
        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");

        ArrayList<String> drinkList=new ArrayList();
        drinkList.add("Coca Cola");
        drinkList.add("Smoothie");
        drinkList.add("Whisky");
        ArrayList<String> produceList=new ArrayList();
        produceList.add("tomato");
        produceList.add("potato");

    System.out.println(bakeryList);//output [pasta, garlic bread, donuts]
        //getting the first element of the array
        System.out.println(bakeryList.get(0));//output pasta
    }
+------------------------------------------------------------
+----Working  methods------------
+------------------------------------------------------------
public class Main {
    public static void main(String[] args) {

      //method= a block of code that is executed whenever it is called upon
       String name="bro";
       int age=21;
       hello(name,age);

    }
    //since we want to call the add method in static main method we have to include static and data type int in add method.
static void hello(String name,int age){
        System.out.println("hello"+name);
        System.out.println("You are" +age);
}
    }
+------------------------------------------------------------
+----overload methods------------
+------------------------------------------------------------

public class Main {
    public static void main(String[] args) {

        //overload methods= methods that share same name but have different parameters
        //                method name + parameters =method signature

        int x = add(1, 2, 3);
        System.out.println(x);
    }
    static int add(int a ,int b){
        System.out.println("This is overloaded method #1");
        return a + b;
    }
    static int add(int a ,int b,int c){
        System.out.println("This is overloaded method #2");
        return a + b + c;
    }
    static int add(int a ,int b,int c,int d){
        System.out.println("This is overloaded method #3");
        return a + b + c +d;
    }

    }
+------------------------------------------------------------
+----!for-each loop in Java------------
+------------------------------------------------------------

import java.util.ArrayList;

//import  java.util.ArrayList; for using for each loop ,creating 2D ArrayList.
//for-each =traversing technique to iterate through the elements in an array/collection
           //it requires less-steps & it is more readable;
public class Main {
    public static void main(String[] args) {

      //let us create array

      String [] animals={"cat","dog","lion","gorilla"};

      //for each
        for(String i : animals){ // the colon(:) represent the word in
            System.out.println(i); //cat,dog,lion, gorilla
        }

// or we can also create arrayList and the out-put is quite similar
ArrayList<String> cars=new ArrayList<String>();
        cars.add("Audi");
        cars.add("BMW");
        cars.add("KIA");
        cars.add("Toyota");
        for(String i : cars){ // the colon(:) represent the word in
            System.out.println(i); //Audi,BMW,KIA,Toyota
        }

    }

    }
+------------------------------------------------------------
+----!final in Java------------
+------------------------------------------------------------
public class Main {
    public static void main(String[] args) {

        double y=3.14159;

        //here we updated the value of y to 4
        y=4;
        final double pi=3.14159;
        //here we cant re-assign the value of final pi

        System.out.println(y);
        System.out.println(pi);//java: cannot assign a value to final variable pi

    }
}


----------------------------------------------------------------
----Creating class in java and constructors
----------------------------------------------------------------
public class Human {
    String name;
    int age;
    double weight;
Human(String name,int age,double weight)
    {
        this.name=name;
        this.age=age;
        this.weight=weight;
    }
 void eat(){
      System.out.println  (this.name + " is eating");
    }
    void drink(){
        System.out.println  (this.name + " is drinking");
    }
}
----------------------------------------------------------------
----Instantiating class in java 
----------------------------------------------------------------
public class Main 
{
    public static void main(String[] args) 
    {
        Human human1=new Human("abebe",26,45);
        Human human2=new Human("Nate",76,145);
        System.out.println(human1.name);//out-put:abebe;
        System.out.println(human2.name+ " your age is "+human2.age);//out-put:Nate your age is 76
human1.drink();//abebe is drinking
human2.eat();//Nate is eating
    }

}
----------------------------------------------------------------
-----------------Global and Local Variable................
----------------------------------------------------------------

...................//local Variable.....................

import java.util.Random; //creates random numbers
public class DiceRoller {
DiceRoller (){
Random   random=new Random();
int number=0;
roll(random,number);

        }
//passing random and number to method roll makes them accessible in Dice roller method.
//otherwise they are inaccessible
void roll(Random random,int number){
number=random.nextInt(6)+1;
System.out.println(number);
}
}

public class Main {
public static void main(String[] args) {

        //local variable=declared inside a method & visible only to that method
        //global=declared outside a method, but within a class. visible to all parts of the class
DiceRoller diceRoller=new DiceRoller();
}

    }

...................//Global Variable.....................
import java.util.Random; //creates random numbers
public class DiceRoller {
//this way random and number will be available in the DiceRoller class.
Random random;
int number;
DiceRoller (){
Random   random=new Random();

roll();

        }
//passing random and number to method roll makes them accessible in Dice roller method.
//otherwise they are inaccessible
void roll(){
number=random.nextInt(6)+1;
System.out.println(number);
}
----------------------------------------------------------------
-----------------Array of objects................
----------------------------------------------------------------
public class Food {

    String name;
    Food(String name){
        this.name=name;

    }
}

public class Main {
    public static void main(String[] args) {
//Option 1
//Food[] refrigerator =new Food[3];
Food food1=new Food("pizza");
        Food food2=new Food("Hambergur");
        Food food3=new Food("pasta");
//refrigerator [0]=food1;
//refrigerator[1]=food2;
//refrigerator[2]=food3;
////Option 2
//another way of creating the array of elements
       
        Food[] refrigerator={food1,food2,food3};
System.out.println(refrigerator[0].name);

    }

----------------------------------------------------------------
----------------Passing objects as a parameter................
----------------------------------------------------------------
//main class

public class Main {
    public static void main(String[] args) {
//Passing objects as parameter

        Garage garage=new Garage();
        Auto auto1=new Auto("BMW");
        Auto auto2=new Auto("Pajaro");
        Auto auto3=new Auto("Mercedes");

garage.Park(auto1);
        garage.Park(auto2);
        garage.Park(auto3);


    }

    }
//Garage class
public class Garage {
    //passing auto object
    //here object data type should be passed
    void Park(Auto auto){
        System.out.println("The " +auto.name+" is parked");
    }
}
//Auto class
public class Auto {
    String name;
    Auto(String name){
        this.name=name;

    }
}

----------------------------------------------------------------
----------------Static keyword in java................
----------------------------------------------------------------
public class Main {
    public static void main(String[] args) {
//static=modifier. A single copy of a variable/method is created and shared
        //The class "owns" the static member.

        Friend friend1=new Friend(("abebe"));
        Friend friend2=new Friend("Patrick");
        Friend friend3=new Friend("Jhon");
        System.out.println(Friend.numberOfFriends);
        //if we remove the static keyword from number of friends variable we cant access number of friends
Friend.displayFriends();
    }

    }
//Friend class

public class Friend {
    String name;
    //static key word makes the number of friends variable available throughout the class.
    static int numberOfFriends;

    Friend(String name){
        this.name=name;
        numberOfFriends++;
    }
 static void displayFriends(){
        System.out.println("You have"+numberOfFriends+"friends");
    }

}
----------------------------------------------------------------
----------------Inheritance................
----------------------------------------------------------------
//Maini class
public class Main {
    public static void main(String[] args) {
//inheritance=the process where one class acquires, the attributes and methods of another class.
Auto auto=new Auto("BMW");
Bicycle bicycle=new Bicycle();
auto.go();//this vehicle is moving
        auto.stop();//this vehicle is Stopped
       System.out.println(auto.doors);//4
        System.out.println(bicycle.pedals);//2
    }

    }

//Bicycle Class
public class Bicycle extends Vehicle{
    int wheels=2;
    int pedals=2;
}

//Auto Class
public class Auto extends Vehicle{
    String name;
    int doors=4;
    int wheels=4;
    Auto(String name){
        this.name=name;

    }
}

----------------------------------------------------------------
----------------Method overriding................
----------------------------------------------------------------
//Main class

public class Main {
    public static void main(String[] args) {
//Method overriding= Declaring a method in subclass,which is already present in parent class.
        //done so that the child class can give its own implementation.
        Animal animal=new Animal();
Dog dog=new Dog();
dog.speak();//The Dog goes bark
animal.speak();//The animal Speaks

    }

    }
//Animal Class
public class Animal {
    void speak(){
        System.out.println("The animal Speaks");
    }
}
//Dog class
public class Dog extends Animal{
    @Override //good practice
    void speak() {
        System.out.println("The Dog goes bark");
       // super.speak("Dog speaks");
    }
}
----------------------------------------------------------------
----------------1.OPTION1:SUPER KEY WORD................
----------------------------------------------------------------
//Main class

public class Main {
    public static void main(String[] args) {
//super=keyword refers to superclass(parent) of an object very similar to the "this"keyword
Hero hero1=new Hero("batman",42,"$$$$");
System.out.println(hero1.Power);
        System.out.println(hero1.name);
    }

    }

//Person Class

public class Person {
    String name;
    int age;
    Person(String name,int age){
        this.name=name;
        this.age=age;
    }
}
//Hero Class
public class Hero extends Person {
    String Power;
    Hero(String name,int age,String Power){
        super(name,age);//super brings the age and name variable from parent class
        this.Power=Power;

    }
}
----------------------------------------------------------------
----------------2.OPTION2:SUPER KEY WORD................
----------------------------------------------------------------
//Main class

public class Main {
    public static void main(String[] args) {
//super=keyword refers to superclass(parent) of an object very similar to the "this"keyword
Hero hero1=new Hero("batman",42,"$$$$");
        Hero hero2=new Hero("Nathan",36,"Hardwork");
System.out.println(hero1.toString());
        System.out.println(hero2.toString());
    }

    }

//Person Class

public class Person {
    String name;
    int age;
    Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String toString(){
        return this.name + "\n"+this.age+"\n";
    }
}

//Hero Class

public class Hero extends Person {
    String Power;
    Hero(String name,int age,String Power) {
        super(name, age);//super brings the age and name variable from parent class
        this.Power = Power;
    }
        public String toString(){
            return super.toString()+this.Power;

    }
}

----------------------------------------------------------------
----------------ABSTRACT KEYWORD................
----------------------------------------------------------------

//Main class
public class Main {
    public static void main(String[] args) {
//Abstract=Abstract classes cannot be instantiated,but they can have a subclass
        //abstract methods are declared without implementations

        Car car =new Car();
       // Vehicle vehicle=new Vehicle();
     car.go();
    }

    }
//Vehicle Class

public abstract class Vehicle {
//abstract class prohibits  creating a class from a Generic class name.
    abstract void go();
}
//Car Class
    public class Car extends Vehicle {
        @Override
        void go() {
            //creating implementation in child class from the abstract parent class
            System.out.println("The driver is driving the car");
        }
    }
----------------------------------------------------------------
----------------Access Modifiers in Java................
----------------------------------------------------------------
package package2;
import package1.*;
public class C {
    //Example of no access modifier "the String defaultMessage is with no access modifier".
    //here defaultMessage is only available within the same package.
    String defaultMessage="This is the default Message";
    //public    String publicMessage will be available in another package
   public String publicMessage=" This is the public Message";


}
package package1;
import package2.*;
public class A {
    //protected access modifier= all methods and classes are available in different packages as long as
    //The class extends to the parent class.
    protected String protectedMessage=" This is protected Message";


}
----------------------------------------------------------------
----------------Encapsulation in Java................
----------------------------------------------------------------
//Main Class

public class Main {
    public static void main(String[] args) {
//Encapsulation=attributes of a class will be hidden or private.
        //can be accessed only through methods(getters and setters)
        //you should make attributes private if you don't have a reason to make them public
//Setters; allow changes attributes of private attributes
        Car car =new Car("BMW","S30",2018);
       // Vehicle vehicle=new Vehicle();

        //setters
        car.setYear(2025);
   System.out.println(car.getMake());

        System.out.println(car.getModel());

        System.out.println(car.getYear());
    }

    }



//CAR CLASS

    public class Car  {
       private String make;
       private String model;
       private int year;
       Car(String make,String model,int year){
          // this.make=make;
          // this.model=model;
          // this.year=year;
           //if we would like to create setters the above code should be changed
           this.setMake(make);
           this.setYear(year);
           this.setModel(model);

       }
       public String getMake(){
           return make;
       }
       public String getModel(){
           return model;
       }
       public int getYear(){
           return year;
       }

       //Setters; changes attributes of private attributes if we would like to change
        public void setMake(String make){
           this.make=make;
        }
        public void setYear(int year){
            this.year=year;
        }
        public void setModel(String model){
           this.model=model;
        }

    }
## Interface in Java
//Main Class

public class Main {
    public static void main(String[] args) {
//interfaces are template that can be applied to a class.
        //similar to inheritance, but specifies what a class has/must do
        //class can apply more than one interface, inheritance is limited to 1 superclass
        Fish fish =new Fish();
        Rabbit rabbit=new Rabbit();
        rabbit.flee();//This rabbit is fleeing
        Lion lion=new Lion();
        lion.hunt();//The lion is hunting
        //here fish is implementing more than one interface
        fish.hunt();//This fish is hunting smaller fishes
        fish.flee();//This fish is fleeing from bigger fishes
    }

    }
//Fish Class

//we apply two interfaces for fish. let us say fish can be predators and Prey

public class Fish implements Prey,Predator {
  @Override
    public void hunt()
    {
     System.out.println("This fish is hunting smaller fishes");
    }
 @Override
    
    public void flee()
    {
        System.out.println("This fish is fleeing from bigger fishes");
    }
}
// Rabbit Class

public class Rabbit implements Prey 
{
    @Override
   public void flee()
    {
        System.out.println("This rabbit is fleeing");
    };
}
//Lion Class

public class Lion
{
 public void hunt()
    {
        System.out.println("The lion is hunting");
    }
}

// Prey Interface
public interface Prey 
{
    void flee();
}

//Predator Interface
public interface Predator
{
    void hunt();
}


----------------------------------------------------------------
----------------Polymorphism................
----------------------------------------------------------------
// Main Class

import package2.C;

polymorphism=greek word for poly="many",Morph-"form.it is the ability of an object to identify as more than one type

                public class Main {
                    public static void main(String[] args) {
                
                Car car=new Car();
                Bicycle bicycle=new Bicycle();
                Boat boat=new Boat();

//creating array of objects:because all identifies as Vehicle.
             Vehicle  [] racers={car,boat,bicycle};
             car.go();//The car is speeding
        //or other way of writing go method

                for(Vehicle x:racers){
        
                    x.go();//The car is speeding //The boat  is floating //The bicycle wheel is rotating
            }
            }

            }
// Vehicle Class
            public class Vehicle {
            
            public void go()
             {
            
             }
            }
//Car Class

            public class Car extends Vehicle {
            @Override
            public void go()
            {
                System.out.println("The car is speeding");
            }
            }

//Boat Class

                public class Car extends Vehicle {
                    @Override
            public void go(){
                System.out.println("The car is speeding");
            }
            
                }
                
//Bicycle Class

        public class Bicycle extends Vehicle {
        @Override
        public void go()
        {
           System.out.println("The bicycle wheel is rotating");
        }
            

----------------------------------------------------------------
----------------Dynamic Polymorphism................
----------------------------------------------------------------
//Dynamic polymorphism=many shapes/forms
      //  Dynamic=after compilation (during run time)
        //e.g. A Octavia is Škoda,and a car and vehicle and an object
        Animal animal;//we are creating animal object, but we don't yet what type of animal is .
       //prompt user to input type of animal. we need scanner

//Main Class

import java.util.Scanner;

public class Main

{
  public static void main(String[] args) 
  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("what animal do you want ");
    System.out.println("(1=Dog) or (2=Cat) ");
    //giving choice for user
    int choice = scanner.nextInt();
    if (choice == 1) {
      animal = new Dog();
      animal.speak();
    } else if (choice == 2) {
      animal = new Cat();
      animal.speak();
    } else {
      animal = new Animal();
      System.out.println("invalid Choice");
      animal.speak();
    }
  }

}

//Dog class

public class Dog extends Animal
{
  @Override //good practice
  void speak()
  {
    System.out.println("The Dog goes bark");
    // super.speak("Dog speaks");
  }
}

//Cat Class

public class Cat extends Animal
{
  @Override
  public void speak() 
  {
    System.out.println("Cat goes Meow");
  }
}

//Animal Class

public class Animal 
{
  void speak() {
    System.out.println("The animal *brrr*");
  }
}

## Exceptions

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//exceptions: an event that occurs during the execution of a program that disrupts the normal flow of instructions

        Scanner scanner=new Scanner(System.in);
        try {
   System.out.println("Enter a whole number to divide");
   int x = scanner.nextInt();
   System.out.println("Enter a whole number to divide:");
   int y = scanner.nextInt();
   System.out.println("Enter a whole number to divide:");
   int z = x / y;
   System.out.println("result:" + z);
 } catch (ArithmeticException e) {
   System.out.println("you cant divide by zero!");
 } catch (InputMismatchException e) {
   System.out.println("Please enter a number!");
 } catch (Exception e) {
   System.out.println("Something went wrong");
 } finally {
   scanner.close();
 }
    }

    }


#FILE


![Untitled](https://github.com/user-attachments/assets/bf7e51b4-def9-4a4d-886b-7aebfb73d022)

#Audio file in java

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.*;

public class Main {

	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException{
		
	
		Scanner scanner = new Scanner(System.in);
		
		File file = new File("Sweetheart.wav");
		AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
		Clip clip = AudioSystem.getClip();
		clip.open(audioStream);
	   clip.start();
	    String response="";
	    while(!response.equals("Q")) {
			System.out.println("P = play, S = Stop, R = Reset, Q = Quit");
			System.out.print("Enter your choice: ");
			
			response = scanner.next();
			response = response.toUpperCase();
			
			switch(response) {
				case ("P"): clip.start();
				break;
				case ("S"): clip.stop();
				break;
				case ("R"): clip.setMicrosecondPosition(0);
				break;
				case ("Q"): clip.close();
				break;
				default: System.out.println("Not a valid response");
			}
		 }
		System.out.println("Byeeee!");	
	    
	}
}
# JFRAME
import java.awt.Color; 
import javax.swing.ImageIcon; import javax.swing.JFrame; 

public class Main { 

public static void main(String[] args) { 

    // JFrame = a GUI window to add components to 

    JFrame frame = new JFrame(); //creates a frame 
    frame.setTitle("JFrame title goes here"); //sets title of frame 
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit from application 
    frame.setResizable(false); //prevent frame from being resized 
    frame.setSize(420,420); //sets the x-dimension, and y-dimension of frame 
    frame.setVisible(true); //make frame visible 
    ImageIcon image = new ImageIcon("logo.png"); //create an ImageIcon 
    frame.setIconImage(image.getImage()); //change icon of frame
    frame.getContentPane().setBackground(new Color(0x123456)); //change color of background }

 }






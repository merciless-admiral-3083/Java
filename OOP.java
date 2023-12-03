// OOP IN JAVA
//SEE VIDEO NO 39 STATIC BLOCK IN JAVA

class Calculator // we created a new class named calcualtor
{
  
  public int add(int n1,int n2) //public class conaining integers which we need to add so we used add(), int n1 and int n2 needs to be added
  {
    int result = n1 + n2; //it is the operation we will do
    return result; //return statement will return the solution of result
    
  }
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
class Computer  // new class computer
{
  public void playmusic() //public means we can use this class in any otheer class too, void means that () next to play music does not need any input
  {
    System.out.println("Playing Music"); //nothing we just printed some text to reflect
  }

  public String get_me_a_pen(int cost)  // here its not void because we mentioned string, we also said that you need to give an integer named cost
  {
    if (cost >= 10) // we gave a condition if cost is less than 10 then nothing can be bought
     return "Pen"; //we can directly use return instead of adding else then saying return
    return "Nothing can be puchased";
  }
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
class single_double
{
  public int add(int n1, int n2, int n3) // we used 3 integers n1 n2 and n3
  {
    return n1+n2+n3; // we summed them up
  }
  public int add(int n1, int n2) // we used the same n1 and n2 here too
  {
    return n1+n2;
  }
  public double add(double n1, double n2) // if we use n1 and n2 again in 2 condition, then it will be dispute so we did double n1 and n2 which tells that w can make 2 seperate statements for n1 and n2
  {
    return n1+n2;
  }
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
class student
{
  int rollno;  //this class contains rollno
  String name; //name
  int marks; //marks
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
class mobile
{
  String brand; // we made topics fordata to be entered
  int price;
  static String name; //IT IS CALLED STATIC VARIABLE NOW, we said that this thing must be constant for all entries in output no matter what we put in input

  public void show() //this helps us to save typing energy, whatever is inside show() gets printed with respect to data, see line 141
  {
    System.out.println(brand + " : " + price + " : " + name);
  }

  public static void show1(mobile obj)//this is now a static method, we mentioned mobile obj because we need to enter data seperately for price and brand
  {
    //System.out.println(brand + " : " + price + " : " + name); //since name is static variable it can be under static method but brand and price are not so they show error
    //to resolve this we can print data for obj1 and obj2 seperately
    System.out.println(obj.brand + " : " + obj.price + " : " + name); //obj.brand and obj.price is used because they are not static variables
  }
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
class human
{
  private int age; //by this we restrict that no one else outisde the class can access this data
  private String name = "Navin"; //same here

  public int getAge() //by this we allow to share some of out things to others by making the value public
  {
    return age; //this will return age
  }

  public void setAge(int a) //by this we are saying that you dont follow the above getAge rather i give me a value that i will print, and that value is in the below class
  {
    this.age = a;
  }


  public String getname() //we get the name printed in the output as we have shared the name publicly
  {
    return name;
  }
 //good thing is we can get this get and set from *Right Click* --> Source Action --> Get getters and setters
//the below text will be printed
  // public String getName() {
  //   return name;
  // }

  // public void setName(String name) {
  //   this.name = name; //just for understanding, think 'this' means 'yeh' (Hindi word)
  // }
  public human()
  {
    System.out.println("Constructor is executed!"); // there is something called constructor, it has SAME NAME AS CLASS NAME
    //name= "Harish"; //by this i want to tell is when you comment out this section and execute it the name harish and not navin because constructor is given moore priority than noral value input
    //what a constructor do is, it gets executed whenever the bridge i.e. on line 183 is processed it starts to run i.e. when the link is created between classes the constructor runs
    //the many times we make a bridge like for obj and then obj1 that many times the constructor will get executed
  }
 
  // YOU CAN USE SOURCE ACTION FROM RIGHT CLICKING AND SELECT CONSTRUCTOR AND THE DESIRED VALUES AS PER THE CLASS AND YOU CAN SAVE THE EFFOR OF TYPING AND MAKING A CONSTRUCTOR

  public human(int age, String name) //these is called parametric sonstructor where we input some values, the output of these values and values i inserted are on line 201
  {
    this.age = age;
    this.name = name;
    System.out.println("It is called Parametric constructor");
  }
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
class A //SEE VIDEO #45 if confused on what things are being done 
{
  public A() 
  {
    
    super(); //if you mentiuon or not its the same it exist in the background, its like John cena ("You can't see me")
    System.out.println("Class A"); //initially the default constructor of superclass and parametric of sub class is executed when we print the data
    //but if we wish to execute both parametric data of class A and B then you need to add the integer value in the () of super of parametric form of subclass like line 142
  }
  public A(int n)
  {
    //this(); //works only in parametric form, it is used to print the constructor without using any integers to call the constructor in short it is sued as print statment for constructors if you want it
    //super();
    System.out.println("Class A Integer");
  }
}
class B  extends A 
// A is called superclass, B is called subclass
{
  public B()
  {
    super();
    System.out.println("Class B");
  }
  public B(int n)
  {
    this();
    //super(n); //remove this line and see the values change, the value that will be output when we remove this n is the value we put in line 234
    System.out.println("Class B Integer");
  }
} //EVERY CLASS IN JAVA EXTENDS TO Object CLASS, IT IS ALSO LIKE JOHN CENA  
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
class alpha
{
  public alpha()
  {
    System.out.print("object created ");
  }
  public void show()
  {
    System.out.println("in alpha ");
  }
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
class One
{
  public int add(int n1, int n2) //notice how we used the same word add in both classes, by default only one of them i.e. add statement of class One and class Two, will be executed
  { //BUT REMEMBER THE BELOW CLASS I.E. THE CLASS IN WHICH WE EXTEND IS HAVING THE MOST PRIORITY SO THE CODE OF CLASS TWO IS EXECUTED, SEE LINE
    return n1+n2;
  }
}
class Two extends One
{
  public int add(int n1, int n2)
  {
    return n1+n2+10;
  }
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
class PC
    {
      public void show()
      {
        System.out.println("In A show");   
      }
    }
class Laptop extends PC //remember every laptop is a PC
    {
      public void show()
      {
        System.out.println("In B show");
      }
    }
class super_computer extends PC //remember every super computer is a PC too
    {
      public void show()
      {
        System.out.println("In C show");
      }
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
final class pen //by making it final we cant let anny other class inherit/extend it
{
    public final void show() //by making it final we will not let nay other class inherit this very statement into other class 
    {
        System.out.println("This file is of Jaspreet Only");
    }

    public void sum(int a17, int b17) 
    {
        System.out.println(a17 + b17);
    }

// class pen_stand extends pen
// {
  
// }
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
class beta
{
  String model;
  int price;
  //we printed the below to get the correct boolean, as discussed in the main class
  //I used sourc action--> generate hashcode and equals for this
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((model == null) ? 0 : model.hashCode());
    result = prime * result + price;
    return result;
  }
  
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    beta other = (beta) obj;
    if (model == null) {
      if (other.model != null)
        return false;
    } else if (!model.equals(other.model))
      return false;
    if (price != other.price)
      return false;
    return true;
  }

  
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
abstract class Car //the same is abstract class as below. if we remove abstract function the class is still valid
{//⚠️WE CANT CREATE OBJECT (I.E. BRIGE B/W 2 CLASSES) OF ABSTRACT CLASS⚠️
  public abstract void drive(); //abstract means that we dont want to define what this is in this perticular class but in some other class
  public void playMusic()
  {
    System.out.println("Play Music");
  }
}
class WagonR extends Car //it extends
{
  public void drive() //here we are defining what drive() do
  {
    System.out.println("Driving"); //so we can create object i.e. bridgge of this class to extract data of drive
  }
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
class no1
{
  int age;
  public void show() //name dosent matter i can name it hello() too
  {
    System.out.println("in class no1");
  }
  class no2 //class no2 is called inner class because it lies inside class no1
  {
    public void config()
    {
      System.out.println("in class no2");
    }
  }
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
class no3
{
  int age;
  public void show() 
  {
    System.out.println("in class no3");
  }
  static class no4 //now the class we have is static
  {
    public void config()
    {
      System.out.println("in class no4");
    }
  }
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
class no5
{
  public void show()
  {
    System.out.println("NEW CLASS");
  }
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
interface Uno //the condition with interface is that whatever you define in it like show(), YOU HAVE TO GIVE ITS OUTPUT VALUE AND CANT LEAVE IT TO RETURN OR VOID
//⚠️WHEN WE NEED TO CREATE LINK BETWEEN 2 INTERFACES WE NEED TO USE EXTENDS AND NOT IMPLEMENTS⚠️
{
  int  age = 44;
  String area = "Hyderabad";
  void show();
  void config();
}
class Duo implements Uno
{
  public void show()
  {
    System.out.println("in show");
  }
  public void config()
  {
    System.out.println("in config");
  }
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
interface Tres
{
  int age = 44;
  String area = "Hyderabad";
  void show();
  void config();
}
interface Quad
{
  void run();
}
interface Hex extends Quad //nothing, just to show
{

}
class Pent implements Tres,Quad
{
  public void show()
  {
    System.out.println("in show");
  }
  public void config()
  {
    System.out.println("in config");
  }
  public void run()
  {
    System.out.println("in run");
  }
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
enum Status //enum helps define  some things like activity
{
  Running, Jogging, Walking, Passing
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//class to class = extends
//class to interface = implements
//interfacee to interface = extends
public class OOP  // it is public class i.e. its main class
{
  public static void main(String a15[])
  {
    int num1=4; //we gave values to num1 and num2
    int num2=5;

    Calculator calc = new Calculator(); // what we did is, we said that something as calc must be named and it must be linked to class calculator, new calculator acts as bridge between both classes
    int result1 = calc.add(num1,num2); //we told that result1 must take values of Demo class and put it in Calculator class, to say it so, we did calc.add(num1,num2)
    System.out.println(result1);

    System.out.println("********************************************************************************************************************************************************************************************1");


    Computer obj = new Computer(); //its link between classes
    obj.playmusic(); // we said that perform playmusic operation of class computer, as we mentioned that obj helps in making link b/w classes
    String str = obj.get_me_a_pen(2); // here we mentioned the cost we have 
    System.out.println(str);
    System.out.println("********************************************************************************************************************************************************************************************2");


    single_double random_name = new single_double();
    int random = random_name.add(3,4); //we used 2 condition in calculator class 1 for n1 n2 and n3 and other for n1 and n2, by this we can either enter 2 values or 3 values, its our choice, but if we mentioned only 1 statement i.e. either of n1 n2 n3 or n1 n2 then we couldnt make 3 value questions or 2 value ones
    System.out.println(random);
    int random2 = random_name.add(2,5,9);
    System.out.println(random2);

    System.out.println("********************************************************************************************************************************************************************************************3");

    student s1= new student(); //bridge  between classses
    s1.rollno = 1; //data for each entry
    s1.name = "Navin";
    s1.marks= 67;

    student s2 = new student();
    s2.rollno = 2;
    s2.name = "Naveen";
    s2.marks= 78;

    student s3= new student();
    s3.rollno = 3;
    s3.name = "Navneet";
    s3.marks= 89;

    student students[] = new student[3]; //this line tells that we need to make an array for the data
    students[0] = s1; // data for each row of array
    students[1] = s2;
    students[2] = s3;

    //for (int j=0; j<students.length;j++)  //this tells how the fdata must be entered, starting from j=0, where j<students.length represent that the no of outputs must be limited to the no of entries
    //{
    //  System.out.println(students[j].name + " : " + students[j].marks);
    //}
    //OR WE CAN USE TH FOLLOWING INSTEAD OF THE COMMENTED PART
    for (student stud: students) //personally its better
    {
    System.out.print(stud.name + " : " + stud.marks + " - "); //i didnt use println here but just print
    
     if (stud.marks < 80)
      System.out.println("Failed");
     else
     System.out.println("Passed");
    }
    System.out.println("********************************************************************************************************************************************************************************************4");
    mobile obj1 = new mobile(); //nothing just data
    obj1.brand = " Apple ";
    obj1.price= 4000;
    mobile.name= "Smartphone"; //since its static so we put class name.name

    mobile obj2 = new mobile();
    obj2.brand = " Android ";
    obj2.price= 5000;
    mobile.name= "Smarty";

    mobile.name = "Phone"; //this is the word we want all entries of .name to follow

    obj1.show(); //we told it to showw me data for obj1 class
    obj2.show(); //same here
    mobile.show1(obj1); //we use it for non static variables to fetch data
    System.out.println("********************************************************************************************************************************************************************************************5");
    human something = new human(); //bridge
    something.setAge(50);  //we set the value to be printed on name
    System.out.println(something.getname()+ " : " + something.getAge()); //we made the layout of how the things must be printed
    // if we use this print statement beore the data being entered then it will print navin : 0, if you set navin as getter and setter like age, it will print null : 0
    human something2 = new human(18, "Vasudev"); //we created a link and we filled the values of a and n i.e. the required inputs
      System.out.println(something2.getname()+ " : " + something2.getAge()); //we made the layout of how the things must be printed
    System.out.println("********************************************************************************************************************************************************************************************6");
      B object = new B (5); // it is used to execute super and sub class
      System.out.println(object); //ITS OF NO USE I JUST MADE IT
      //IF WE REMOVE THE NUMBER INSIDE I.E. 5 THEN WE WILL GET DEFAULT CONSTRUCTORS OF CLASSES A AND B
      // IF WE PUT VALUE OF n IN ANY SUPER() LIKE IF I PUT N'S VALUE IN DEFAULT OF B, I WILL GET "Class A Integer" & "Class B"
    System.out.println("********************************************************************************************************************************************************************************************7");
    new alpha().show(); //it is anonymous object i.e. it has nothing inside but it will execute things written in class a
    //new alpha().show(); //if typed twice, it will give same output again
    //INHERITANCE IN JAVA
    //inheritance means when we inherit data of/from one class to other and since we are progressing ahead in java, we will take data of/from one file to other
    //I WILL BE USING 3 FILES NAMELY Demo.java, AdvCalc.java, Calc.java, rest data will be in the respective files
    //After inheritance is done in other files we are coming back here
    Two classTwo = new Two();
    int r1= classTwo.add(5,5);
    System.out.println(r1);
    //Reach out to file named Power inside tools folder for further information
    //Back Here
    System.out.println("********************************************************************************************************************************************************************************************8");
    PC obj_4 = new Laptop(); //since the Laptop class extends to PC, we can use PC obj_4 = ..., the output will be of Laptop class
    obj_4.show();

    PC obj_5 =new PC(); 
    obj_5.show();

    obj_5 = new Laptop(); //now as per method overiding ie. giving priority, only Laptop object must be shown as output compared to the above statement
    obj_5.show();

    obj_5 = new super_computer(); //the same thing as above, but what we observe in output is, when we print them all 3 of them gets rpinted instead of only 1
    obj_5.show();
    System.out.println("********************************************************************************************************************************************************************************************9");
    //we will now see final keyword
    final int number = 8; //by this we are making 8 as the final number which cant be changed, it is constant now
    //number = 9; //if we try to replace it with some other number, error will be shown
    System.out.println(number);
    pen thing = new pen();
    thing.show();
    thing.sum(4,5);
    System.out.println("********************************************************************************************************************************************************************************************10");
    beta obj5 = new beta();
    obj5.model = "Lenovo";
    obj5.price=1000;
    System.out.println(obj5); //we will  observe we will get class name and some code, by default, .toString() is executed in the background with  obj5, like (obj5.toString())
    //now, we can alter the code that is generated as per our choice, it can be done by either, typing the below text in the CLASS
    /*public String toSring()
     * {
     * return"Hello";
     * }
     */
    beta obj6 = new beta();
    obj6.model="Intel Yoga";
    obj6.price = 1000;
    boolean result = obj5 == obj6;
    System.out.println(result);  //NOTE, we are not mentioning .price for comparison, and when we run it, we get boolean as false, but we didnt set and condition, now go to class
      //whatever we get is right
    System.out.println("********************************************************************************************************************************************************************************************11");
    //we will see how to convert from one number type to other
    double a18 = 4.5; //we had  a decimal number 4.5
    int a19 = (int) a18; //we converted it into int by typing the following, note- we may lose some data/values like in this case when onverting from one form to other
    System.out.println(a19);
    System.out.println("********************************************************************************************************************************************************************************************12");
    int num3 = 8;
    Integer num4 = num3; //by this we are defining num 3 as num4, int means integer number and Integer means integer group where num4 which was origionallu num3 is defined
    System.out.println(num4); //it is called autoboxing

    int num5 = num4.intValue(); //here we are extracting the value we enclosed num3 into, i.e. we are extractring the value of num4 which is num3 origionally
    System.out.println(num5);// it is called unboxing

    int num6 = num4; //we are doing the above process in short lines and automatically
    System.out.println(num6); //its called auto unboxing

   String strone = "15";
    int num7 = Integer.parseInt(strone); //we are converting string to integer
    System.out.println(num7 * 2); //we are verifying if out conversion is correct or not by performing integer operations i.e. mathematical operations
    System.out.println("********************************************************************************************************************************************************************************************13");
    Car objCar = new WagonR();
    objCar.drive();
    obj.playmusic();
    System.out.println("********************************************************************************************************************************************************************************************14");
    no1 thing1 = new no1(); //we used this normally as we do
    thing1.show();

    no1.no2 thing2 = thing1.new no2(); //when there is inner class we use *outer class.inner class* and on right side we use .new and then inner class name
    thing2.config();
    //if class is static then we will use the below one
    no3.no4 thing3 = new no3.no4();
    thing3.config();
    System.out.println("********************************************************************************************************************************************************************************************15");
    //anonymous classses are the ones which exist but are not visible to user
    //whenever we change the data of any class from another class an anonoymous inner class is created
    no5 thing4 = new no5()
    {
      public void show() //notice how we didnt name any class here, iit wwill be considered as anonymous class here
      {
        System.out.println("Another new class"); //IF LET SAY NO5 IS ABSTRACT CLASS THEN INSTEAD OF MAKING A NEW CLASS TO EXTRACT DATA OF THAT CLASS INTOO ANOTHER NEW CLASS, WE CAN USE THIS METHOD TO EXTRACT DATA FROM ABSTRACT CLASS
      }
    }; //this semicolon ';' is important!
    thing4.show();
    System.out.println("********************************************************************************************************************************************************************************************16");
    //INSTEAD OF SAYING 'ABSTRACT PUBLIC' WE CAN ALSO ENTION 'INTERFACE' AND WHEN WE MENTION INTERFACE WE NEED TO REPLACE 'EXTENDS' TO 'IMPLEMENTS'
    Uno objUno = new Duo();
    objUno.show();
    objUno.config();
    //Uno.area = "Singapore"; then it will show error because any variab;le inserted in interface is final and  static and cant be changed
    System.out.println(Uno.area);
    System.out.println("********************************************************************************************************************************************************************************************17");
    Status nineeleven = Status.Running; //nine eleven is anything random, Running is the activity we defined in enum
    System.out.println(nineeleven.ordinal()); //ordinal tells the location of 'Running' in the enum class
    //if we want to know position of all things available in the class we do as follows
    Status [] ss = Status.values();
    for (Status hello : ss)
    {
      //System.out.println(hello); //this is enhanced for loop, go up and see it, if not here then in JAS_1 file
      //i commented out the above line because it was conflicting with the below line in output
      System.out.println(hello + " : " + hello.ordinal());
    //for better presentation we can print the order too like
    }
    Status hello = Status.Running; //we can tpe anything we wwant output of
    if(hello == Status.Running) //if we put running then it will give All good and similarly for others
      System.out.println("All Good");
      else if (hello == Status.Jogging)
    System.out.println("Jogging is good");
      else if (hello == Status.Walking)
    System.out.println("Wogging is good");
      else
      System.out.println("Passing is good");





  }
}

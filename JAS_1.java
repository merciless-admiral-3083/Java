// is used to add comments
// just like in python, we type python in terminal and then we can do normal things like math, or print something by typing print("text")
//similarly in java we type jshell, and to print something INSIDE jshell, we type 'System.out.print("");', '' IS NOT INCLUDED IN CODE
// we can also use /* & */ to add comments in paragraph form
//To compile the code you need to type 'javac *File name with extension*' ex. here its javac JAS_1
//To get output you need to type 'javac *Filename+Extension' then type 'java *Class name*'
//to print hello world we need to start  a code the following way
//SEE VIDEO NO 39 STATIC BLOCK IN JAVA

class JAS_1 //first create a class, preferably the same name as your folder
{
    public static void main(String a[]) /*public means the class is accessible to all classes, static means that whatever  we do in this lcass is appicable to all things we are lining it to, 
    main means that we are entering some java code, void means that we are not giving/expecting some value of main, string a[] means we are inserting values of java program in it, and  we are providing text in the class/code */
    {
        System.out.println("ੴ : Ik Onkar");
        System.out.println("Mercilessness is the key"); //ln will print new line
        System.out.println(10+5);
        int o = 1; //we have learned this int thing in python so no need to explain it :)
        int b= 1;
        int output1 = o + b;
        System.out.println(output1);
        System.out.println("*********************************************************************************************1");
        int num = 9; //used to add integer
        System.out.println(num);
        byte byt =127; //it has range of -127 to +128
        System.out.println(byt);
        short sht = 558; //it can handle short numbers which come undr -32K to +32K
        System.out.println(sht);
        long lng = 5854l; //iit can handle long numbers
        System.out.println(lng);        
        float flt = 5.8f; //used to store decimale numbers, if you put whole number there then .0 will be added at last i.e. 56 then it will be 56.0
        System.out.println(flt);
        double dbl = 5.8; //used to store decimal numbers with double preision i.e. with more values after decimal, if you add whole number then .0 gets added here too
        System.out.println(dbl);
        char cha = 'h'; // YOU CAN'T USE "" HERE!!!, used to store SINGLE character or numbers
        System.out.println(cha);
        boolean boo = true; //for true and  false
        System.out.println(boo);
        // there is thing called literals, it includes boolean, numbers, character or string data, we can use binary numbers to get its decimal output
        System.out.println("*********************************************************************************************2");
        int c = 0b101; // 0b is the code where b defines binary and 0 is 0
        System.out.println(c);
        int d= 0x7E;
        System.out.println(d); // x represent hexadecimal, and E is 14 as 10=A 11=B... 15=F
        //int num3 = 10000000; NOW, if we have to count the number of zeroes here then you can add _ in between random zeroes to make it easy for you to understand
        System.out.println("*********************************************************************************************3");
        int e= 10_00_00_00;
        System.out.println(e);
        double f = 12e10; //e represent power i.e 12 * 10^10, double will just show this in integer
        System.out.println(f); 
        char g = 'a';
        c++; //by this we can go 1 character further
        System.out.println(g);
        char h = 'z';
        h++; //this time '{' will be printed
        System.out.println(h);
        System.out.println("*********************************************************************************************4");
        //NOTE- WE CAN MOVE FROM SMALL RANGE THINGS TO BIG ONES BUT NOT VICE VERSA, like byte cant be converted to integer but vice versa is possible
        // we cant store character value into boolean value or vice versa as they both have differennt properties
        byte i =  127;
        int j = 12;
        i = (byte)j; // by this we converted j=12 to byte from integer
        System.out.println(i);
        float k = 5.8f;
        int l = (int)k; //we converted float to integer, by this .8 of float is removed as its now integer
        System.out.println(l);
        byte m = 10;//they are initially in byte form
        byte n = 30;
        int output2 = m*n; //but their output is not in the range of byte so we converted it into integer to get the output
        System.out.println(output2);
        int p = 7;
        int q = 5;
        //q = q + 2; //we can add any number to q or any other number
        //But we can also do it in the following way, 
        //q += 1; //by this q will be added with 2, same for -=, *=, /=, it can be done without any extra line of code

        /*by typing q++ or q--, we can add/subtract ONLY 1 from q, but there is something as post increment/decrement and 
        pre increment/decrement, Post incrememtn/decrement is num++/ num--, but pre increment/decrement is ++num/--num
        the difference is in post increment/decrement, it will take (or fetch) the value and then add/subtract 1 whereas in pre increment
        it will first add/subtract the value and then fetch the values and print, SO THIS THING NEEDS TO BE UNDERSTOOD */
        int output4 = q++;  //DONT PRINT ALL OF THESE AT ONCE ELSE THE OUTPUT WILL NOT BE PRINTED CORRECTLY
        int output5 = ++q;
        System.out.println(output4);
        System.out.println("*********************************************************************************************5");
        System.out.println(output5);
        System.out.println("*********************************************************************************************6");
        int output3 = p%q; //by this % we can find the remainder of when we divide p and q
        //similarly there are many other mathematical operations we can perform like * / + -
        System.out.println(output3); 
        System.out.println("*********************************************************************************************7");
        int r = 5; //these are simple booleans
        int s = 6; //not just integers but we can do it for float or double i.e. decimal values too
        boolean output6 = r>s;
        boolean output7 = r<s;
        boolean output8 = r<=s;
        boolean output9 = r>=s;
        boolean output10 = r!= s; //stands for not equal to 
        boolean output11 = r==s;  //stands for equal to
        System.out.println(output6);
        System.out.println(output7);
        System.out.println(output7);
        System.out.println(output8);
        System.out.println(output9);
        System.out.println(output10);
        System.out.println(output11);
        /*  && means AND, here 
        True condition and True Condition = True
        T  T = T
        T  F = F
        F  T = F
        F  F = F
        || means OR, here
        T  T = T
        T  F = T
        F  T = T
        F  F = F
        ! means NOT, here, see below how to use it
        T = F
        F = T        */
        int t = 7;
        int u = 5;
        int v = 5;
        int w = 9;
        boolean output12 = t>u && v>w;
        boolean output13 = t>u || v>w;
        boolean output14 = t>u; // we need to add ! in print statement and not in initial statement
        System.out.println(output12);
        System.out.println(output13);
        System.out.println(!output14);
        System.out.println("*********************************************************************************************8");
        int x = 15;
        if (x>10 && x<=20)
          System.out.println("WE DID IT!");
        else
          System.out.println("NO WORRIES TRY SOME OTHER NUMBER");
        // if we put if(false) then its print statement then IT WILL NEVER BE PRINTED AS THE CONDITION IS FALSE AND IT WILL NEVER BE PRINTED
        int y = 5;
        int z = 8;
        if (y>z)
        { //we use this {} so that we can add more than 1 thing to print on a particular condition
            System.out.print(y);
            System.out.print(" is the greatest number amongst y and z");
        }
        else
        {
         System.out.print(z);
         System.out.println(" is the greatest number amongst y and z");
        }
        System.out.println("*********************************************************************************************9");
      int a1= 10; //we have to find the greatest aamongst the 3
      int a2 = 15;
      int a3 = 20;
      if (a1 > a2 && a1 > a3) 
      {
        System.out.print(a1);
        System.out.print(" is the greatest amongst a1, a2 & a3");
      }
     else if (a2 > a3 && a2 > a1)     // by this we can tell which value amongst the 3 is greatest
     {
        System.out.print(a2);
        System.out.print(" is the greatest amongst a1, a2 & a3");
     }
     else 
     {
        System.out.print(a3);
        System.out.print(" is the greatest amongst a1, a2 & a3");
      }
      int a4 = 4; //an even number
      int output15 = 0; //initial value is 0, yoou have done such things in python also, where we set intital value as 0
      output15 = a4%2==0 ? 1 : 0; // %2==0 means if we divide a4 by 2 and get remainder = 0 then ? means print 1(it was or choice to print 1) else (shown by :) 0
      System.out.println(output15); //it tells that 4 is even as remainder = 0
      System.out.println("*********************************************************************************************10");
      int a5 = 2; // it means that if a5=2 then it will print Tuesday and similar
      switch(a5){ //we used switch as its alternate to if else if and else statement, personally it seems more convineant
        case 1 -> System.out.println("Monday"); // the issue comes that if we say a5=2 then it will print Tuesday and all things below, so break is used to print just Tuesday and nothing else
        case 2 -> System.out.println("Tuesday");
        case 3 -> System.out.print("Wednesday");
        case 4 -> System.out.println("Thursday");
        case 5 -> System.out.println("Friday");
        case 6 -> System.out.println("Saturday");
        case 7 -> System.out.println("Sunday");
        default -> System.out.println("Enter a valid number");
        //default means if the value is not from 1 to 7 then it must print the following for all other values 
      }
      System.out.println("*********************************************************************************************11");
      int a6 = 1;
      while (a6<=4)  //while is a type of loop, where we have put condition that a6 must be less than or equal to 4 till then make a loop
      { System.out.println("Hi " +a6); //it will print Hi followed by increasing value of a6, increasing because we put a6++
      
      a6++;
    }
    System.out.println("Bye " + a6); //it will print Bye 5 because the value till 4 is used in a6 loop, so the next value i.e. 5 will be shifted here

    int a7=1;
    while (a7<=4)
    {
      System.out.println("Hi" +i);
      int a8 = 1;
      while (a8<=3){
        System.out.println("Hello " + a8); //by this i want to say is that when you prin Hi 1, before printing Hi 2 it will print Hello 1 Hello 2 Hello 3
        // its because the code first scans the  whole thing once then repeats itself again to print Hi 2 Hello 1 Hello 2 hello 3 and then Hi 3 ... till Bye 5
        a8++;
      }
      a7++;
    }
    System.out.println("Bye "+ a7);
    System.out.println("*********************************************************************************************12");
    int a9 = 5;
    do //now we know that 5 is more than the while condition, but what do statement will do is it will print the false statement atleast omce
    { System.out.println("Hi " +a9); //it will print Hi followed by increasing value of a6, increasing because we put a6++
      //in some case if we dont mention anything in place of int a9=5 or something, and mention while(true) then it is infinite loop as its printing everything true i.e. everything is degined as true
      a9++;
    }
    while (i<=4);

    for (int a10=1; a10<=5; a10++) //by this we can include all statements in one line
    {
      System.out.println("Day " +a10 );
    }
    System.out.println("*********************************************************************************************13");
    //Arrays
    int num10   [] = {5,6,7,8};
    System.out.println(num10[1 /* 1 is the position of the number we want to retrieve */]);
    num10 [1] = 5;
    System.out.println(num10[1]); //we defined a new value to position 1
    int num11[] = new int[5]; // we mentioned that num3 is a new array, which has LENGTH 5
    System.out.println(num11[1]); // by default all values in this array is 0 like [0,0,0,0,0,0]
    //we can edit some values inside it
    num11[0] = 4;
    num11[1] = 5;
    num11[2] = 6; // we defined values for the positions 0 1 and 2
    for (int a16=0; a16<=4; a16++) // we did that for values <=4, where initial value is 0, add 1 number from 0 to 1 2 3 and 4
    {
      System.out.println(num11[a16]); //and print all thoose values, by this we saved the following workload
      /* System.out.println(num3[0])
       * System.out.println(num3[1])
       * System.out.println(num3[2])
       * System.out.println(num3[3])
       * System.out.println(num3[4])
       * System.out.println(num3[5])
       */
      }
      System.out.println("*********************************************************************************************14");
      //There is a math class in Java, which helps us do maths
      System.out.println(Math.max(5,10)); //it will give max term from the two
      System.out.println(Math.min(5,10)); //min term
      System.out.println(Math.sqrt(64)); //square root
      System.out.println(Math.abs(-4.7)); //modulus 
      System.out.println(Math.random()); //random, by default it will print in decimal
      int randomNum = (int)(Math.random() * 101); // *101 means the number generated will be in range of 0 to 100
      System.out.println(randomNum);

    System.out.println("*********************************************************************************************15");
  
    // now we will  create a matrix
    int matrix[][] = new int [3] [4]; //it will make matrix of 3 row and 4 column, since we said new int... all values are initially 0
    for (int a17=0; a17<3; a17++) //row will come first before bracket, initital value 0, for a17<3, a17++ means 1 value add every step
    {
      for (int a18=0; a18<4; a18++) //column next, same process as above, but here its 4 because of 4 columns
      {
        System.out.print(matrix [a17][a18] + " "); // WE DIDNT USE PRINTLN BUT JUST PRINT TO MAKE A MATRIX we said that a17 i.e. row will be here and a18 will be here +" " provides space between numbers of matrix
      }
      System.out.println(); //println is used to keep matrix away from other things to be printed for more organised things
    }
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    System.out.println("*********************************************************************************************16");
    int matrix2[][] = new int[3][4];
    for (int row=0; row<3; row++)
    {
      for (int column=0;column<4;column++) // no semicolon will come after for statement
    {
      matrix2 [row][column] = (int)(Math.random() *100);
      System.out.print(matrix2[row][column] + " ");
    }
      System.out.println();
    }
    //OR WE CAN USE THE BELOW IN BLACK OF LINE 264 to LINE 273
    System.out.println("*********************************************************************************************17");
    for (int rows[]  : matrix2) //rows is different from row, rows tell that we are talking about arrays/matrix here, matrix2 means we are taking data from matrix2 field
    {
      for (int anything_random : rows) //we are doing like a=3, a+4, similarly we are telling that anything_random = rows
      {
        System.out.print (anything_random + " "); //we gave space between numbers
      }
      System.out.println(); // we printed it
    }
    System.out.println("*********************************************************************************************18");
    // now we will create custom matrix i.e. arrays
    int matrix3[][] = new int[3][]; //we just mention the rows and not columns as we want to make different column for diff row
    matrix3[0] = new int [3]; //0 refers too first row, 3 refers to number of columns to be added in 0th i.e. 1st row
    matrix3[1] = new int [4];
    matrix3[2] = new int [2];
    for (int a19=0; a19<matrix3.length;a19++) //.length is used so that the server will know that we have mentioned 3 values for 1st row, 4 and 2 for rest rows
    {
      for (int a20=0; a20<matrix3[a19].length;a20++)
      {
        matrix3[a19][a20] =(int)(Math.random()*100);
        System.out.print(matrix3[a19][a20] + " ");
      }
      System.out.println();
    }

    {
      int[][][] threeDArray = new int[3][4][5]; //3d arrays have X Y and Z coordinate, NOTE- NUMBER OF DIGITS IN OUTPUT= 3*4*5=60 i.e. the coordinate's multiply

      // Fill the 3D array with random numbers
      for (int a21 = 0; a21 < 3; a21++) //we filled details for X coordinate
      {
          for (int a22 = 0; a22 < 4; a22++) //Y coordinate
      {
        for (int a23 = 0; a23 < 5; a23++) //Z coordinate
      {
        threeDArray[a21][a22][a23] = (int)(Math.random() * 100); //we defined how the values of the array must be shown
      }
      }
      }

      // Print the 3D array
      for (int a21 = 0; a21 < 3; a21++) //we told how the valeues must be processed
      {
        for (int a22 = 0; a22 < 4; a22++) 
      {
        for (int a23 = 0; a23 < 5; a23++) 
      {
        System.out.print(threeDArray[a21][a22][a23] + " "); //we made the layout of how its to be printed
      }
        System.out.println();
      }
      System.out.println("**********************************************************************************************19");
      String name = new String ("Navin");
      System.out.println("Hello " + name);
      System.out.println(name.concat(" Jaspreet")); //this is used to just print navin and jaspreet together, inshort it acts as a + thing that we do in print("anything" + "anything" )
      System.out.println(name.hashCode()); //just remember  this is a thing, its of no specific use
      System.out.println(name.charAt(1)); //this will tell the character present at position 1 in "Navin" like at position 1 there is letter a
      System.out.println("**********************************************************************************************19");

      //there are two types of stringss 1. Mutable which can be changed and one immutable which cannot be changed
      // there are 2 types stringbuffer and stringbuilder, both are mutable, stringbuffer can handle many threads at once whereas stringbuilder can't
      StringBuffer sb = new StringBuffer();//this is the syntax to make a string buffer
      System.out.println(sb.capacity());  // we are taking capacity of string buffer, by default its 16
      StringBuffer sb2 = new StringBuffer("Navin");
      System.out.println(sb2.capacity()); //this will print 16+ Navin letters i.e. 16+5=21
      StringBuffer sb3 = new StringBuffer("Navin");
      sb3.append(" Reddy"); //this helps us add words inside the existing words like system.out.println("anything" + "anything"), like this
      System.out.println(sb3);
      sb3.insert(0 , "Java"); //this will add the word java at position 0
      sb3.setLength(10); //this will set the length of word to 10 letters only, if values are less then rest will be filled with space, if more word less limit then only starting words will come
    }
    
    } 
  }  
}

//after executing this code we will get  *class name*.class file, its byte code and its none of our business to mess with that
// there are two types of numerical value, double and float, by default the values are double, which are more precise and fast than float
// to make a value float and noot double, you need to add 'f' after the number, like 'float num=5.6f;'

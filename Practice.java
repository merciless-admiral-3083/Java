enum Skatus //enum helps define  some things like activity
{
  Running, Jogging, Walking, Passing
}
public class Practice  // it is public class i.e. its main class
{
  public static void main(String a15[])
  {Status [] ss = Status.values();
    for (Status hello : ss)
    {
     // System.out.println(hello); //this is enhanced for loop, go up and see it, if not here then in JAS_1 file
    System.out.println(hello + " : " + hello.ordinal());
    //for better presentation we can print the order too like
    }
  }
}
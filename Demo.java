public class Demo //Demo is the first file
{
 public static void main(String a[])
 {
    VeryAdvCalc obj = new VeryAdvCalc(); //we created a link between two files in the exact same way we create link between two classses
    int r1 = obj.add(4 , 5);  //we inserted values of n1 and n2, along with that, thee things we defined in their respective classes like add, div etc are put here, THEY(add, div sub) ARE NO SYNTAX, WE ADDED THEN BY OUR OWN
    int r2 = obj.sub(4 , 5); //if you want you can rename add, sub... to anything like Hitler, Heronome, Atashinchi etc
    int r3 = obj.multi(4 , 5);
    int r4 = obj.div(4 , 5);
    double r5 = obj.power(4,2);
   System.out.println(r1 + " " + r2 + " " + r3 + " " + r4 + " " + r5); //we printed them
 }   
}

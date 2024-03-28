package other;

class Launch
{
    public void abc()
    {
        Ade_2 obj = new Ade_2();
        System.out.println(obj.age_2()); //we want to retrieve info of age so we created a link that can be accessed by other files
    }
}

public class Ade_2 
{
    private int  age_2 = 25;
    public int age_2(){
        return age_2;
    }
 //protected int age_2 = 25; //the protected statement can be used in the same package, IF THE FILE IS NOT IN THE SAME PACKAGE THEN YOU HAVE TO EXTEND ANY NEW CLASS TO THIS CLASS AS SHOWN

}
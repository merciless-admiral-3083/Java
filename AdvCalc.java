//noticee how we didnt use public static void main, because what we are using is ultimately a class and not a file
public class AdvCalc extends Calc //AdvCalc is the third file
//we extended the advcalc class to calc class because it helps indirectly makes advcalc and calc a sigle file which makes it easy to import the data of these files into demo file
{ public int multi(int n1, int n2) //we inserted tat n1*n2 is multiply when we put multi here
    {
        return n1*n2;
    }
    public int div(int n1, int n2)
    {
        return n1/n2;
    }
    
}

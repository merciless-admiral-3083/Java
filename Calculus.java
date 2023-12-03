//We will use import statement for importing data from another folder like here it is tools folder
// import tools.AdvCalc_Copy;
//import tools.Calc_Copy; //import means import, tools means folder and Calc_Copy is file name
import other.tools.*; //other.tools.* means we aretalking of a folder named tools which is situated inside another folder named 'other'
public class Calculus 
{
    public static void main(String[] args) 
    {
        Calc_Copy obj = new Calc_Copy();   // once you put this statement the import statement gets imported automatically, f it dosent then you have to put import only 1 time, it will get imported automatically the next time
        int ab1 = obj.add(4,5);
        System.out.println(ab1);
        AdvCalc_Copy obj1 = new AdvCalc_Copy();  
        int ab2 = obj1.multi(5,5);
        System.out.println(ab2);
    }
}

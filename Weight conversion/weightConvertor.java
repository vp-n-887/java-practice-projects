import java.util.Scanner;

public class weightConvertor{

    public static void main(String [] args)
    {
        System.out.println("weight convertor");
        System.out.println("enter option \n1 to convert kilograms to pounds\n2 to convert pounds to kilograms");
        
        Scanner s=new Scanner(System.in);
        int option;
        Double weight;
        Double newweight;

        option=s.nextInt();

        if(option==1)
        {
            // 1 kilogram is 2.2046 pounds
            System.out.print("enter the weight in kilograms");
            weight=s.nextDouble();
            newweight=weight*2.2046;
            System.out.println("the weight in pounds is "+newweight);
        }

        else if(option==2)
        {
           // 1 pound=0.4535 kgs
            System.out.print("enter the weight in pounds");
            weight=s.nextDouble();
            newweight=weight*0.4535;
            System.out.println("the weight in kilograms is "+newweight);
        }

        s.close();
    }
}
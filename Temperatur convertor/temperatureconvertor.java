import java.util.Scanner;

public class temperatureconvertor {
    public static void main(String[] args){
          
        double temp;
        double newtemp;
        String unit;
        int option;

        Scanner s=new Scanner(System.in);

        System.out.println("temperature convertor");
        System.out.println("\nenter the option");
          System.out.println("1 to convert celsius to farenheit");
            System.out.println("2 to convert farenheit to celsius");

option=s.nextInt();
System.out.print("Enter the temperature: ");


temp=s.nextDouble();

  newtemp=(option==1)? (((9.0/5.0)*temp)+32):(((5.0/9.0)*(temp-32)));
  unit=(option==1)?" degree F":" degree C";

  System.out.printf("converted temperature is: %f %s",newtemp,unit);

  s.close();
        



    }
}

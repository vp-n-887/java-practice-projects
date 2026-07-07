import java.util.Scanner;
import java.util.Random;

public class numberguessing{

    public static void main(String[] args){

        Scanner s=new Scanner(System.in);
        Random r=new Random();
        int number;
        int guess;
        int atempt=0;

        System.out.println("Number guessing game");
        
        number=r.nextInt(1,11);

        System.out.println("the random number has been generated");

        do{
            System.out.print("enter the guess: ");
            guess=s.nextInt();
            atempt++;
        }
        while(guess!=number);

        System.out.println("you have won\n the random number is "+ number+"\nAnd your guess is "+guess+ "\nyou have won in "+atempt+" attempt");

        s.close();

    }
}

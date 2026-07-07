import java.util.Scanner;
public class newyearcoutndown {
    
    public static void main(String[] args) throws InterruptedException{

        Scanner s=new Scanner(System.in);
        int countdown;

        System.out.print("countdown: ");
        countdown=s.nextInt();

        for(int i=countdown;i>0;i--)
        {
            System.out.println(i);
            Thread.sleep(1000);//sleep actaullay makes the code pause for the durattion millisecond by using exception
        }

        System.out.println("HAPPY NEW YEAR BITCHES!!");
        s.close();

    }
}

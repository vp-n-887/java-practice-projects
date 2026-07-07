import java.util.Scanner;

public class banking {
    public static void main(String[] args){
        
        //variables
        Scanner s=new Scanner(System.in);
        int option;
        int accno=0;
        String accholder="null";
        double bal=0;
        double deposit;
        double withdraw;
        

        do{
            System.out.println("---------$$BANKING SYSTEM$$------------");

            showmenu();
            option=s.nextInt();

            switch(option)
            {
                case 1:
                    {
                        System.out.print("enter acc no: ");
                        accno=s.nextInt();
                        s.nextLine();
                        System.out.print("enter acc holder name: ");
                        accholder=s.nextLine();
                        System.out.print("enter amount balnce: ");
                        bal=s.nextDouble();
                        break;
                    }

                    case 2:
                    {
                        System.out.println("acc no: "+ accno);
                        System.out.println("acc holder name : "+ accholder);
                        System.out.println("balance: "+ bal+"\n");
                        break;
                    }

                    case 3:
                    {
                       System.out.print("enter amount to be withdrwan: ");
                       withdraw=s.nextDouble();
                       bal=withdraw(bal,withdraw);
                       break;
                    }

                    case 4:
                    {
                        System.out.print("enter amount to be deposit: ");
                        deposit=s.nextDouble();
                        bal=deposit(bal,deposit);
                       
                        break;
                    }

                    case 5:
                    {
                           System.out.println("exiting..................");
                           s.close();
                           return;
                    }

                    default:
                        {
                            System.out.println("invalid option!!!!!!!!!!!!!!");
                        }
            } 
        }
         while(true);
        
    }
    static void showmenu()
    {
        System.out.println("----------MENU-----------");
        System.out.println("1.create account");
        System.out.println("2.show bank details");
        System.out.println("3.withdraw");
        System.out.println("4.deposit");
        System.out.println("5.exit\n");

        System.out.print("enter an option: ");
    }

    static double withdraw(double bal,double withdraw)
    {
        if(bal>=withdraw)
        {
            bal=bal-withdraw;
            System.out.println("amount withdrwan is "+ withdraw);
            System.out.println("amount balance is "+ bal+"\n");
            return bal;
        }

        else
        {
            System.out.println("insuffecient balance !!!!!");
            System.out.println("balance is: "+ bal);
            return bal;
        }
    }

    static double deposit(double bal,double deposit)
    {
        bal=bal+deposit;
        System.out.println("amount deposit is "+ deposit);
        System.out.println("amount balance is "+ bal+"\n");
        return bal;
    }

    
}

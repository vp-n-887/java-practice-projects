import java.util.Scanner;
import java.util.Random;

public class rockPaperScissors {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        Random r=new Random();
        String[] choice={"rock","paper","scissors"};
        String player;
        String computer;
        int playerscore=5;
        int computerscore=5;
        int playagain=1;

        System.out.println("------------ROCK PAPERS AND SCISSORS---------------");
        System.out.println("INITIAL SCORES:  ");
        System.out.println("Player score: "+playerscore);
        System.out.println("Computer score: "+computerscore);
        System.out.println("\n\n\n");

        while(playagain==1)
        {
             computer=choice[r.nextInt(0,3)];
             System.out.println("Computer move: "+ computer);
           
            System.out.print("enter your move: ");
            player=s.nextLine();

            if(computer.equals("rock"))
            {
                switch(player)
                {
                    case "rock":
                    {   playerscore+=0;
                        computerscore+=0;
                        break;
                    }

                    case "paper":
                        {
                        playerscore+=1;
                        computerscore-=1;
                        break;  
                        }

                        case "scissors":
                        {
                        playerscore-=1;
                        computerscore+=1;
                        break;  
                        }
                }


            }

            else if(computer.equals("paper"))
            {
                switch(player)
                {
                    case "paper":
                    {   playerscore+=0;
                        computerscore+=0;
                        break;
                    }

                    case "scissors":
                        {
                        playerscore+=1;
                        computerscore-=1;
                        break;  
                        }

                        case "rock":
                        {
                        playerscore-=1;
                        computerscore+=1;
                        break;  
                        }
                }

                
            }

            else if(computer.equals("scissors"))
            {
                switch(player)
                {
                    case "scissors":
                    {   playerscore+=0;
                        computerscore+=0;
                        break;
                    }

                    case "rock":
                        {
                        playerscore+=1;
                        computerscore-=1;
                        break;  
                        }

                        case "paper":
                        {
                        playerscore-=1;
                        computerscore+=1;
                        break;  
                        }
                }

                
            }

        System.out.print("\ndo u want to play again(y-1/n-0): ");
        playagain=s.nextInt();
        s.nextLine();
        }

        System.out.println("the SCORES ARE------");
        System.out.println("\nPLAYER: "+playerscore);
        System.out.println("COMPUTER: "+computerscore);
        System.out.println("\n\n---------------THE END--------------------");

        s.close();
    }
}

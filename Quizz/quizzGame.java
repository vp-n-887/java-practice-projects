import java.util.Scanner;

public class quizzGame {

    public static void main(String[] args)
    {
        //welcome msg
        //question array -> 1D
        //option array -> 2D
        //correct answer array -> 1D
        //workflow:
        //display questions
        //display opyions
        //enter the guess
        //check if its right or not
        //if right add on to score if not leave 
        //display final score

        Scanner s=new Scanner(System.in);
        
        String[] question={"2+3","2-1","5*15","81/9","6*7"};
        String[][] option={{"1.4","2.5","3.6","4.7"},
                           {"1.1","2.0","3.5","4.9"},
                           {"1.5","2.15","3.75","4.20"},
                           {"1.9","2.81","3.8","4.1"},
                           {"1.6","2.7","3.67","4.42"}     
                          };
        int[] answer={2,1,3,1,4};
        int guess;
        int score=0;

        System.out.println("-----------BRAINS NEEDED------------");
        System.out.println("GAME STARTS....");

        for(int i=0;i<question.length;i++)
        {
            //question
            System.out.println("QUESTION : "+question[i]);

            //options
           // for(String j=0;j<option[i];j++)  //this is not working
            for(String j:option[i])
            {
                System.out.println(j);
            }
 
            //GUESS
            System.out.print("enter your guess answer: ");
            guess=s.nextInt();

            if(guess==answer[i])
            {
                System.out.println("your answer is CORRECT\n\n");
                score++;
            }

            else{
                System.out.println("your answer is wrong\n\n");
            }
        }

        System.out.println("---------------thats an END TO THE QUESTIONS--------------");
        System.out.println("SCORE: "+ score);

        switch(score)
        {
            case 5:
                {
                    System.out.println("WONDERFULL EXCELLENT BITCHH\nCORTISOL LEVEL: HIGH");
                    break;
                }

            case 4:
                {
                    System.out.println("GREAT JOB MAN" );
                    break;
                }
            
            case 3:
                {
                    System.out.println("GOOD BRUHH");
                    break;
                }

            case 2:
                {
                    System.out.println("CORTISOL LEVEL : LOW\nLOWKEY YOU R SO DUMB");
                    break;
                }

            case 1:
                {
                    System.out.println("USE YOUR BRAIN");
                    break;
                }

            case 0:
                {
                    System.out.println("YOU DUMB FUCKING BITCH!!");
                    break;
                }
        }

        System.out.println("---------------------THE END---------------------");

        s.close();
    }
    
}

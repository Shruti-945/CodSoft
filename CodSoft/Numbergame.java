import java.util.Scanner;

public class Numbergame {
  public static void main(String[] args) {
    Scanner obj=new Scanner(System.in);
    int chances=10;
    int i, finals=0;
    boolean reset=true;
    System.out.println("Welcome to the number Game");
    System.out.println("You have "+ chances + "  chances to win the game");
    
    while(reset) {
      int number=getnumber(1,100);
      boolean guess=false;
      for(i=0;i<=chances;i++) {
        System.out.println("Chance number" + (i+1)+ ". Enter your guess");
        int user=obj.nextInt();
        if(user==number) {
          guess=true;
          finals=+1;
          System.out.println("Correct guess.You won.");
          break;
        }
        else if(user>number) {
          System.out.println("Too high");

        }
        else {
          System.out.println("Too low");
        }
      }
      if(guess==false) {
        System.out.println("Wrong guess.You lost the chance.The number is " +number);
      }
      System.out.println("Do you want to try again?Yes or NO?");
      String playAgain=obj.next();
      reset=playAgain.equalsIgnoreCase("Yes");
    }
      System.out.println("That's it Buddy,Hope you enjoyed it");
      System.out.println("Here is your score " +finals);
    }
  
      public static int getnumber(int min,int max) {
        return (int)(Math.random()*(max-min+1)+min);
      }
}



import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
public class Application{
  // private static boolean guessedCorrectl;

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Random random = new Random();
    boolean palyAgain = true;

    while(palyAgain){
      int secretNumber = random.nextInt(100)+1; //this getting number from one two hunders 1-100
      int attempts = 0;

        int maxAttempts = 7;
      boolean guessedCorrectlt = false;
      while(!guessedCorrectlt && attempts<maxAttempts){
      System.out.print("Enter your guess : ");
      try {
          int guess = sc.nextInt();
      attempts++;
      System.out.println("Remenning Attempts  "+(maxAttempts-attempts));

      if(guess<secretNumber){
        System.out.println("Too low ! try again .");
      }else if(guess>secretNumber){
        System.out.println("Too high ! try again .");
      }else{
        System.out.println("Correct ! you guessed it  "+attempts+"  tries");
        guessedCorrectlt = true;
      }
      } catch (InputMismatchException e) {
        System.out.println("That's not a valid Numbet! please enter a valid Integer .");

        sc.next();
      }
    }
    if(!guessedCorrectlt){
      System.out.println("Out of Attemps ! The Number was "+secretNumber);
    }

    System.out.println("Play Again ?(y/n)");
    String response = sc.next();
    if(!response.equalsIgnoreCase("y")){
      palyAgain = false;
    }
    }

    
    System.out.println("Thank you for Playing !");
    
  }
}
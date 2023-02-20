import java.util.Scanner;
import java.util.Random;


public class App {
    public static void main(String[] args) throws Exception {
        //declare the number of variables and initialize to 0
        int answer = 0;
        int guess = 0;
        Random rng = new Random();
        int tries = 5;

        //declare and initialize a scanner object
        Scanner myScanner = new Scanner(System.in);

        //generate random number between 1 and 20
        System.out.println("GENERATING RANDOM NUMBER! BEEP BOP BOOP");
        
        answer = rng.nextInt(20) + 1;
        
        // now start the guessing game!
        while ( tries > 0){
            //get a guess
            System.out.println("HUMAN! please guess a number between 1 and 20");
            System.out.println("YOU HAVE " + tries + " ATTEMPTS... OR ELSE!!!!");
            guess = myScanner.nextInt();

            //does guess equal answer?
            if (guess == answer){
                System.out.println("CONGRADULATIONS ARE IN ORDER FOR YOUR SURVIVAL, THAT WAS CORRECT");
                break;
            } else if (guess < 1 || guess > 20) {
                System.out.println("Enter a number between 1 and 20");
                tries --;
                continue;
            }
            if (guess > answer) {
                System.out.println("guess is too high, pick a lower number!");
                tries --;
                continue;
            } else {
                System.out.println("guess is too low, pick a higher number!");
                tries --;
            }
        
        }
        if (tries == 0) {
            System.out.println("YOU HAVE FAILED, PREPARE FOR ELIMINATION!");
        } else {
            System.out.println("....YOU ARE SAFE FOR NOW.... The number was: " + answer);
        }
    }
}

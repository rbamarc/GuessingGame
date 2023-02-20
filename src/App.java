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
            //instruct the user of the objective
            System.out.println("HUMAN! please guess a number between 1 and 20");
            System.out.println("YOU HAVE " + tries + " ATTEMPTS... OR ELSE!!!!");
            //get a guess
            guess = myScanner.nextInt();

            //does guess equal answer?
            if (guess == answer){
                System.out.println("CONGRADULATIONS ARE IN ORDER FOR YOUR SURVIVAL, THAT WAS CORRECT");
                break; // breaks out of the loop if the answer is correct
            } else if (guess < 1 || guess > 20) { //is the answer out of range?
                System.out.println("Enter a number between 1 and 20");
                tries --; //take a try away for each iteration of this
                continue; //continues the loop
            }
            if (guess > answer) {
                System.out.println("guess is too high, pick a lower number!");
                tries --; //take a try away for each iteration of this
                continue; 
            } else {
                System.out.println("guess is too low, pick a higher number!");
                tries --; //take a try away for each iteration of this
            }
        
        }
        //failure or passing statement
        if (tries == 0) {
            System.out.println("YOU HAVE FAILED, PREPARE FOR ELIMINATION!");
        } else {
            System.out.println("....YOU ARE SAFE FOR NOW.... The number was: " + answer);
        }
    }
}

import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        //declare the number of variables and initialize to 0
        int answer = 0;
        int guess = 0;

        //declare and initialize a scanner object
        Scanner myScanner = new Scanner(System.in);

        //ask player 1 to enter a number from 1 to 20
        System.out.println("Player1: please enter a number between 1 and 20");
        //now wait until a number is entered
        answer = myScanner.nextInt();
        //note there should be an error check here to make sure an int was entered
        // now start the guessing game!
        while ( true ){
            //get a guess
            System.out.println("Player 2: please guess a number between 1 and 20");
            guess = myScanner.nextInt();

            //does guess equal answer?
            if (guess == answer){
                break;
            } else if (guess < 1 || guess > 20) {
                System.out.println("Enter a number between 1 and 20");
                continue;
            }
            if (guess > answer) {
                System.out.println("guess is too high, pick a lower number!");
                continue;
            } else {
                System.out.println("guess is too low, pick a higher number!");
            }
        
        }
        System.out.println("That's it! The number was: " + answer);
    }
}

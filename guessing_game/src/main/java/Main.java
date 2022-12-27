import java.util.Random;
import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            // take user input
            System.out.print("Enter a number between 1 to 10: ");
            Scanner input = new Scanner(System.in);

            // generate a secret number
            Random randomNumber = new Random();
            int secretNumber = randomNumber.nextInt(1,10);

            // use a loop
            // once the secret number is generated, the loop should continue taking the user input till the user guesses the correct secret number

            while(true) {

                int userGuess = input.nextInt();
                System.out.println("Your guess is: " + userGuess);

                if(userGuess > secretNumber ) {
                    System.out.println("Your guess is too high. Try again");
                }
                if(userGuess < secretNumber) {
                    System.out.println("Your guess is too low. Try again");
                }
                else if(userGuess == secretNumber) {
                    System.out.println("Yay.You got this right this time!");
                    break;
                }

            }
        }
    }



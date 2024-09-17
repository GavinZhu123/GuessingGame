import java.util.Scanner;
import java.util.Random;

public class Main{
    public static void main(String[] args){
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        int x = rand.nextInt(bound:100);
        int guess;
        System.out.println("Enter your first guess: ");
        guess = scan.nextInt();
        int count = 0; //count the number of times the user guesses

        while(guess != x){
            if (guess == x) {
                System.out.println("Correct! You guessed the answer in " + count + "guesses.");

            } else if (guess < x) {
                System.out.println("Incorrect. Your guess was lower than the answer. Please guess again: ");
                guess = scan.nextInt();
                count = count + 1;

            } else if (guess > x) {
                System.out.println("Incorrect. Your guess was higher than the answer. Please guess again: ");
                guess = scan.nextInt();
                count = count + 1;

            }
            


        }

        if (count < 8){
            System.out.println("Congratulations. You guessed in under 8 attempts.");
        } else if (count > 8){
            System.out.println("Congratulations. You guessed in over 8 attempts.");
        }
    }


}
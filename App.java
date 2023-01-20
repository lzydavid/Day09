package sdf;

import java.util.Random;
import java.util.Scanner;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }
    public static void main(String[] args) {
        
        Random rand = new Random();
        Integer guessNumber = rand.nextInt(100);

        Integer myGuess = 0;

        Scanner input = new Scanner(System.in);

        while (myGuess != guessNumber){
            myGuess = input.nextInt();
            
            if(myGuess<guessNumber){
                System.out.println("The number you guess is lower");
            }
            else if(myGuess > guessNumber){
                System.out.println("The number you guess is higher");
            }
            else{
                System.out.println("You got it right");
                input.close();
                System.exit(0);
            }
        }
    }
}

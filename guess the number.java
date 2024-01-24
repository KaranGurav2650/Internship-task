import java.util.*;
public class guess {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int min = 1;
                int max = 100;
                int trail = 5;
                int number = min + (int) (max * Math.random());
                int num, guess;
                System.out.println("Choose a number between 1 to 100");
                System.out.println("Guess the number within 5 trials");
                for (num = 1; num <= trail; num++) {
                    System.out.println("Guess the number:");
                    guess = sc.nextInt();
                    if (number == guess) {
                        System.out.println("Balle! Balle! You guessed the correct number");
                        break;
                    } else if (number > guess) {
                        System.out.println("Number is greater than the guess");
                    } else if (number < guess) {
                        System.out.println("Number is less than the guess");
                    }
                }
                if (num > trail) {
                    System.out.println(" ohhh no trials are finished");
                    System.out.println("The number was " + number);
                }
            }
        }


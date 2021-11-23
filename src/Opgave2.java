import java.util.Random;
import java.util.Scanner;

public class Opgave2 {
    int guessLeft = 3;

    Scanner scanner = new Scanner(System.in);

    Random randomGuessNumber = new Random(); 
    int correctNumber = randomGuessNumber.nextInt(1, 11);

    public void Start() {
        // Ouputs some infomation about the program/game, and execute ValidateGuessNumber method.
        Information();
    }

    public void Information() {
        System.out.println("Welcome to guess the number game!".toUpperCase());
        System.out.println("\n-About-\nIn this game you are gonna guess a number between 1 - 10\nYou have 3 try to guess the number. If your guess is wrong you will loose 1 guess and loose at 0.\n");
        ValidateGuessNumber();
    }

    private void ValidateGuessNumber() {
        String userInput;
        int parsedNumber = 0;

        while (!false) {
            System.out.print("Guess: ");
            userInput = scanner.next().trim();
            try {
                parsedNumber = Integer.parseInt(userInput);
                break;
            } catch (Exception e) {
                System.out.println("Du skal skrive et hel tal");
            }            
        }
        CheckGuess(parsedNumber);
        scanner.close();
    }

    public void CheckGuess(int userGuess) {

        if (userGuess < correctNumber) {
            guessLeft--;
            System.out.println("Try to guess higher next time.\n"  + "Guess left: " + guessLeft);
        }
        else if (userGuess > correctNumber) {
            guessLeft--;
            System.out.println("Try to guess lower next time.\n" + "Guess left: " + guessLeft);
        }
        else {
            System.out.println("YOU WON!\nThe number was: " + correctNumber);
            return;
        }

        if (guessLeft >= 1) {
            ValidateGuessNumber();
        }
        else {
            System.out.println("You lost...\nThe number was: " + correctNumber);
            return;
        }
    }
}
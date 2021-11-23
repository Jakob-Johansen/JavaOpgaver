public class Opgave2 {

    int guessLeft = 3;

    int correctNumber = (int) Math.random() * 11;

    public void Start() {
        // Ouputs some infomation about the program/game.
        Information();
    }

    public void Information() {
        System.out.println("Welcome to guess the number game!".toUpperCase());
        System.out.println("\n-About-\nIn this game you are gonna guess a number between 1 - 10\nYou have 3 try to guess the number. If your guess is wrong you will loose 1 guess and loose at 0.\n");

    }
}
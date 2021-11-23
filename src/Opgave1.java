import java.util.Random;
import java.util.Scanner;

public class Opgave1 {

    public void RigtigRegning() {
        int a, b, c, userInput;

        Random randomNumber = new Random();

        a = (int)(Math.random() * 22);
        b = (int)(Math.random() * 22);
        c = randomNumber.nextInt(1,4);
        
        switch (c) {
            case 1:
                System.out.println("Hvad er " + a + " + " + b + "?");
                userInput = UserInputValidate();
                if (userInput == a + b)
                    System.out.println("Du har regnet rigtigt!");
                else
                    System.out.println("Du har regnet forkert.");
            break;
            case 2:
                System.out.println("Hvad er " + a + " - " + b + "?");
                userInput = UserInputValidate();
                if (userInput == a - b)
                    System.out.println("Du har regnet rigtigt!");
                else
                    System.out.println("Du har regnet forkert.");
            break;
            case 3:
                System.out.println("Hvad er " + a + " * " + b + "?");
                userInput = UserInputValidate();
                if (userInput == a * b)
                   System.out.println("Du har regnet rigtigt!");
                else
                    System.out.println("Du har regnet forkert.");
            break;
            default:
                System.out.println("Der skete en fejl.");
            break;
        }
    }

    private int UserInputValidate() {
        String userInput;
        int parsedInt = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Svar: ");
            userInput = scanner.next().trim();
            try {
                parsedInt = Integer.parseInt(userInput);
                break;
            } catch (Exception e) {
                System.out.println("Du skal skrive et hel tal.");
            }
        }
        scanner.close();
        return parsedInt;
    }

}

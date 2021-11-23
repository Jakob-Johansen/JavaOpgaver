import java.util.Random;
import java.util.Scanner;

public class Opgave1 {

    public void RigtigRegning() {
        int a, b, c, userInput;

        Random random1 = new Random();
        Random random2 = new Random();
        Random random3 = new Random();

        a = random1.nextInt(1,22);
        b = random2.nextInt(1,22);
        c = random3.nextInt(1,4);
        
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

    public int UserInputValidate() {
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

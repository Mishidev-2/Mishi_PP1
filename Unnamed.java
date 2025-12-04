import java.util.Scanner;

public class Unnamed {
    private static Scanner scanner = new Scanner(System.in);
    
    public static void start() {
        GameTools.displayGlitchEffect();
        GameTools.typeText("???");
        GameTools.delay(2);
        GameTools.typeText("UNKNOWN REALM");
        GameTools.delay(1);
        
        GameTools.typeText("\nScene 1: Beyond Reality...");
        GameTools.typeText("You find yourself in a place that shouldn't exist.");
        GameTools.typeText("The laws of physics bend around you.");
        GameTools.pressToContinue(scanner);
        
        GameTools.typeText("\nScene 2: The Truth Unveiled...");
        GameTools.typeText("With your Ed3 powers, you see the code of existence.");
        GameTools.typeText("Everything is connected in ways you never imagined.");
        GameTools.pressToContinue(scanner);
        
        GameTools.typeText("\nScene 3: A Final Choice...");
        GameTools.typeText("You stand before the source of all creation.");
        
        System.out.println("1. Embrace the code");
        System.out.println("2. Rewrite reality");
        System.out.println("3. Return to nothingness");
        System.out.print("Enter your choice (1-3): ");
        
        String choice = scanner.nextLine();
        
        switch (choice) {
            case "1":
                GameTools.typeText("\nYou become one with the universe...");
                GameTools.typeText("Your consciousness expands across all existence.");
                break;
            case "2":
                GameTools.typeText("\nYou rewrite the rules of reality...");
                GameTools.typeText("A new world is born from your will.");
                break;
            case "3":
                GameTools.typeText("\nYou choose oblivion...");
                GameTools.typeText("Everything fades to white.");
                break;
            default:
                GameTools.typeText("\nThe choice is made for you...");
        }
        
        GameTools.typeText("\nThe secret mission is complete.");
        GameTools.typeText("Thank you for discovering this hidden path.");
        GameTools.pressToContinue(scanner);
        
        // Return to main menu
    }
}  
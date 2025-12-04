import java.util.Scanner;

public class Mission4 {
    private static Scanner scanner = new Scanner(System.in);
    
    public static void start() {
        GameTools.clearScreen();
        GameTools.typeText("=== MISSION 4 ===");
        GameTools.typeText("Welcome, " + GameState.getPlayerName() + "!");
        
        // Scene 1
        GameTools.typeText("\nScene 1: The final chapter begins...");
        GameTools.typeText("You stand before the gates of destiny.");
        GameTools.pressToContinue(scanner);
        
        // Scene 2
        GameTools.typeText("\nScene 2: The weight of your journey settles upon you.");
        GameTools.typeText("Every choice has led to this moment.");
        GameTools.pressToContinue(scanner);
        
        // Scene 3
        GameTools.typeText("\nScene 3: A final test approaches...");
        GameTools.typeText("The path splits before you.");
        GameTools.pressToContinue(scanner);
        
        // Scene 4 - Branch based on HasFeather
        if (GameState.hasFeather()) {
            scene4WithFeather();
        } else {
            scene4WithoutFeather();
        }
    }
    
    private static void scene4WithFeather() {
        GameTools.typeText("\nScene 4: You hold the mystical feather...");
        GameTools.typeText("A celestial being appears before you.");
        GameTools.typeText("\"That feather... it belongs to the heavens.\"");
        
        GameTools.typeText("\nThe being extends a hand.");
        GameTools.typeText("What will you do?");
        
        System.out.println("1. Give the feather to the being");
        System.out.println("2. Refuse and keep the feather");
        System.out.print("Enter your choice (1 or 2): ");
        
        String choice = scanner.nextLine();
        
        if (choice.equals("1")) {
            GameTools.typeText("\nYou hand over the feather...");
            GameState.setHasFeather(false);
            GameState.setIfEd2(true); // Set Ed2 to true for Bad End 2
            GameTools.typeText("The being takes it and vanishes.");
            GameTools.typeText("You feel a profound sense of loss...");
            GameTools.pressToContinue(scanner);
            
            // Trigger Bad End 2 immediately - NO MAZE
            //Endings.showBadEnd2();
        } else {
            GameTools.typeText("\nYou clutch the feather tightly...");
            GameTools.typeText("\"I cannot part with this,\" you say.");
            GameTools.typeText("The being frowns and disappears.");
            GameTools.typeText("You proceed with the feather still in your possession.");
            GameTools.pressToContinue(scanner);
            
            // Continue to maze
            runHeavenMaze();
        }
    }
    
    private static void scene4WithoutFeather() {
        GameTools.typeText("\nScene 4: Without the feather's burden...");
        GameTools.typeText("You feel light and unencumbered.");
        GameTools.typeText("The path to the heavens lies open before you.");
        GameTools.pressToContinue(scanner);
        
        runHeavenMaze();
    }
    
    private static void runHeavenMaze() {
        GameTools.typeText("\nThe Maze to Heaven awaits...");
        GameTools.typeText("Navigate this final challenge to reach your destiny.");
        GameTools.pressToContinue(scanner);
        
        boolean mazeCompleted = GameTools.runMazeGame(scanner);
        
        if (mazeCompleted) {
            GameTools.typeText("\nYou have reached the heavens!");
            GameTools.typeText("Your journey culminates here...");
            GameTools.pressToContinue(scanner);
            
            // Check which ending to show
            Endings.checkEnding();
        } else {
            GameTools.typeText("\nYou failed to navigate the maze...");
            GameTools.typeText("Your journey ends here in obscurity.");
            GameTools.pressToContinue(scanner);
            // Return to main menu
        }
    }
}
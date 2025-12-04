import java.util.Scanner;

public class Endings {
    private static Scanner scanner = new Scanner(System.in);
    
    public static void checkEnding() {
        GameTools.clearScreen();
        GameTools.typeText("=== FINAL DESTINY ===");
        
        // Check conditions for each ending
        if (GameState.hasFeather() && GameState.getSinCounter() > 0) {
            showBadEnd(); // Has feather AND sins > 0
            
        } else if (GameState.hasFeather()) {
            showNormalBadEnd(); // Has feather but no sins
            
        } else if (GameState.getSinCounter() > 0) {
            showSinBadEnd(); // Has sins but no feather
            
        } else if (GameState.isIfEd3()) {
            showTrueEnd();
        } else {
            showGoodEnd();
        }
    }
    
    public static void showGoodEnd() {
        GameTools.typeText("ENDING: The Pure Heart");
        GameTools.typeText("======================");
        GameTools.typeText("Without sin and without worldly attachments...");
        GameTools.typeText("You have achieved enlightenment.");
        GameTools.typeText("The heavens welcome you with open arms.");
        GameTools.typeText("\nYour purity has saved your soul.");
        GameTools.typeText("You find eternal peace in the celestial realms.");
        GameTools.pressToContinue(scanner);
        
        // Return to main menu
        returnToMainMenu();
    }
    
    public static void showNormalBadEnd() {
        GameTools.typeText("ENDING: The Feather's Burden");
        GameTools.typeText("============================");
        GameTools.typeText("You kept the celestial feather...");
        GameTools.typeText("But without any sins to weigh you down,");
        GameTools.typeText("you find yourself trapped between worlds.");
        GameTools.typeText("\nThe feather grants you immortality,");
        GameTools.typeText("but at the cost of true enlightenment.");
        GameTools.typeText("You are forever a guardian, never to ascend.");
        GameTools.pressToContinue(scanner);
        
        // Return to main menu without reset
        returnToMainMenu();
    }
    
    public static void showBadEnd() {
        GameTools.typeText("ENDING: The Weight of Sin and Feather");
        GameTools.typeText("======================================");
        GameTools.typeText("Your sins have followed you to the heavens...");
        GameTools.typeText("and the feather you kept only magnifies their weight.");
        GameTools.typeText("\nThe celestial gates slam shut before you.");
        GameTools.typeText("The feather becomes an anchor, dragging you down.");
        GameTools.typeText("You are cast into the abyss between realms.");
        GameTools.pressToContinue(scanner);
        
        // Reset and prepare for true ending path
        GameTools.typeText("\nIn your darkest moment...");
        GameTools.typeText("A forbidden knowledge awakens within you...");
        GameTools.typeText("The path of Ed3 reveals itself!");
        resetForTrueEnding();
        
        // Mission 1 will automatically detect Ed3=true and run Unnamed after
        Mission1.start();
    }
    
    public static void showSinBadEnd() {
        GameTools.typeText("ENDING: The Weight of Sin");
        GameTools.typeText("=========================");
        GameTools.typeText("Your sins have followed you to the heavens...");
        GameTools.typeText("The gates close before you.");
        GameTools.typeText("\nYour burden is too heavy for heaven to bear.");
        GameTools.typeText("You are cast back to the mortal realm.");
        GameTools.typeText("\nSin leaves marks that even eternity cannot erase.");
        GameTools.pressToContinue(scanner);
        
        // Return to main menu without reset
        returnToMainMenu();
    }
    
    public static void showTrueEnd() {
        GameTools.typeText("ENDING: The Ed3 Revelation");
        GameTools.typeText("===========================");
        GameTools.typeText("With Ed3 activated and a pure heart...");
        GameTools.typeText("You have achieved the True Ending!");
        GameTools.typeText("\nThe heavens reveal their deepest secrets to you.");
        GameTools.typeText("You understand the true nature of reality.");
        GameTools.typeText("This is not an end, but a new beginning...");
        GameTools.typeText("\nYou have transcended beyond mere mortal understanding.");
        GameTools.typeText("The cosmos is yours to explore.");
        GameTools.pressToContinue(scanner);
        
        // Final completion - no more loops
        GameTools.typeText("=== GAME COMPLETE ===");
        returnToMainMenu();
    }
    
    // Reset game state and enable Ed3 for the true ending path
    private static void resetForTrueEnding() {
        // Reset all progress but keep Ed3 enabled
        GameState.setSinCounter(0);
        GameState.setHasFeather(false); // Reset the feather
        GameState.setIfEd3(true);  // This is the key - enables the secret path
        GameState.setTrueEndUnlocked(false);
        
        GameTools.typeText("Reality reshapes itself around you...");
        GameTools.typeText("Ed3 energy courses through your being!");
        GameTools.delay(2);
        GameTools.clearScreen();
    }
    
    // Return to main menu
    private static void returnToMainMenu() {
        GameTools.typeText("\nReturning to main menu...");
        GameTools.delay(2);
        // This would typically call your main menu method
        // MainMenu.show();
    }
}
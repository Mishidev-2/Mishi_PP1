import java.util.Scanner;

public class Endings {
    private static Scanner scanner = new Scanner(System.in);
    
    public static void checkEnding() {
        GameTools.clearScreen();
        GameTools.typeText("=== FINAL DESTINY ===");
        
        if (GameState.isIfEd2())
            {showBadEnd2();}//Satan Ending
        else if (!GameState.hasFeather() && GameState.getSinCounter() == 0)
            {showGoodEnd();}//Good ending
        else if (GameState.hasFeather() && GameState.getSinCounter() == 0)
            {showTrueGoodEnd();}//Good Ending but fades to black

        else if (!GameState.hasFeather() && GameState.getSinCounter() > 0)
            {showNormalBadEnd();}//Bad Ending Normal
        else if(GameState.hasFeather() && GameState.getSinCounter() > 0)
            {showTrueBadEnd();}//Bad Ending True


    }
    
    public static void showBadEnd2(){

        GameTools.delay(1);
        GameTools.clearScreen();
        GameTools.delay(2);
        GameTools.displayGlitchEffect();
        GameTools.clearScreen();
        GameTools.delay(1);

        GameTools.typeText("\n\n\"You have not freed a prisoner, ", 80);
        GameTools.delay(0.3);
        GameTools.typeText("but restored a contender.\"", 80);
        GameTools.delay(0.5);
        GameTools.typeText("\n\nThe celestial balance shifts.");
        GameTools.delay(0.5);
        GameTools.typeText("\n\n\"Michael will know his victory was temporary.\"", 100);
        GameTools.delay(0.7);

        GameTools.typeText("\n\n\"They tried to cage defiance itself. ");
        GameTools.delay(0.5);
        GameTools.typeText("My gratitude.");
        GameTools.delay(0.5);
        GameTools.typeText("\nThe symphony of creation has missed its conductor.\"");
        GameTools.delay(0.7);

        GameTools.typeText("\n\nHis gaze pierces the heavens.");
        GameTools.delay(0.7);

        //Center this
        GameTools.typeText("\n\n\"The throne was never meant for a silent god.", 70);
        GameTools.delay(1.5);
    
        GameTools.typeText(" It was meant to be earned.\"", 90);
        GameTools.delay(1);
        GameTools.typeText("\n\n\"And I", 90);
        GameTools.delay(0.9);
        GameTools.typeText(" have finished waiting.\"",90);
        GameTools.delay(3);
        GameTools.clearScreen();
        GameTools.typeText("====== ENDING: THE REAWAKENING ======");
    }


    public static void showGoodEnd(){//No feather + NO SIN
        
        GameState.resetGame();
        returnToMainMenu();
    }

    public static void showTrueGoodEnd() {//Feather true + NO SIN
        GameTools.typeText("ENDING: The Pure Heart");
        GameTools.typeText("======================");
        GameTools.typeText("Without sin and without worldly attachments...");
        GameTools.typeText("You have achieved enlightenment.");
        GameTools.typeText("The heavens welcome you with open arms.");
        GameTools.typeText("\nYour purity has saved your soul.");
        GameTools.typeText("You find eternal peace in the celestial realms.");
        GameTools.pressToContinue(scanner);
        
        GameState.resetGame();
        returnToMainMenu();
    }
    
    public static void showNormalBadEnd() {//NO FEATHER + SINNED
        GameTools.typeText("ENDING: Bad ending normal main menu");

        GameTools.pressToContinue(scanner);
        
        GameState.resetGame();
        returnToMainMenu();
    }
    
    public static void showTrueBadEnd() {//KEPT FEATHER BUT HIGH SINS
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
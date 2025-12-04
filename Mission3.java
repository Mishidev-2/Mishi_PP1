import java.util.Scanner;

public class Mission3 {
    private static Scanner scanner = new Scanner(System.in);
    
    public static void start() {
        GameTools.clearScreen();
        GameTools.typeText("===== The Last Circle =====");
        GameTools.typeText("Welcome, " + GameState.getPlayerName() + "!");
        
        // Scene 1
        GameTools.typeText("\nScene 1: The journey continues...");
        GameTools.typeText("You find yourself in a mysterious new realm.");
        GameTools.pressToContinue(scanner);
        
        // Scene 2
        GameTools.typeText("\nScene 2: A pivotal moment approaches...");
        GameTools.typeText("The air feels different here, charged with energy.");
        GameTools.pressToContinue(scanner);
        
        // Scene 3
        GameTools.typeText("\nScene 3: The path remains shrouded in mystery...");
        GameTools.typeText("You must rely on your instincts.");
        GameTools.typeText("Every choice feels like a gamble in this unfamiliar place.");
        GameTools.pressToContinue(scanner);
        
        // Choice 1
        boolean choiceCompleted = false;
        while (!choiceCompleted) {
            GameTools.clearScreen();
            GameTools.typeText("=== CRITICAL CHOICE ===");
            GameTools.typeText("Current State:");
            GameTools.typeText("- Status Effect Taint: " + GameState.hasStatusEffectTaint());
            GameTools.typeText("- Has Feather: " + GameState.hasFeather()); // This will show false at start
            GameTools.typeText("- Sin Counter: " + GameState.getSinCounter());
            
            GameTools.typeText("\nChoose your path:");
            System.out.println("1. Path of Purity - Cleanse the taint and gain the feather");
            System.out.println("2. Path of Renewal - Reset everything and start over");
            System.out.println("3. Path of Knowledge - Solve the riddle of doubt");
            System.out.print("Enter your choice (1, 2, or 3): ");
            
            String choice = scanner.nextLine();
            
            switch (choice) {
                case "1":
                    handleChoice1();
                    choiceCompleted = true;
                    break;
                case "2":
                    handleChoice2();
                    return; // Return to Mission 1
                case "3":
                    choiceCompleted = handleChoice3();
                    break;
                default:
                    GameTools.typeText("Invalid choice. Please enter 1, 2, or 3.");
                    GameTools.delay(2);
            }
        }
        
        GameTools.typeText("\nMission 3 completed!");
        GameState.displayState();
        GameTools.pressToContinue(scanner);
    }
    
    private static void handleChoice1() {
        GameTools.typeText("\nYou chose the Path of Purity...");
        GameState.setStatusEffectTaint(false);
        GameState.setHasFeather(true); // NOW you get the feather!
        GameTools.typeText("The taint has been cleansed from your spirit.");
        GameTools.typeText("A mystical feather materializes and attaches to you.");
        GameTools.typeText("Status Effect Taint is now: " + GameState.hasStatusEffectTaint());
        GameTools.typeText("You now have the feather: " + GameState.hasFeather());
        GameTools.pressToContinue(scanner);
    }
    
    private static void handleChoice2() {
        GameTools.typeText("\nYou chose the Path of Renewal...");
        GameTools.typeText("Everything fades to white...");
        GameTools.typeText("Your journey resets completely.");
        GameTools.delay(3);
        
        // Reset game state and return to Mission 1
        GameState.resetGame();
        GameTools.typeText("Returning to the beginning...");
        GameTools.delay(2);
        Mission1.start();
    }
    
    private static boolean handleChoice3() {
        GameTools.typeText("\nYou chose the Path of Knowledge...");
        GameTools.typeText("A mysterious voice speaks: 'Answer my riddle...'");
        GameTools.typeText("'I am often felt but never seen,");
        GameTools.typeText("I can paralyze the keen.");
        GameTools.typeText("I live in questions, not in answers,");
        GameTools.typeText("And grow in uncertain circumstances.'");
        
        String[] riddleKeywords = {"doubt", "uncertainty", "skepticism", "hesitation", "distrust"};
        int attempts = 0;
        boolean riddleSolved = false;
        
        while (attempts < 2 && !riddleSolved) {
            System.out.print("\nYour answer (attempt " + (attempts + 1) + "/2): ");
            String answer = scanner.nextLine();
            
            if (GameTools.checkRiddleAnswer(answer, riddleKeywords)) {
                riddleSolved = true;
                if (attempts == 0) {
                    GameTools.typeText("Correct on first try! Your wisdom shines.");
                    GameState.setStatusEffectTaint(false);
                    // hasFeather remains false (no change)
                    GameTools.typeText("The taint is cleansed but you gain no feather.");
                } else {
                    GameTools.typeText("Correct! Better late than never.");
                    GameState.setStatusEffectTaint(false);
                    // hasFeather remains false (no change)
                    GameTools.typeText("The taint is gone but the feather remains elusive.");
                }
                GameTools.typeText("Status Effect Taint: " + GameState.hasStatusEffectTaint());
                GameTools.typeText("Has Feather: " + GameState.hasFeather());
                GameTools.pressToContinue(scanner);
            } else {
                attempts++;
                if (attempts == 1) {
                    GameTools.typeText("Wrong! The voice gives you one more chance...");
                } else {
                    GameTools.typeText("Wrong again! The voice whispers a hint: 'do__t'");
                    GameTools.typeText("Your failure has consequences...");
                    GameTools.delay(2);
                    
                    // Reset and return to Mission 1
                    GameState.resetGame();
                    GameTools.typeText("Everything fades away...");
                    GameTools.delay(2);
                    GameTools.typeText("Returning to Mission 1...");
                    GameTools.delay(2);
                    GameState.resetGame();
                    Mission1.start();
                    return false; // Mission failed, don't continue Mission 3
                }
            }
        }
        
        return true; // Riddle solved, continue Mission 3
    }
}
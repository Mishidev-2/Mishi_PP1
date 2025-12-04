import java.util.Scanner;

public class MainFile {
   private static Scanner scanner = new Scanner(System.in);
    
   public static void main(String[] args) {
      boolean running = true;
        
      while (running) {
         GameTools.clearScreen();
         System.out.println("===== MAIN MENU =====");
         System.out.println("1. New Game");
         System.out.println("2. Mission Select - Debug");
         System.out.println("3. Quit");
         System.out.print("Choose an option: ");
            
         String choice = scanner.nextLine();
            
         switch (choice) {
            case "1":
                    // New Game: Reset to default and start from Mission 1
               GameState.resetGame();
               startNewGame();
               break;
            case "2":
               GameState.resetGame();
               missionSelect();
               break;
            case "3":
               running = false;
               GameTools.typeText("Deconceptualizing...");
               break;
            default:
               GameTools.typeText("Invalid option. Please try again.");
               GameTools.delay(1);
         }
      }
      scanner.close();
   }
    
   private static void startNewGame() {
        // Start with Mission 1 and progress through missions naturally
      Mission1.start();
      
      // Check if True End was unlocked after Mission 1
      if (GameState.isTrueEndUnlocked()) {
         // If True End unlocked, go to secret mission instead of Mission 2
         Unnamed.start();
      } else {
         // Otherwise continue normal progression
         Mission2.start();
         Mission3.start();
         Mission4.start();
      }
   }
    
   private static void missionSelect() {
      GameTools.clearScreen();
      System.out.println("=== MISSION SELECT ===");
      System.out.println("1. Void");
      System.out.println("2. Hell");
      System.out.println("3. The Last Circle");
      System.out.println("4. Cocyutus");
      System.out.println("5. Back to Main Menu");
      System.out.print("Choose a mission: ");
        
      String choice = scanner.nextLine();
        
      switch (choice) {
         case "1":
                // Mission 1: Only needs name and ifEd3
            GameState.resetGame();
            configureMission1State();
            Mission1.start();
            break;
         case "2":
                // Mission 2: Only needs name
            configureMission2State();
            Mission2.start();
            break;
         case "3":
                // Mission 3: Only needs name and sinCount
            configureMission3State();
            Mission3.start();
            break;
         case "4":
                // Mission 4: Only needs sinCount, name and, feather status
            configureMission4State();
            Mission4.start();
            break;
         case "5":
                // Return to main menu
            break;
         default:
            GameTools.typeText("Invalid mission selection.");
            GameTools.pressToContinue(scanner);
      }
   }
    
   private static void configureMission1State() {
      GameTools.clearScreen();
      GameTools.typeText("===== Void Config =====\n\n");
        
        // Reset game state first
      GameState.resetGame();
        
        // Set name
      GameTools.typeText("Enter your name:\n");
      System.out.print("Name: ");
      String name = scanner.nextLine();
      if (!name.trim().isEmpty()) {
         GameState.setPlayerName(name);
      }
        
        // Set ifEd3
      GameTools.typeText("\nSet ifEd3 status:");
      System.out.println("\n1. ifEd3 = true");
      System.out.println("2. ifEd3 = false");
      System.out.print("\nChoose (1 or 2): ");
      String edChoice = scanner.nextLine();
      GameState.setIfEd3(edChoice.equals("1"));
        
      GameTools.typeText("\nConfiguration complete!");
      GameTools.typeText("\nName: " + GameState.getPlayerName());
      GameTools.typeText("\nifEd3: " + GameState.isIfEd3());
      GameTools.typeText("\n\nConceptualizing...");
      GameTools.delay(2);
   }
    
   private static void configureMission2State() {
      GameTools.clearScreen();
      GameTools.typeText("===== Hell Config =====\n\n");
        
        // Reset game state first
      GameState.resetGame();
        
        // Mission 2: Only needs name
      GameTools.typeText("Enter your name: ");
      String name = scanner.nextLine();
      if (!name.trim().isEmpty()) {
         GameState.setPlayerName(name);
      }
        
        // Mission 2 defaults
      GameState.setStatusEffectTaint(false); // Mission 2 always has taint active
      GameState.setIfEd3(false); // Default to false for Mission 2
        
      GameTools.typeText("\nConfiguration complete!");
      GameTools.typeText("\nName: " + GameState.getPlayerName());
      GameTools.typeText("\n\nEntering Hell...");
      GameTools.delay(2);
   }
    
   private static void configureMission3State() {
      GameTools.clearScreen();
      GameTools.typeText("=== MISSION 3 CONFIGURATION ===");
    
        // Reset game state first
      GameState.resetGame();
    
        // Set name
      GameTools.typeText("Enter your name:");
      System.out.print("Name: ");
      String name = scanner.nextLine();
      if (!name.trim().isEmpty()) {
         GameState.setPlayerName(name);
      }
    
        // Set sin count (0-2) with direct input
      GameTools.typeText("\nSet sin counter (0 to 2):");
      System.out.print("Enter sin count (0 - 2): ");
      String sinInput = scanner.nextLine();
   
      int sinCount = 0;
      try {
         sinCount = Integer.parseInt(sinInput);
      } catch (Exception e) {
         // Default to 0 if invalid
      }
      if (sinCount < 0 || sinCount > 2) {
         System.out.print("\nInvalid: Defaulting to Zero\n");
         sinCount = 0;
      }
      GameState.setSinCounter(sinCount);
    
        // Mission 3 defaults
      GameState.setStatusEffectTaint(true); // Mission 3 starts with taint active
      GameState.setHasFeather(false); // Mission 3 starts WITHOUT feather
      GameState.setIfEd3(false); // Default to false for Mission 3
    
      GameTools.typeText("\nConfiguration complete!");
      GameTools.typeText("Name: " + GameState.getPlayerName());
      GameTools.typeText("Sin Counter: " + GameState.getSinCounter());
      GameTools.typeText("Status Effect Taint: " + GameState.hasStatusEffectTaint());
      GameTools.typeText("Breaking Reality...");
      GameTools.delay(2);
   }
    
   private static void configureMission4State() {
      GameTools.clearScreen();
      GameTools.typeText("=== Last Circle Config ===");
    
    // Reset game state first
      GameState.resetGame();
    
    // Set name
      GameTools.typeText("Enter your name:");
      System.out.print("Name: ");
      String name = scanner.nextLine();
      if (!name.trim().isEmpty()) {
         GameState.setPlayerName(name);
      }
    
    // Set sin count (0-2) with direct input
      GameTools.typeText("\nSet sin counter (0 to 2):");
      System.out.print("Enter sin count (0-2): ");
      String sinInput = scanner.nextLine();
    
      int sinCount = 0;
      try {
         sinCount = Integer.parseInt(sinInput);
      } catch (Exception e) {
        // Default to 0 if invalid
      }
      if (sinCount < 0 || sinCount > 2) {
         System.out.print("\nInvalid: Defaulting to Zero\n");
         sinCount = 0;
      }
      GameState.setSinCounter(sinCount);
    
    // Set feather status
      GameTools.typeText("\nSet feather status:");
      System.out.println("1. Has Feather = true");
      System.out.println("2. Has Feather = false");
      System.out.print("Choose (1 or 2): ");
      String featherChoice = scanner.nextLine();
      GameState.setHasFeather(featherChoice.equals("1"));
    
    // Mission 4 defaults
      GameState.setStatusEffectTaint(true); // Mission 4 has taint active
      GameState.setIfEd3(false); // Default to false for Mission 4
    
      GameTools.typeText("\nConfiguration complete!");
      GameTools.typeText("Name: " + GameState.getPlayerName());
      GameTools.typeText("Sin Counter: " + GameState.getSinCounter());
      GameTools.typeText("Has Feather: " + GameState.hasFeather());
      GameTools.typeText("Fighting the Heavens...");
      GameTools.delay(2);
   }
}
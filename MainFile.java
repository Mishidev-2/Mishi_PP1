import java.util.Scanner;

public class MainFile {
  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    boolean running = true;
    while (running) {
      GameTools.clearScreen();
      System.out.println("===== THE BROKEN PARADIGM =====");
      System.out.println("1. New Game");
      System.out.println("2. Mission Select - Debug");
      System.out.println("3. Quit");
      System.out.print("Choose an option: ");

      String choice = scanner.nextLine();

      switch (choice) {
        case "1" -> {
          // New Game: Reset to default and start from Mission 1
          GameState.resetGame();
          runGameSequence();
        }
        case "2" -> {
          GameState.resetGame();
          missionSelect();
        }
        case "3" -> {// Close
          running = false;
          GameTools.typeText("Deconceptualizing...");
        }
        default -> {
          GameTools.typeText("Invalid option. Please try again.");
          GameTools.delay(1);
        }
      }
    }
    scanner.close();
  }

  public static void runGameSequence() {
    Mission1.start();

    if (GameState.isIfEd3()) {
      Unnamed.start();
    } else {
      Mission2.start();
      boolean survivedM3 = Mission3.start();
      // Enables the death scene thingy
      if (!survivedM3) {
        return;
      }

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
      case "1" -> {
        // Mission 1: Only needs ifEd3
        GameState.resetGame();
        configureMission1State();
        runGameSequence();
      }
      case "2" -> {
        // Mission 2: Only needs name
        configureMission2State();
        Mission2.start();
        if (Mission3.start()) {
          Mission4.start();
        }
      }
      case "3" -> {
        // Mission 3: Only needs name and sinCount
        configureMission3State();
        if (Mission3.start()) {
          Mission4.start();
        }
      }
      case "4" -> {
        // Mission 4: Only needs sinCount, name and, feather status
        configureMission4State();
        Mission4.start();
      }
      case "5" -> {
      }
      default -> {
        GameTools.typeText("Invalid mission selection.");
        GameTools.pressToContinue(scanner);
      }
    }
    // Return to main menu
  }

  private static void configureMission1State() {
    GameTools.clearScreen();
    GameTools.typeText("===== Void Config =====\n\n");

    // Reset game state first
    GameState.resetGame();

    // Set ifEd3
    GameTools.typeText("\nSet ifEd3 status:");
    System.out.println("\n1. ifEd3 = true");
    System.out.println("2. ifEd3 = false");
    System.out.print("\nChoose (1 or 2): ");
    String edChoice = scanner.nextLine();
    GameState.setIfEd3(edChoice.equals("1"));

    GameTools.typeText("\nConfiguration complete!");
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
    GameState.setStatusEffectTaint(false);

    GameTools.typeText("\nConfiguration complete!");
    GameTools.typeText("\nName: " + GameState.getPlayerName());
    GameTools.typeText("\n\nEntering Hell...");
    GameTools.delay(2);
  }

  private static void configureMission3State() {
    GameTools.clearScreen();
    GameTools.typeText("=== The Final Circle Config ===\n\n");

    // Reset game state first
    GameState.resetGame();

    // Set name
    GameTools.typeText("Enter your name: ");
    String name = scanner.nextLine();
    if (!name.trim().isEmpty()) {
      GameState.setPlayerName(name);
    }

    int sinCount;

    while (true) { // Loop forever until we hit 'break'
      GameTools.typeText("\nSet sin counter (0 to 2): ");

      String sinInput = scanner.nextLine().trim();

      // empty input
      if (sinInput.isEmpty()) {
        System.out.println("Input cannot be empty. Try again.");
        continue; // skip and loop
      }

      try {
        sinCount = Integer.parseInt(sinInput);

        // Valid Range Check
        if (sinCount >= 0 && sinCount <= 2) {
          GameState.setSinCounter(sinCount);
          break; // stops loop
        } else {
          System.out.println("Error: Number must be 0, 1, or 2.");
        }

      } catch (NumberFormatException e) {
        // invalid outputs
        System.out.println("Error: '" + sinInput + "' is not a number.");
      }
    }

    // Mission 3 defaults
    GameState.setStatusEffectTaint(true); // Mission 3 starts with taint active
    GameState.setHasFeather(false); // Mission 3 starts WITHOUT feather

    GameTools.typeText("\nConfiguration complete!");
    GameTools.typeText("\n\nName: " + GameState.getPlayerName());
    GameTools.typeText("\nSin Counter: " + GameState.getSinCounter());
    GameTools.typeText("\nStatus Effect Taint: " + GameState.hasStatusEffectTaint());
    GameTools.typeText("\n\nBreaking Reality...");
    GameTools.delay(2);
  }

  private static void configureMission4State() {
    GameTools.clearScreen();
    GameTools.typeText("=== Cocyutus Config ===\n\n");

    // Reset game state first
    GameState.resetGame();

    // Set name
    GameTools.typeText("Enter your name: ");
    String name = scanner.nextLine();
    if (!name.trim().isEmpty()) {
      GameState.setPlayerName(name);
    }

    int sinCount;

    while (true) { // Loop forever until we hit 'break'
      GameTools.typeText("\nSet sin counter (0 to 2): ");

      String sinInput = scanner.nextLine().trim();

      // empty input
      if (sinInput.isEmpty()) {
        System.out.println("Input cannot be empty. Try again.");
        continue; // skip and loop
      }

      try {
        sinCount = Integer.parseInt(sinInput);

        // Valid Range Check
        if (sinCount >= 0 && sinCount <= 2) {
          GameState.setSinCounter(sinCount);
          break; // stops loop
        } else {
          System.out.println("Error: Number must be 0, 1, or 2.");
        }

      } catch (NumberFormatException e) {
        // invalid outputs
        System.out.println("Error: '" + sinInput + "' is not a number.");
      }
    }

    // Set feather status
    GameTools.typeText("\nSet feather status:");
    GameTools.typeText("\n[1] Has Feather = true");
    GameTools.typeText("\n[2] Has Feather = false");
    GameTools.typeText("\nChoose (1 or 2): ");
    String featherChoice = scanner.nextLine();
    GameState.setHasFeather(featherChoice.equals("1"));

    // Mission 4 defaults
    GameState.setStatusEffectTaint(true); // Mission 4 has taint active

    GameTools.typeText("\nConfiguration complete!");
    GameTools.typeText("\nName: " + GameState.getPlayerName());
    GameTools.typeText("\nSin Counter: " + GameState.getSinCounter());
    GameTools.typeText("\nHas Feather: " + GameState.hasFeather());
    GameTools.typeText("\n\nFighting the Heavens...");
    GameTools.delay(2);
  }
}
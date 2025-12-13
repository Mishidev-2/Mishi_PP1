import java.util.Scanner;

public class MainFile {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        showMainMenu();
    }

    public static void showMainMenu() {
      GameTools.showTitleCard(scanner);  
      boolean running = true;
        
        while (running) {
            GameTools.clearScreen();
            System.out.println(ConsoleColors.YELLOW_BOLD + "======== THE BROKEN PARADIGM ========" + ConsoleColors.RESET);
            System.out.println("1. New Game");
            System.out.println("2. Settings"); // SKIP FEATURE
            System.out.println("3. Mission Select - Debug");
            System.out.println("4. Quit");
            System.out.print("Choose an option: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1" -> {
                    GameState.resetGame();
                    runGameSequence();
                }
                case "2" -> {
                    // SETTINGS MENU
                    toggleSettings();
                }
                case "3" -> {
                    GameState.resetGame();
                    missionSelect();
                }
                case "4" -> {
                    running = false;
                    GameTools.typeText("Deconceptualizing...", ConsoleColors.PURPLE);
                    System.exit(0); 
                }
                default -> {
                    GameTools.typeText("Invalid option. Please try again.", ConsoleColors.RED);
                    GameTools.delay(1);
                }
            }
        }
    }

    private static void toggleSettings() {
        boolean inSettings = true;
        while(inSettings) {
            GameTools.clearScreen();
            System.out.println(ConsoleColors.WHITE_BOLD + "========== SETTINGS ===========" + ConsoleColors.RESET);
            
            String status = GameState.isInstantText() ? ConsoleColors.GREEN + "ON" + ConsoleColors.RESET : ConsoleColors.RED + "OFF" + ConsoleColors.RESET;
            System.out.println("1. Instant Text: [" + status + "]");
            System.out.println("2. Back");
            System.out.print("Choose: ");
            
            String input = scanner.nextLine();
            
            if (input.equals("1")) {
                GameState.setInstantText(!GameState.isInstantText()); // Toggle
            } else if (input.equals("2")) {
                inSettings = false;
            }
        }
    }

    public static void runGameSequence() {
        Mission1.start();
        if (GameState.isIfEd3()) {
            Unnamed.start();
        } else {
            Mission2.start();
            boolean survivedM3 = Mission3.start();
            if (!survivedM3) { return; }
            Mission4.start();
        }
    }

    private static void missionSelect() {
        GameTools.clearScreen();
        System.out.println(ConsoleColors.CYAN + "========== MISSION SELECT ===========" + ConsoleColors.RESET);
        System.out.println("1. Void");
        System.out.println("2. Hell");
        System.out.println("3. The Last Circle");
        System.out.println("4. Cocyutus");
        System.out.println("5. Back to Main Menu");
        System.out.print("Choose a mission: ");

        String choice = scanner.nextLine();

        switch (choice) {
            case "1" -> {
                GameState.resetGame();
                configureMission1State();
                runGameSequence();
            }
            case "2" -> {
                configureMission2State();
                Mission2.start();
                if (Mission3.start()) {
                    Mission4.start();
                }
            }
            case "3" -> {
                configureMission3State();
                if (Mission3.start()) {
                    Mission4.start();
                }
            }
            case "4" -> {
                configureMission4State();
                Mission4.start();
            }
            case "5" -> { }
            default -> {
                GameTools.typeText("Invalid mission selection.");
                GameTools.pressToContinue(scanner);
            }
        }
    }

    private static void configureMission1State() {
        GameTools.clearScreen();
        GameTools.typeText("=========== VOID CONFIG =============\n\n", ConsoleColors.PURPLE);
        GameState.resetGame();
        
        GameTools.typeText("\nSet ifEd3 status:");
        System.out.println("\n1. ifEd3 = true");
        System.out.println("2. ifEd3 = false");
        System.out.print("\nChoose (1 or 2): ");
        String edChoice = scanner.nextLine();
        GameState.setIfEd3(edChoice.equals("1"));
        
        GameTools.typeText("\nConfiguration complete!");
        GameTools.typeText("\nifEd3: " + GameState.isIfEd3());
        GameTools.typeText("\n\nConceptualizing...", ConsoleColors.PURPLE);
        GameTools.delay(2);
    }

    private static void configureMission2State() {
        GameTools.clearScreen();
        GameTools.typeText("=========== HELL CONFIG =============\n\n", ConsoleColors.RED);
        GameState.resetGame();
        
        GameTools.typeText("Enter your name: ");
        String name = scanner.nextLine().trim();
        if (name.isEmpty()) {
            GameState.setPlayerName("Lucifer");
            GameTools.typeText("\nDefault: Lucifer\n");
        } else {
          GameState.setPlayerName(name);
        }
        
        GameState.setStatusEffectTaint(false);
        GameTools.typeText("\nConfiguration complete!");
        GameTools.typeText("\nName: " + GameState.getPlayerName());
        GameTools.typeText("\n\nEntering Hell...", ConsoleColors.RED);
        GameTools.delay(2);
    }

    private static void configureMission3State() {
        GameTools.clearScreen();
        GameTools.typeText("====== THE FINAL CIRCLE CONFIG ======\n\n", ConsoleColors.CYAN);
        GameState.resetGame();

        GameTools.typeText("Enter your name: ");
        String name = scanner.nextLine().trim();
        if (name.isEmpty()) {
            GameState.setPlayerName("Lucifer");
            GameTools.typeText("\nDefault: Lucifer\n");
        } else {
          GameState.setPlayerName(name);
        }

        int sinCount;
        while (true) { 
            GameTools.typeText("\nSet sin counter (0 to 2): ");
            String sinInput = scanner.nextLine().trim();

            if (sinInput.isEmpty()) {
                System.out.println("Input cannot be empty. Try again.");
                continue; 
            }

            try {
                sinCount = Integer.parseInt(sinInput);
                if (sinCount >= 0 && sinCount <= 2) {
                    GameState.setSinCounter(sinCount);
                    break; 
                } else {
                    System.out.println("Error: Number must be 0, 1, or 2.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: '" + sinInput + "' is not a number.");
            }
        }

        GameState.setStatusEffectTaint(true);
        GameState.setHasFeather(false);

        GameTools.typeText("\nConfiguration complete!");
        GameTools.typeText("\nName: " + GameState.getPlayerName());
        GameTools.typeText("\nSin Counter: " + GameState.getSinCounter());
        GameTools.typeText("\nStatus Effect Taint: " + GameState.hasStatusEffectTaint());
        GameTools.typeText("\n\nBreaking Reality...", ConsoleColors.CYAN);
        GameTools.delay(2);
    }

    private static void configureMission4State() {
        GameTools.clearScreen();
        GameTools.typeText("========== COCYUTUS CONFIG ==========\n\n", ConsoleColors.CYAN_BOLD);
        GameState.resetGame();

        GameTools.typeText("Enter your name: ");
        String name = scanner.nextLine().trim();
        if (name.isEmpty()) {
            GameState.setPlayerName("Lucifer");
            GameTools.typeText("\nDefault: Lucifer\n");
        } else {
          GameState.setPlayerName(name);
        }

        int sinCount;
        while (true) { 
            GameTools.typeText("\nSet sin counter (0 to 2): ");
            String sinInput = scanner.nextLine().trim();

            if (sinInput.isEmpty()) {
                System.out.println("Input cannot be empty. Try again.");
                continue; 
            }

            try {
                sinCount = Integer.parseInt(sinInput);
                if (sinCount >= 0 && sinCount <= 2) {
                    GameState.setSinCounter(sinCount);
                    break; 
                } else {
                    System.out.println("Error: Number must be 0, 1, or 2.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: '" + sinInput + "' is not a number.");
            }
        }

        OUTER:
        while (true) {
            GameTools.typeText("\nSet feather status:");
            GameTools.typeText("\n[1] Has Feather = true");
            GameTools.typeText("\n[2] Has Feather = false");
            System.out.print("\nChoose (1 or 2): ");
            String featherChoice = scanner.nextLine().trim();
            switch (featherChoice) {
                case "1" -> {
                    GameState.setHasFeather(true);
                    break OUTER; 
                }
                case "2" -> {
                    GameState.setHasFeather(false);
                    break OUTER; 
                }
                default -> System.out.println("Invalid input. Please enter '1' or '2'.");
            }
        }

        GameState.setStatusEffectTaint(true); 
        
        GameTools.typeText("\nConfiguration complete!");
        GameTools.typeText("\nName: " + GameState.getPlayerName());
        GameTools.typeText("\nSin Counter: " + GameState.getSinCounter());
        GameTools.typeText("\nHas Feather: " + GameState.hasFeather());
        GameTools.typeText("\n\nFighting the Heavens...", ConsoleColors.YELLOW);
        GameTools.delay(2);
    }
}
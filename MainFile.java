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
            System.out.println("3. Message");
            System.out.println("4. Mission Select - Debug");
            System.out.println("5. Quit");
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
                    Message();
                }

                case "4" -> {
                    GameState.resetGame();
                    missionSelect();
                }
                case "5" -> {
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
        boolean inmission = true;


        while(inmission){
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
                case "5" -> {
                    inmission = false;
                }
                default -> {
                
                }
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

    private static void Message(){
        boolean inMessage = true;
        while(inMessage){

            GameTools.clearScreen();
            System.out.println(ConsoleColors.GREEN+ "========== MESSAGE ===========" + ConsoleColors.RESET);
            GameTools.delay(2);
            GameTools.clearScreen();
            GameTools.typeText("To Sir Tupas,");GameTools.delay(1);

            GameTools.typeText("\n\nGood day/night sir, this is our output:");
            GameTools.typeText(" at its simplest form, it is a story game inside the console with");
            GameTools.typeText("\ndifferent endings depending on the choices you make (6 endings in total!).");
            GameTools.delay(0.7);
            GameTools.typeText("\nSince this game is very dialogue heavy -");
            GameTools.typeText(" if you only wish to test it,");
            GameTools.typeText("\nI recommend you turn on the instant text in the settings ");
            GameTools.typeText("\nBut for the full experience, I suggest you keep it like that and maybe play through one of the endings at least -");
            GameTools.typeText("\nI had a lot of fun writing the plot.");
            GameTools.typeText("\n\nThere were some bugs; sometimes the same thing would print over again,");
            GameTools.typeText(" but It rarely happens -\nmight be a bug from the IDE itself or something.");
            GameTools.typeText("\n\nMaybe I should've done this in a jframe or whatever like the other guys, ");
            GameTools.typeText("\nbut I didn't really want to rely on AI too much so I just winged it.");
            GameTools.typeText("\n\nI hope you enjoy the output,");
            GameTools.typeText(" even if it is a bit underwhelming compared to the rest - as I have seen,");
            GameTools.typeText("\nmost if not all of them were doing GUIs and stuff. ");
            GameTools.delay(0.7);
            GameTools.typeText("\n\nI also just wanted to thank you for everything you have done for us,");
            GameTools.typeText(" \nI actually had no prior experience in coding whatsoever before I came to your class,");
            GameTools.typeText("\nwhich is why I am so thankful for the beginner-friendly way you taught us,");
            GameTools.typeText("\nbecause of this I have learned so much, and was also inspired to do some advance learning.");
            GameTools.typeText("\nFor the first time in a while,");
            GameTools.typeText(" I was actually enjoying the process of learning,");
            GameTools.typeText(" so for this I thank you.");
            
            GameTools.typeText("\n\nThank you sir for being our PP1 professor!");
            GameTools.delay(1);

            boolean inchoice = true;
            while(inchoice){         
            System.out.println("\n\n[1] Go Back");
            System.out.print("Choose: ");
            String input = scanner.nextLine();

                if (input.equals("1")){
                    inchoice = false;
                    inMessage = false;
                } else{
                System.out.println("Invalid Output");
                }
            }

        }

    }

}
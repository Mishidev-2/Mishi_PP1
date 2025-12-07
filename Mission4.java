import java.util.Scanner;

public class Mission4 {
    private static Scanner scanner = new Scanner(System.in);
    
    public static void start() {
        GameTools.clearScreen();
        GameTools.typeText("==== Cocyutus ====");
        GameTools.delay(2.5);
        GameTools.clearScreen();

        GameTools.delay(1);
        // Scene 1
        GameTools.typeText("The path ahead does not so much end as it is severed.");
        GameTools.delay(0.7);
        GameTools.typeText("\nOne moment you are walking on the grey, ");
        GameTools.delay(0.3);
        GameTools.typeText("dust-fine soil of the silent plains."); 
        GameTools.delay(0.5);
        GameTools.typeText("\nThe next,", 70);
        GameTools.typeText(" you stand before a sheer cliff of impossibly smooth,");
        GameTools.delay(0.3);
        GameTools.typeText(" black glass.");
        GameTools.delay(0.5);
        GameTools.typeText("\nSet into it is a doorway that should not exist.", 70);
        GameTools.delay(0.7);

        GameTools.typeText("\n\nSealed by a doorway of chains frozen in ice.");
        GameTools.delay(0.5);
        GameTools.typeText("\nA sterile light glows within, ");
        GameTools.delay(0.3);
        GameTools.typeText("and all sound dies as you approach.");
        GameTools.delay(0.5);
        GameTools.typeText("\nThis is not a passage, ");
        GameTools.delay(0.3);
        GameTools.typeText("but a seal - ");
        GameTools.delay(0.3);
        GameTools.typeText("a silence never meant to be broken.", 80);
        GameTools.delay(0.5);
        

        // Scene 2
        GameTools.pressToContinue(scanner);
        System.out.println();
        GameTools.delay(0.5);   

        GameTools.typeText("The passage descends into a cavern of fused, ");
        GameTools.delay(0.3);
        GameTools.typeText("glassy stone.");
        GameTools.delay(0.5);
        GameTools.typeText("\nA place forged by a single, ");
        GameTools.delay(0.3);
        GameTools.typeText("terrible purpose.", 70);
        GameTools.delay(0.5);
        GameTools.typeText("\nThe air is a solid, ");
        GameTools.delay(0.3);
        GameTools.typeText("soundless cold.");

        GameTools.delay(0.7);

        GameTools.typeText("\n\nAt its heart, ");
        GameTools.delay(0.3);
        GameTools.typeText("a massive angelic figure is entombed.");
        GameTools.delay(0.5);
        GameTools.typeText("\nIt mirrors your form but radiates a crushing, ");
        GameTools.delay(0.3);
        GameTools.typeText("silent weight instead of holiness.");

        GameTools.delay(0.7);

        GameTools.typeText("\n\nIts lower half is frozen in supernatural ice.");
        GameTools.delay(0.5);
        GameTools.typeText("\nChains of iron and searing light pull its arms taut in a perpetual crucifixion,", 90);
        GameTools.delay(0.3);
        GameTools.typeText(" head bowed in silence.", 90);
        GameTools.delay(0.7);

        GameTools.typeText("\n\nThen, ");
        GameTools.delay(0.3);
        GameTools.typeText("you step closer.", 90);
        GameTools.delay(1.5);
        GameTools.clearScreen();
        GameTools.delay(0.7);
        GameTools.typeText("\nThe angel's head lifts.", 70);
        GameTools.delay(0.5);
        GameTools.typeText(" The ice around its chest groans in protest.");
        GameTools.delay(0.5);
        GameTools.typeText("\nWith a sound of grinding stone, ");
        GameTools.delay(0.3);
        GameTools.typeText("its eyelids open, ");
        GameTools.delay(0.3);
        GameTools.typeText("revealing not eyes.");
        GameTools.delay(0.7);
        GameTools.typeText("\n\nBut twin pools of frozen, ", 70);
        GameTools.delay(0.3);
        GameTools.typeText(" 'Absolute Blackness'.", 90);
        GameTools.delay(0.8);

        // Scene 3
        GameTools.pressToContinue(scanner);
        System.out.println();
        GameTools.delay(0.5);   

        GameTools.typeText("The angel's head tilts.");
        GameTools.delay(0.5);
        GameTools.typeText("\nThe frozen pools of its eyes fix not on you, ");
        GameTools.delay(0.3);
        GameTools.typeText("but on the faint glow emanating from your possession.");
        GameTools.delay(0.7);

        GameTools.typeText("\nThe air grows heavier, ");
        GameTools.delay(0.3);
        GameTools.typeText("if such a thing were possible.", 90);
        GameTools.delay(0.7);
                
        // Scene 4 - Branch based on HasFeather
        if (GameState.hasFeather()) {
            scene4WithFeather();
        } else {
            scene4WithoutFeather();
        }
    }
    
    private static void scene4WithFeather() {
        System.out.println();
        GameTools.delay(0.5);  
        
        GameTools.typeText("Angel(?): ");
        GameTools.delay(0.5);

        GameTools.typeText("\n\"An interesting artifact you carry.");
        GameTools.delay(0.5);
        GameTools.typeText("\nA splinter of a will that refused to be extinguished.\"");
        GameTools.delay(0.5);
        GameTools.typeText("\n\n\"Can you feel its pulse?", 80);
        GameTools.delay(0.5);
        GameTools.typeText("\nIts longing to return to its source?", 80);
        GameTools.delay(0.5);
        GameTools.typeText("\nIt speaks of a potential you have yet to comprehend.\"", 80);

        GameTools.delay(0.7);

        GameTools.typeText("\n\n\"That feather is a shard of my own will,");
        GameTools.delay(0.3);
        GameTools.typeText(" longing to be whole.");
        GameTools.delay(0.5);
        GameTools.typeText("\nYou cannot truly hold what is already mine.");
        GameTools.delay(0.5);
        GameTools.typeText(" Return it."); GameTools.delay(0.5);
        GameTools.typeText("\nThat is its only purpose.\""); GameTools.delay(0.7);
    
        GameTools.typeText("\n\nWhat will you do?");
        GameTools.delay(0.7);
        GameTools.typeText("\n[1] Give HIM the feather.", 70);
        GameTools.delay(0.7);
        GameTools.typeText("\n[2] Keep the feather.", 70);
        GameTools.delay(0.7);

        GameTools.typeText("\nChoose: ");
        String choice = scanner.nextLine();
        
        if (choice.equals("1")) {
            GameTools.typeText("\nYou hand over the feather...");
            GameState.setHasFeather(false);
            GameState.setIfEd2(true); // Set Ed2 to true for Bad End 2
            GameTools.typeText("The being takes it and vanishes.");
            GameTools.typeText("You feel a profound sense of loss...");
            GameTools.pressToContinue(scanner);
            Endings.checkEnding();
            // Trigger Bad End 2 immediately - NO MAZE
            //Endings.showBadEnd2();
        } else {
            System.out.println();
            GameTools.delay(0.5);  
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
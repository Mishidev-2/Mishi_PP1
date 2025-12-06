import java.util.Scanner;

public class Mission3 {
    private static Scanner scanner = new Scanner(System.in);
    
    public static void start() {
        GameTools.clearScreen();
        GameTools.typeText("===== The Last Circle =====");
        GameTools.delay(2.5);
        GameTools.clearScreen();

        GameTools.delay(1);
        // Scene 1
        GameTools.typeText("You gaze upon the doorway to your next destination -\n");
        GameTools.delay(0.5);
        GameTools.typeText("A towering archway");
        GameTools.delay(0.3);
        GameTools.typeText(" of interlocking obsidian and bone", 100);

        GameTools.delay(0.7);

        GameTools.typeText("\n\nIt pretends to be a violent rupture but is,");
        GameTools.delay(0.3);
        GameTools.typeText("\nin truth,");
        GameTools.delay(0.3);
        GameTools.typeText(" a horrifyingly precise architecture.\n", 100);

        GameTools.delay(0.7);

        GameTools.typeText("\nA knot of frozen light at its center whispers");
        GameTools.delay(0.3);
        GameTools.typeText(" a dozen logical, ");
        GameTools.delay(0.1);
        GameTools.typeText("contradicting truths.");
        GameTools.delay(0.5);
        GameTools.typeText("\n\nDirectly into your mind.", 100);
        GameTools.delay(0.7);

        GameTools.pressToContinue(scanner);
        System.out.println();
        
        // Scene 2
        GameTools.typeText("You step through the door.\n");
        GameTools.delay(0.7);

        GameTools.typeText("The world shifts in a disorienting lurch as the heat and stink of the previous circle vanish.", 50);
        GameTools.delay(0.5);

        GameTools.typeText("\nReplaced by a silent plain of grey dust");

        GameTools.typeText(" that stretches into eternity.", 60);
        GameTools.delay(0.7);

        GameTools.typeText("\n\nThe air hangs heavy");
        GameTools.typeText(" with the scent of old parchment and static,");
        GameTools.delay(0.5);

        GameTools.typeText("\nand the wound on your side gives a sudden throb.");
        GameTools.delay(1);

        GameTools.typeText("\n\nA sharp reminder that your time here is already borrowed.", 60);
        GameTools.delay(0.7);


        GameTools.pressToContinue(scanner);
        System.out.println();
        
        // Scene 3
        GameTools.typeText("As you move through the landscape,");
        GameTools.delay(0.3); 
        GameTools.typeText(" feeling the dissonance.");
        GameTools.delay(0.7);
        GameTools.typeText("\nThe silence from Heaven is a void in your mind,");
        GameTools.delay(0.3);
        GameTools.typeText(" where the guiding Voice used to be.", 60);
        GameTools.delay(0.7);

        GameTools.pressToContinue(scanner);
        System.out.println();
        
        // Scene 4
        GameTools.typeText("In the center stands a magnificent silver tree.");
        GameTools.delay(0.5);
        GameTools.typeText("\nAdorning a single,", 60);
        GameTools.typeText(" crystalline fruit.", 60);
        GameTools.delay(0.7);
        GameTools.typeText("\n\nThen,");
        GameTools.delay(0.3);
        GameTools.typeText(" a figure detaches itself from the silver bark of the tree, ");
        GameTools.delay(0.5);
        GameTools.typeText("\nnot emerging,");
        GameTools.delay(0.3);
        GameTools.typeText(" but simply resolving into existence as if he was always part of the scene.");
        GameTools.delay(0.7);
        GameTools.typeText("\n\nHe is a demon who looks like a weary scholar,");
        GameTools.delay(0.3);
        GameTools.typeText(" his eyes holding a library's worth of quiet amusement.");
        GameTools.delay(0.7);
        GameTools.typeText("\nHe gestures with a slender hand to the magnificent tree.");
        GameTools.delay(0.7);

        // Choice 1
        boolean choiceCompleted = false;
        while (!choiceCompleted) {
            System.out.println();
            GameTools.typeText("<Unknown Demon:> \n");
            GameTools.delay(0.2);
            GameTools.typeText("\"Behold,");
            GameTools.delay(0.3);
            GameTools.typeText(" The Arbor Lucis\"", 70);

            GameTools.delay(0.7);
            GameTools.typeText("\n\n\"This fruit purges corruption,");
            GameTools.delay(0.3);
            GameTools.typeText(" a reset for tainted existence.");
            GameTools.delay(0.5);
            GameTools.typeText("\nI am Mephis,", 70);
            GameTools.typeText(" its curator.\"", 70);

            GameTools.delay(1.5);

            GameTools.typeText("\n\nMephis shifts his gaze to you...", 60);
            GameTools.typeText("\nNo.");
            GameTools.delay(0.7);
            GameTools.typeText("\nINSIDE of you.", 60);

            GameTools.delay(1.5);


            GameTools.typeText("\n\n<Mephis:> \n");
            GameTools.delay(0.5);
            GameTools.typeText("\"You are running on corrupted logic.");
            GameTools.delay(0.5);
            GameTools.typeText("\nI see the fatal error pulsing beneath your skin...\"");
            GameTools.delay(0.7);
            GameTools.typeText("\n\"If only there were a debugger for such a primitive model.", 70);
            GameTools.delay(1);
            GameTools.typeText(" Oh, wait.\"");

            GameTools.delay(0.7);

            GameTools.typeText("\n\nHe produces the fruit,");
            GameTools.delay(0.3);
            GameTools.typeText(" holding it out carelessly.");

            GameTools.delay(0.7);

            GameTools.typeText("\n\n\"THIS clears the crash.", 60);
            GameTools.delay(0.3);
            GameTools.typeText("\nA factory reset.");
            GameTools.delay(0.5);
            GameTools.typeText("\nIt is 'sufficient' to keep you functioning.\"", 60);

            GameTools.delay(0.7);

            GameTools.typeText("\n\nHe then holds up the feather,");
            GameTools.delay(0.3);
            GameTools.typeText(" his eyes narrowing intensely.");

            GameTools.delay(0.7);

            GameTools.typeText("\n\n\"But this is the update.");
            GameTools.delay(0.3);
            GameTools.typeText(" You could walk away merely 'repaired,'");
            GameTools.delay(0.5);
            GameTools.typeText(" remaining the glitch you are...");
            GameTools.delay(0.5);
            GameTools.typeText("\nBut why choose to be obsolete...", 70);
            GameTools.delay(0.5);
            GameTools.typeText(" When you can be rewritten?\"", 70);

            GameTools.delay(1.3);

            GameTools.typeText("\n\n\" won't reset you only to leave you obsolete.\"", 60);

            GameTools.delay(0.7);

            GameTools.typeText("\n\n\"So, choose:");
            GameTools.typeText("\nAccept both the upgrade and the purge to continue,", 60);
            GameTools.typeText(" or refuse", 70);
            GameTools.typeText(" and let the corruption terminate you.\"", 60);

            GameTools.typeText("\n\n===== CRITICAL CHOICE =====\n\n");
            GameTools.typeText("Current State:");
            GameTools.typeText("\n- Status Effect Taint: " + GameState.hasStatusEffectTaint());
            GameTools.typeText("\n- Sin Counter: " + GameState.getSinCounter());
            
            GameTools.typeText("\nChoose:");
            GameTools.typeText("\n[1] \"Yes. I will take the feather and the fruit.\"");
            GameTools.typeText("\n[2] \"No. I will accept neither.\"");
            GameTools.delay(10);
            GameTools.typeText("\n[3] \"No. I only want the fruit.\"");
            System.out.print("Enter your choice: ");
            
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
    
    private static boolean handleChoice3() {//RIDDLEEE
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
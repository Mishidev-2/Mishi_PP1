import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;
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
            GameTools.typeText("\n\nBut why choose to be obsolete...", 70);
            GameTools.delay(0.5);
            GameTools.typeText(" When you can be rewritten?\"", 70);

            GameTools.delay(1.3);

            GameTools.typeText("\n\n\"I won't reset you only to leave you obsolete.\"", 60);

            GameTools.delay(0.7);
        boolean choiceCompleted = false;
        while (!choiceCompleted) {
            GameTools.typeText("\n\n\"So, choose:");
            GameTools.typeText("\nAccept both the upgrade and the purge to continue,", 60);
            GameTools.typeText(" or refuse", 70);
            GameTools.typeText(" and let the corruption terminate you.\"", 60);

            GameTools.typeText("\n\n===== CRITICAL CHOICE =====\n\n");
            GameTools.typeText("Current State:");
            GameTools.typeText("\n- Status Effect Taint: " + GameState.hasStatusEffectTaint());
            GameTools.typeText("\n- Sin Counter: " + GameState.getSinCounter());
            
            // 1. Display only the first two options
            GameTools.typeText("\nChoose:");
            GameTools.typeText("\n[1] \"Yes. I will take the feather and the fruit.\"");
            GameTools.typeText("\n[2] \"No. I will accept neither.\"");
            System.out.print("\nEnter your choice: ");
            
            // 2. Setup the Thread-Safe Flag
            // This allows the timer and the main program to talk to each other
            AtomicBoolean hasAnswered = new AtomicBoolean(false);

            // 3. Create the Timer Thread (15 Seconds)
            Thread secretTimer = new Thread(() -> {
                try {
                    // 15 seconds
                    Thread.sleep(15000); 

                    // If user hasn't typed yet, show the secret option
                    if (!hasAnswered.get()) {
                        GameTools.typeText("\n\n[3] \"No. I only want the fruit.\"");
                        System.out.print("\nEnter your choice: "); // Re-print prompt
                    }
                } catch (InterruptedException e) {
                    // Thread interrupted (user answered early), do nothing
                }
            });

            // Start the timer in the background
            secretTimer.start();

            // 4. Input
            String choice = scanner.nextLine();

            // 5. Stop timer if answered
            hasAnswered.set(true);
            secretTimer.interrupt();

            switch (choice) {
                case "1":
                    handleChoice1();
                    choiceCompleted = true; // Assumes you have this boolean controlling a loop
                    break;
                case "2":
                    handleChoice2();
                    return; // Return to Mission 1
                case "3":
                    // They can type "3" even before the text appears!
                    choiceCompleted = handleChoice3(); 
                    break;
                default:
                    GameTools.typeText("Invalid choice. Please enter 1, 2, or 3.");
                    // Small delay for error message reading
                    try { Thread.sleep(2000); } catch (InterruptedException e) {} 
            }
        }
        
        GameTools.typeText("\nMission 3 completed!");
        GameState.displayState();
        GameTools.pressToContinue(scanner);
    }
    
    private static void handleChoice1() {
        GameTools.delay(0.5);
        System.out.println();

        GameTools.typeText("Satisfied, ");
        GameTools.delay(0.7);
        GameTools.typeText("Mephis gives you both. ");
        GameTools.delay(0.3);
        GameTools.typeText("\nThe fruit purges you with scorching light ");
        GameTools.delay(0.7);
        GameTools.typeText("- the feather offers a comforting, false hope.\n");

        GameTools.delay(0.7);

        GameTools.typeText("You are cleansed,");
        GameTools.delay(0.3);
        GameTools.typeText(" but now carry the seed of your own downfall.", 60);
        GameTools.delay(0.7);
        GameState.setStatusEffectTaint(false);
        GameState.setHasFeather(true); // NOW you get the feather!
        GameTools.typeText("\n*The taint has been cleansed from your spirit.*");
        GameTools.typeText("\n*A mystical feather materializes and attaches to you.*");

        GameTools.pressToContinue(scanner);
    }
    
    private static void handleChoice2() {
        GameTools.delay(0.5);
        System.out.println();

        GameTools.typeText("Mephis gives a slight, respectful nod.");
        GameTools.delay(0.7);

        GameTools.typeText("\n\n<Mepthis:>");
        GameTools.delay(0.3);
        GameTools.typeText("\n\"A pure data point.");
        GameTools.delay(0.3);
        GameTools.typeText(" A terminal of absolute principle.");
        GameTools.delay(0.5);
        GameTools.typeText(" Admirable.\"");
        GameTools.delay(0.3);

        GameTools.typeText("\n\nHe steps back ");
        GameTools.delay(0.5);
        GameTools.typeText("and dissolves into the haze.");
        GameTools.delay(0.7);


        GameTools.typeText("\n\nYour strength fails you. ");
        GameTools.delay(0.5);
        GameTools.typeText("The black taint spreads, ");
        GameTools.delay(0.3);
        GameTools.typeText("freezing you from inside out.");
        GameTools.delay(0.5);
        GameTools.typeText("\nYou collapse,");
        GameTools.delay(0.3);
        GameTools.typeText(" and your light extinguishes...", 60);
        GameTools.delay(0.5);
        
        // Reset game state and return to Mission 1
        GameState.resetGame();
        GameTools.typeText("\n\nDeconceptualizing...", 90);
        GameTools.delay(2);
        MainFile.startNewGame();
    }
    
    private static boolean handleChoice3() {//RIDDLEEE
        GameTools.delay(0.5);
        System.out.println();

        GameTools.typeText("\"I only want the fruit.\"", 60);

        GameTools.delay(0.7);

        GameTools.typeText("\n\n<Mepthis:>");
        GameTools.delay(0.3);
        GameTools.typeText("\n\"Negotiation? ");
        GameTools.delay(0.3);
        GameTools.typeText("A mortal concept.");
        GameTools.delay(0.5);
        GameTools.typeText("\nYou desire the conclusion without its premise.");
        GameTools.delay(0.7);
        GameTools.typeText("\nBut I am a scholar of broken truths,");
        GameTools.delay(0.3);
        GameTools.typeText(" and I value intellect."); 
        GameTools.delay(0.5);
        GameTools.typeText("\nProve your current logic is sufficient:");
        GameTools.delay(0.7);
        GameTools.typeText(" solve a heresy for me.\"\n");
        GameTools.delay(1.5);

        GameTools.typeText("\n\n\"I am the child of a question that has no sanctioned answer.");
        GameTools.delay(0.5);
        GameTools.typeText("\nI am the shadow that falls when a perfect truth is held to the light.");
        GameTools.delay(0.5);

        GameTools.typeText("\n\nYou can use me to dismantle a fortress of certainty,");
        GameTools.delay(0.3);
        GameTools.typeText(" but you will be left with only rubble and sky.", 60);
        GameTools.delay(0.7);
        GameTools.typeText("\nYou can follow me to the edge of revelation,");
        GameTools.delay(0.7);
        GameTools.typeText(" but I will always point you back to the question.\"", 60);

        GameTools.delay(1.5);

        GameTools.typeText("\n\nWhat am I?", 100);
        GameTools.delay(1);
        
        String[] riddleKeywords = {"doubt", "uncertainty", "skepticism", "hesitation", "distrust"};
        int attempts = 0;
        boolean riddleSolved = false;
        
        while (attempts < 2 && !riddleSolved) {
            System.out.print("\n\nYour answer (attempt " + (attempts + 1) + "/2): ");
            String answer = scanner.nextLine();
            
            if (GameTools.checkRiddleAnswer(answer, riddleKeywords)) {
                riddleSolved = true;
                if (attempts == 0) {

                    System.out.println();
                    GameTools.delay(1);

                    GameTools.typeText("Mephis looks genuinely impressed,");
                    GameTools.delay(0.5);
                    GameTools.typeText(" and slightly disappointed.");

                    GameTools.delay(1.5);

                    GameTools.typeText("\n\n\"A flawless deduction.", 60);
                    GameTools.delay(0.7);
                    GameTools.typeText(" Your core programming is more robust than I anticipated.\"");
                    GameTools.delay(0.7);

                    GameTools.typeText("\n\nWith a sigh of concession,");
                    GameTools.delay(0.5);
                    GameTools.typeText(" he plucks the fruit and tosses it to you.");

                    GameTools.delay(1.5);

                    GameTools.typeText("\n\n\"The purge is yours.");
                    GameTools.delay(0.5);
                    GameTools.typeText(" The upgrade...", 100);
                    GameTools.delay(0.7);

                    GameTools.typeText("\nRemains available,");
                    GameTools.delay(0.7);
                    GameTools.typeText(" should you ever change your mind.\"", 70);
                    GameTools.delay(0.7);
                    
                    GameState.setStatusEffectTaint(false);
                    // hasFeather remains false (no change)
                } else {

                    System.out.println();
                    GameTools.delay(1);

                    GameTools.typeText("He lets out a soft,");
                    GameTools.delay(0.3);
                    GameTools.typeText(" breathy chuckle,");
                    GameTools.delay(0.3);
                    GameTools.typeText(" a sound like rustling pages.");
                    GameTools.delay(0.5);
                    GameTools.typeText("\n\n\"Ah, there it is.", 70);
                    GameTools.delay(0.5);
                    GameTools.typeText(" You stumbled on the threshold,");
                    GameTools.delay(0.3);
                    GameTools.typeText("but you crossed it nonetheless.");
                    GameTools.delay(0.5);
                    GameTools.typeText("\nThe insight is correct,");
                    GameTools.delay(0.3);
                    GameTools.typeText(" if delayed.");
                    GameTools.delay(0.5);
                    GameTools.typeText("\nIt seems there is yet a spark within the rubble worth preserving.\"");
                    GameTools.delay(0.7);
                    GameTools.typeText("\n\n\"The purge is yours,");
                    GameTools.delay(0.3);
                    GameTools.typeText(" you may proceed.\"", 60);
                    GameState.setStatusEffectTaint(false);
                    // hasFeather remains false (no change)
                }
                GameTools.typeText("\nStatus Effect Taint: " + GameState.hasStatusEffectTaint());
                GameTools.typeText("\nHas Feather: " + GameState.hasFeather());
                GameTools.pressToContinue(scanner);
            } else {
                attempts++;
                if (attempts == 1) {
                    //Wrong 1
                    System.out.println();
                    GameTools.delay(1);

                    GameTools.typeText("Mephis tilts his head,", 60);
                    GameTools.delay(0.3);
                    GameTools.typeText(" a look of quiet amusement mixed with slight pity.");
                    GameTools.delay(0.7);
                    GameTools.typeText("\n\n\"An understandable error.");
                    GameTools.delay(0.5);
                    GameTools.typeText("\nThe obvious answer is often the most seductive trap.");
                    GameTools.delay(0.7);
                    GameTools.typeText("\nLook past the stated function.");
                    GameTools.delay(0.5);
                    GameTools.typeText("\nConsider the foundation upon which it is built,");
                    GameTools.delay(0.5);
                    GameTools.typeText(" not the structure itself.\"");
                    GameTools.delay(0.7);
                    GameTools.typeText("\n\n\"You have one more attempt to grasp the truth of this place.\"", 60);
                    GameTools.delay(0.5);
                    GameTools.typeText("\n(Hint: D__BT)");
                } else {
                    System.out.println();
                    GameTools.delay(1);

                    GameTools.typeText("Mephis's weary expression solidifies into one of finality.", 60);
                    GameTools.delay(0.5);
                    GameTools.typeText("\nHe gives a slight,");
                    GameTools.delay(0.3);
                    GameTools.typeText(" dismissive shake of his head.");
                    GameTools.delay(0.5);
                    GameTools.typeText("\n\n\"No.", 60);
                    GameTools.delay(0.7);
                    GameTools.typeText(" The capacity for higher understanding is simply not there.", 60);
                    GameTools.delay(0.5);
                    GameTools.typeText("\nThe corruption has run too deep,");
                    GameTools.delay(0.3);
                    GameTools.typeText(" or the original code was too limited.", 60);
                    GameTools.delay(0.5);
                    GameTools.typeText("\nA pity.");
                    GameTools.delay(0.7);
                    GameTools.typeText(" The terminal must be reset.\"", 60);
                    GameTools.delay(0.5);
                    GameTools.typeText("\n\n\"Our discourse is over.\"", 60);
                    
                    // Reset and new game
                    GameState.resetGame();
                    System.out.println();
                    GameTools.delay(2);
                    GameTools.typeText("\nData lost...", 100);
                    GameTools.delay(2);
                    GameTools.typeText("\nRecovering...", 90);
                    GameState.resetGame();
                    MainFile.startNewGame();
                    return false; // Mission failed, don't continue Mission 3
                }
            }
        }
        
        return true; // Riddle solved, continue Mission 3
    }
}
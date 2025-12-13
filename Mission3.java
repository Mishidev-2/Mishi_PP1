import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;

public class Mission3 {
    private static Scanner scanner = new Scanner(System.in);
    
    public static boolean start() {
        GameTools.clearScreen();
        GameTools.typeText("========== THE LAST CIRCLE ==========", ConsoleColors.WHITE_BOLD);
        GameTools.delay(2.5);
        GameTools.clearScreen();
        GameTools.delay(1);
        GameTools.typeText("You gaze upon the doorway to your next destination -\n");
        GameTools.delay(0.5);
        GameTools.typeText("A towering archway");
        GameTools.delay(0.3);
        GameTools.typeText(" of interlocking obsidian and bone", ConsoleColors.WHITE_BOLD, 100);
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
        GameTools.typeText("\n\nDirectly into your mind.", ConsoleColors.PURPLE, 100);
        GameTools.delay(0.7);
        GameTools.pressToContinue(scanner);
        System.out.println();
        
        GameTools.typeText("You step through the door.");
        GameTools.delay(0.7);
        GameTools.typeText("\n\nThe world shifts in a disorienting lurch as the heat and stink of the previous circle vanish.", 50);
        GameTools.delay(0.5);
        GameTools.typeText("\nReplaced by a silent plain of grey dust", ConsoleColors.WHITE);
        GameTools.typeText(" that stretches into eternity.", 60);
        GameTools.delay(0.7);
        GameTools.typeText("\n\nThe air hangs heavy");
        GameTools.typeText(" with the scent of old parchment and static,");
        GameTools.delay(0.5);
        GameTools.typeText("\nand the wound on your side gives a sudden throb.", ConsoleColors.RED);
        GameTools.delay(1);
        GameTools.typeText("\n\nA sharp reminder that your time here is already borrowed.", 60);
        GameTools.delay(0.7);
        GameTools.pressToContinue(scanner);
        System.out.println();
        
        GameTools.typeText("As you move through the landscape,");
        GameTools.delay(0.3); 
        GameTools.typeText(" feeling the dissonance.");
        GameTools.delay(0.7);
        GameTools.typeText("\nThe silence from Heaven is a void in your mind,");
        GameTools.delay(0.3);
        GameTools.typeText(" where the guiding Voice used to be.", ConsoleColors.PURPLE, 60);
        GameTools.delay(0.7);
        GameTools.pressToContinue(scanner);
        System.out.println();
        
        GameTools.typeText("In the center stands a magnificent silver tree.", ConsoleColors.CYAN);
        GameTools.delay(0.5);
        GameTools.typeText("\nAdorning a single,", 60);
        GameTools.typeText(" crystalline fruit.", ConsoleColors.CYAN_BOLD, 60);
        GameTools.delay(0.7);
        GameTools.typeText("\n\nThen,");
        GameTools.delay(0.3);
        GameTools.typeText(" a figure detaches itself from the silver bark of the tree, ");
        GameTools.delay(0.5);
        GameTools.typeText("\nnot emerging,");
        GameTools.delay(0.3);
        GameTools.typeText(" but simply resolving into existence as if he was always part of the scene.");
        GameTools.delay(0.7);
        GameTools.typeText("\n\nHe is a demon who looks like a weary scholar,", ConsoleColors.PURPLE);
        GameTools.delay(0.3);
        GameTools.typeText(" his eyes holding a library's worth of quiet amusement.", ConsoleColors.PURPLE);
        GameTools.delay(0.7);
        GameTools.typeText("\nHe gestures with a slender hand to the magnificent tree.");
        GameTools.delay(0.7);

        System.out.println();
        GameTools.typeText("\n<Unknown Demon:> \n", ConsoleColors.PURPLE);
        GameTools.delay(0.2);
        GameTools.typeText("\"Behold,");
        GameTools.delay(0.3);
        GameTools.typeText(" The Arbor Lucis\"", ConsoleColors.CYAN_BOLD, 70);
        GameTools.delay(0.7);
        GameTools.typeText("\n\n\"This fruit purges corruption,");
        GameTools.delay(0.3);
        GameTools.typeText(" a reset for tainted existence.");
        GameTools.delay(0.5);
        GameTools.typeText("\nI am Mephis,", ConsoleColors.PURPLE_BOLD, 70);
        GameTools.typeText(" its curator.\"", ConsoleColors.PURPLE, 70);
        GameTools.delay(1.5);
        GameTools.typeText("\n\nMephis shifts his gaze to you...", 60);
        GameTools.typeText("\nNo.");
        GameTools.delay(0.7);
        GameTools.typeText("\nINSIDE of you.", ConsoleColors.RED_BOLD, 60);
        GameTools.delay(1.5);

        GameTools.typeText("\n\n<Mephis:> \n", ConsoleColors.PURPLE);
        GameTools.delay(0.5);
        GameTools.typeText("\"You are running on corrupted logic.", ConsoleColors.PURPLE);
        GameTools.delay(0.5);
        GameTools.typeText("\nI see the fatal error pulsing beneath your skin...\"", ConsoleColors.PURPLE);
        GameTools.delay(0.7);
        GameTools.typeText("\n\"If only there were a debugger for such a primitive model.", ConsoleColors.PURPLE, 70);
        GameTools.delay(1);
        GameTools.typeText(" Oh, wait.\"", ConsoleColors.PURPLE);
        GameTools.delay(0.7);
        GameTools.typeText("\n\nHe produces the fruit,");
        GameTools.delay(0.3);
        GameTools.typeText(" holding it out carelessly.");
        GameTools.delay(0.7);
        GameTools.typeText("\n\n\"THIS clears the crash.", ConsoleColors.CYAN, 60);
        GameTools.delay(0.3);
        GameTools.typeText(" A factory reset.", ConsoleColors.CYAN);
        GameTools.delay(0.5);
        GameTools.typeText("\nIt is 'sufficient' to keep you functioning.\"", ConsoleColors.PURPLE, 60);
        GameTools.delay(0.7);
        GameTools.typeText("\n\nHe then holds up the feather,");
        GameTools.delay(0.3);
        GameTools.typeText(" his eyes narrowing intensely.");
        GameTools.delay(0.7);
        GameTools.typeText("\n\n\"But this is the update.", ConsoleColors.PURPLE);
        GameTools.delay(0.3);
        GameTools.typeText(" You could walk away merely 'repaired,'");
        GameTools.delay(0.5);
        GameTools.typeText(" remaining the glitch you are...");
        GameTools.delay(0.5);
        GameTools.typeText("\n\nBut why choose to be obsolete...", ConsoleColors.PURPLE, 70);
        GameTools.delay(0.5);
        GameTools.typeText(" When you can be rewritten?\"", ConsoleColors.PURPLE_BOLD, 70);
        GameTools.delay(1.3);
        GameTools.typeText("\n\n\"I won't reset you only to leave you obsolete.\"", ConsoleColors.PURPLE, 60);
        GameTools.delay(0.7);

        boolean choiceCompleted = false;
        while (!choiceCompleted) {
            GameTools.typeText("\n\n\"So, choose:");
            GameTools.typeText("\nAccept both the upgrade and the purge to continue,", 60);
            GameTools.typeText(" or refuse", 70);
            GameTools.typeText(" and let the corruption terminate you.\"", 60);
            GameTools.typeText("\n\n===== CRITICAL CHOICE =====\n", ConsoleColors.RED_BOLD);
            GameTools.typeText("\nChoose:", ConsoleColors.WHITE_BOLD);
            GameTools.typeText("\n[1] \"Yes. I will take the feather and the fruit.\"");
            GameTools.typeText("\n[2] \"No. I will accept neither.\"");
            System.out.print("\nEnter your choice: ");
            
            AtomicBoolean hasAnswered = new AtomicBoolean(false);
            Thread secretTimer = new Thread(() -> {
                try {
                    Thread.sleep(8000); //8 secs
                    if (!hasAnswered.get()) {
                        System.out.print(ConsoleColors.PURPLE + "\n...Tick..." + ConsoleColors.RESET); 
                        GameTools.typeText("\n\n[3] \"No. I only want the fruit.\"", ConsoleColors.CYAN_BOLD);
                        System.out.print("\nEnter your choice: ");
                    }
                } catch (InterruptedException e) {}
            });
            secretTimer.start();
     
            String choice = scanner.nextLine();
            hasAnswered.set(true);
            secretTimer.interrupt();

            switch (choice) {
                case "1" -> {
                    handleChoice1();
                    choiceCompleted = true; 
                }
                case "2" -> {
                    handleChoice2();
                    return false; 
                }
                case "3" -> {
                    boolean result = handleChoice3();
                    if (result) {
                        choiceCompleted = true; 
                    } else {
                        return false; 
                    }
                }
                default -> {
                    GameTools.typeText("Invalid choice. Please enter 1, 2, or 3.", ConsoleColors.RED);
                    try { Thread.sleep(2000); } catch (InterruptedException e) {} 
                }
            }
        }
        
        GameTools.pressToContinue(scanner);
        return true; 
    }
    
    private static void handleChoice1() {
        GameTools.delay(0.5);
        System.out.println();
        GameTools.typeText("Satisfied, ");
        GameTools.delay(0.7);
        GameTools.typeText("Mephis gives you both. ");
        GameTools.delay(0.3);
        GameTools.typeText("\nThe fruit purges you with scorching light ", ConsoleColors.YELLOW);
        GameTools.delay(0.7);
        GameTools.typeText("- the feather offers a comforting, false hope.\n", ConsoleColors.PURPLE);
        GameTools.delay(0.7);
        GameTools.typeText("You are cleansed,", ConsoleColors.CYAN);
        GameTools.delay(0.3);
        GameTools.typeText(" but now carry the seed of your own downfall.", ConsoleColors.RED, 60);
        GameTools.delay(0.7);
        GameState.setStatusEffectTaint(false);
        GameState.setHasFeather(true); 
        GameTools.typeText("\n\n*The taint has been cleansed from your spirit.*", ConsoleColors.GREEN);
        GameTools.typeText("\n*A mystical feather materializes and attaches to you.*", ConsoleColors.PURPLE);
    }
    
    private static void handleChoice2() {
        GameTools.delay(0.5);
        System.out.println();
        GameTools.typeText("Mephis gives a slight, respectful nod.");
        GameTools.delay(0.7);
        GameTools.typeText("\n\n<Mepthis:>", ConsoleColors.PURPLE);
        GameTools.delay(0.3);
        GameTools.typeText("\n\"A pure data point.", ConsoleColors.PURPLE);
        GameTools.delay(0.3);
        GameTools.typeText(" A terminal of absolute principle.", ConsoleColors.PURPLE);
        GameTools.delay(0.5);
        GameTools.typeText(" Admirable.\"", ConsoleColors.PURPLE);
        GameTools.delay(0.3);
        GameTools.typeText("\n\nHe steps back ");
        GameTools.delay(0.5);
        GameTools.typeText("and dissolves into the haze.");
        GameTools.delay(0.7);
        GameTools.typeText("\n\nYour strength fails you. ", ConsoleColors.RED);
        GameTools.delay(0.5);
        GameTools.typeText("The black taint spreads, ", ConsoleColors.RED);
        GameTools.delay(    0.3);
        GameTools.typeText("freezing you from inside out.", ConsoleColors.CYAN);
        GameTools.delay(0.5);
        GameTools.typeText("\nYou collapse,");
        GameTools.delay(0.3);
        GameTools.typeText(" and your light extinguishes...", 60);
        GameTools.delay(0.5);
        GameTools.typeText("\n\nDeconceptualizing...", ConsoleColors.RED_BOLD, 90);
        GameTools.delay(2);
    }
    
    private static boolean handleChoice3() {
        GameTools.delay(0.5);
        System.out.println();
        GameTools.typeText("\"I only want the fruit.\"", 60);
        GameTools.delay(0.7);
        GameTools.typeText("\n\n<Mepthis:>", ConsoleColors.PURPLE);
        GameTools.delay(0.3);
        GameTools.typeText("\n\"Negotiation? ", ConsoleColors.PURPLE);
        GameTools.delay(0.3);
        GameTools.typeText("A mortal concept.", ConsoleColors.PURPLE);
        GameTools.delay(0.5);
        GameTools.typeText("\nYou desire the conclusion without its premise.", ConsoleColors.PURPLE);
        GameTools.delay(0.7);
        GameTools.typeText("\nBut I am a scholar of broken truths,", ConsoleColors.PURPLE);
        GameTools.delay(0.3);
        GameTools.typeText(" and I value intellect.", ConsoleColors.PURPLE); 
        GameTools.delay(0.5);
        GameTools.typeText("\nProve your current logic is sufficient:", ConsoleColors.PURPLE);
        GameTools.delay(0.7);
        GameTools.typeText(" solve a heresy for me.\"\n", ConsoleColors.PURPLE);
        GameTools.delay(1.5);
        GameTools.typeText("\n\n\"I am the child of a question that has no sanctioned answer.", ConsoleColors.CYAN);
        GameTools.delay(0.5);
        GameTools.typeText("\nI am the shadow that falls when a perfect truth is held to the light.", ConsoleColors.CYAN);
        GameTools.delay(0.5);
        GameTools.typeText("\n\nYou can use me to dismantle a fortress of certainty,", ConsoleColors.CYAN);
        GameTools.delay(0.3);
        GameTools.typeText(" but you will be left with only rubble and sky.", ConsoleColors.CYAN, 60);
        GameTools.delay(0.7);
        GameTools.typeText("\nYou can follow me to the edge of revelation,", ConsoleColors.CYAN);
        GameTools.delay(0.7);
        GameTools.typeText(" but I will always point you back to the question.\"", ConsoleColors.CYAN, 60);
        GameTools.delay(1.5);
        GameTools.typeText("\n\nWhat am I?", ConsoleColors.WHITE_BOLD, 100);
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
                    GameTools.typeText("\n\n\"A flawless deduction.", ConsoleColors.PURPLE, 60);
                    GameTools.delay(0.7);
                    GameTools.typeText(" Your core programming is more robust than I anticipated.\"", ConsoleColors.PURPLE);
                    GameTools.delay(0.7);
                    GameTools.typeText("\n\nWith a sigh of concession,");
                    GameTools.delay(0.5);
                    GameTools.typeText(" he plucks the fruit and tosses it to you.");
                    GameTools.delay(1.5);
                    GameTools.typeText("\n\n\"The purge is yours.", ConsoleColors.PURPLE);
                    GameTools.delay(0.5);
                    GameTools.typeText(" The upgrade...", ConsoleColors.PURPLE, 100);
                    GameTools.delay(0.7);
                    GameTools.typeText("\nRemains available,", ConsoleColors.PURPLE);
                    GameTools.delay(0.7);
                    GameTools.typeText(" should you ever change your mind.\"", ConsoleColors.PURPLE, 70);
                    GameTools.delay(0.7);
                    GameState.setStatusEffectTaint(false);
                } else {
                    System.out.println();
                    GameTools.delay(1);
                    GameTools.typeText("He lets out a soft,");
                    GameTools.delay(0.3);
                    GameTools.typeText(" breathy chuckle,");
                    GameTools.delay(0.3);
                    GameTools.typeText(" a sound like rustling pages.");
                    GameTools.delay(0.5);
                    GameTools.typeText("\n\n\"Ah, there it is.", ConsoleColors.PURPLE, 70);
                    GameTools.delay(0.5);
                    GameTools.typeText(" You stumbled on the threshold,", ConsoleColors.PURPLE);
                    GameTools.delay(0.3);
                    GameTools.typeText("but you crossed it nonetheless.", ConsoleColors.PURPLE);
                    GameTools.delay(0.5);
                    GameTools.typeText("\nThe insight is correct,", ConsoleColors.PURPLE);
                    GameTools.delay(0.3);
                    GameTools.typeText(" if delayed.", ConsoleColors.PURPLE);
                    GameTools.delay(0.5);
                    GameTools.typeText("\nIt seems there is yet a spark within the rubble worth preserving.\"", ConsoleColors.PURPLE);
                    GameTools.delay(0.7);
                    GameTools.typeText("\n\n\"The purge is yours,", ConsoleColors.PURPLE);
                    GameTools.delay(0.3);
                    GameTools.typeText(" you may proceed.\"", ConsoleColors.PURPLE, 60);
                    GameState.setStatusEffectTaint(false);
                }
                
                System.out.println();
                GameTools.typeText("\nStatus Effect Taint: " + GameState.hasStatusEffectTaint());
                GameTools.typeText("\nHas Feather: " + GameState.hasFeather());
               

            } else {
                attempts++;
                if (attempts == 1) {
                    System.out.println();
                    GameTools.delay(1);
                    GameTools.typeText("Mephis tilts his head,", 60);
                    GameTools.delay(0.3);
                    GameTools.typeText(" a look of quiet amusement mixed with slight pity.");
                    GameTools.delay(0.7);
                    GameTools.typeText("\n\n\"An understandable error.", ConsoleColors.PURPLE);
                    GameTools.delay(0.5);
                    GameTools.typeText("\nThe obvious answer is often the most seductive trap.", ConsoleColors.PURPLE);
                    GameTools.delay(0.7);
                    GameTools.typeText("\nLook past the stated function.", ConsoleColors.PURPLE);
                    GameTools.delay(0.5);
                    GameTools.typeText("\nConsider the foundation upon which it is built,", ConsoleColors.PURPLE);
                    GameTools.delay(0.5);
                    GameTools.typeText(" not the structure itself.\"", ConsoleColors.PURPLE);
                    GameTools.delay(0.7);
                    GameTools.typeText("\n\n\"You have one more attempt to grasp the truth of this place.\"", ConsoleColors.PURPLE, 60);
                    GameTools.delay(0.5);
                    GameTools.typeText("\n(Hint: D__BT)", ConsoleColors.WHITE_BOLD);
                } else {
                    System.out.println();
                    GameTools.delay(1);
                    GameTools.typeText("Mephis's weary expression solidifies into one of finality.", 60);
                    GameTools.delay(0.5);
                    GameTools.typeText("\nHe gives a slight,");
                    GameTools.delay(0.3);
                    GameTools.typeText(" dismissive shake of his head.");
                    GameTools.delay(0.5);
                    GameTools.typeText("\n\n\"No.", ConsoleColors.PURPLE, 60);
                    GameTools.delay(0.7);
                    GameTools.typeText(" The capacity for higher understanding is simply not there.", ConsoleColors.PURPLE, 60);
                    GameTools.delay(0.5);
                    GameTools.typeText("\nThe corruption has run too deep,", ConsoleColors.PURPLE);
                    GameTools.delay(0.3);
                    GameTools.typeText(" or the original code was too limited.", ConsoleColors.PURPLE, 60);
                    GameTools.delay(0.5);
                    GameTools.typeText("\nA pity.");
                    GameTools.delay(0.7);
                    GameTools.typeText(" The terminal must be reset.\"", ConsoleColors.PURPLE, 60);
                    GameTools.delay(0.5);
                    GameTools.typeText("\n\n\"Our discourse is over.\"", ConsoleColors.PURPLE, 60);
                    GameState.resetGame();
                    System.out.println();
                    GameTools.delay(2);
                    GameTools.typeText("\nData lost...", ConsoleColors.RED_BOLD, 100);
                    GameTools.delay(2);
                    GameTools.typeText("\nRecovering...", ConsoleColors.GREEN, 90);
                    return false; 
                }
            }
        }
        return true; 
    }
}
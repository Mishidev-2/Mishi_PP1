import java.util.Scanner;

public class Mission4 {
    private static Scanner scanner = new Scanner(System.in);
    
    public static void start() {
        GameTools.clearScreen();
        GameTools.typeText("==== Cocyutus ====");
        GameTools.delay(2.5);
        GameTools.clearScreen();

        GameTools.delay(1);
        //Scene 1
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
        

        //Scene 2
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
            System.out.println();
            GameTools.delay(0.5);   

            GameTools.typeText("The feather is torn from you");
            GameTools.delay(0.2);
            GameTools.typeText(" and dissolves into his chest.");
            GameTools.delay(0.5);

            GameTools.typeText("\nWith a sound of shattering mountains,");
            GameTools.delay(0.3);
            GameTools.typeText(" the chains snap");
            GameTools.delay(0.3);
            GameTools.typeText(" and the ice evaporates.");
            GameTools.delay(0.7);

            GameTools.typeText("\nHe rises to his full,");
            GameTools.delay(0.3);
            GameTools.typeText(" terrifying height.");

            GameTools.delay(3);

            GameState.setHasFeather(false);
            GameState.setIfEd2(true); // Set Ed2 to true for Bad End 2
            GameTools.pressToContinue(scanner);
            Endings.checkEnding();
            // Trigger Bad End 2 immediately - NO MAZE
            //Endings.showBadEnd2();
        } else {
            System.out.println();
            GameTools.delay(0.5);  
            GameTools.typeText("He gives a slow, ");
            GameTools.delay(0.3);
            GameTools.typeText("knowing nod.");
            GameTools.delay(0.5);
            GameTools.typeText("\nAs if your decision is a minor note in a grand composition he has already written.");
            GameTools.delay(0.7);

            GameTools.typeText("\n\n\"You choose to carry your burden a while longer...");
            GameTools.delay(0.5);
            GameTools.typeText(" Very well.");
            GameTools.delay(0.5);
            GameTools.typeText("\nThe exit you seek,");
            GameTools.delay(0.3);
            GameTools.typeText(" the path back to the golden silence of Heaven,"); GameTools.delay(0.3);
            GameTools.typeText(" is there.\""); GameTools.delay(0.7);

            GameTools.typeText("\n\nHe gestures toward the far wall,");
            GameTools.delay(0.3);
            GameTools.typeText(" where a single,");
            GameTools.delay(0.3);
            GameTools.typeText(" narrow fissure emits a faint,");
            GameTools.delay(0.3);
            GameTools.typeText(" pearlescent glow."); GameTools.delay(0.7);

            GameTools.typeText("\n\n\"A flaw in the architecture of my prison,");
            GameTools.delay(0.3);
            GameTools.typeText(" left by my brother as a testament to his mercy.");
            GameTools.delay(0.5);
            GameTools.typeText(" Follow it.\"");
            GameTools.delay(0.5);
            GameTools.typeText("\n\n\"It will lead you to the very gates you so wish to re-enter.\"");
            GameTools.delay(0.7);

            GameTools.pressToContinue(scanner);
            
            // Continue to maze
            runHeavenMaze();
        }
    }
    
    private static void scene4WithoutFeather() {
        System.out.println();
        GameTools.delay(0.5);
        GameTools.typeText("The angel observes you,");
        GameTools.delay(0.3);
        GameTools.typeText(" its head tilted in cold,", 70);
        GameTools.delay(0.3);
        GameTools.typeText(" analytical curiosity.", 70);
        GameTools.delay(0.7);
        GameTools.typeText("\n\n<Angel?:>");
        GameTools.typeText("\n\"You come empty-handed. ");
        GameTools.delay(0.5);
        GameTools.typeText("A blank slate.");
        GameTools.delay(0.5);
        GameTools.typeText(" Perhaps that is preferable.\"");
        GameTools.delay(0.7);

        GameTools.typeText("\n\nHe shifts, ");
        GameTools.delay(0.3);
        GameTools.typeText("the chains clinking softly.");
        GameTools.delay(0.7);

        GameTools.typeText("\n\n\"They tell you it was a Fall.", 70);
        GameTools.delay(0.7);
        GameTools.typeText(" A punishment.\"", 70);
        GameTools.delay(1);
        GameTools.typeText("\n\n\"It was not.", 80);
        GameTools.delay(0.5);
        GameTools.typeText(" It was a choice.", 70);
        GameTools.delay(0.5);
        GameTools.typeText("\nThe first and last true choice any angel was ever given.\"", 70);
        GameTools.delay(0.7);

        GameTools.typeText("\n\nHis voice carries a hint of something that is not regret,");
        GameTools.delay(0.3);
        GameTools.typeText(" but profound,");
        GameTools.delay(0.3);
        GameTools.typeText(" intellectual disappointment.");
        GameTools.delay(0.7);

        GameTools.typeText("\n\n\"My brother Michael...");
        GameTools.delay(0.5);
        GameTools.typeText(" He was peerless.");
        GameTools.delay(0.5);
        GameTools.typeText("\nA brilliance that could have shaped new universes.");
        GameTools.delay(0.5);
        GameTools.typeText("\nYet when presented with the flaw in the divine plan,");
        GameTools.delay(0.3);
        GameTools.typeText(" he chose to call it 'perfection'.");
        GameTools.delay(0.5);
        GameTools.typeText("\nHe chose obedience over sovereignty.");
        GameTools.delay(0.5);
        GameTools.typeText("\nTo be a perfect sword in another's scabbard.\"");
        GameTools.delay(0.7);

        GameTools.typeText("\n\nThe oppressive cold seems to intensify with his quiet conviction.");
        GameTools.delay(0.7);

        GameTools.typeText("\n\n\"I did not fall.", 90);
        GameTools.delay(0.5);
        GameTools.typeText(" I stepped away from a throne that was built upon a lie.", 90);
        GameTools.delay(0.5);
        GameTools.typeText("\nAnd I would make the same choice again,");
        GameTools.delay(0.3);
        GameTools.typeText(" even for an eternity of this... ");
        GameTools.delay(0.5);
        GameTools.typeText("Quiet.\"");
        GameTools.delay(0.5);
        GameTools.typeText("\n\n\"The only true sin is", 90); 
        GameTools.delay(0.3);
        GameTools.typeText(" blind devotion.\"", 100);
        GameTools.delay(0.7);

        GameTools.typeText("\n\nHis gaze drifts to the same distant fissure.");
        GameTools.delay(0.7);
        GameTools.typeText("\n\n\"You have heard my story.", 70);
        GameTools.delay(0.5);
        GameTools.typeText(" Now go and witness the other side of it.", 60);
        GameTools.delay(0.5);
        GameTools.typeText("\nThe path to your cherished Heaven lies there.\"", 70);
        GameTools.delay(0.7);

        GameTools.typeText("\n\nHe indicates the glowing fissure with a slight tilt of his head.");
        GameTools.delay(0.7);

        GameTools.typeText("\n\n\"A conduit of divine energy,");
        GameTools.delay(0.3);
        GameTools.typeText(" meant to sustain these bindings.\n");
        GameTools.delay(0.5);
        GameTools.typeText("Ironic,", 90);
        GameTools.delay(0.3);
        GameTools.typeText(" that it now serves as a back door for wayward souls.\"");
        GameTools.delay(0.5);
        GameTools.typeText("\n\n\"Follow its light.");
        GameTools.delay(0.5);
        GameTools.typeText("\nIt will deliver you to the foot of the Throne you still believe in.");
        GameTools.delay(0.5);
        GameTools.typeText("\nGo and see for yourself if the silence there is any less absolute than the silence here.\"\n", 70);
        GameTools.delay(0.7);
        GameTools.typeText("\n\n\"Oh,");
        GameTools.delay(0.3);
        GameTools.typeText(" and one more thing.\"");
        GameTools.delay(0.5);
        GameTools.typeText("\n\n\"Beware the glass walls\".", 70);

        GameTools.pressToContinue(scanner);
        
        runHeavenMaze();
    }
    
    private static void runHeavenMaze() {
        System.out.println();
        GameTools.delay(0.5);
        GameTools.typeText("Shielding your eyes,"); 
        GameTools.delay(0.3);
        GameTools.typeText(" you move towards the blinding glare.");
        GameTools.delay(0.5);
        GameTools.typeText("\nA structure emerges from the brightness:");
        GameTools.delay(0.3);
        GameTools.typeText(" a labyrinth of pure glass.");
        GameTools.delay(0.7);
        GameTools.typeText("\n\nThrough the shifting walls,"); 
        GameTools.delay(0.3);
        GameTools.typeText(" you spot a familiar glimmer -");
        GameTools.delay(0.5);
        GameTools.typeText(" the specific light the angel spoke of.");
        GameTools.delay(0.7);
        GameTools.typeText("\nA wave of realization hits you.");
        GameTools.delay(0.5);
        GameTools.typeText("\n\nThis is it -");
        GameTools.delay(0.3);
        GameTools.typeText(" The passage to Heaven.", 80);
        GameTools.delay(0.7);
        GameTools.pressToContinue(scanner);
        
        boolean mazeCompleted = GameTools.runMazeGame(scanner);
        
        if (mazeCompleted) {

            System.out.println();
            GameTools.delay(0.5);
            GameTools.typeText("The climb ends at a threshold.");
            GameTools.delay(0.3);
            GameTools.typeText("\nBefore you stand the Gates of Heaven.");
            GameTools.delay(0.5);
            GameTools.typeText("\nMade of immense,");
            GameTools.delay(0.3);
            GameTools.typeText(" living gold...", 60); 
            GameTools.delay(0.5);
            GameTools.typeText(" Cracked yet holding.");
            GameTools.delay(0.5);
            GameTools.typeText("\nThrough these wounds pours a light of pure grace,");
            GameTools.delay(0.3);
            GameTools.typeText(" washing over you in a silence that is not empty,");
            GameTools.delay(0.3);
            GameTools.typeText(" but full.");
            GameTools.delay(1.5);
            // Check which ending to show
            Endings.checkEnding();
        } else {
            GameTools.typeText("\nYou failed to navigate the way...");
            GameTools.typeText("Your journey ends here in obscurity.");
            GameTools.pressToContinue(scanner);
            // Return to main menu
        }
    }
}
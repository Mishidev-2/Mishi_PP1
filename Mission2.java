import java.util.Scanner;

public class Mission2 {
   private static Scanner scanner = new Scanner(System.in);
   
   public static void start() {
   
      boolean missionCompleted = false;
      
      while (!missionCompleted) {
         GameTools.clearScreen();
         GameTools.typeText("===== Hell =====");
         GameTools.delay(2.5);
         GameTools.clearScreen();
      
//LScene 1
         GameTools.delay(1);
      
         GameTools.typeText("A heavy, ");
         GameTools.delay(0.2);
         GameTools.typeText("iron sky greets you, ");
         GameTools.delay(0.2);
         GameTools.typeText("the air thick with the scent of ash and regret.\n");
         GameTools.delay(0.7);
      
         GameTools.typeText("Exiting the Void has deposited you at the foot of a colossal castle, ");
         GameTools.delay(0.2);
         GameTools.typeText("\n");
         GameTools.typeText("its walls hewn from blackened, ");
         GameTools.delay(0.2);
         GameTools.typeText("seamless rock that stretches into the gloom.\n\n");
         GameTools.delay(0.7);
      
         GameTools.typeText("You wait, ");
         GameTools.delay(0.2);
         GameTools.typeText("expecting the familiar Voice to dictate your next move.\n");
         GameTools.delay(1);
         GameTools.typeText("It offers no counsel. ");
         GameTools.delay(1);
         GameTools.typeText("The silence is its own kind of instruction.", 50);
         GameTools.delay(0.5);
      
//LScene 2
         GameTools.pressToContinue(scanner);
         System.out.println();
         GameTools.delay(0.5);
      
         GameTools.typeText("You head inside the labyrinth of shadow and despair.\n");
         GameTools.delay(0.5);
         GameTools.delay(0.7);
      
         GameTools.typeText("Its interior is silent, ");GameTools.delay(0.2);
         GameTools.typeText("filled with the shuffling forms of the damned.\n");GameTools.delay(0.5);
         GameTools.delay(0.7);
      
         GameTools.typeText("It is in this oppressive quiet that a new sound cuts through\n");GameTools.delay(0.5);
         GameTools.typeText("- clear, ");GameTools.delay(0.2);
         GameTools.typeText("sharp, ");GameTools.delay(0.2);
         GameTools.typeText("and utterly alien in this place of muted suffering.\n\n");GameTools.delay(0.5);
         GameTools.delay(0.7);
      
         GameTools.typeText("A child's cry.", 100);
         GameTools.typeText("\n\n");
         GameTools.delay(1);
      
         GameTools.typeText("It is not your task to comfort the condemned, ");GameTools.delay(0.2);
         GameTools.typeText("even if it is a mere child.", 100);GameTools.delay(0.5);
         
// LChoice 1 - Sin counter increment
         System.out.println();
         GameTools.delay(1);
         GameTools.typeText("\nChoose...");
         GameTools.delay(0.7);
         GameTools.typeText("\n[1] Ignore the Child");
         GameTools.delay(0.5);
         GameTools.typeText("\n[2] Help The Child");
         GameTools.delay(0.5);
         GameTools.typeText("\nEnter choice (1 or 2): ");

         String choice = scanner.nextLine();
         System.out.println();

         switch (choice) { 
            case "2" -> {
                //Sinpath
                GameState.incrementSinCounter();
                GameTools.delay(0.5);
                
                GameTools.typeText("You comfort the child, ");GameTools.delay(0.2);
                GameTools.typeText("guiding it toward a semblance of peace.\n\n");GameTools.delay(0.5);
                GameTools.delay(1);
                
                GameTools.typeText("As its cries subside, ");GameTools.delay(0.2);
                GameTools.typeText("a black smoke coalesces from the ground, ");GameTools.delay(0.2);
                GameTools.typeText("\n");
                GameTools.typeText("wrapping around the soul and pulling it gently into the depths.");GameTools.delay(0.5);
              }
            default -> {
               if(!choice.equals("1")){
                  GameTools.typeText("Invalid choice.");
                  GameTools.delay(0.5);
                  GameTools.typeText("\nIgnoring by default");
                  GameTools.delay(0.5);
               }

                System.out.println();
                GameTools.typeText("The soul continues to cry - ");
                GameTools.delay(0.5);
                GameTools.typeText("wandering and lost.\n");
                GameTools.delay(0.5);
                GameTools.delay(0.7);
                
                GameTools.typeText("It may never find its way...");
                GameTools.delay(0.5);
                GameTools.typeText("\n");
                GameTools.delay(1);
                GameTools.typeText("\n");
                GameTools.delay(1);
                GameTools.typeText("Forever.", 100);
                GameTools.delay(0.5);
              }
         }         
         GameTools.typeText("\n\nSin counter: " + GameState.getSinCounter());         
      
// LScene 3
         GameTools.pressToContinue(scanner);
         System.out.println();
         GameTools.delay(0.5);
         
         GameTools.typeText("Finally, ");GameTools.delay(0.2);
         GameTools.typeText("you find an exit, ");GameTools.delay(0.2);
         GameTools.typeText("a single door standing amidst the countless shifting souls.\n\n");GameTools.delay(0.5);
         GameTools.delay(0.7);
      
         GameTools.typeText("Heading towards it - ");
         GameTools.delay(0.5);
         GameTools.typeText("you suddenly hear a flap of wings.\n");GameTools.delay(0.5);
         GameTools.delay(1);
      
         GameTools.typeText("Before the exit, ");GameTools.delay(0.2);
         GameTools.typeText("there stands a figure, ");GameTools.delay(0.2);
         GameTools.typeText("a gatekeeper perhaps?\n\n");GameTools.delay(0.5);
         GameTools.delay(0.7);
      
         GameTools.typeText("Its form shifts between shadow and ember, ");GameTools.delay(0.2);
         GameTools.typeText("neither damned nor divine. ");GameTools.delay(0.5);
         GameTools.typeText("\nIts voice drips like oil across still water.");GameTools.delay(0.5);
         GameTools.delay(1);
         
         System.out.println();
         GameTools.delay(0.5);
         
//LChoice 2 - Riddle Setup
         GameTools.typeText("\n<Gatekeeper?>\n");
         GameTools.delay(1);
         GameTools.typeText("Hushh, ");GameTools.delay(0.2);
         GameTools.typeText("wanderer. ");GameTools.delay(0.5);
         GameTools.typeText("Did you hear it?\n");GameTools.delay(0.5);
         GameTools.delay(1);
         GameTools.typeText("The only sound that dared to live here - ");
         GameTools.delay(0.5);
         GameTools.typeText("the cry of what never was.\n\n");GameTools.delay(0.5);
         GameTools.delay(1);
      
         GameTools.typeText("Do not deny it Angel, ");GameTools.delay(0.2);
         GameTools.typeText("you pretend to be blind, ");GameTools.delay(0.2);
         GameTools.typeText("yet I see what lies beneath your white robes.\n");GameTools.delay(0.5);
         GameTools.delay(0.7);
      
         GameTools.typeText("Tell me, ");GameTools.delay(0.2);
         GameTools.typeText("Seraph, ");GameTools.delay(0.2);
         GameTools.typeText("before you pass through this gate... ");
         GameTools.delay(1);
         GameTools.typeText("Did you know what that was?\n");GameTools.delay(0.5);
         GameTools.delay(1);
         GameTools.typeText("The cry you ignored.\n\n");GameTools.delay(0.5);
         GameTools.delay(0.5);
      
         GameTools.typeText("It leans forward, ");GameTools.delay(0.2);
         GameTools.typeText("its many eyes gleaming like dim candles in a chapel long forgotten.\n\n");GameTools.delay(0.5);
         GameTools.delay(1);
      
      
         
// LChoice 2 - Riddle game

         String[] riddle1Keywords = {"stillborn", "unborn", "stillborn child", "unborn child", "miscarriage"};
         boolean riddleSolved = false;
         
         while (!riddleSolved) {
            GameTools.typeText("\"In a realm where no heart beats, ");GameTools.delay(0.2);
            GameTools.typeText("I am born without breath.\n");GameTools.delay(0.5);
            GameTools.delay(0.7);
            GameTools.typeText("My voice breaks silence, ");GameTools.delay(0.2);
            GameTools.typeText("yet I have no mouth.\n");GameTools.delay(0.5);
            GameTools.delay(0.7);
            GameTools.typeText("I am the echo of what was never given life, ");GameTools.delay(0.2);
            GameTools.typeText("\n");
            GameTools.typeText("and the memory of a name never spoken.\n\n");GameTools.delay(0.5);
            GameTools.delay(1.5);

            GameTools.typeText("What am I?\"\n: ", 100);GameTools.delay(0.5);
            String answer = scanner.nextLine();
            
            if (GameTools.checkRiddleAnswer(answer, riddle1Keywords)) {
               //Succeed
               GameTools.typeText("\n\"Correct... ");
               GameTools.delay(1);
               GameTools.typeText("though few speak it aloud.\n");GameTools.delay(0.5);
               GameTools.delay(1);
            
               GameTools.typeText("This is the sound of all that was denied a beginning.\n");GameTools.delay(0.5);
               GameTools.delay(1);
            
               GameTools.typeText("They linger here - ");
               GameTools.delay(0.5);
               GameTools.typeText("between God's mercy and the Devil's claim -\n");
               GameTools.delay(0.5);
               GameTools.delay(1);
               GameTools.typeText("forever crying for a world that never heard them.\"", 100);GameTools.delay(0.5);
               riddleSolved = true;
            
            } else {
               //Fail
               GameTools.typeText("\nThe gatekeeper's eyes dim.\n");GameTools.delay(0.5);
               GameTools.delay(0.5);
               GameTools.typeText("The child's cry comes hither - ");
               GameTools.delay(0.5);
               GameTools.typeText("mournful and accusing\n\n");GameTools.delay(0.5);
               GameTools.delay(1.5);
            
               GameTools.typeText("<Gatekeeper>\n");
               GameTools.delay(1);
               GameTools.typeText("\"No, ");GameTools.delay(0.2);
               GameTools.typeText("you have named it falsely.\"\n\n", 50);GameTools.delay(0.5);
               GameTools.delay(0.7);
            
               GameTools.typeText("<???>\n");
               GameTools.delay(0.5);
               GameTools.typeText("\"Why did you not know us?\"\n\n", 100);GameTools.delay(0.5);
               GameTools.delay(1);
            
               GameTools.typeText("Invisible hands pull at the angel's wings\n");
               GameTools.delay(0.5);
               GameTools.typeText("light unraveling into ash.\n\n");GameTools.delay(0.5);
               GameTools.delay(1);
            
               GameTools.typeText("<Gatekeeper>\n");
               GameTools.delay(0.5);
               GameTools.typeText("\"In Limbo, ");GameTools.delay(0.2);
               GameTools.typeText("wrong words unmake what is left of you.\"\n\n", 100);GameTools.delay(0.5);
               GameTools.delay(1);
            
               GameTools.typeText("The door turns to dust.\n");GameTools.delay(0.5);
               GameTools.delay(0.5);
               GameTools.typeText("Silence returns - ");
               GameTools.delay(1);
               GameTools.typeText("heavier than before.", 100);GameTools.delay(0.5);
               
               break;//goes directly to if!riddleSolved
            }
         }
         
         if (!riddleSolved) {
            GameState.setSinCounter(0);
            GameTools.typeText("\nDissolved into dust...");
            GameTools.delay(2);
            GameTools.typeText(" Reforming...");
            GameTools.delay(2);
            continue;//Go back to the start();
         }
         
         // If we get here, continue with Mission 2 - gluttony
         missionCompleted = continueMission2();
      }
      
   
      GameTools.pressToContinue(scanner);
   }
   
   private static boolean continueMission2() {
// GScene 1
      GameTools.clearScreen();
      GameTools.delay(1);
   
      GameTools.typeText("Clearing the challenge, ");GameTools.delay(0.2);
      GameTools.typeText("you step through the door - ");
      GameTools.delay(0.5);
      GameTools.typeText("and the air itself seems to rot.\n");GameTools.delay(0.5);
      GameTools.delay(0.7);
   
      GameTools.typeText("The scent of decay clings to your feathers, ");GameTools.delay(0.2);
      GameTools.typeText("heavy and wet.\n");GameTools.delay(0.5);
      GameTools.delay(0.7);
   
      GameTools.typeText("Each breath tastes of spoiled sweetness, ");GameTools.delay(0.2);
      GameTools.typeText("each step sinks deeper than the last.\n\n");GameTools.delay(0.5);
      GameTools.delay(1.5);
   
      GameTools.typeText("Then you see it.\n\n");GameTools.delay(0.5);
      GameTools.delay(1.5);
   
      GameTools.typeText("The ground is a spongy morass of half-digested food.\n");GameTools.delay(0.5);
      GameTools.delay(1);
   
      GameTools.typeText("Their punishment is an eternal, ");GameTools.delay(0.2);
      GameTools.typeText("starving consumption.\n");GameTools.delay(0.5);
      GameTools.delay(1);
   
      GameTools.typeText("Gorged on nothing, ");GameTools.delay(0.2);
      GameTools.typeText("forever craving everything.", 100);GameTools.delay(0.5);
      
      GameTools.pressToContinue(scanner);
      
// GScene 2
      GameTools.typeText("\n");
      GameTools.delay(0.7);
   
      GameTools.typeText("Eventually, ");GameTools.delay(0.2);
      GameTools.typeText("you come across a soul. ");GameTools.delay(0.5);
      GameTools.typeText("Eyes wide with a primal, ");GameTools.delay(0.2);
      GameTools.typeText("insane hunger.\n");GameTools.delay(0.5);
      GameTools.delay(0.7);
   
      GameTools.typeText("Perceiving your presence it scoots over, ");GameTools.delay(0.2);
      GameTools.typeText("revealing a trail of its own innards spilling out from beneath his belly.\n");GameTools.delay(0.5);
      GameTools.delay(1);
   
      GameTools.typeText("\"A morsel... ");
      
      GameTools.delay(1);
      GameTools.typeText("just a crumb!\"\n");GameTools.delay(0.5);
      GameTools.delay(0.7);
   
      GameTools.typeText("It gurgles, ");GameTools.delay(0.2);
      GameTools.typeText("voice a wet bubble from the muck.", 100);GameTools.delay(0.5);

// GChoice 1
      System.out.println();
      GameTools.delay(1);
      GameTools.typeText("\nChoose...");
      GameTools.delay(0.7);
      GameTools.typeText("\n[1] Ignore it");
      GameTools.delay(0.5);
      GameTools.typeText("\n[2] Help the soul");
      GameTools.delay(0.5);
      GameTools.typeText("\nEnter choice (1 or 2): ");      
      String gChoice = scanner.nextLine();

      switch (gChoice) {
         case "1" -> {
             //status effect
             GameState.setStatusEffectTaint(true);
             System.out.println();
             GameTools.delay(0.5);
             
             GameTools.typeText("You turn away.");GameTools.delay(0.5);
             GameTools.typeText(" Its pleas rot into silence.");
             GameTools.delay(0.7);
             
             GameTools.typeText("\nIt reaches to your back,");GameTools.delay(0.3);
             GameTools.typeText(" pressing a hand against your wings.");
             GameTools.delay(0.5);
             GameTools.typeText("\nA searing pain blooms -");GameTools.delay(0.3);
             GameTools.typeText(" light flaring beneath your ribs.");
             GameTools.delay(0.5);
             GameTools.typeText("\nYou feel something burning out from within.");
             GameTools.delay(0.7);
             
             GameTools.typeText("\n\nA brand forms over your heart,");GameTools.delay(0.3);
             GameTools.typeText(" glowing faintly like molten iron.");
             GameTools.delay(0.5);
             GameTools.typeText("\nYour wings wither,");GameTools.delay(0.3);
             GameTools.typeText(" the feathers blackening,");GameTools.delay(0.3);
             GameTools.typeText(" eaten by unseen fire.");GameTools.delay(0.7);
             
             GameTools.typeText("\n\nStatus effect: ", 100);
             GameTools.delay(0.3);
             GameTools.typeText("Wither", 100);
           }
         case "2" -> {
             //statuseffect + increment sin
             GameState.setStatusEffectTaint(true);
             GameState.incrementSinCounter();
             System.out.println();
             GameTools.delay(0.5);
             
             GameTools.typeText("You offer a starving soul bread and water,");GameTools.delay(0.3);
             GameTools.typeText("\nbut they transform into ash and black oil in its mouth.");
             GameTools.delay(0.7);
             
             GameTools.typeText("\n\nThe soul retches,");GameTools.delay(0.3);
             GameTools.typeText(" spitting black bile,");GameTools.delay(0.3);
             GameTools.typeText(" and shrieks its condemnation.");
             GameTools.delay(0.5);
             GameTools.typeText("\n\n\"Liars!");
             GameTools.delay(0.5);
             GameTools.typeText(" Demons in light's clothing!");
             GameTools.typeText(" Your mercy is a disease!\"");
             GameTools.delay(0.7);
             
             GameTools.typeText("\n\nThe soul condemns you,");GameTools.delay(0.3);
             GameTools.typeText(" and its despair lashes out,");
             GameTools.delay(0.3);
             GameTools.typeText("\ntainting your wings with an unhealable withering.");
             GameTools.delay(0.7);
             
             GameTools.typeText("\n\nYou do not heal in hell,");GameTools.delay(0.3);
             GameTools.typeText("\nyou must find a way to suppress the wither or stop it completely.");
             GameTools.delay(0.7);
             
             
             GameTools.typeText("\n\nStatus effect: ", 100);
             GameTools.delay(0.3);
             GameTools.typeText("Wither", 100);
           }
         default -> {
               GameTools.typeText("Invalid choice. The indecision invites the taint regardless.");
               GameState.setStatusEffectTaint(true);
               GameTools.typeText("\n\nStatus effect: Wither");
         }

      }
      
      GameTools.typeText("\n\nSin counter: " + GameState.getSinCounter());
   
      GameTools.pressToContinue(scanner);
      
// GScene 3
      System.out.println();
      GameTools.delay(0.5);
      
      GameTools.typeText("You stumble forward,");GameTools.delay(0.3);
      GameTools.typeText(" the brand of wither searing your chest.");
      GameTools.delay(0.5);
      
      GameTools.typeText("\nEach step tears through muscle and flame.");
      GameTools.delay(0.5);
      GameTools.typeText("\nThe door stands ahead,");GameTools.delay(0.3);
      GameTools.typeText(" distant yet pulsing faintly like a heartbeat.");
      GameTools.delay(0.5);
      GameTools.typeText("\n\nThen,");
      GameTools.delay(0.3);
      GameTools.typeText(" the air splits -");
      GameTools.typeText("\nThe Gatekeeper materializes,");
      GameTools.delay(0.3);
      GameTools.typeText(" wings folded inwards,");
      GameTools.delay(0.3);
      GameTools.typeText(" feathers like burned parchment.");
      GameTools.delay(0.5);
   
      GameTools.typeText("\n\nIts voice seeps through the cracks of your pain.", 100);GameTools.delay(0.3);
      
      System.out.println();
      //transition
      GameTools.delay(1);
      
      // GChoice 2 - Riddle with multiple attempts
      String[] riddle2Keywords = {"gluttony"};
      int attempts = 0;
      boolean secondRiddleSolved = false;
      
      
         GameTools.typeText("\n<Gatekeeper of Gluttony:>\n");
         GameTools.delay(0.7);
         GameTools.typeText("\"You reek of decay, "); GameTools.delay(0.3);
         GameTools.typeText("angel. \n"); GameTools.delay(0.5);
         GameTools.delay(0.7);
         GameTools.typeText("The mark devours you from within - \n"); GameTools.delay(0.5);
         GameTools.typeText("a hunger made flesh.\"\n\n"); GameTools.delay(0.5);
         GameTools.delay(1);
      
         GameTools.typeText("It tilts its head, "); GameTools.delay(0.3);
         GameTools.typeText("studying you like a specimen pinned beneath glass.\n\n"); GameTools.delay(0.5);
         GameTools.delay(0.7);
      
         GameTools.typeText("You want release? "); GameTools.delay(0.5);
         GameTools.typeText("Perhaps it is in the next circle. \n"); GameTools.delay(0.5);
         GameTools.delay(0.7);
         GameTools.typeText("Answer, "); GameTools.delay(0.3);
         GameTools.typeText("before you rot where you stand.\n\n"); GameTools.delay(0.5);
         GameTools.delay(1);
      
         GameTools.typeText("The souls below gurgle, "); GameTools.delay(0.3);
         GameTools.typeText("chewing the air as if echoing your need.\n\n"); GameTools.delay(0.5);
         GameTools.delay(0.7);
      
         GameTools.typeText("\"Tell me - \""); GameTools.delay(0.5);
         GameTools.delay(1);
      

      while (attempts < 3 && !secondRiddleSolved) {

         GameTools.typeText("\n\n\"When a soul feeds on everything,");
         GameTools.delay(0.5);
         GameTools.typeText(" yet remains empty.\"", 70);
         GameTools.delay(0.5);
         GameTools.typeText("\n\"What.", 100);
         GameTools.delay(0.5);
         GameTools.typeText(" Sin.", 100);
         GameTools.delay(0.5);
         GameTools.typeText(" Binds it?", 100);
         GameTools.delay(1);
      
         GameTools.typeText("\n(Attempt " + (attempts + 1) + "): ");
         String answer = scanner.nextLine();
         
         if (GameTools.checkRiddleAnswer(answer, riddle2Keywords) && attempts == 1) {
            //2nd Attempt correct
            GameTools.typeText("\nThe gatekeeper nods,");
            GameTools.delay(0.5);
            GameTools.typeText("\n\n\"So you know the taste of emptiness.");
            GameTools.delay(0.5);
            GameTools.typeText("\nPass through,");
            GameTools.delay(0.3);
            GameTools.typeText(" and seek your release.\"", 60);
            GameTools.delay(1);

            secondRiddleSolved = true;
         }else if(GameTools.checkRiddleAnswer(answer, riddle2Keywords)){
            //First Attempt correct
            GameTools.typeText("\nThe Gatekeeper's grin flickers -");
            GameTools.delay(0.2);
            GameTools.typeText(" like light reflected in bile.");
            GameTools.delay(0.5);
            GameTools.typeText("\n\n\"Yes...", 100);
            GameTools.delay(0.5);
            GameTools.typeText(" the endless feast.\"", 60);
            GameTools.typeText("\n\n\"You understand the craving then.\"");
            GameTools.delay(0.5);
            GameTools.typeText("\n\nIt gestures toward the door.");
            GameTools.delay(0.5);
            GameTools.typeText("\n\n\"I never promised to hold the cure.\"");
            GameTools.delay(1);
            secondRiddleSolved = true;
         
         } else {
            attempts++;
             switch (attempts) {
                 case 1 -> {
                     GameTools.typeText("\n1st Attempt failed");
                     System.out.println();
                     GameTools.typeText("\"Wrong.\"");
                     GameTools.delay(0.5);
                     GameTools.typeText("\n\nThe gatekeeper snarls.");
                     GameTools.delay(0.5);
                     GameTools.typeText("\nThe rot spreads.");
                     GameTools.delay(0.5);
                     GameTools.typeText("\n\n\"Try again,");
                     GameTools.delay(0.3);
                     GameTools.typeText(" before you are consumed.\"");
                     GameTools.delay(1);
                 }
                 case 2 -> {
                     GameTools.typeText("\n2nd Attempt failed");
                     System.out.println();
                     GameTools.typeText("The gatekeeper laughs,");
                     GameTools.delay(0.3);
                     GameTools.typeText(" a sound like grinding bones.");
                     GameTools.delay(0.5);
                     GameTools.typeText("\n\n\"Still wrong.");
                     GameTools.delay(0.5);
                     GameTools.typeText(" Can you not feel the decay?\"");
                     GameTools.delay(0.5);
                     GameTools.typeText("\n\n\"One more failure", 100);
                     GameTools.delay(0.3);
                     GameTools.typeText(" and you will join the feasters below.\"", 100);
                     GameTools.delay(1);
                 }
                 default -> {
                     GameTools.typeText("\n3rd Attempt Failed You have failed and return to Limbo.");
                     System.out.println();
                     GameTools.typeText("\"You are empty of mind as well as soul.");
                     GameTools.delay(0.5);
                     GameTools.typeText("\nNow,");
                     GameTools.delay(0.3);
                     GameTools.typeText(" become one with the feast.\"", 90);
                     GameTools.delay(0.5);
                     
                     GameTools.typeText("\n\nYou wither away and join the Gluttonous in their endless supper.", 70);
                     GameTools.delay(1);
                     GameState.setSinCounter(0);
                     return false;//start() loop to repeat from the beginning
                 }
             }//
         }
      }
      
      return secondRiddleSolved;
   }
}
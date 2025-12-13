import java.util.Scanner;

public class Mission1 {
   private static Scanner scanner = new Scanner(System.in);
    
   public static void start() {
      GameTools.clearScreen();
      GameTools.typeText("=============== VOID ================", ConsoleColors.PURPLE_BOLD);
      GameTools.delay(2.5);
      GameTools.clearScreen();
      GameTools.delay(1);

      // Scene 1
      if (GameState.isIfEd3()) {
         GameTools.typeText("You awaken in the endless void.", ConsoleColors.PURPLE);
         GameTools.delay(0.5);
         GameTools.typeText(" Again.", ConsoleColors.PURPLE, 50);
         GameTools.delay(0.7);
         GameTools.typeText("\nIt's a formless nothing stretching infinitely -");
         GameTools.typeText(" Standard issue oblivion.");

         GameTools.delay(0.7);
         GameTools.typeText("\n\nBefore you,"); 
         GameTools.delay(0.3);
         GameTools.typeText(" a vast black hole looms...", ConsoleColors.WHITE_BOLD);
         GameTools.delay(0.5);
         GameTools.typeText("\nIts presence is oppressive,");
         GameTools.delay(0.3);
         GameTools.typeText(" but It just hangs there...");
         GameTools.delay(0.5);
         GameTools.typeText(" Waiting.", 70);

         GameTools.delay(0.7);
         GameTools.typeText("\n\nAs usual its hunger knows no bounds,", 50);
         GameTools.delay(0.3);
         GameTools.typeText(" taking in all the light for itself.");
         GameTools.delay(0.7);
         GameTools.typeText("\n\nIts grand,");
         GameTools.delay(0.3);
         GameTools.typeText(" terrifying,");
         GameTools.delay(0.3);
         GameTools.typeText(" and exhausting to look at.", 60);
         GameTools.delay(0.7);
         GameTools.typeText("\n\nNo light reaches you...");
         GameTools.delay(0.5);
         GameTools.typeText(" It feels as if the light itself has forsaken you,");
         GameTools.delay(0.3);
         GameTools.typeText(" refusing to guide your way");
         GameTools.delay(0.5);
         GameTools.typeText("\nOr maybe it just couldn't be bothered.", 70);
         GameTools.delay(0.7);
         GameTools.typeText("\n\nMuch like you.", 70);
      } else {
      // Scene 1 Normal
         GameTools.typeText("You awaken in an endless void, ", ConsoleColors.PURPLE);GameTools.delay(0.2);
         GameTools.typeText("a formless nothing stretching infinitely.\n", ConsoleColors.PURPLE);
         GameTools.delay(0.7);
      
         GameTools.typeText("Before you, ");GameTools.delay(0.2);
         GameTools.typeText("a vast black hole looms.\n", ConsoleColors.WHITE_BOLD);
         GameTools.delay(0.7);
      
         GameTools.typeText("Its presence so oppressive, ");GameTools.delay(0.2);
         GameTools.typeText("it should devour you.\n\n");
         GameTools.delay(0.7);
      
         GameTools.typeText("And yet, ", 100);GameTools.delay(0.2);
         GameTools.typeText("it does not.", 100);
         GameTools.delay(0.7);
         GameTools.typeText("\n\n");
      
         GameTools.typeText("At its heart: ");GameTools.delay(0.2);
         GameTools.typeText("A cosmic hunger, ");GameTools.delay(0.2);
         GameTools.typeText("a nihility.\n");GameTools.delay(0.5);
         GameTools.delay(0.7);
      
         GameTools.typeText("Surroundings, ");GameTools.delay(0.2);
         GameTools.typeText("devoid of luster.\n");GameTools.delay(0.5); 
         GameTools.delay(0.7);
      
         GameTools.typeText("It generates a gravity so strong, ");GameTools.delay(0.2);
         GameTools.typeText("it forms a blazing ring of stolen radiance around it.\n\n", ConsoleColors.YELLOW);
         GameTools.delay(0.7);
      
         GameTools.typeText("No light reaches you, ");
         GameTools.delay(0.2);
         GameTools.typeText("it feels as if the light itself has forsaken you.", 100);
         GameTools.delay(1);
         GameTools.typeText("\n\nRefusing to guide your way.", ConsoleColors.RED, 100);
      }
        
      GameTools.pressToContinue(scanner);
      System.out.println();
      
      // Scene 2
      if (GameState.isIfEd3()) {
         GameTools.typeText("Then,");
         GameTools.delay(0.3);
         GameTools.typeText(" right on queue - ");
         GameTools.delay(0.3);
         GameTools.typeText(" The voice,", ConsoleColors.YELLOW);
         GameTools.delay(0.3);
         GameTools.typeText("\nParting the silence of the void and speaking directly into your mind.");
         GameTools.delay(0.7);
         GameTools.typeText("\n\nExactly like the first instance,");
         GameTools.delay(0.3);
         GameTools.typeText(" it sounds perfect...");
         GameTools.delay(0.5);
         GameTools.typeText(" Too perfect.", ConsoleColors.RED);
         GameTools.delay(0.7);
         GameTools.typeText("\n\n<Voice:>", ConsoleColors.YELLOW_BOLD);
         GameTools.delay(0.3);
         GameTools.typeText("\n\"You have awakened,", ConsoleColors.YELLOW);
         GameTools.delay(0.3);
         GameTools.typeText(" fledgeling.\"", ConsoleColors.YELLOW);
         GameTools.delay(0.7);
         GameTools.typeText("\n\n\"Come,", ConsoleColors.YELLOW);
         GameTools.delay(0.3);
         GameTools.typeText(" your journey awaits.\"", ConsoleColors.YELLOW);
         GameTools.delay(0.7);
         GameTools.typeText("\n\nThe voice rings hollow -");
         GameTools.delay(0.3);
         GameTools.typeText(" tinny and rehearsed.");
         GameTools.delay(0.5);
         GameTools.typeText("\nYou have heard this a thousand times,");
         GameTools.delay(0.3);
         GameTools.typeText(" you are not a newborn.");
         GameTools.delay(0.3);
         GameTools.typeText("\n\nYou are the oldest thing here...", ConsoleColors.CYAN, 70);
            
      } else {
         GameTools.typeText("Then, ");GameTools.delay(0.2);
         GameTools.typeText("a voice. ", ConsoleColors.YELLOW);GameTools.delay(0.5);
         GameTools.typeText("It parts the ever silent void.\n");GameTools.delay(0.5);
         GameTools.delay(0.7); 
         GameTools.typeText("A resonant tone emanates from the very nonexistence of it, ");GameTools.delay(0.2);
         GameTools.typeText("\nspeaking directly into your mind.\n\n");GameTools.delay(0.5);
         GameTools.delay(0.7); 
         GameTools.typeText("<Voice:>\n", ConsoleColors.YELLOW_BOLD);
         GameTools.delay(1);
         GameTools.typeText("\"You Have awakened, ", ConsoleColors.YELLOW);GameTools.delay(0.2);
         GameTools.typeText("fledgling.\"\n", ConsoleColors.YELLOW, 100);GameTools.delay(0.5);
         GameTools.delay(1);
         GameTools.typeText("\"Come, ", ConsoleColors.YELLOW);GameTools.delay(0.2);
         GameTools.typeText("your journey awaits.\"\n\n", ConsoleColors.YELLOW, 100);GameTools.delay(0.5);
         GameTools.delay(0.7); 
         GameTools.typeText("An instinctual compulsion roots you to your purpose.\n");GameTools.delay(0.5);
         GameTools.delay(0.7); 
         GameTools.typeText("The voice has not forbidden any other paths, ");GameTools.delay(0.2);
         GameTools.typeText("\nyet you are given an absolute in his presence - ");
         GameTools.delay(1);
         GameTools.typeText("To obey is not a decision; ");GameTools.delay(0.2);
         GameTools.typeText("it is an inevitability.");GameTools.delay(0.5);
      }
      
      GameTools.pressToContinue(scanner);
      System.out.println();
      
      // Scene 3
      GameTools.typeText("[0] \"Journey?\"\n[Enter to Continue]");
      scanner.nextLine();
      System.out.println();
      
      GameTools.typeText("<Voice:>\n", ConsoleColors.YELLOW_BOLD);
      GameTools.delay(1);
      GameTools.typeText("\"You have yes, ", ConsoleColors.YELLOW);GameTools.delay(0.2);
      GameTools.typeText("all Angels have an ultimatum.\n", ConsoleColors.YELLOW);GameTools.delay(0.5);
      GameTools.delay(0.7); 
      GameTools.typeText("To serve the Divine Presence, ", ConsoleColors.YELLOW);GameTools.delay(0.2);
      GameTools.typeText("our Lord.\n\n", ConsoleColors.YELLOW, 80);GameTools.delay(0.5);
      GameTools.delay(0.7); 
      GameTools.typeText("HE resides within the Heavens, ", ConsoleColors.YELLOW);GameTools.delay(0.2);
      GameTools.typeText("a mere three realms away.\n", ConsoleColors.YELLOW);GameTools.delay(0.5);
      GameTools.delay(0.7); 
      GameTools.typeText("It is imperative to our purpose that ", ConsoleColors.YELLOW);
      GameTools.typeText("newborns must go through a trial before being subject to the heavenly will.\n\n", ConsoleColors.YELLOW);GameTools.delay(0.5);
      GameTools.delay(0.7); 
      GameTools.typeText("You shall traverse a realm to get to the Celestial Abode: ", ConsoleColors.YELLOW);GameTools.delay(0.2);
      GameTools.typeText("The realm of sinners - ", ConsoleColors.YELLOW);
      GameTools.delay(1);
      GameTools.typeText("\"Hell.\"", ConsoleColors.RED_BOLD, 100);GameTools.delay(0.5);
      GameTools.delay(2); 

      if(GameState.isIfEd3()){
         GameTools.typeText("\n\nHoly yappathon...\n\n");
      }else{
         System.out.println();
         System.out.println();
      }
      
      //Name Scene
      GameTools.typeText("<Voice:>\n", ConsoleColors.YELLOW_BOLD);
      GameTools.delay(0.7);
      GameTools.typeText("Before proceeding... ", ConsoleColors.YELLOW);
      GameTools.delay(1.5);
      GameTools.typeText("Do you wish to name yourself?", ConsoleColors.YELLOW, 70);GameTools.delay(0.5);
      System.out.println();
      
      System.out.print(ConsoleColors.WHITE_BOLD + "\n[Y] \"Yes.\" \n[N] \"I require no name.\"\n" + ConsoleColors.RESET);
      char yn = GameTools.getyn(scanner);
        
      if (yn == 'Y' || yn == 'y') {
         GameTools.typeText("\n\"Yes.\"\n\n", 75);
         GameTools.delay(1.5);
         GameTools.typeText("<Voice:>\n", ConsoleColors.YELLOW_BOLD);
         GameTools.delay(0.7);
         GameTools.typeText("Then Speak your chosen designation.\n\n", ConsoleColors.YELLOW, 75);
         GameTools.delay(0.5);
         System.out.print("Name: ");
         String name = scanner.nextLine();
         GameState.setPlayerName(name);
         
         GameTools.typeText("\n<Voice:>\n", ConsoleColors.YELLOW_BOLD);
         GameTools.delay(1);
         GameTools.typeText("" + GameState.getPlayerName() + ". ", ConsoleColors.YELLOW, 100);GameTools.delay(0.5);
         GameTools.typeText("So it shall be recorded in the Celestial Register.\n", ConsoleColors.YELLOW, 50);GameTools.delay(0.5);
         
      } else {
         GameTools.typeText("\n\"I require no name.\"\n\n", 75);
         GameTools.delay(1.5);
         GameTools.typeText("<Voice:>\n", ConsoleColors.YELLOW_BOLD);
         GameTools.delay(1);
         GameTools.typeText("Self-denial? ", ConsoleColors.YELLOW);GameTools.delay(0.5);
         GameTools.delay(1);
         GameTools.typeText("Futile.\n", ConsoleColors.YELLOW);GameTools.delay(0.5);
         GameTools.delay(0.7);
         GameTools.typeText("I am vested with the authority to name, ", ConsoleColors.YELLOW);GameTools.delay(0.2);
         GameTools.typeText("therefore shall.\n", ConsoleColors.YELLOW);GameTools.delay(0.5);
         GameTools.delay(1);
         GameTools.typeText("You are... ", ConsoleColors.YELLOW);
         GameTools.delay(1.5);
         GameTools.typeText("Luce.", ConsoleColors.WHITE_BOLD, 100);GameTools.delay(0.5);
         GameState.setPlayerName("Luce");
      }   
      GameTools.delay(2);
      GameTools.typeText("\n\n");
      GameTools.delay(0.7);
      
      //Scene 4
      GameTools.typeText("<Voice:>\n", ConsoleColors.YELLOW_BOLD);
      GameTools.delay(1);
      GameTools.typeText("" + GameState.getPlayerName() + ", ", ConsoleColors.YELLOW);GameTools.delay(0.2);
      GameTools.typeText("attend carefully to my counsel.\n", ConsoleColors.YELLOW);GameTools.delay(0.5);
      GameTools.delay(0.7);
      GameTools.typeText("Hell is peril incarnate - ", ConsoleColors.YELLOW);
      GameTools.delay(0.5);
      GameTools.typeText("the eternal penitentiary for those who defied our Holy Father.\n", ConsoleColors.YELLOW);GameTools.delay(0.5);
      GameTools.delay(0.7);
      GameTools.typeText("Under normal circumstances, ", ConsoleColors.YELLOW);GameTools.delay(0.2);
      GameTools.typeText("I am to guide you throughout your journey.\n", ConsoleColors.YELLOW);GameTools.delay(0.2);
      GameTools.typeText("Unfortunately the connection between the Heavens and Hell has been severed through some unknown means.", ConsoleColors.YELLOW);GameTools.delay(0.2);
      GameTools.typeText("\n");
      GameTools.typeText("I cannot be your guide... ", ConsoleColors.YELLOW);
      GameTools.delay(1.5);
      
      // SKIP DIALOGUE LOGIC
      if(GameState.isIfEd3()){
         System.out.println();
         GameTools.typeText("");
         GameTools.typeText("\n[Skip?]\n", ConsoleColors.RED_BOLD);
         char yesn = GameTools.getyn(scanner);   

         if(Character.toUpperCase(yesn) == 'Y'){
               runZoneout();
         }else{
            runAdvice();
         }
      }else{
         runAdvice();
      }

      GameTools.pressToContinue(scanner);
        
      if (GameState.isIfEd3()) {
         System.out.println();
         GameTools.typeText("A strange energy pulls you elsewhere...", ConsoleColors.PURPLE);
         GameTools.typeText("\nThe fabric of reality shifts around you...\n\n", ConsoleColors.PURPLE);
         GameTools.delay(2);
      }
   }

   private static void runAdvice(){
      System.out.println();
      GameTools.delay(0.7);
      GameTools.typeText("Such is the situation - ", ConsoleColors.YELLOW);
      GameTools.delay(0.5);
      GameTools.typeText("I shall give three absolute commandments to light your journey:\n\n", ConsoleColors.YELLOW);GameTools.delay(0.5);
      GameTools.delay(1);
      GameTools.typeText("First: ", ConsoleColors.YELLOW_BOLD);
      GameTools.delay(1);
      GameTools.typeText("Their corruption is insidious. ", ConsoleColors.YELLOW);GameTools.delay(0.5);
      GameTools.typeText("Trust nothing from the condemned.\n\n", ConsoleColors.YELLOW);GameTools.delay(0.5);
      GameTools.delay(1);
      GameTools.typeText("Second: ", ConsoleColors.YELLOW_BOLD);
      GameTools.delay(1);
      GameTools.typeText("Your sole purpose in such a realm is to simply go through the passage.\n\n", ConsoleColors.YELLOW);GameTools.delay(0.5);
      GameTools.delay(1);
      GameTools.typeText("Third: ", ConsoleColors.YELLOW_BOLD);
      GameTools.delay(1);
      GameTools.typeText("No unclean gifts shall be accepted. ", ConsoleColors.YELLOW);GameTools.delay(0.5);
      GameTools.typeText("Their price is damnation.\n\n", ConsoleColors.RED, 100);GameTools.delay(0.5);
      GameTools.delay(1);
      GameTools.typeText("Under no circumstances should you gaze upon their torment with anything but contempt.\n", ConsoleColors.YELLOW);GameTools.delay(0.5);
      GameTools.typeText("Their suffering is divine justice and it has been served.\n", ConsoleColors.YELLOW);GameTools.delay(0.5);
      GameTools.delay(1);
      GameTools.typeText("Your eyes remain only on the road.", ConsoleColors.YELLOW_BOLD, 100);GameTools.delay(0.5);
   }

   private static void runZoneout(){
      GameTools.delay(0.7);
      System.out.println();
      GameTools.typeText("You zone out of the exposition dump and finally.");
      GameTools.delay(0.5);
      GameTools.typeText("\nThe voice stops -");
      GameTools.delay(0.3);
      GameTools.typeText(" It expects you to walk into the next gate,");
      GameTools.delay(0.3);
      GameTools.typeText(" to play the game.", 60);
      GameTools.delay(0.7);
      GameTools.typeText("\n\nYou stare at the 'road' it mentioned,");
      GameTools.delay(0.3);
      GameTools.typeText(" that blazing ring of fire...");
      GameTools.delay(0.5);
      GameTools.typeText(" You really don't have the energy for this.", 60);
      GameTools.delay(0.7);
      GameTools.typeText("\n\nYou reach into your wings and take out one of the plumes,");
      GameTools.delay(0.3);
      GameTools.typeText(" It feels cold against your skin.", ConsoleColors.CYAN);
      GameTools.delay(0.5);
      GameTools.typeText("\nReal -");
      GameTools.delay(0.3);
      GameTools.typeText(" Unlike everything else here.", 60);
      GameTools.delay(0.7);
      GameTools.typeText("\n\nThe feather reveals a tear in the curtain.");
      GameTools.delay(0.5);
      GameTools.typeText("\nA passageway void of color;");
      GameTools.delay(0.5);
      GameTools.typeText(" Just a dull,", 60);
      GameTools.delay(0.3);
      GameTools.typeText(" transparent gray.", 60);
      GameTools.delay(0.7);
      GameTools.typeText("\n\nThe voice says nothing -");
      GameTools.delay(0.3);
      GameTools.typeText("\nWhy would it say anything else?");
      GameTools.delay(0.5);
      GameTools.typeText("\nIts just a puppet after all...", 60);
      GameTools.delay(0.7);
      GameTools.typeText("\n\nYou turn your back on the black hole");
      GameTools.delay(0.3);
      GameTools.typeText(" and the world disappears.");
      GameTools.delay(0.5);
      GameTools.typeText("\n\nAs you step into the colorless void.", ConsoleColors.PURPLE, 60);
   }
}
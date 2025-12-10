import java.util.Scanner;

public class Mission1 {
   private static Scanner scanner = new Scanner(System.in);
    
   public static void start() {
      GameTools.clearScreen();
      GameTools.typeText("===== Void =====");
      GameTools.delay(2.5);
      
      
      GameTools.clearScreen();  
      
      // Scene 1
      if (GameState.isIfEd3()) {
         GameTools.typeText("You awaken in the endless void.");
         GameTools.delay(0.5);
         GameTools.typeText(" Again.", 50);
         GameTools.delay(0.7);
         GameTools.typeText("\nIt's a formless nothing stretching infinitely -");
         GameTools.typeText(" Standard issue oblivion.");

         GameTools.delay(0.7);

         GameTools.typeText("\n\nBefore you,"); 
         GameTools.delay(0.3);
         GameTools.typeText(" a vast black hole looms...");
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
      // Scene 1
         GameTools.typeText("You awaken in an endless void, ");GameTools.delay(0.2);
         GameTools.typeText("a formless nothing stretching infinitely.\n");
         GameTools.delay(0.7);
      
         GameTools.typeText("Before you, ");GameTools.delay(0.2);
         GameTools.typeText("a vast black hole looms.\n");
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
         GameTools.typeText("devoid of luster.\n");GameTools.delay(0.5); // period pause
         GameTools.delay(0.7);
      
         GameTools.typeText("It generates a gravity so strong, ");GameTools.delay(0.2);
         GameTools.typeText("it forms a blazing ring of stolen radiance around it.\n\n");
         GameTools.delay(0.7);
      
         GameTools.typeText("No light reaches you, ");
         GameTools.delay(0.2);
         GameTools.typeText("it feels as if the light itself has forsaken you.", 100);
         GameTools.delay(1);
         GameTools.typeText("\n");
         GameTools.delay(1);
         GameTools.typeText("\n");
         GameTools.delay(1);
         GameTools.typeText("Refusing to guide your way.", 100);
      }
        
      GameTools.pressToContinue(scanner);//
      System.out.println();
      
      // Scene 2
      if (GameState.isIfEd3()) {
         GameTools.typeText("You feel a familiar energy coursing through you...");
      
      
      } else {
      // Scene 2
         GameTools.typeText("Then, ");GameTools.delay(0.2);
         GameTools.typeText("a voice. ");GameTools.delay(0.5);
         GameTools.typeText("It parts the ever silent void.\n");GameTools.delay(0.5);
         GameTools.delay(0.7); // paragraph break
      
         GameTools.typeText("A resonant tone emanates from the very nonexistence of it, ");GameTools.delay(0.2);
         GameTools.typeText("\n");
         GameTools.typeText("speaking directly into your mind.\n\n");GameTools.delay(0.5);
         GameTools.delay(0.7); // paragraph break
      
         GameTools.typeText("<Voice:>\n");
         GameTools.delay(1);
         GameTools.typeText("\"You Have awakened, ");GameTools.delay(0.2);
         GameTools.typeText("fledgling.\"\n", 100);GameTools.delay(0.5);
         GameTools.delay(1);
         GameTools.typeText("\"Come, ");GameTools.delay(0.2);
         GameTools.typeText("your journey awaits.\"\n\n", 100);GameTools.delay(0.5);
         GameTools.delay(0.7); // paragraph break
      
         GameTools.typeText("An instinctual compulsion roots you to your purpose.\n");GameTools.delay(0.5);
         GameTools.delay(0.7); // paragraph break
      
         GameTools.typeText("The voice has not forbidden any other paths, ");GameTools.delay(0.2);
         GameTools.typeText("\n");
         GameTools.typeText("yet you are given an absolute in his presence - ");
         GameTools.delay(1);
         GameTools.typeText("To obey is not a decision; ");GameTools.delay(0.2);
         GameTools.typeText("it is an inevitability.");GameTools.delay(0.5);
      }
      
      GameTools.pressToContinue(scanner);//
      System.out.println();
      //Scene 3
      if (GameState.isIfEd3()) {
         GameTools.typeText("You feel a familiar energy coursing through you...");
      
      } else {  
      // Scene 3
         GameTools.typeText("[0] \"Journey?\"\n[Enter to Continue]");
         scanner.nextLine();
         System.out.println();
      
         GameTools.typeText("<Voice:>\n");
         GameTools.delay(1);
         GameTools.typeText("\"You have yes, ");GameTools.delay(0.2);
         GameTools.typeText("all Angels have an ultimatum.\n");GameTools.delay(0.5);
         GameTools.delay(0.7); // paragraph break
      
         GameTools.typeText("To serve the Divine Presence, ");GameTools.delay(0.2);
         GameTools.typeText("our Lord.\n\n", 80);GameTools.delay(0.5);
         GameTools.delay(0.7); // paragraph break
      
         GameTools.typeText("HE resides within the Heavens, ");GameTools.delay(0.2);
         GameTools.typeText("a mere three realms away.\n");GameTools.delay(0.5);
         GameTools.delay(0.7); // paragraph break
      
         GameTools.typeText("It is imperative to our purpose that ");
         GameTools.typeText("newborns must go through a trial before being subject to the heavenly will.\n\n");GameTools.delay(0.5);
         GameTools.delay(0.7); // paragraph break
      
         GameTools.typeText("You shall traverse a realm to get to the Celestial Abode: ");GameTools.delay(0.2);
         GameTools.typeText("The realm of sinners - ");
         GameTools.delay(1);
         GameTools.typeText("\"Hell.\"", 100);GameTools.delay(0.5);
         GameTools.delay(2); // long pause
         GameTools.typeText("\n\n");
         GameTools.delay(1);
      }
      
      
      
      GameTools.typeText("<Voice:>\n");
      GameTools.delay(0.7);
      GameTools.typeText("Before proceeding... ");
      GameTools.delay(1.5);
      GameTools.typeText("Do you wish to name yourself?", 70);GameTools.delay(0.5);
      System.out.println();
      // Simple char input for yes/no
      char yn;
      while (true) {
         System.out.print("[Y] \"Yes.\" \n[N] \"I require no name.\"\n: ");
         yn = scanner.nextLine().charAt(0);
            
         switch (Character.toUpperCase(yn)) {
            case 'Y':
            case 'N':
               break;
            default:
               System.out.println("Invalid input! Please enter Y or N.");
               continue;
         }
         break;
      }
        
      if (yn == 'Y' || yn == 'y') {
         GameTools.typeText("\n\"Yes.\"\n\n", 75);
         GameTools.delay(1.5);
      
         GameTools.typeText("<Voice:>\n");
         GameTools.delay(0.7);
         GameTools.typeText("Then Speak your chosen designation.\n\n", 75);
         GameTools.delay(0.5);
      
         System.out.print("Name: ");
         String name = scanner.nextLine();
         GameState.setPlayerName(name);
         
         
         GameTools.typeText("\n<Voice:>\n");
         GameTools.delay(1);
         GameTools.typeText("" + GameState.getPlayerName() + ". ", 100);GameTools.delay(0.5);
         GameTools.typeText("So it shall be recorded in the Celestial Register.\n", 50);GameTools.delay(0.5);
         
         
      } else {
         GameTools.typeText("\n\"I require no name.\"\n\n", 75);
         GameTools.delay(1.5);
      
         GameTools.typeText("<Voice:>\n");
         GameTools.delay(1);
         GameTools.typeText("Self-denial? ");GameTools.delay(0.5);
         GameTools.delay(1);
         GameTools.typeText("Futile.\n");GameTools.delay(0.5);
         GameTools.delay(0.7);
      
         GameTools.typeText("I am vested with the authority to name, ");GameTools.delay(0.2);
         GameTools.typeText("therefore shall.\n");GameTools.delay(0.5);
         GameTools.delay(1);
      
         GameTools.typeText("You are... ");
         GameTools.delay(1.5);
         GameTools.typeText("Luce.", 100);GameTools.delay(0.5);
      
         GameState.setPlayerName("Luce");
      }   
      GameTools.delay(2);
      GameTools.typeText("\n\n");
      GameTools.delay(0.7);
   
      GameTools.typeText("<Voice:>\n");
      GameTools.delay(1);
      GameTools.typeText("" + GameState.getPlayerName() + ", ");GameTools.delay(0.2);
      GameTools.typeText("attend carefully to my counsel.\n");GameTools.delay(0.5);
      GameTools.delay(0.7);
   
      GameTools.typeText("Hell is peril incarnate - ");
      GameTools.delay(0.5);
      GameTools.typeText("the eternal penitentiary for those who defied our Holy Father.\n");GameTools.delay(0.5);
      GameTools.delay(0.7);
   
      GameTools.typeText("Under normal circumstances, ");GameTools.delay(0.2);
      GameTools.typeText("I am to guide you throughout your journey.\n");GameTools.delay(0.2);
      GameTools.typeText("Unfortunately the connection between the Heavens and Hell has been severed through some unknown means.");GameTools.delay(0.2);
      GameTools.typeText("\n");
      GameTools.typeText("I cannot be your guide... ");
      GameTools.delay(1.5);
      GameTools.typeText("\n\n");
      GameTools.delay(0.7);
   
      GameTools.typeText("Such is the situation - ");
      GameTools.delay(0.5);
      GameTools.typeText("I shall give three absolute commandments to light your journey:\n\n");GameTools.delay(0.5);
      GameTools.delay(1);
   
      GameTools.typeText("First: ");
      GameTools.delay(1);
      GameTools.typeText("Their corruption is insidious. ");GameTools.delay(0.5);
      GameTools.typeText("Trust nothing from the condemned.\n\n");GameTools.delay(0.5);
      GameTools.delay(1);
   
      GameTools.typeText("Second: ");
      GameTools.delay(1);
      GameTools.typeText("Your sole purpose in such a realm is to simply go through the passage.\n\n");GameTools.delay(0.5);
      GameTools.delay(1);
   
      GameTools.typeText("Third: ");
      GameTools.delay(1);
      GameTools.typeText("No unclean gifts shall be accepted. ");GameTools.delay(0.5);
      GameTools.typeText("Their price is damnation.\n\n", 100);GameTools.delay(0.5);
      GameTools.delay(1);
   
      GameTools.typeText("Under no circumstances should you gaze upon their torment with anything but contempt.\n");GameTools.delay(0.5);
      GameTools.typeText("Their suffering is divine justice and it has been served.\n");GameTools.delay(0.5);
      GameTools.delay(1);
      GameTools.typeText("Your eyes remain only on the road.", 100);GameTools.delay(0.5);
      
      //
      
      //GameState.displayState();
      GameTools.pressToContinue(scanner);
        
        // Check if Ed3 is true and run Unnamed mission
      if (GameState.isIfEd3()) {
         System.out.println();
         GameTools.typeText("A strange energy pulls you elsewhere...");
         GameTools.typeText("The fabric of reality shifts around you...\n");
         GameTools.delay(2);
         Unnamed.start();
      }
        
   }
}
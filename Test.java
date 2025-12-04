import java.util.Scanner;
public class Test{
   private static Scanner scanner = new Scanner(System.in);
   public static void main(String[] args){
      Scanner key = new Scanner(System.in);
   
            // GScene 1
      GameTools.typeText("\n\n");
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
      GameTools.delay(0.7);
   
      GameTools.typeText("Then you see it.\n\n");GameTools.delay(0.5);
      GameTools.delay(0.7);
   
      GameTools.typeText("The ground is a spongy morass of half-digested food.\n");GameTools.delay(0.5);
      GameTools.typeText("Their punishment is an eternal, ");GameTools.delay(0.2);
      GameTools.typeText("starving consumption.\n");GameTools.delay(0.5);
      GameTools.delay(1);
   
      GameTools.typeText("Gorged on nothing, ");GameTools.delay(0.2);
      GameTools.typeText("forever craving everything.", 100);GameTools.delay(0.5);
      
      
      // GScene 2
      GameTools.pressToContinue(scanner);
      System.out.println();
      GameTools.delay(0.5);
      
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
      System.out.println("[1] Ignore it");
      System.out.println("[2] Help the soul");
      System.out.print("Enter choice (1 or 2): ");
      
      String gChoice = scanner.nextLine();
      switch (gChoice) {
         case "1":
            //status effect
            GameState.setStatusEffectTaint(true);
            GameTools.typeText("Status Effect Taint remains: " + GameState.hasStatusEffectTaint());
            break;
         case "2":
            //statuseffect + increment sin
            GameState.setStatusEffectTaint(true);
            GameState.incrementSinCounter();
            GameTools.typeText("Status Effect Taint: " + GameState.hasStatusEffectTaint());
            break;
         default:
            GameTools.typeText("Invalid choice. Defaulting to option 1.");
      }
      
      GameTools.typeText("Sin counter: " + GameState.getSinCounter());
   
      GameTools.pressToContinue(scanner);
   
   
   }
}
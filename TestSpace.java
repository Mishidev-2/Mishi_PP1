import java.util.*;

public class TestSpace{
   public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      
/*
GameTools.pressToContinue(scanner);
System.out.println();
*/

//"Shielding your eyes, you move towards the blinding glare. A structure emerges from the brightness: a labyrinth of pure glass. Through the shifting walls, you spot a familiar glimmer—the specific light the angel spoke of. A wave of realization hits you. This is it. The passage to Heaven."
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
        GameTools.typeText("\n\nThis is it.");
        GameTools.delay(0.3);
        GameTools.typeText(" The passage to Heaven.", 80);
        GameTools.delay(0.7);
   GameTools.runMazeGame(scanner);
      //


   /*Commas: 0.3 s
   Periods: 0.5
   Paragraphs: 0.7*/

   
   }
}
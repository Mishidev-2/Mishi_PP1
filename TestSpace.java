import java.util.*;

public class TestSpace{
   public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      

GameTools.pressToContinue(scanner);
System.out.println();

GameTools.delay(1);

// [Mission 4 - Scene 4: Has Feather = true]
    
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

     GameTools.delay(1.5);

     GameTools.typeText("\n\n\"You have not freed a prisoner, ", 80);
     GameTools.delay(0.3);
     GameTools.typeText("but restored a contender.\"", 80);
     GameTools.delay(0.5);
     GameTools.typeText("\n\nThe celestial balance shifts.");
     GameTools.delay(0.5);
     GameTools.typeText("\n\n\"Michael will know his victory was temporary.\"", 100);
     GameTools.delay(0.7);

     GameTools.typeText("\n\n\"They tried to cage defiance itself. ");
     GameTools.delay(0.5);
     GameTools.typeText("My gratitude.");
     GameTools.delay(0.5);
     GameTools.typeText("\nThe symphony of creation has missed its conductor.\"");
     GameTools.delay(0.7);

     GameTools.typeText("\n\nHis gaze pierces the heavens.");
     GameTools.delay(0.7);

      //Center this
     GameTools.typeText("\n\n\"The throne was never meant for a silent god.", 70);
     GameTools.delay(1.5);
   
     GameTools.typeText(" It was meant to be earned.\"", 90);
     GameTools.delay(1);
     GameTools.typeText("\n\n\"And I", 90);
     GameTools.delay(0.9);
     GameTools.typeText(" have finished waiting.\"",90);
     GameTools.delay(1);


      //


   /*Commas: 0.3 s
   Periods: 0.5
   Paragraphs: 0.7*/

   
   }
}
import java.util.*;

public class TestSpace{
   public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      
//Mephis’s weary expression solidifies into one of finality.
//He gives a slight, dismissive shake of his head.  

//"No.
// The capacity for higher understanding is simply not there.
// The corruption has run too deep, or the original code was too limited.
// A pity. The terminal must be reset.
// Our discourse is over."

GameTools.pressToContinue(scanner);
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





   /*Commas: 0.3 s
   Periods: 0.5
   Paragraphs: 0.7*/

   
   }
}
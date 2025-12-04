import java.util.*;

public class TestSpace{
   public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
         
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
   
      GameTools.typeText("\"Tell me - \"\n\n"); GameTools.delay(0.5);
      GameTools.delay(1);
   
      GameTools.typeText("\"When a soul feeds on everything yet remains empty, \n"); GameTools.delay(0.3);
      GameTools.delay(0.7);
      GameTools.typeText("what sin binds it?\"\n"); GameTools.delay(0.5);
      GameTools.delay(1);
      System.out.print("(Attempt 1): ");
      String answer = scanner.nextLine();
      
      GameTools.pressToContinue(scanner);
   
   
   /*Commas: 0.3 s
   Periods: 0.5
   Paragraphs: 0.7*/

   
   }
}
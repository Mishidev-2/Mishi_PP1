import java.util.*;

public class TestSpace{
   public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      

//[Mission 3 - Scene 4]
/* 
Unknown Demon: 
"Behold the Arbor Lucis."

"This fruit purges corruption, a reset for tainted existence. I am Mephis, its curator.

Mephis shifts his gaze to you... 
No.
Inside of you.

<Mephis:> 
"You are running on corrupted logic. I see the fatal error pulsing beneath your skin..."

"If only there were a debugger for such a primitive model. Oh, wait."

He produces the fruit, holding it out carelessly.

"THIS clears the crash. A factory reset. It is **sufficient** to keep you functioning."

He then holds up the feather, his eyes narrowing intensely.

"But this is the _update_. You could walk away merely 'repaired,' remaining the glitch you are... but why choose to be obsolete when you can be rewritten?"

I won't reset you only to leave you obsolete. 

So, choose: accept both the upgrade and the purge to continue, or refuse and let the corruption terminate you."
*/

//Scene 
            GameTools.delay(0.7);

            GameTools.typeText("\n\n\"So, choose:", 100);
            GameTools.delay(0.9);
            GameTools.typeText("\nAccept both the upgrade and the purge to continue,", 60);
            GameTools.typeText(" or refuse", 70);
            GameTools.typeText(" and let the corruption terminate you.\"", 60);

            GameTools.typeText("\n\n===== CRITICAL CHOICE =====\n\n");
            GameTools.typeText("Current State:");
            GameTools.typeText("\n- Status Effect Taint: " + GameState.hasStatusEffectTaint());
            GameTools.typeText("\n- Sin Counter: " + GameState.getSinCounter());
            
            GameTools.typeText("\n\nChoose:");
            GameTools.typeText("\n[1] \"Yes. I will take the feather and the fruit.\"");
            GameTools.typeText("\n[2] \"No. I will accept neither.\"");
            GameTools.delay(25);
            GameTools.typeText("\n[3] \"No. I only want the fruit.\"");
            System.out.print("Enter your choice: ");
            
            String choice = scanner.nextLine();




GameTools.pressToContinue(scanner);
System.out.println();
   /*Commas: 0.3 s
   Periods: 0.5
   Paragraphs: 0.7*/

   
   }
}
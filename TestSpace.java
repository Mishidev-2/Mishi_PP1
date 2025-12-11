import java.util.*;

public class TestSpace{
   public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      

      showTitleCard();


   scanner.close();
   }
// Add this to GameTools.java

    public static void showTitleCard() {
        GameTools.clearScreen();
        
        // Optional: Top border for emphasis
        System.out.println("                                         "); 
        
        // Print the title slowly
        GameTools.typeText("======== THE BROKEN PARADIGM ========", 50); // 20ms speed
        
        System.out.println(); // New line
        System.out.println("                                         "); 

        // Dramatic pause
         GameTools.delay(1.5);
        
        // Optional: Subtitle or "Press Enter" prompt
        System.out.println("\n      [ Press Enter to Begin ]");
        
        // Wait for user input to clear the title card
        Scanner tempScanner = new Scanner(System.in);
        tempScanner.nextLine();
        
         GameTools.clearScreen();
    }




}
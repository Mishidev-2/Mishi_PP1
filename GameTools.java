import java.util.Scanner;

public class GameTools {
    
   public static void clearScreen() {
      for (int i = 0; i < 50; i++) {
         System.out.println();
      }
   }
    
   public static void delay(double seconds) {
      try {
         Thread.sleep((long)(seconds * 1000));
      } catch (InterruptedException e) {}
   }
    
   public static void pressToContinue(Scanner key) {
      System.out.print("\n\n[Press Enter to continue...]");
      key.nextLine();
   }
    
    // Default speed (30ms)
   public static void typeText(String text) {
      typeText(text, 25);
   }
    
    // Adjustable speed - just change the number for speed in milliseconds
   public static void typeText(String text, int speed) {
      for(char c : text.toCharArray()) {
         System.out.print(c);
         System.out.flush();
         try {
            Thread.sleep(speed);
         } catch (InterruptedException e) {}
      }
   }
    
    // Riddle
   public static boolean checkRiddleAnswer(String userInput, String[] keywords) {
      String input = userInput.toLowerCase();
      for (String keyword : keywords) {
         if (input.matches(".*\\b" + keyword + "\\b.*")) {
            return true;
         }
      }
      return false;
   }
    
   public static void displayGlitchEffect() {
      String chars = "!@#$%^&*()_+-=[]{}|;:,.<>?/~`0123456789";
   
    // First 5 lines of random glitch
      for(int i = 0; i < 5; i++) {
         StringBuilder line = new StringBuilder();
         for(int j = 0; j < 53; j++) {
            int randomIndex = (int)(Math.random() * chars.length());
            line.append(chars.charAt(randomIndex));
         }
         System.out.println(line.toString());
         try { Thread.sleep(20); } 
         catch (InterruptedException e) {}
      }
   
    //HE is here
      String[] glitches = {
         "=##========#=======#= H3 i5 h3r3 =##========#=======",
         "{>}>$@0&(=======#=====#=== 3 i5 h =======#=====#===0",
         "@1)2=====#====== H3 i5 h3r3 ==#======#======!@1)3{67",
         "=!@$====#=====#= HE i5 h3r3 ========#=====#=^#Y$H#!@",
         "!@=#========#== HE is h3r3 ===#========#===+!+!@___#",
         "=@!#!#!========#= HE is her3 ============#=!@#@!SE@!"
         };
   
      for (String glitch : glitches) {
         System.out.print(glitch);
         try { Thread.sleep(80); } 
         catch (InterruptedException e) {}
         System.out.print("\r");
      }
   
   
      typeText("==================== HE is here ====================", 0);
      System.out.println();
   
   
      for(int i = 0; i < 5; i++) {
         StringBuilder line = new StringBuilder();
         for(int j = 0; j < 53; j++) {
            int randomIndex = (int)(Math.random() * chars.length());
            line.append(chars.charAt(randomIndex));
         }
         System.out.println(line.toString());
         try { Thread.sleep(20); } 
         catch (InterruptedException e) {}
      }
   }
   //GameTools.displayGlitchEffect(); - usecase
    
    
    
    // Maze game utility
   public static boolean runMazeGame(Scanner scanner) {
        // 9x9 maze represented as a 2D array
        // 0 = path, 1 = wall, 2 = player, 3 = exit
      int[][] maze = {
            {1, 1, 1, 1, 1, 1, 1, 1, 1},
            {1, 2, 0, 0, 0, 0, 0, 0, 1},
            {1, 1, 1, 0, 1, 1, 1, 0, 1},
            {1, 0, 0, 0, 0, 0, 1, 0, 1},
            {1, 0, 1, 1, 1, 0, 1, 0, 1},
            {1, 0, 0, 0, 1, 0, 0, 0, 1},
            {1, 1, 1, 0, 1, 1, 1, 0, 1},
            {1, 0, 0, 0, 0, 0, 0, 3, 1},
            {1, 1, 1, 1, 1, 1, 1, 1, 1}
         };
        
      int playerX = 1, playerY = 1; // Starting position
        
      typeText("Welcome to the Maze! Find the exit (marked as 3). Use W,A,S,D to move.");
        
      while (true) {
            // Display maze
         displayMaze(maze);
            
         System.out.print("Enter move (W/A/S/D) or Q to quit: ");
         String move = scanner.nextLine().toUpperCase();
            
         int newX = playerX, newY = playerY;
            
         switch (move) {
            case "W": newY--; 
               break;
            case "S": newY++; 
               break;
            case "A": newX--; 
               break;
            case "D": newX++; 
               break;
            case "Q": 
               typeText("You quit the maze.");
               return false;
            default:
               typeText("Invalid move! Use W, A, S, D, or Q.");
               continue;
         }
            
            // Check if move is valid
         if (newX >= 0 && newX < 9 && newY >= 0 && newY < 9) {
            if (maze[newY][newX] == 0 || maze[newY][newX] == 3) { // Path or exit
                    // Move player
               maze[playerY][playerX] = 0; // Clear old position
               playerX = newX;
               playerY = newY;
                    
               if (maze[playerY][playerX] == 3) { // Reached exit
                  displayMaze(maze);
                  typeText("Congratulations! You escaped the maze!");
                  return true;
               }
                    
               maze[playerY][playerX] = 2; // Set new position
            } else {
               typeText("You hit a wall! Try another direction.");
            }
         } else {
            typeText("Invalid move! You can't go that way.");
         }
      }
   }
    
   private static void displayMaze(int[][] maze) {
      clearScreen();
      System.out.println("=== MAZE ===");
      for (int i = 0; i < 9; i++) {
         for (int j = 0; j < 9; j++) {
            switch (maze[i][j]) {
               case 0: System.out.print(" "); 
                  break; // Path
               case 1: System.out.print("█"); 
                  break; // Wall
               case 2: System.out.print("P"); 
                  break; // Player
               case 3: System.out.print("E"); 
                  break; // Exit
            }
            System.out.print(" ");
         }
         System.out.println();
      }
      System.out.println();
   }
}
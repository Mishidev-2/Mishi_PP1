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
      typeText(text, 1);
   }
    // just change the number for speed in milliseconds
   public static void typeText(String text, int speed) {
      for(char c : text.toCharArray()) {
         System.out.print(c);
         System.out.flush();
         try {
            Thread.sleep(speed);
         } catch (InterruptedException e) {}
      }
   }


   //YN choices
   //Usecase: 'choice' char GameTools.getyn(scanner);

   public static char getyn(Scanner scanner) {
      char input;
      while (true) {
         System.out.print("[Y/N]: ");
         String line = scanner.nextLine().trim();

         if (!line.isEmpty()) {
               input = Character.toUpperCase(line.charAt(0));
               if (input == 'Y' || input == 'N') {
                  return input;
               }
         }
         System.out.println("Invalid input. Please type 'Y' or 'N'.");
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
        // --- 1. SETUP THE MAP ---
        // A 2D array represents the grid.
        // 0 = empty path, 1 = wall, 2 = player, 3 = exit
        int[][] maze = {
            {1, 1, 1, 1, 1, 1, 1, 1, 1},
            {1, 2, 0, 0, 0, 0, 0, 0, 1}, // Player starts at row 1, col 1
            {1, 1, 1, 0, 1, 1, 1, 0, 1},
            {1, 0, 0, 0, 0, 0, 1, 0, 1},
            {1, 0, 1, 1, 1, 0, 1, 0, 1},
            {1, 0, 0, 0, 1, 0, 0, 0, 1},
            {1, 1, 1, 0, 1, 1, 1, 0, 1},
            {1, 0, 0, 0, 0, 0, 0, 3, 1},
            {1, 1, 1, 1, 1, 1, 1, 1, 1}
        };

        // Track player coordinates (x = column, y = row)
        int playerX = 1; 
        int playerY = 1; 

        // Intro text
        typeText("Get to the Heavensgate. (Use W,A,S,D to move.)");
        delay(0.5);
        pressToContinue(scanner);

        // --- 2. THE GAME LOOP ---
        // This runs forever until the player wins (returns true) or quits (returns false)
        while (true) {
            
            // Draw the current state of the map
            displayMaze(maze);

            // Get input
            System.out.print("Enter move (W/A/S/D): ");
            String move = scanner.nextLine().toUpperCase();

            // Calculate "Proposed" Move
            // We don't change playerX/Y yet; we calculate where they WANT to go (newX/newY).
            int newX = playerX;
            int newY = playerY;

            switch (move) {
                case "W": newY--; break; // Up (decrease row index)
                case "S": newY++; break; // Down (increase row index)
                case "A": newX--; break; // Left (decrease column index)
                case "D": newX++; break; // Right (increase column index)
                case "Q":
                    typeText("You quit the maze.");
                    return false;
                default:
                    typeText("Invalid move! Use W, A, S, D.");
                    continue; // Skip the rest of the loop and ask for input again
            }

            // --- 3. COLLISION CHECKS ---
            
            // First: Are we staying inside the array boundaries?
            if (newX >= 0 && newX < 9 && newY >= 0 && newY < 9) {

                // Get the value of the tile we are trying to step on
                int targetTile = maze[newY][newX];

                // IF the tile is a Path (0) or the Exit (3)
                if (targetTile == 0 || targetTile == 3) {
                    
                    // A. Clear the player's CURRENT spot (make it empty space)
                    maze[playerY][playerX] = 0;

                    // B. Update coordinates to the NEW spot
                    playerX = newX;
                    playerY = newY;

                    // C. Check for Win
                    if (targetTile == 3) {
                        maze[playerY][playerX] = 2; // Draw player on the exit
                        displayMaze(maze);
                        typeText("You reach a door made of light....");
                        delay(1);
                        return true;
                    }

                    // D. Place the player in the new spot in the array
                    maze[playerY][playerX] = 2;

                } else {
                  System.out.println();
                  //Death if hit wall
                  typeText("Your fingers graze the glass wall.");
                  delay(0.5);
                  typeText(" Panic sets in as you try to pull back,");
                  delay(0.3);
                  typeText(" but the frost binds your skin instantly.");
                  delay(0.7);
                  typeText("\n\nThe cold creeps up your arms,");
                  delay(0.3);
                  typeText(" settling deep in your chest,");
                  delay(0.5);
                  typeText(" until finally...");
                  delay(0.7);
                  typeText(" Even your soul freezes over.");
                  delay(0.5);
                  pressToContinue(scanner);

                    // 1. Erase player from where they currently are standing
                    maze[playerY][playerX] = 0;

                    // 2. Hard reset coordinates back to start (1, 1)
                    playerX = 1;
                    playerY = 1;

                    // 3. Put the player back at the start in the array
                    maze[playerY][playerX] = 2;
                }

            } else {
                // If the player tries to go outside the array bounds (shouldn't happen with walls, but good safety)
                typeText("Invalid move! You can't go that way.");
            }
        }
    }
//
    // ==========================================
    // VISUALIZATION
    // ==========================================
    private static void displayMaze(int[][] maze) {
        clearScreen();
        System.out.println("===== MAZE OF ETERNAL COLD =====");
        
        // Loop through every Row (i)
        for (int i = 0; i < 9; i++) {
            // Loop through every Column (j) inside that row
            for (int j = 0; j < 9; j++) {
                
                
                switch (maze[i][j]) {
                    case 0: System.out.print(" "); break; // Path (Empty)
                    case 1: System.out.print("█"); break; // Wall
                    case 2: System.out.print("P"); break; // Player
                    case 3: System.out.print("E"); break; // Exit
                }
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
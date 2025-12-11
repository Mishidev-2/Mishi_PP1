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
        // 0 = empty path, 1 = wall, 2 = player, 3 = exit
        int[][] maze = {
            {1, 1, 1, 1, 1, 1, 1, 1, 1},
            {1, 2, 0, 0, 0, 0, 0, 0, 1}, //player starts at row 1, col 1
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

      //intro
        typeText("Get to the Heavensgate. (Use W,A,S,D to move.)");
        delay(0.5);
        pressToContinue(scanner);


        //runs forever until the player wins (returns true) or quits (returns false)
        while (true) {
            

            displayMaze(maze);

            // Get input
            System.out.print("Enter move (W/A/S/D): ");
            String move = scanner.nextLine().toUpperCase();

            int newX = playerX;
            int newY = playerY;

            switch (move) {
                case "W" -> newY--;
                // Up (decrease row index)
                case "S" -> newY++;
                // Down (increase row index)
                case "A" -> newX--;
                // Left (decrease column index)
                case "D" -> newX++;
                // Right (increase column index)
                case "Q" -> {
                    typeText("You quit the maze.");
                    return false;
                }
                default -> {
                    typeText("Invalid move! Use W, A, S, D.");
                    continue; // Skip the rest of the loop and ask for input again
                }
            }

            //collision stuffs
            
            //array boundaries - if within the 9x9 area or 8x8 rather
            if (newX >= 0 && newX < 9 && newY >= 0 && newY < 9) {

                //travel destination tile
                int targetTile = maze[newY][newX];

                // IF the tile is a Path (0) or the Exit (3)
                if (targetTile == 0 || targetTile == 3) {
                    
                    //clear current space
                    maze[playerY][playerX] = 0;

                    //update cords
                    playerX = newX;
                    playerY = newY;

                    //if exit tile
                    if (targetTile == 3) {
                        maze[playerY][playerX] = 2; // Draw player on the exit
                        displayMaze(maze);
                        typeText("You reach a door made of light....");
                        delay(1);
                        return true;
                    }

                    //place the player in the new spot in the array
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

                    //erase player from where they currently are standing
                    maze[playerY][playerX] = 0;

                    //hard reset coordinates back to start (1, 1)
                    playerX = 1;
                    playerY = 1;

                    //put the player back at the start in the array
                    maze[playerY][playerX] = 2;
                }

            } else {
                //jic goes outside array
                typeText("Invalid move! You can't go that way.");
            }
        }
    }

    private static void displayMaze(int[][] maze) {
        clearScreen();
        System.out.println("===== MAZE OF ETERNAL COLD =====");
        
        //Row (i)
        for (int i = 0; i < 9; i++) {
            //Column (j)
            for (int j = 0; j < 9; j++) {
                
                
                switch (maze[i][j]) {
                    case 0 -> System.out.print(" ");
                    //path
                    case 1 -> System.out.print("█");
                    //wall
                    case 2 -> System.out.print("P");
                    //player
                    case 3 -> System.out.print("E");
                    //exit
                }
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
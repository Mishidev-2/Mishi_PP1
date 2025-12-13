import java.util.Scanner;

public class GameTools {
    
    public static void showTitleCard(Scanner scanner) {
        clearScreen();
        System.out.println("                                         ");   
        typeText("======== THE BROKEN PARADIGM ========", ConsoleColors.YELLOW_BOLD, 20); 
        System.out.println(); 
        System.out.println("                                         "); 
        delay(1.5);
        System.out.println("\n      [ Press Enter to Begin ]");
        scanner.nextLine();
        clearScreen();       
    }

   public static void clearScreen() {
      for (int i = 0; i < 50; i++) {
         System.out.println();
      }
   }
    
   public static void delay(double seconds) {
      // If Instant Text is ON, skip delays
      if (GameState.isInstantText()) { return; }
      
      try {
         Thread.sleep((long)(seconds * 1000));
      } catch (InterruptedException e) {}
   }
    
   public static void pressToContinue(Scanner key) {
      System.out.print(ConsoleColors.WHITE_BOLD + "\n\n[Press Enter to continue...]" + ConsoleColors.RESET);
      key.nextLine();
   }
    
   // Overload: Text only
   public static void typeText(String text) {
      typeText(text, 30);
   }
   // Overload: Text + Color
   public static void typeText(String text, String color) {
      typeText(text, color, 30);
   }
   // Overload: Text + Color + Speed
   public static void typeText(String text, String color, int speed) {
      System.out.print(color);
      typeText(text, speed);
      System.out.print(ConsoleColors.RESET);
   }

   public static void typeText(String text, int speed) {
      //If instant text is enabled, print instantly and return
      if (GameState.isInstantText()) {
          System.out.print(text);
          System.out.flush();
          return;
      }
      
      for(char c : text.toCharArray()) {//converts text to char to print it one by one
         System.out.print(c);
         System.out.flush();//force show character immediately
         try {
             switch (c) {
                 case '.', '?', '!' -> Thread.sleep(speed + 300);//Delay for Punctuations and such
                 case ',' -> Thread.sleep(speed + 150);
                 default -> Thread.sleep(speed);
             }
         } catch (InterruptedException e) {}
      }
   }

   //YN choices
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

    //Riddle
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
         System.out.println(ConsoleColors.PURPLE + line.toString() + ConsoleColors.RESET);
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
         System.out.print(ConsoleColors.RED + glitch + ConsoleColors.RESET);
         try { Thread.sleep(80); } 
         catch (InterruptedException e) {}
         System.out.print("\r");
      }
   
      typeText("==================== HE is here ====================", ConsoleColors.RED_BOLD, 0);
      System.out.println();
   
   
      for(int i = 0; i < 5; i++) {
         StringBuilder line = new StringBuilder();
         for(int j = 0; j < 53; j++) {
            int randomIndex = (int)(Math.random() * chars.length());
            line.append(chars.charAt(randomIndex));
         }
         System.out.println(ConsoleColors.PURPLE + line.toString() + ConsoleColors.RESET);
         try { Thread.sleep(20); } 
         catch (InterruptedException e) {}
      }
   }
    
    
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

        int playerX = 1; 
        int playerY = 1; 

      //intro
        typeText("Get to the Heavensgate. (Use W,A,S,D to move.)");
        delay(0.5);
        pressToContinue(scanner);

        while (true) {
            displayMaze(maze);

            System.out.print("Enter move (W/A/S/D): ");
            String move = scanner.nextLine().toUpperCase();

            int newX = playerX;
            int newY = playerY;

            switch (move) {
                case "W" -> newY--;
                case "S" -> newY++;
                case "A" -> newX--;
                case "D" -> newX++;
                case "Q" -> {
                    typeText("You quit the maze.");
                    return false;
                }
                default -> {
                    typeText("Invalid move! Use W, A, S, D.");
                    continue; 
                }
            }

            if (newX >= 0 && newX < 9 && newY >= 0 && newY < 9) {
                int targetTile = maze[newY][newX];

                if (targetTile == 0 || targetTile == 3) {
                    maze[playerY][playerX] = 0;
                    playerX = newX;
                    playerY = newY;

                    if (targetTile == 3) {
                        maze[playerY][playerX] = 2; 
                        displayMaze(maze);
                        typeText("You reach a door made of light....", ConsoleColors.YELLOW_BOLD);
                        delay(1);
                        return true;
                    }
                    maze[playerY][playerX] = 2;

                } else {
                  System.out.println();
                  typeText("Your fingers graze the glass wall.", ConsoleColors.CYAN);
                  delay(0.5);
                  typeText(" Panic sets in as you try to pull back,");
                  delay(0.3);
                  typeText(" but the frost binds your skin instantly.", ConsoleColors.CYAN);
                  delay(0.7);
                  typeText("\n\nThe cold creeps up your arms,");
                  delay(0.3);
                  typeText(" settling deep in your chest,");
                  delay(0.5);
                  typeText(" until finally...");
                  delay(0.7);
                  typeText(" Even your soul freezes over.", ConsoleColors.CYAN_BOLD);
                  delay(0.5);
                  pressToContinue(scanner);

                    maze[playerY][playerX] = 0;
                    playerX = 1;
                    playerY = 1;
                    maze[playerY][playerX] = 2;
                }
            } else {
                typeText("Invalid move! You can't go that way.");
            }
        }
    }

    private static void displayMaze(int[][] maze) {
        clearScreen();
        System.out.println(ConsoleColors.CYAN + "=== MAZE OF ETERNAL COLD ===" + ConsoleColors.RESET);
        
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                switch (maze[i][j]) {
                    case 0 -> System.out.print(" ");
                    case 1 -> System.out.print(ConsoleColors.WHITE + "█" + ConsoleColors.RESET);
                    case 2 -> System.out.print(ConsoleColors.RED + "P" + ConsoleColors.RESET);
                    case 3 -> System.out.print(ConsoleColors.YELLOW + "E" + ConsoleColors.RESET);
                }
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
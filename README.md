Contributions:

Idea + Story + Dialogue - Shimizu
Text Formatting - Shimizu + Gemini Pro, Calmerin (Mission 4), Cangaida (Mission 3)

General Framework + the Code - Shimizu

Only used Gemini pro for text formatting + some methods I couldnt figure out such as
    GameTools.textType();
    GameTools.displayGlitchEffect();
    GameTools.runMazeGame();

VS's Github copilot (i think thats what it was) suggestions were used sometimes to make the code more efficient
But the majority of the code and logic were by me (Shimizu)


Thank you...

---------------------------------------------------------------------------------------------------------------

About the game:

This has a complete story mode - pretty long, so for quicker progression - set this:

 // Default speed (30ms)
   public static void typeText(String text) {
      typeText(text, 30); //<- set this to 1
   }

Game has a few gimmicks:
Yes or No Choices
Choice system that increments a counter
Riddles
Maze

It has 6 endings

Bad End 2 - Happens if you give the feather to the angel encased in ice

Good End - No feather + no sin

True Good End - Has feather + no sin

Bad End - No feather + sin higher than 0

True Bad End - Has feather + sin higher than 0

True Ending - Requirement: True Bad End


Files:

MainFile

Main menu
1. New Game - progresses normally, resets gamestates and runs the game from Mission 1

2. Mission Select
- resets gamestates
- allows you to select which mission to start from and set their prerequisites

3. Quit - quit


Mission 1:
Contains name
Alternative Dialogue if True Bad End is triggered
Alternative path if True Bad End is triggered

Mission 2:
Contains the sin increment choices
Contains 2 riddles

Mission 3:
Contains the taint variable which kills the player if not cured for long enough
Contains the last riddle
Contains the feather which is required for some endings

Mission 4:
Leads to bad end 2 if feather is given
Contains the maze

Unnamed.java
Secret level after unlocking true end

Endings:
Stores the endings

GameStates
Stores the Booleans and stuff

GameTools
Stores the methods I use such as typeText and delay






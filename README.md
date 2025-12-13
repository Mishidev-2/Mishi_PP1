Contributions:

Idea + Story + Dialogue - Shimizu
Text Formatting + testing - Shimizu, Calmerin, Cangayda, Gemini Pro

General Framework/flow of game + initial code - Shimizu

Only used Gemini pro for text formatting + some methods I couldnt figure out such as
    GameTools.textType();
    GameTools.displayGlitchEffect();// this one especially
    GameTools.runMazeGame();
    the atomic boolean was something new as well

VS's Github copilot (i think thats what it was) suggestions were used sometimes to make the code more efficient
But the majority of the code and logic were by a human.

Thank you...

---------------------------------------------------------------------------------------------------------------

How to run the game
> Open it up, wait for everything to load and run the MainFile
> PS the colors dont work in jgrasp

About the game:

This has a complete story mode
- for pure testingg turn instant text on
Game has a few gimmicks:
1. Yes or No Choices
2. Choice system that increments a counter
3. Riddles
4. Maze

It has 6 endings
1. Bad End - No feather + sin higher than 0
2. Bad End 2 - Happens if you give the feather to the angel encased in ice
3. Good End - No feather + no sin
4. True Good End - Has feather + no sin
5. True Bad End - Has feather + sin higher than 0
6. True Ending - Requirement: True Bad End


Files:
ConsoleColors - colors for the text and dialogue
MainFile
- Main menu
1. New Game - progresses normally, resets gamestates and runs the game from Mission 1
2. Settings - only setting is the typetext speed being turned to instant
3. Mission Select
- resets gamestates
- allows you to select which mission to start from and set their prerequisites
4. Quit - quit


Mission 1:
- Contains name
- Alternative Dialogue if True Bad End is triggered
- Alternative path if True Bad End is triggered

Mission 2:
- Contains the sin increment choices
- Contains 2 riddles

Mission 3:
- Contains the taint variable which kills the player if not cured for long enough
- Contains the last riddle
- Contains the feather which is required for some endings

Mission 4:
- Leads to bad end 2 if feather is given to the angel
- Contains the maze

Unnamed.java
- Secret level after unlocking true end

Endings:
- Stores the endings

GameStates
- Stores the Booleans, setters, getters, and stuff

GameTools
- Stores the methods used such as typeText and delay







> Members:

1. Shimizu
 Contributions: Concept, Story, Dialogue, General Framework, Core Logic, Initial Code

2. Calmerin
 Contributions: Text-Formatting, Testing, Suggestions & Feedback.

3. Cangayda
 Contributions: Text-Formatting, Testing, Suggestions & Feedback.

> Tools & Ai assistance:

1. Gemini Pro - Used for text-formatting and specific methods (displayGlitchEffect(), runMazeGame(), AtomicBoolean, and textType)
2. Github Copilot - Used for code efficiency suggestions and optimizations

Note: Majority of the game logic, narrative, flow was human generated - AI assitance was only utilized strictly for syntax correction, formatting, and specific utility methods.

> How to run the game
1. It is recommended to use VScode as that is what was used during development - Jgrasp cannot render the colors properly

Execution steps
1. Open the files and wait for them to load
2. Run MainFile.java


> Core Gameplay and Mechanics

1. Story Mode - COMPLETE narrative experience with 6 endings
2. Choice System
    - Yes/No Prompts
    - Sin counter - choices may increment a "sin" variable
2. Puzzles
    - Riddles
    - Maze
3. Time Mechanics - No spoilers


> File Structure
1. Main File 
 - Contains:
 a. New Game - Resets gamestate and runs from mission1
 
 b. Settings - Only setting is InstantText - useful for debugging
 
 c. Mission Select - Mostly a debug tool, could be used to jump into specific missions while setting prerequisites
 
 d. Quit - exits

2. Game State
  - State Manager, stores booleans, counters, getters, and setters

3. Game Tools
 - Contains core utility methods
 
4. Console Colors
 - Library for dialogue colors

5. The Mission Files + Unnamed
 - Main Content of the game

6. Endings
 - Stores the Endings

> SPOILERS Mission Content

Mission 1
- Contains Name Setter
- Alternative Path and Dialogues if "True Bad End" is triggered

Mission 2
- Introduction of the sin mechanic, the taint variable, and the first two riddles

Mission 3
-  The final riddle and location of the Feather - a key item

Mission 4
- Contains the Maze and the critical Angel encased in Ice interaction 
- Chance for Early Ending (Bad End 2)

Unnamed.java
- A secret level/epilogue accessible only after unlocking the True Ending


> Spoilers Ending Guide

1. Bad End	
    Feather: NO
    Sin: > 0

2. Bad End 2
    Action: Give Feather to Angel in Mission4/Cocyutus

3. Good End
    Feather: NO
    Sin: 0

4. True Good End
    Feather: YES
    Sin: 0

5. True Bad End - Enables Ed3 for True Ending
    Feather: YES
    Sin: > 0

6. True Ending
    Condition: Only unlocked after triggering True Bad End






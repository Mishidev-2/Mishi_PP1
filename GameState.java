public class GameState {


    // USAGE: if (GameState.isNameSet()) { ... }
    private static boolean nameSet = false;

    //String name = GameState.getPlayerName();
    //GameState.setPlayerName("New Name");
    private static String playerName = "Luce"; // Default name - Hints to lucifer lol

    //int sins = GameState.getSinCounter();
    // INCREMENT: GameState.incrementSinCounter();
    // SET: GameState.setSinCounter(5);
    private static int sinCounter = 0;

    // CHECK: if (GameState.hasStatusEffectTaint()) { ... }
    // SET: GameState.setStatusEffectTaint(true);
    private static boolean statusEffectTaint = false;

    //if (GameState.isIfEd3()) { ... }
    //GameState.setIfEd3(true);
    private static boolean ifEd3 = false;

    //if (GameState.isIfEd2()) { ... }
    //GameState.setIfEd2(true);
    private static boolean ifEd2 = false;

    //Check or set feather possession (affects Mission 3 & 4 paths)
    //if (GameState.hasFeather()) { ... }
    //ameState.setHasFeather(false);
    private static boolean hasFeather = false;

    // GETTER METHODS

    /*
    Check if player name has been set
    USAGE: if (GameState.isNameSet()) { // do something }
     */
    public static boolean isNameSet() {
        return nameSet;
    }

    /*
    Get the current player name
    USAGE: System.out.println("Hello " + GameState.getPlayerName());
     */
    public static String getPlayerName() {
        return playerName;
    }

    /*
    Get current sin counter value
    USAGE: int currentSins = GameState.getSinCounter();
     */
    public static int getSinCounter() {
        return sinCounter;
    }

    /*
    Check if status effect taint is active
    USAGE: if (GameState.hasStatusEffectTaint()) { // taint effects }
     */
    public static boolean hasStatusEffectTaint() {
        return statusEffectTaint;
    }

    /*
    Check if Ed3 condition is true
    USAGE: if (GameState.isIfEd3()) { // Ed3 specific dialogue }
     */
    public static boolean isIfEd3() {
        return ifEd3;
    }

    /*
    Check if Ed2 condition is true (used for Bad End 2 in Mission 4)
    USAGE: if (GameState.isIfEd2()) { // Ed2 specific events }
     */
    public static boolean isIfEd2() {
        return ifEd2;
    }

    /*
    Check if player has the feather item
    USAGE: if (GameState.hasFeather()) { // allow feather action }
     */
    public static boolean hasFeather() {
        return hasFeather;
    }

    // SETTER METHODS

    /*
    USAGE: GameState.setNameSet(true);
     */
    public static void setNameSet(boolean setName) {
        nameSet = setName;
    }

    /*
    Set the player's name and mark name as set
    USAGE: GameState.setPlayerName("Arthur");
     */
    public static void setPlayerName(String name) {
        playerName = name;
        nameSet = true;
    }
    /*
    Increase sin counter by 1
    USAGE: GameState.incrementSinCounter();
     */
    public static void incrementSinCounter() {
        sinCounter++;
    }

    /*
    Set sin counter to specific value
    USAGE: GameState.setSinCounter(3); // sets sins to 3
     */
    public static void setSinCounter(int count) {
        sinCounter = count;
    }

    /*
    Enable or disable status effect taint
    USAGE: GameState.setStatusEffectTaint(true); // activates taint
     */
    public static void setStatusEffectTaint(boolean taint) {
        statusEffectTaint = taint;
    }

    /*
    Set Ed3 status (affects story choices and dialogue in Mission 1)
    USAGE: GameState.setIfEd3(true); // enables Ed3 path
     */
    public static void setIfEd3(boolean ed3) {
        ifEd3 = ed3;
    }

    /*
    Set Ed2 status (triggers Bad End 2 in Mission 4)
    USAGE: GameState.setIfEd2(true); // enables Ed2 path and Bad End 2
     */
    public static void setIfEd2(boolean ed2) {
        ifEd2 = ed2;
    }

    /*
    Set whether player has feather item (affects Mission 3 & 4 paths)
    USAGE: GameState.setHasFeather(false); // player lost feather
     */
    public static void setHasFeather(boolean feather) {
        hasFeather = feather;
    }

    /*
    Reset all game state variables to default values
    USAGE: GameState.resetGame(); // called when starting new game
     */
    public static void resetGame() {
        nameSet = false;
        playerName = "Luce";
        sinCounter = 0;
        statusEffectTaint = false;
        ifEd3 = false;
        ifEd2 = false;
        hasFeather = false;
    }

    // Display current game state (for debugging)
    /**
    Display all current game state values (for debugging)
    USAGE: GameState.displayState(); // shows current state in console
     */
    public static void displayState() {
        System.out.println("=== CURRENT GAME STATE ===");
        System.out.println("Name: " + playerName + " (set: " + nameSet + ")");
        System.out.println("Sin Counter: " + sinCounter);
        System.out.println("Status Effect Taint: " + statusEffectTaint);
        System.out.println("ifEd3: " + ifEd3);
        System.out.println("ifEd2: " + ifEd2);
        System.out.println("Has Feather: " + hasFeather);
        System.out.println("==========================");
    }
}
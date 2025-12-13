public class GameState {
    private static boolean nameSet = false;
    private static String playerName = "Luce"; 
    private static int sinCounter = 0;
    private static boolean statusEffectTaint = false;
    private static boolean ifEd3 = false;
    private static boolean ifEd2 = false;
    private static boolean hasFeather = false;
    private static boolean instantText = false; 

    // GETTERS
    // Use: Check if player set custom name
    // Call: GameState.isNameSet()
    public static boolean isNameSet() { return nameSet; }
    
    // Use: Get player's current name
    // Call: String name = GameState.getPlayerName();
    public static String getPlayerName() { return playerName; }
    
    // Use: Check how many sins player has
    // Call: int sins = GameState.getSinCounter();
    public static int getSinCounter() { return sinCounter; }
    
    // Use: Check if player has taint status effect
    // Call: boolean tainted = GameState.hasStatusEffectTaint();
    public static boolean hasStatusEffectTaint() { return statusEffectTaint; }
    
    // Use: Check if ending 3 was unlocked
    // Call: boolean ending3 = GameState.isIfEd3();
    public static boolean isIfEd3() { return ifEd3; }
    
    // Use: Check if ending 2 was unlocked
    // Call: boolean ending2 = GameState.isIfEd2();
    public static boolean isIfEd2() { return ifEd2; }
    
    // Use: Check if player has feather item
    // Call: boolean feather = GameState.hasFeather();
    public static boolean hasFeather() { return hasFeather; }
    
    // Use: Check if instant text setting is enabled
    // Call: boolean instant = GameState.isInstantText();
    public static boolean isInstantText() { return instantText; }

    // SETTERS
    // Use: Manually set if name was set (usually use setPlayerName instead)
    // Call: GameState.setNameSet(true);
    public static void setNameSet(boolean setName) { nameSet = setName; }
    
    // Use: Set player's name (also marks name as set)
    // Call: GameState.setPlayerName("Alice");
    public static void setPlayerName(String name) { playerName = name; nameSet = true; }
    
    // Use: Add 1 to sin counter (for evil choices)
    // Call: GameState.incrementSinCounter();
    public static void incrementSinCounter() { sinCounter++; }
    
    // Use: Set sin counter to specific value
    // Call: GameState.setSinCounter(2);
    public static void setSinCounter(int count) { sinCounter = count; }
    
    // Use: Enable/disable taint status effect
    // Call: GameState.setStatusEffectTaint(true);
    public static void setStatusEffectTaint(boolean taint) { statusEffectTaint = taint; }
    
    // Use: Mark ending 3 as unlocked - True End
    // Call: GameState.setIfEd3(true);
    public static void setIfEd3(boolean ed3) { ifEd3 = ed3; }
    
    // Use: Mark ending 2 as unlocked - Bad End 2
    // Call: GameState.setIfEd2(true);
    public static void setIfEd2(boolean ed2) { ifEd2 = ed2; }
    
    // Use: Set if player has feather item
    // Call: GameState.setHasFeather(true);
    public static void setHasFeather(boolean feather) { hasFeather = feather; }
    
    // Use: Turn instant text on/off
    // Call: GameState.setInstantText(true);
    public static void setInstantText(boolean instant) { instantText = instant; }

    // Use: Reset all game progress (keeps instant text setting)
    // Call: GameState.resetGame();
    public static void resetGame() {
        nameSet = false;
        playerName = "Luce";
        sinCounter = 0;
        statusEffectTaint = false;
        ifEd3 = false;
        ifEd2 = false;
        hasFeather = false;
        
    }
}
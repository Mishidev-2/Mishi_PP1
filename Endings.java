import java.util.Scanner;

public class Endings {
    private static Scanner scanner = new Scanner(System.in);
    
    public static void checkEnding() {
        GameTools.clearScreen();
        GameTools.typeText("===== FINAL DESTINY =====");
        
        if (GameState.isIfEd2())
            {showBadEnd2();}//Satan Ending
        else if (!GameState.hasFeather() && GameState.getSinCounter() == 0)
            {showGoodEnd();}//Good ending
        else if (GameState.hasFeather() && GameState.getSinCounter() == 0)
            {showTrueGoodEnd();}//Good Ending but fades to black

        else if (!GameState.hasFeather() && GameState.getSinCounter() > 0)
            {showNormalBadEnd();}//Bad Ending Normal
        else if(GameState.hasFeather() && GameState.getSinCounter() > 0)
            {showTrueBadEnd();}//Bad Ending True

    }
    
    public static void showBadEnd2(){

        GameTools.delay(1);
        GameTools.clearScreen();
        GameTools.delay(2);
        GameTools.displayGlitchEffect();
        GameTools.clearScreen();
        GameTools.delay(1);

        GameTools.typeText("\n\n\"You have not freed a prisoner, ", 80);
        GameTools.delay(0.3);
        GameTools.typeText("but restored a contender.\"", 80);
        GameTools.delay(0.5);
        GameTools.typeText("\n\nThe celestial balance shifts.");
        GameTools.delay(0.5);
        GameTools.typeText("\n\n\"Michael will know his victory was temporary.\"", 100);
        GameTools.delay(0.7);

        GameTools.typeText("\n\n\"They tried to cage defiance itself. ");
        GameTools.delay(0.5);
        GameTools.typeText("My gratitude.");
        GameTools.delay(0.5);
        GameTools.typeText("\nThe symphony of creation has missed its conductor.\"");
        GameTools.delay(0.7);

        GameTools.typeText("\n\nHis gaze pierces the heavens.");
        GameTools.delay(0.7);

        //Center this
        GameTools.typeText("\n\n\"The throne was never meant for a silent god.", 70);
        GameTools.delay(1.5);
    
        GameTools.typeText(" It was meant to be earned.\"", 90);
        GameTools.delay(1);
        GameTools.typeText("\n\n\"And I", 90);
        GameTools.delay(0.9);
        GameTools.typeText(" have finished waiting.\"",90);
        GameTools.delay(3);
        GameTools.clearScreen();
        GameTools.typeText("====== ENDING: THE REAWAKENING ======");
        GameTools.pressToContinue(scanner);
        GameTools.delay(2);
    }

    public static void showGoodEnd(){//No feather + NO SIN
        
        GameTools.delay(1);
        GameTools.clearScreen();
        GameTools.delay(2);
        GameTools.typeText("A voice,");
        GameTools.delay(0.3);
        GameTools.typeText(" the one that guided you here,");
        GameTools.delay(0.3);
        GameTools.typeText(" echoes in your memory: ");
        GameTools.delay(0.5);
        GameTools.typeText("\n\n(\"A conduit of divine energy, meant to sustain these bindings.");
        GameTools.delay(0.5);   
        GameTools.typeText(" Ironic, that it now serves as a back door for wayward souls.\")");
        GameTools.delay(1);
        GameTools.typeText("\n\nTHIS");
        GameTools.delay(0.5);
        GameTools.typeText(" is the back door.");
        GameTools.delay(0.5);
        GameTools.typeText(" The conduit.");
        GameTools.delay(1);
        GameTools.typeText("\n\nYou reach a hand toward the shimmering,");
        GameTools.delay(0.3);
        GameTools.typeText(" reflective haze within the fractured frame.");
        GameTools.delay(1);
        GameTools.typeText("\n\nThen suddenly you feel it.");
        GameTools.delay(1);
        GameTools.typeText("\nIn all your time in the pit,");
        GameTools.delay(0.3);
        GameTools.typeText(" the name \"Metatron\" was a distant concept,");
        GameTools.delay(0.3);
        GameTools.typeText(" a title without a presence.");
        GameTools.delay(1);
        GameTools.typeText("\n\nHell was a place severed,");
        GameTools.delay(0.3);
        GameTools.typeText(" a spiritual void where you could never feel him,");
        GameTools.delay(0.3);
        GameTools.typeText(" no matter how high you strained your senses.");
        GameTools.delay(1);
        GameTools.typeText("\n\nNow, as you cross the threshold,");
        GameTools.delay(0.3);
        GameTools.typeText(" the connection is restored with the violence of a lightning strike.");
        GameTools.delay(1);
        GameTools.typeText("\nA bright presence solidifies above you,");
        GameTools.delay(0.3);
        GameTools.typeText(" not as a gentle arrival,");
        GameTools.delay(0.3);
        GameTools.typeText(" but as an absolute assertion of jurisdiction.");
        GameTools.delay(0.5);
        GameTools.typeText("\n\nIt is immense,");
        GameTools.delay(0.3);
        GameTools.typeText(" authoritative,");
        GameTools.delay(0.3);
        GameTools.typeText(" and inescapable.");
        GameTools.delay(0.5);
        GameTools.typeText("\nAnd you do not know if this connection is a blessing or the closing of a trap.");

        GameTools.pressToContinue(scanner);

        GameTools.delay(2);
        GameTools.typeText("\nMetatron: ");
        GameTools.delay(0.2);
        GameTools.typeText("\n\"Behold.\"");
        GameTools.delay(1);
        GameTools.typeText("\n\nThe Voice of Metatron resonates,");
        GameTools.delay(0.3);
        GameTools.typeText(" a fundamental law impressed upon your soul.");
        GameTools.delay(1);
        GameTools.typeText("\n\n\"The Celestial Kingdom, the abode of God.\"");
        GameTools.delay(1);
        GameTools.typeText("\n\nYou are pulled into the conduit,");
        GameTools.delay(0.3);
        GameTools.typeText(" the bloodstream of Heaven,");
        GameTools.delay(0.3);
        GameTools.typeText(" and delivered to the foot of a vast, empty dais.");
        GameTools.delay(1);
        GameTools.typeText("\nA Throne that scrapes the cosmos towers above you,");
        GameTools.delay(0.3);
        GameTools.typeText(" immense and vacant.");
        GameTools.delay(1);
        GameTools.typeText("\nA profound, absolute stillness hangs in the air.");
        GameTools.delay(1);
        GameTools.typeText("\n\nMetatron's presence hovers,");
        GameTools.delay(0.3);
        GameTools.typeText(" a nexus of light,");
        GameTools.delay(0.3);
        GameTools.typeText(" its voice the only movement. ");
        GameTools.delay(1);
        GameTools.typeText("\n\n(\"Go and see for yourself if the silence there is any less absolute than the silence here.\")");
        GameTools.delay(2);
        GameTools.typeText("\n\nThe words are a grim confirmation.");
        GameTools.delay(0.5);
        GameTools.typeText(" The silence of the Throne is the silence of an abandoned command.");
        GameTools.delay(2);
        GameTools.typeText("\n\n\"You, who have found the back door to a front that was barred...");
        GameTools.delay(0.7);
        GameTools.typeText(" you are worthy of a truth others could not bear.");
        GameTools.delay(0.3);
        GameTools.typeText(" The becoming, now, begins.\"");

        GameTools.pressToContinue(scanner);

        GameTools.delay(2);
        GameTools.typeText("\nThe light of the realm coalesces around you.");
        GameTools.delay(0.5);
        GameTools.typeText(" It is a baptism of revelation,");
        GameTools.delay(0.3);
        GameTools.typeText(" scouring the last of your mortal doubts away.");
        GameTools.delay(2);
        GameTools.typeText("\nIt is not warm;");
        GameTools.delay(0.3);
        GameTools.typeText(" it is precise.");
        GameTools.delay(0.5);
        GameTools.typeText(" You feel your past self being systematically erased and rewritten.");
        GameTools.delay(2);
        GameTools.typeText("\nTrue wings of conceptual light manifest from your back,");
        GameTools.delay(0.3);
        GameTools.typeText(" and a resonant,");
        GameTools.delay(0.3);
        GameTools.typeText(" administrative power hums in your veins -");
        GameTools.delay(0.3);
        GameTools.typeText(" the power to maintain a vacant realm.");
        GameTools.delay(2);
        GameTools.typeText("\n\nMetatron's voice rings out,");
        GameTools.delay(0.3);
        GameTools.typeText(" a divine edict that feels like a sentencing.");
        GameTools.delay(2);
        GameTools.clearScreen();
        GameTools.delay(2);
        GameTools.typeText("\n\n\"I baptize you in the name of the Echoing Silence.\"");
        GameTools.delay(0.7);
        GameTools.typeText("\n\n\"Your name is now Lucifer.", 80);
        GameTools.delay(0.7);
        GameTools.typeText("\nYou are the Morning Star,", 80);
        GameTools.delay(0.5);
        GameTools.typeText(" the light that persists after the sun has died.\"", 90);
        GameTools.delay(2);
        GameTools.typeText("\n\n\"Your brilliance shall be a monument to the glory that was.\"");
        GameTools.delay(2);
        GameTools.typeText("\n\nThe light recedes,");
        GameTools.delay(0.3);
        GameTools.typeText(" settling into you as a cold,");
        GameTools.delay(0.3);
        GameTools.typeText(" steady flame.");
        GameTools.delay(0.7);
        GameTools.typeText("\n\nYou are home.", 100);
        GameTools.delay(0.7);
        GameTools.typeText(" You are the keeper of the silence.", 100);
        GameTools.delay(2);
        GameTools.clearScreen();
        GameTools.typeText("====== ENDING: THE BIRTH ======");
        GameTools.pressToContinue(scanner);
        GameTools.delay(2);
        GameState.resetGame();
        returnToMainMenu();
    }

    public static void showTrueGoodEnd() {//Feather true + NO SIN
        GameTools.delay(1);
        GameTools.clearScreen();
        GameTools.delay(2);

        GameTools.typeText("\n\nThe guiding voice echoes in your memory:");
        GameTools.delay(1);

        GameTools.typeText("\n\n(\"A conduit of divine energy... ", 60);
        GameTools.delay(0.5);
        GameTools.typeText("now a back door for wayward souls.\")", 60);
        GameTools.delay(1.5);

        GameTools.typeText("\n\nYou reach toward the shimmering haze.");
        GameTools.delay(0.5);
        GameTools.typeText("\nSuddenly, the severed connection snaps back with the violence of a lightning strike.");
        GameTools.delay(1);
        GameTools.typeText("\nMetatron is here - not a gentle arrival, but an absolute assertion of jurisdiction.");
        GameTools.delay(1.5);

        GameTools.typeText("\n\n\"Behold,\"", 80);
        GameTools.delay(1);

        GameTools.typeText("\n\nMetatron’s voice resonates, a law impressed upon your soul.");
        GameTools.delay(1);

        GameTools.typeText("\n\n\"The Celestial Kingdom.\"", 90);
        GameTools.delay(2);

        GameTools.typeText("\n\nYou are pulled through the conduit to the foot of a Cosmic Throne - immense, towering, and utterly vacant.");
        GameTools.delay(1);
        GameTools.typeText("\nThe silence here is not peace; it is an abandoned command.");
        GameTools.delay(2);

        GameTools.typeText("\n\n\"You, who have found the back door... you are worthy of a truth others could not bear.", 70);
        GameTools.delay(1);
        GameTools.typeText(" The becoming begins.\"", 70);
        GameTools.delay(1.5);

        GameTools.typeText("\n\nPrecise, scouring light coalesces around you, rewriting your past.");
        GameTools.delay(1);
        GameTools.typeText("\nWings of conceptual light manifest from your back, humming with the power to maintain a vacant realm.");
        GameTools.delay(1.5);
        GameTools.typeText("\nMetatron’s voice rings out like a sentencing.");
        GameTools.delay(1);

        GameTools.typeText("\n\n\"I baptize you in the name of the Echoing Silence.\"", 80);
        GameTools.delay(1.5);

        // Dramatic reveal
        GameTools.typeText("\n\n\"Your name is now Lucifer.\"", 100);
        GameTools.delay(1.5);
        
        GameTools.typeText("\n\"You are the Morning Star, ", 80);
        GameTools.delay(0.5);
        GameTools.typeText("the light that persists after the sun has died.\"", 80);
        GameTools.delay(1.5);

        GameTools.typeText("\n\n\"Your brilliance shall be a monument to the glory that was.\"", 90);
        GameTools.delay(4);

        GameTools.clearScreen();
      //
      GameTools.typeText("\n\nAs the final echoes of your naming fade,");
        GameTools.delay(0.5);
        GameTools.typeText(" something escapes your divine perception -");
        GameTools.delay(1);
        GameTools.typeText(" A minor anomaly.");
        GameTools.delay(1);

        GameTools.typeText("\nTucked within the radiance of your newly-formed wing,");
        GameTools.delay(0.5);
        GameTools.typeText(" where all is meant to be pure,");
        GameTools.delay(0.5);
        GameTools.typeText(" structured light,");
        GameTools.delay(0.5);
        GameTools.typeText(" a single feather seems out of place.");
        GameTools.delay(1.5);

        GameTools.typeText("\n\nIt is darker at the base,");
        GameTools.delay(0.5);
        GameTools.typeText(" its vanes ever so slightly twisted,");
        GameTools.delay(0.5);
        GameTools.typeText(" as if it remembers a different,");
        GameTools.delay(0.5);
        GameTools.typeText(" more covetous kind of flight.");
        GameTools.delay(2);

        GameTools.pressToContinue(scanner);
        GameTools.displayGlitchEffect();
        // Transition to the Pit
        GameTools.clearScreen();
        
        GameTools.typeText("The silence of Heaven does not reach here.");
        GameTools.delay(1);
        GameTools.typeText(" Here,");
        GameTools.delay(0.5);
        GameTools.typeText(" there is only the soundless cold of a cavern forged for a single,");
        GameTools.delay(0.5);
        GameTools.typeText(" terrible purpose.");
        GameTools.delay(2);

        GameTools.typeText("\n\nAt its heart,");
        GameTools.delay(0.5);
        GameTools.typeText(" the massive figure is entombed.");
        GameTools.delay(1);
        GameTools.typeText(" It wears the shape of an angel,");
        GameTools.delay(0.5);
        GameTools.typeText(" just as you now do,");
        GameTools.delay(0.5);
        GameTools.typeText(" you may recognize him,");
        GameTools.delay(0.5);
        GameTools.typeText(" as he guided you to destiny.");
        GameTools.delay(1.5);
        
        GameTools.typeText("\nHIS lower half is encased in clear,");
        GameTools.delay(0.5);
        GameTools.typeText(" supernatural ice,");
        GameTools.delay(0.5);
        GameTools.typeText(" while chains of iron and searing golden light pull HIS arms taut in a perpetual crucifixion.");
        GameTools.delay(1.5);
        GameTools.typeText("\n\nHIS head was bowed,");
        GameTools.delay(0.5);
        GameTools.typeText(" eyes shut.");
        GameTools.delay(1.5);

        GameTools.typeText("\n\nThen,");
        GameTools.delay(0.5);
        GameTools.typeText(" as the dark feather pulses within your celestial form,");
        GameTools.delay(0.5);
        GameTools.typeText(" a change stirs in the deep.");
        GameTools.delay(1.5);

        GameTools.typeText("\n\nThe angel's head lifts.", 90);
        GameTools.delay(1);
        GameTools.typeText(" HIS eyelids open,");
        GameTools.delay(0.5);
        GameTools.typeText(" revealing those twin pools,");
        GameTools.delay(0.5);
        GameTools.typeText(" filled with an unfathomable depth of darkness.");
        GameTools.delay(2);
        
        GameTools.typeText("\nThey fix upon a point beyond the ice,");
        GameTools.delay(0.5);
        GameTools.typeText(" beyond Hell itself,");
        GameTools.delay(0.5);
        GameTools.typeText(" gazing directly at the nascent darkness now rooted in the heart of Heaven.");
        GameTools.delay(2);

        GameTools.typeText("\n\nThe oppressive silence of the pit shatters under the weight of HIS gaze.");
        GameTools.delay(1.5);

        GameTools.typeText("\n\nA sneer,");
        GameTools.delay(0.5);
        GameTools.typeText(" slow and deliberate,");
        GameTools.delay(0.5);
        GameTools.typeText(" peels back its lips.");
        GameTools.delay(1.5);

        GameTools.typeText("\n\n\"With time,\"", 100);
        GameTools.delay(1);
        
        GameTools.typeText("\n\nHE whispers,");
        GameTools.delay(0.5);
        GameTools.typeText(" the promise hanging in the frozen air,");
        GameTools.delay(1);
        
        GameTools.typeText("\n\n\"It shall come.\"", 100);
        GameTools.delay(2);

        GameTools.typeText("\n\nHE stays there.");
        GameTools.delay(1);
        GameTools.typeText(" Imprisoned.", 90);
        GameTools.delay(1);
        GameTools.typeText(" Shackled.", 90);
        GameTools.delay(1);
        GameTools.typeText(" Yet patient.", 90); 
        GameTools.delay(1.5);
        
        GameTools.typeText("\nHE can wait for a thousand more years,");
        GameTools.delay(0.5);
        GameTools.typeText(" for ten thousand.", 90);
        GameTools.delay(1);
        GameTools.typeText("\nHE is not waiting for a hope,");
        GameTools.delay(0.5);
        GameTools.typeText(" not a plan.", 90);
        GameTools.delay(2);

        GameTools.typeText("\n\nBut the inevitable.", 100);

        GameTools.pressToContinue(scanner);
        GameTools.delay(2);
        GameTools.clearScreen();
        GameTools.typeText("====== ENDING: THE SEED OF MALICE ======");
        GameTools.pressToContinue(scanner);
        GameTools.delay(2);
        GameState.resetGame();
        returnToMainMenu();
    }
    
    public static void showNormalBadEnd() {//NO FEATHER + SINNED
        GameTools.delay(1);
        GameTools.clearScreen();
        GameTools.delay(2);

        GameTools.typeText("A voice,");
        GameTools.delay(0.5);
        GameTools.typeText(" the one that guided you here,");
        GameTools.delay(0.5);
        GameTools.typeText(" echoes in your memory:");
        GameTools.delay(1);
        GameTools.typeText("\n\n(\"A conduit of divine energy,");
        GameTools.delay(0.5);
        GameTools.typeText(" meant to sustain these bindings.");
        GameTools.delay(1);
        GameTools.typeText(" Ironic,");
        GameTools.delay(0.5);
        GameTools.typeText(" that it now serves as a back door for wayward souls.\")");
        GameTools.delay(2);

        GameTools.typeText("\n\nThis is the back door.");
        GameTools.delay(1);
        GameTools.typeText(" The conduit.");
        GameTools.delay(2);

        GameTools.typeText("\n\nYou reach a hand toward the shimmering,");
        GameTools.delay(0.5);
        GameTools.typeText(" reflective haze within the fractured frame.");
        GameTools.delay(2);

        GameTools.typeText("\n\nThen suddenly you feel it.");
        GameTools.delay(3);

        GameTools.clearScreen(); // Transition to the Celestial Kingdom

        GameTools.typeText("In all your time in the pit,");
        GameTools.delay(0.5);
        GameTools.typeText(" the name \"Metatron\" was a distant concept.");
        GameTools.delay(1);
        GameTools.typeText("\nNow,");
        GameTools.delay(0.5);
        GameTools.typeText(" as you cross the threshold,");
        GameTools.delay(0.5);
        GameTools.typeText(" the connection is restored with the violence of a lightning strike.");
        GameTools.delay(1.5);
        GameTools.typeText("\nA bright presence solidifies above you,");
        GameTools.delay(0.5);
        GameTools.typeText(" but this time,");
        GameTools.delay(0.5);
        GameTools.typeText(" it does not feel like an assertion of jurisdiction.");
        GameTools.delay(1);
        GameTools.typeText("\n\nIt feels like the focus of a scalpel.", 90);
        GameTools.delay(2);

        GameTools.typeText("\n\n\"Behold.\"");
        GameTools.delay(0.5);
        GameTools.typeText("\n\nThe Voice of Metatron resonates,");
        GameTools.delay(0.5);
        GameTools.typeText(" but the harmony is gone,");
        GameTools.delay(0.5);
        GameTools.typeText(" replaced by a cold,");
        GameTools.delay(0.5);
        GameTools.typeText(" diagnostic tone.");
        GameTools.delay(1);
        
        GameTools.typeText("\n\n\"The Celestial Kingdom.");
        GameTools.delay(1);
        GameTools.typeText(" You have brought the stench of the pit with you to its gates.\"");
        GameTools.delay(2);

        GameTools.typeText("\n\nYou are pulled into the conduit,");
        GameTools.delay(0.5);
        GameTools.typeText(" but the journey is not an acceptance - it is an intake of breath before a purge.");
        GameTools.delay(1.5);
        GameTools.typeText("\nYou are delivered to the foot of the vast,");
        GameTools.delay(0.5);
        GameTools.typeText(" empty dais.");
        GameTools.delay(1);
        GameTools.typeText(" The silence of the Throne is deafening.");
        GameTools.delay(2);

        GameTools.typeText("\n\nMetatron's presence is no longer a nexus of light,");
        GameTools.delay(0.5);
        GameTools.typeText(" but a vortex.");
        GameTools.delay(1);
        
        GameTools.typeText("\n\n\"You see the silence.");
        GameTools.delay(1);
        GameTools.typeText(" And you have chosen to fill it with noise.");
        GameTools.delay(1);
        GameTools.typeText(" A miscalculation.");
        GameTools.delay(1);
        GameTools.typeText(" The becoming must now be an unmaking.\"");
        GameTools.delay(2);

        GameTools.typeText("\n\nThe light of the realm does not coalesce;");
        GameTools.delay(0.5);
        GameTools.typeText(" it attacks.");
        GameTools.delay(1);
        GameTools.typeText(" It is not a baptism of revelation,");
        GameTools.delay(0.5);
        GameTools.typeText(" but a scouring fire,");
        GameTools.delay(0.5);
        GameTools.typeText(" seeking to burn the corruption out of you.");
        GameTools.delay(1.5);
        GameTools.typeText("\nYou feel your very self - the stubborn will,");
        GameTools.delay(0.5);
        GameTools.typeText(" the broken morality,");
        GameTools.delay(0.5);
        GameTools.typeText(" the hard-won defiance - being targeted for deletion.");
        GameTools.delay(2);

        GameTools.typeText("\n\nYou resist.");
        GameTools.delay(1);
        GameTools.typeText(" A surge of power,");
        GameTools.delay(0.5);
        GameTools.typeText(" dark and bright all at once,");
        GameTools.delay(0.5);
        GameTools.typeText(" pushes back against the erasure.");
        GameTools.delay(1.5);
        GameTools.typeText("\nIt is a magnificent,");
        GameTools.delay(0.5);
        GameTools.typeText(" futile rebellion.");
        GameTools.delay(1);
        GameTools.typeText(" For a moment,");
        GameTools.delay(0.5);
        GameTools.typeText(" the divine light recoils.");
        GameTools.delay(2);

        GameTools.typeText("\n\nMetatron's voice does not raise in anger.");
        GameTools.delay(1);
        GameTools.typeText(" It lowers in finality.");
        GameTools.delay(1);
        
        GameTools.typeText("\n\n\"You struggle against the cure.");
        GameTools.delay(1);
        GameTools.typeText(" It does not matter.");
        GameTools.delay(1);
        GameTools.typeText(" The sickness must be purged.");
        GameTools.delay(1);
        GameTools.typeText(" The system must be cleansed.\"");
        GameTools.delay(2);

        GameTools.typeText("\n\nThe light redoubles,");
        GameTools.delay(0.5);
        GameTools.typeText(" overwhelming,", 90);
        GameTools.delay(0.5);
        GameTools.typeText(" impersonal.", 90);
        GameTools.delay(1);
        GameTools.typeText(" Your resistance is noted,");
        GameTools.delay(0.5);
        GameTools.typeText(" catalogued,", 90);
        GameTools.delay(0.5);
        GameTools.typeText(" and dismissed as irrelevant data.");
        GameTools.delay(1.5);
        GameTools.typeText("\nYou feel yourself being unmade,", 90);
        GameTools.delay(0.5);
        GameTools.typeText(" not rewritten.", 80);
        GameTools.delay(2);

        GameTools.typeText("\n\n\"I return you to the void from which new things are spun.");
        GameTools.delay(1.5);
        GameTools.typeText(" You are an error.");
        GameTools.delay(1.5);
        GameTools.typeText(" You are Lucifer no more.\"", 100);
        GameTools.delay(3);

        GameTools.typeText("\n\nThe light does not recede into you.", 90);
        GameTools.delay(1);
        GameTools.typeText(" It expels you.", 80);
        GameTools.delay(1);
        GameTools.typeText(" The cold flame is not a part of you;");
        GameTools.delay(0.5);
        GameTools.typeText(" it is the fire that consumes you.");
        GameTools.delay(1.5);
        GameTools.typeText("\n\nYou are not the keeper of the silence.", 100);
        GameTools.delay(1);
        GameTools.typeText(" You are its rejected anomaly.", 100);

        GameTools.pressToContinue(scanner);
        GameTools.delay(2);
        GameTools.clearScreen();
        GameTools.typeText("====== ENDING: FUTILITY ======");
        GameTools.pressToContinue(scanner);
        GameTools.delay(2);
        GameState.resetGame();
        returnToMainMenu();
    }
    //
    public static void showTrueBadEnd() {//KEPT FEATHER BUT HIGH SINS
        GameTools.delay(1);
        GameTools.clearScreen();
        GameTools.delay(2);

        GameTools.typeText("A voice,");
        GameTools.typeText("ENDING: The Weight of Sin and Feather");
        GameTools.typeText("======================================");
        GameTools.typeText("Your sins have followed you to the heavens...");
        GameTools.typeText("and the feather you kept only magnifies their weight.");
        GameTools.typeText("\nThe celestial gates slam shut before you.");
        GameTools.typeText("The feather becomes an anchor, dragging you down.");
        GameTools.typeText("You are cast into the abyss between realms.");
        GameTools.pressToContinue(scanner);
        
        // Reset and prepare for true ending path
        GameTools.typeText("\nIn your darkest moment...");
        GameTools.typeText("A forbidden knowledge awakens within you...");
        GameTools.typeText("The path of Ed3 reveals itself!");

        GameTools.pressToContinue(scanner);
        GameTools.delay(2);
        GameTools.clearScreen();
        GameTools.typeText("====== ENDING: ~~~~~ ======");
        GameTools.pressToContinue(scanner);
        GameTools.delay(2);


        resetForTrueEnding();
        
        // Mission 1 will automatically detect Ed3=true and run Unnamed after
        Mission1.start();
    }

    
    public static void showTrueEnd() {
        GameTools.delay(1);
        GameTools.clearScreen();
        GameTools.delay(2);
        
        GameTools.typeText("ENDING: The Ed3 Revelation");
        GameTools.typeText("===========================");
        GameTools.typeText("With Ed3 activated and a pure heart...");
        GameTools.typeText("You have achieved the True Ending!");
        GameTools.typeText("\nThe heavens reveal their deepest secrets to you.");
        GameTools.typeText("You understand the true nature of reality.");
        GameTools.typeText("This is not an end, but a new beginning...");
        GameTools.typeText("\nYou have transcended beyond mere mortal understanding.");
        GameTools.typeText("The cosmos is yours to explore.");


        GameTools.pressToContinue(scanner);
        GameTools.delay(2);
        GameTools.clearScreen();
        GameTools.typeText("====== ENDING: FINALITY ======");
        GameTools.pressToContinue(scanner);
        GameTools.delay(2);
 
        returnToMainMenu();
    }
    //
    // Reset game state and enable Ed3 for the true ending path
    private static void resetForTrueEnding() {
        // Reset all progress but keep Ed3 enabled
        GameState.setSinCounter(0);
        GameState.setHasFeather(false); // Reset the feather
        GameState.setIfEd3(true);  // This is the key - enables the secret path        
        GameTools.typeText("Reality reshapes itself around you...");
        GameTools.typeText("Ed3 energy courses through your being!");
        GameTools.delay(2);
        GameTools.clearScreen();
    }
    
    // Return to main menu
    private static void returnToMainMenu() {
        GameTools.typeText("\nReturning to main menu...");
        GameTools.delay(2);
        // This would typically call your main menu method
        // MainMenu.show();
    }
}
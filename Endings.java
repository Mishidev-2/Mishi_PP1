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

        GameTools.typeText("\n\nMetatron's voice resonates, a law impressed upon your soul.");
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
        GameTools.typeText("\nMetatron',s voice rings out like a sentencing.");
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
        GameTools.typeText("\"A conduit of divine energy...", 70);
        GameTools.delay(0.5);
        GameTools.typeText(" Now a back door for wayward souls.\"", 70);
        GameTools.delay(0.5);
        GameTools.typeText("\n\nRemembering the statement said by the angel in chains,", 60);
        GameTools.delay(0.3);
        GameTools.typeText(" you tell yourself:", 60);

        GameTools.delay(0.7);

        GameTools.typeText("\n\n\"Truly an accurate description\"", 70);

        GameTools.pressToContinue(scanner);
        GameTools.clearScreen();

        GameTools.delay(0.7);
        GameTools.typeText("\"Perfection admits no variation.\"", 70);

        GameTools.delay(0.7);

        GameTools.typeText("\n\nBefore you, a source of light brighter than the sun radiates -");
        GameTools.delay(0.3);
        GameTools.typeText(" but this is no celestial body made of mere gas.", 60);
        GameTools.delay(0.5);
        GameTools.typeText("\nThis is no simple amalgamation of liquid metal and gravity.", 60);

        GameTools.delay(0.7);

        GameTools.typeText("\n\nThis is an Archangel -", 60);
        GameTools.delay(0.3);
        GameTools.typeText(" the highest order under the Throne.", 60);
        GameTools.delay(0.7);
        GameTools.typeText("\n\nThe voice was never a guide.");
        GameTools.delay(0.3);
        GameTools.typeText(" It was a calibrator -");
        GameTools.delay(0.3);
        GameTools.typeText(" It was Metatron.", 60);

        GameTools.delay(0.7);

        GameTools.typeText("\n\nThe gateway closes,");
        GameTools.delay(0.3);
        GameTools.typeText(" it hardens.", 60);
        GameTools.delay(0.5);
        GameTools.typeText("\nAnd you are frozen in place,", 60);
        GameTools.delay(0.3);
        GameTools.typeText(" pinned by the sudden,");
        GameTools.delay(0.3);
        GameTools.typeText(" crushing weight of absolute Law.");

        GameTools.delay(0.7);

        GameTools.typeText("\n\nThe Voice");
        GameTools.delay(0.3);
        GameTools.typeText(" - Metatron looms,");
        GameTools.delay(0.3); 
        GameTools.typeText(" not as a spirit,");
        GameTools.delay(0.3);
        GameTools.typeText(" but as a towering wall of judgment.", 60);

        GameTools.delay(0.7);

        GameTools.typeText("\nHe looks at you not with anger,", 60);
        GameTools.delay(0.3);
        GameTools.typeText(" but with the indifference of someone forced to correct a recurring mistake.", 70);

        GameTools.pressToContinue(scanner);

        GameTools.delay(0.7);
        GameTools.typeText("\n<METATRON - THE VOICE OF GOD>");
        GameTools.delay(0.5);
        GameTools.typeText("\n\n\"You attempted to enter the Equation while carrying a remainder.");
        GameTools.delay(0.5);
        GameTools.typeText(" That is your sin.");
        GameTools.delay(0.5);
        GameTools.typeText("\nYou are not evil;");
        GameTools.delay(0.5);
        GameTools.typeText(" You are incorrect.\"", 70);

        GameTools.delay(0.7);

        GameTools.typeText("\n\nThe floor beneath you dissolves.");
        GameTools.delay(0.5);
        GameTools.typeText(" Opening into a deep,");
        GameTools.delay(0.3);
        GameTools.typeText(" colorless expanse.");
        GameTools.delay(0.5);
        GameTools.typeText("\nIt is not dark;");
        GameTools.delay(0.5);
        GameTools.typeText(" It is the terrifying absence of data -");
        GameTools.delay(0.5);
        GameTools.typeText(" Nihility.", 100);

        GameTools.delay(0.7);

        GameTools.typeText("\n\n\"We do not abide paradoxes here.");
        GameTools.delay(0.5);
        GameTools.typeText(" Your will has deviated from the pattern.");
        GameTools.delay(0.5);
        GameTools.typeText("\nTo keep the structure sound,");
        GameTools.delay(0.3);
        GameTools.typeText(" the anomaly must be resolved.\"");

        GameTools.delay(0.7);

        GameTools.typeText("\n\nHe extends a hand, and gravity inverts.");
        GameTools.delay(0.5);
        GameTools.typeText(" You are no longer falling down;\n");
        GameTools.delay(0.5);
        GameTools.typeText("You are falling backward -");
        GameTools.delay(0.5);
        GameTools.typeText(" reverting to a state before you made your choices.");

        GameTools.delay(0.7);

        GameTools.typeText("\n\n\"I sentence you to the Null.", 70);
        GameTools.delay(0.5);
        GameTools.typeText(" Not to die,");
        GameTools.delay(0.3);
        GameTools.typeText(" but to be unmade.");
        GameTools.delay(0.5);
        GameTools.typeText("\nLet the silence strip away your flaws,", 70);
        GameTools.delay(0.5);
        GameTools.typeText(" until you are nothing but potential again.\"", 70);
        GameTools.delay(0.7);


        GameTools.typeText("\n\n\"When you return,");
        GameTools.delay(0.3);
        GameTools.typeText(" you will be symmetrical.\"");
        GameTools.delay(2);
        GameTools.clearScreen();
        GameTools.delay(0.5);
        GameTools.typeText("\n\n\"Or you will not be", 60);
        GameTools.delay(0.5);
        GameTools.typeText(" at all...\"", 100);
        GameTools.delay(1);
        GameTools.clearScreen();
        GameTools.typeText("====== ENDING: ", 70);
        GameTools.clearScreen();
        GameTools.displayGlitchEffect();
        GameTools.clearScreen();
        GameTools.typeText("\n\n...", 900);
        GameTools.clearScreen();
        GameTools.typeText("\n\n...", 900);
        GameTools.clearScreen();

        System.out.println();
        
        GameTools.delay(0.7);
        GameTools.typeText("As the white silence of the Null swallows you,");
        GameTools.delay(0.3);
        GameTools.typeText(" something rustles within your wings -", 60);
        GameTools.delay(0.5);
        GameTools.typeText("\nthe Black Feather you took from Mephis.", 70);
        GameTools.delay(0.5);
        GameTools.typeText(" It does not disintegrate;");
        GameTools.delay(0.3);
        GameTools.typeText(" it expands.", 80);

        GameTools.delay(0.7);

        GameTools.typeText("\n\nA single black plume unfurls,");
        GameTools.delay(0.3);
        GameTools.typeText(" extending its darkness like a vine.");
        GameTools.delay(0.3);
        GameTools.typeText("\nPiercing your chest");
        GameTools.delay(0.1);
        GameTools.typeText(" and rooting itself into your soul.", 90);

        GameTools.delay(0.7);

        GameTools.typeText("\n\nThe Void screams...", 100);

        GameTools.delay(0.7);

        GameTools.typeText("\n\nThe world spins violently,");
        GameTools.delay(0.3);
        GameTools.typeText(" dissolving the white nothingness into distinct,");
        GameTools.delay(0.3);
        GameTools.typeText(" painful color.", 70);

        GameTools.pressToContinue(scanner);
        GameTools.delay(2);
        GameTools.clearScreen();

        flashback();
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


    public static void flashback(){
         GameTools.delay(1);
        GameTools.clearScreen();
        GameTools.delay(2);

        GameTools.typeText("You are no longer falling.");
        GameTools.delay(0.5);
        GameTools.typeText(" You are kneeling.", 70);

        GameTools.delay(0.7);

        GameTools.typeText("\n\nThe air smells of ozone and burning gold.");
        GameTools.delay(0.5);
        GameTools.typeText(" You are surrounded by the wreckage of a celesial battle.");
        GameTools.delay(0.5);
        GameTools.typeText("\nThe broken shards of Heaven lie scattered around you like spilled diamonds.", 60);

        GameTools.delay(0.7);

        GameTools.typeText("\n\nIn one of these jagged,", 60);
        GameTools.delay(0.3);
        GameTools.typeText(" reflective fragments,", 60);
        GameTools.delay(0.3);
        GameTools.typeText(" you catch a glimpse of your own face.", 60);

        GameTools.delay(0.7);

        GameTools.typeText("\n\nIt is breathtaking.");
        GameTools.delay(0.5);
        GameTools.typeText(" The definition of beauty -");
        GameTools.delay(0.3);
        GameTools.typeText(" Symmetry so perfect it hurts to look upon;");
        GameTools.delay(0.3);
        GameTools.typeText("\nLight woven into skin,");
        GameTools.delay(0.3);
        GameTools.typeText(" eyes that hold the depth of the morning star.");

        GameTools.delay(0.7);
        GameTools.typeText("\n\nIt is the most beautiful thing existence has ever crafted.", 80);
        GameTools.delay(0.5);
        GameTools.typeText("\nAnd you know it.", 100);

        GameTools.delay(0.7);

        GameTools.typeText("\n\nThis beauty is not just a trait;");
        GameTools.delay(0.3);
        GameTools.typeText(" it is a justification.", 60);
        GameTools.delay(0.5);
        GameTools.typeText(" It is the root of your(?) Pride.", 90);

        GameTools.delay(0.7);

        GameTools.typeText("\n\nA jolt of recognition hits you -");
        GameTools.delay(0.3);
        GameTools.typeText(" this face in the reflection...");
        GameTools.delay(0.5);
        GameTools.typeText("\nIt is the face of the prisoner you saw frozen in the ice of Cocytus.");
        GameTools.delay(0.5);
        GameTools.typeText("\nYou are not looking at a stranger.", 80);
        GameTools.delay(0.7);
        GameTools.typeText("\n\nYou are looking at the \"Truth\" that was left behind.", 80);

        GameTools.delay(0.7);

        GameTools.typeText("\n\nYou try to stand,");
        GameTools.delay(0.3);
        GameTools.typeText(" to admire yourself fully,");
        GameTools.delay(0.3);
        GameTools.typeText(" but you cannot.");
        GameTools.delay(0.5);
        GameTools.typeText("\nChains of starlight bind your wrists and wings,");
        GameTools.delay(0.3);
        GameTools.typeText(" pinning you to the floor of the High Heavens.", 80);
        GameTools.delay(0.7);
        GameTools.typeText("\nThe weight is infinite.", 80);

        GameTools.delay(0.7);

        GameTools.typeText("\n\nLooking down at you are two figures.", 90);

        GameTools.pressToContinue(scanner);
        System.out.println();

        GameTools.delay(0.5);
        GameTools.typeText("On the left stands Michael", 70); 
        GameTools.delay(0.5);
        GameTools.typeText(" -", 70);
        GameTools.delay(0.3);
        GameTools.typeText(" The Archangel of Death.", 100);
        GameTools.delay(0.5);
        GameTools.typeText("\nHe holds the scales of judgment in one hand,"); 
        GameTools.delay(0.3);
        GameTools.typeText(" and a greatsword in the other.", 50);

        GameTools.delay(0.7);
        GameTools.typeText("\n\nOn the right stands Metatron", 70);
        GameTools.delay(0.5);
        GameTools.typeText(" -", 70);
        GameTools.delay(0.3);
        GameTools.typeText(" The Voice of the Heavenly Will.", 100);
        GameTools.delay(0.5);
        GameTools.typeText("\nHe is terrifyingly bright,", 60);
        GameTools.delay(0.3);
        GameTools.typeText(" a silhouette cut from raw radiance.", 80);
        GameTools.delay(0.5);
        GameTools.typeText("\nHe looks at you with no pity,");
        GameTools.delay(0.3);
        GameTools.typeText(" no anger -", 80);
        GameTools.delay(0.3);
        GameTools.typeText("\nOnly the indifferent calculation of a machine observing a broken cog.", 90);

        GameTools.pressToContinue(scanner);

        GameTools.clearScreen();
        System.out.println();
        GameTools.delay(0.7);
        GameTools.typeText("<Michael:>");
        GameTools.delay(0.3);
        GameTools.typeText("\n\"He will not bend -", 100);
        GameTools.delay(0.5);
        GameTools.typeText(" you know this as well as I.", 50);
        GameTools.delay(0.5);
        GameTools.typeText("\nHis pride is absolute.\"", 60);

        GameTools.delay(0.7);

        GameTools.typeText("\n\n\"Despite my authority,");
        GameTools.delay(0.3);
        GameTools.typeText(" we Archangels are not so easy to cast down.");
        GameTools.delay(0.5);
        GameTools.typeText("\nTo break him is to break the very foundation we stand on.\"");

        GameTools.delay(0.7);

        GameTools.typeText("\n\n\"And Lucifer's strength is undoubtedly on the same level as mine.\"", 100);

        GameTools.delay(0.7);

        GameTools.typeText("\n\n<Metatron:>");
        GameTools.delay(0.3);
        GameTools.typeText("\n\"Then we do not break the stone.", 70);
        GameTools.delay(0.5);
        GameTools.typeText(" We separate the elements.", 60);
        GameTools.delay(0.5);
        GameTools.typeText("\nWe shall sever his pride -");
        GameTools.delay(0.3);
        GameTools.typeText(" his source of power.\"", 70);

        GameTools.delay(0.7);

        GameTools.typeText("\n\nMetatron gestures to your bound form.");

        GameTools.delay(0.7);

        GameTools.typeText("\n\n\"We will perform a partition.\"", 70);

        GameTools.delay(0.5);

        GameTools.typeText("\n\n\"We shall bind his 'Truth' -", 50);
        GameTools.delay(0.5);
        GameTools.typeText(" His identity,", 50);
        GameTools.delay(0.3);
        GameTools.typeText("\nIn the absolute zero of Cocyutus.", 70);
        GameTools.delay(0.5);
        GameTools.typeText("\nThere,");
        GameTools.delay(0.3);
        GameTools.typeText(" frozen in static ice,");
        GameTools.delay(0.3);
        GameTools.typeText(" he cannot act.");
        GameTools.delay(0.5);
        GameTools.typeText(" He cannot rebel.\"", 70);

        GameTools.delay(0.7);

        GameTools.typeText("\n\n<Michael:>");
        GameTools.delay(0.3);
        GameTools.typeText("\n\"And his will?");
        GameTools.delay(0.5);
        GameTools.typeText(" The fire that drives him?\"", 60);

        GameTools.delay(0.7);

        GameTools.typeText("\n\n<Metatron:>");
        GameTools.delay(0.3);
        GameTools.typeText("\n\"Cast his will into the cycle.");
        GameTools.delay(0.5);
        GameTools.typeText(" Without his truth to guide it,");
        GameTools.delay(0.3);
        GameTools.typeText("\nhis will is just raw energy.\"");

        GameTools.delay(0.7);

        GameTools.typeText("\n\n\"We will throw him into the void to be reconceptualized.");
        GameTools.delay(0.5);
        GameTools.typeText("\nMay he learn obedience through countless loops of existence.\"", 70);

        GameTools.delay(0.7);

        GameTools.typeText("\n\n<Michael:>");
        GameTools.delay(0.3);
        GameTools.typeText("\n\"He will resist to the very end...");
        GameTools.delay(0.5);
        GameTools.typeText("\nTearing the cycle apart to find himself.\"");

        GameTools.delay(0.7);

        GameTools.typeText("\n\n<Metatron:>");
        GameTools.delay(0.3);
        GameTools.typeText("\n\"Indeed.");
        GameTools.delay(0.5);
        GameTools.typeText(" He is a stubborn variable,");
        GameTools.delay(0.3);
        GameTools.typeText("\nbut if the calculation is successful.", 50);
        GameTools.delay(0.5);
        GameTools.typeText("\nHe will loop until the errors are smoothed out.\"", 60);

        GameTools.delay(0.7);

        GameTools.typeText("\n\n\"He will act,", 60);
        GameTools.delay(0.5);
        GameTools.typeText(" fail,", 60);
        GameTools.delay(0.5);
        GameTools.typeText(" and restart,", 60);
        GameTools.delay(0.5);
        GameTools.typeText("\nUntil a version worthy of the light finally emerges\"", 80);

        GameTools.delay(0.7);

        GameTools.typeText("\n\nMichael looks at you one last time.", 60);
        GameTools.delay(0.5);
        GameTools.typeText("\nThe conflict leaves his eyes,");
        GameTools.delay(0.5);
        GameTools.typeText(" replaced by the steel of duty.\"");
        GameTools.delay(0.5);

        GameTools.typeText("\n\nThe Scales of Justice tip decisively...", 100);

        GameTools.pressToContinue(scanner);

        GameTools.clearScreen();

        GameTools.typeText("\"Very", 100);
        GameTools.delay(0.4);
        GameTools.typeText(" well...\"", 100);
        GameTools.delay(1);

        GameTools.typeText("\n\nMichael raises his sword.", 50);
        GameTools.delay(0.5);
        GameTools.typeText("\nThe blade erupts in lighting,", 60);
        GameTools.delay(0.5);
        GameTools.typeText("\nblazing with a fire that burns hotter than the stars.", 70);


        GameTools.pressToContinue(scanner);
        GameTools.delay(2);
        GameTools.clearScreen();

        GameTools.typeText("The memory ends,");
        GameTools.delay(0.3);
        GameTools.typeText(" fatigue rushes over you...");

        GameTools.pressToContinue(scanner);
        GameTools.delay(2);

    }





}

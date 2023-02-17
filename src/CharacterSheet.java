import com.prog2.races.Race;

import java.util.ArrayList;

public class CharacterSheet {

    // * basic info
    public String characterName;
    public CharacterClass characterClass;
    public int level;
    public Race characterRace;
    public Background background;
    public Alignment alignment;
    public String playerName;
    public int xp;

    // * hit-points and armor
    public int armorClass;
    public int initiative;
    public int speed;
    public int maxHP;
    public int currentHP;
    public int hitDiceType;
    public int amountOfHitDice;
    public int proficiencyBonus;

    // * ability scores
    public int strength;
    public int dexterity;
    public int contitution;
    public int intelligent;
    public int wisdom;
    public int charisma;

    // * passives
    public int passivePerception;

    // * features and traits
    public ArrayList<String> traits;

    // * proficiencies
    public ArrayList<String> languages;
    public ArrayList <String> proficiencies;

    // * equipment
    public ArrayList<String> equipment;
    public ArrayList<String> weapons;
    public ArrayList<String> armor;
    public ArrayList<String> spells;

    // * money
    public int copper;
    public int silver;
    public int electrum;
    public int gold;
    public int platinum;


}

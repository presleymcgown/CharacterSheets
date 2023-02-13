import java.io.Serializable;
import java.util.ArrayList;

public abstract class Race implements Serializable{

    /// region Racial Information
    public String raceName;
    public CreatureSize size;
    public int speed;

    /// endregion

    // * bonus stats are added to a character's rolled ability scores

    /// region Racial Bonus Stats
    public int hp;
    public int strength;
    public int dexterity;
    public int constitution;
    public int intelligence;
    public int wisdom;
    public int charisma;

    /// endregion

    /// region Proficiencies and Features
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

    /// endregion

    public Race(){

        traits = new ArrayList<>();
        languages = new ArrayList<>();
        proficiencies = new ArrayList<>();
        equipment = new ArrayList<>();
        weapons = new ArrayList<>();
        armor = new ArrayList<>();
        spells = new ArrayList<>();

    }

}

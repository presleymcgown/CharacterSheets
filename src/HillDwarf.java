public class HillDwarf extends Race{

    public HillDwarf(){

        super();

        this.raceName = "Hill Dwarf";
        this.size = CreatureSize.MEDIUM;
        this.speed = 25;
        this.hp = 1;
        this.constitution = 2;
        this.wisdom = 1;

        this.languages.add("Dwarvish");
        this.languages.add("Common");
        this.traits.add("Darkvision");
        this.traits.add("Poison Resistance");

    }

}

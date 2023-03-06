package com.prog2.backgrounds;

public class Sailor extends Background{

    public Sailor(){

        this.backgroundName = "Sailor";

        this.proficiencies.add("Athletics");
        this.proficiencies.add("Perception");

        this.equipment.put("A belaying pin (club)", true);
        this.equipment.put("50 feet of silk rope", true);
        this.equipment.put("A lucky charm such as a rabbit foot or small stone with a hole in the center", true);
        this.equipment.put("A set of common clothes", true);
        this.equipment.put("A belt pouch containing 10 gp", true);

    }

}

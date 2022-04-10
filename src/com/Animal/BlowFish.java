package com.Animal;

public class BlowFish extends Fish{
    private String speciesNansamba57153;

    public BlowFish(String species) {
        super();
        species = "Species";
    }

    public BlowFish(String name, int age, int weight, String jawless, String species) {
        super(name, age, weight, jawless);
        this.speciesNansamba57153 = species;
    }

    public BlowFish(String name, String jawless, String species) {
        super(name, jawless);
        this.speciesNansamba57153 = species;
    }
    @Override
    public void eat(String food) {
        System.out.println("The fish eats "+ food);
    }

    @Override
    public void getVoice() {
        System.out.println("The fish makes bubbles");;
    }

    @Override
    public String toString() {
        return "BlowFish{" +
                "species='" + speciesNansamba57153 + '\'' +
                '}';
    }
}

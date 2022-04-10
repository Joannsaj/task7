package com.Animal;

public class Pigeon extends Bird{
    String speciesNansamba57153;

    public Pigeon() {
        super();
        speciesNansamba57153 = "flying-bird";
    }

    public Pigeon(String name, int age, int weight, String featherColor, String species) {
        super(name, age, weight, featherColor);
        this.speciesNansamba57153 = species;
    }

    public Pigeon(String name, String featherColor, String species) {
        super(name, featherColor);
        this.speciesNansamba57153 = species;
    }

    @Override
    public void eat(String food) {
        System.out.println("The Pigeon eats "+ food);
    }

    @Override
    public void getVoice() {
        System.out.println("The pigeon craws");
    }

    @Override
    public String toString() {
        return "Pigeon{" +
                "species='" + speciesNansamba57153 + '\'' +
                '}';
    }
}

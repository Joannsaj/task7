package com.Animal;

public class Mammal extends Animal {
    private String animalNansamba57153;
    public Mammal() {
        super();
        animalNansamba57153 = "Animal";
    }
    public Mammal(String name, int age, int weight,String animal) {
        super(name, age, weight);
        this.animalNansamba57153 = animal;
    }
    public Mammal(String name, String animal){
        super(name);
        this.animalNansamba57153 =animal;
    }

    @Override
    public void eat(String food) {
        System.out.println("This mammal eats "+ food);
    }

    @Override
    public void getVoice() {
        System.out.println("This mammal makes sound");
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "animal='" + animalNansamba57153 + '\'' +
                '}';
    }
}

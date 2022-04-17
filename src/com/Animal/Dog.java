package com.Animal;

public class Dog extends Mammal implements AnimalBehaviour, AnimalMove {
    private String breedNansamba57153;

    public Dog(String breed) {
       super();
       breed = "Animal";
    }

    public Dog(String name, int age, int weight, String animal, String breed) {
        super(name, age, weight, animal);
        this.breedNansamba57153 = breed;
    }

    public Dog(String name,String animal, String breed) {
        super(name,animal);
        this.breedNansamba57153 = breed;
    }

    @Override
    public void eat(String food) {
        System.out.println("The dog eats "+ food);
    }

    @Override
    public void getVoice() {
        System.out.println("The dog is barking");;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breedNansamba57153 + '\'' +
                '}';
    }

    @Override
    public void sleep() {
    }

    @Override
    public void move() {
        System.out.println(this.getClass().getSimpleName() + " runs");
    }
}

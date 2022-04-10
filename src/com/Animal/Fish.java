package com.Animal;

public class Fish extends Animal{
    String jawlessNansamba57153;

    public Fish() {
        super();
        jawlessNansamba57153 = "jawless";
    }

    public Fish(String name, int age, int weight, String jawless) {
        super(name, age, weight);
        this.jawlessNansamba57153 = jawless;
    }

    public Fish(String name, String jawless) {
        super(name);
        this.jawlessNansamba57153 = jawless;
    }
    @Override
    public void eat(String food) {
        System.out.println("This fish eats "+food);
    }

    @Override
    public void getVoice() {
        System.out.println("This fish makes bubbles");
    }
}

package com.Animal;

public class Bird extends Animal{
    String featherColorNansamba57153;

    public Bird() {
        super();
        featherColorNansamba57153 = "Blue";
    }
    public Bird(String name, int age, int weight, String featherColor) {
        super(name, age, weight);
        this.featherColorNansamba57153 = featherColor;
    }

    public Bird(String name, String featherColor) {
        super(name);
        this.featherColorNansamba57153 = featherColor;
    }

    @Override
    public void eat(String food) {
        System.out.println("The bird eats "+ food);
    }

    @Override
    public void getVoice() {
        System.out.println("The bird tweets");
    }

    @Override
    public String toString() {
        return "Bird{" +
                "featherColor='" + featherColorNansamba57153 + '\'' +
                '}';
    }
}

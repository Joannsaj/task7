package com.Animal;

public abstract class Animal {
    String nameNansamba57153;
    int ageNansamba57153;
    int weightNansamba57153;

    public Animal(){
        ageNansamba57153 = weightNansamba57153 = 0;
        nameNansamba57153 = "Animal";
    }

    public Animal(String name, int age, int weight) {
        this.nameNansamba57153 = name;
        this.ageNansamba57153 = age;
        this.weightNansamba57153 = weight;
    }

    public Animal(String name) {
        this.nameNansamba57153 = name;
    }

    public String getNameNansamba57153() {
        return nameNansamba57153;
    }

    public void setNameNansamba57153(String nameNansamba57153) {
        this.nameNansamba57153 = nameNansamba57153;
    }

    public int getAgeNansamba57153() {
        return ageNansamba57153;
    }

    public void setAgeNansamba57153(int ageNansamba57153) {
        this.ageNansamba57153 = ageNansamba57153;
    }

    public int getWeightNansamba57153() {
        return weightNansamba57153;
    }

    public void setWeightNansamba57153(int weightNansamba57153) {
        this.weightNansamba57153 = weightNansamba57153;
    }
    public abstract void eat(String food);
    public abstract void getVoice();

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + nameNansamba57153 + '\'' +
                ", age=" + ageNansamba57153 +
                ", weight=" + weightNansamba57153 +
                '}';
    }
}

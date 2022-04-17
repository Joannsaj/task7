package com.Animal;

public class Main {

    public static void main(String[] args) {
        // write your code here


        Animal animal[] = new Animal[6];
        animal[0] = new Mammal("Doggy","Dog");
        animal[1] = new Dog("DoGGy","Dog","bulldog");
        animal[2] = new Fish("Fishy","jawless");
        animal[3] = new BlowFish("FiSHy","jawless","goldfish");
        animal[4] = new Bird("Birdy","brown");
        animal[5] = new Pigeon("BiRDy","grey","flying-bird");

        animal[1].eat("Meat");
        animal[1].getVoice();

        animal[2].eat("Seeds");
        animal[2].getVoice();

        animal[3].eat("Seeds");
        animal[3].getVoice();

        animal[4].eat("bread");
        animal[4].getVoice();

        animal[5].eat("corn");
        animal[5].getVoice();

        AnimalBehaviour animalBehaviour [] = new AnimalBehaviour[3];
        animalBehaviour[0]=new Dog("DoGGy","Dog","bulldog");
        animalBehaviour[1]=new Pigeon("BiRDy","grey","flying-bird");
        animalBehaviour[2]=new BlowFish("FiSHy","jawless","goldfish");

        for (Animal a : animal){
            a.move();
        }

        for (Animal a: animal){
            AnimalName.name(a.getNameNansamba57153());
        }
    }

}

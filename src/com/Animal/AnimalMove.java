package com.Animal;

public interface AnimalMove {
    default void move() {
        System.out.println(this.getClass().getSimpleName() + " move");
    }
}
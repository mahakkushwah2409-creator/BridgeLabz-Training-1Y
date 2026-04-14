package com.gla.generics;
import java.util.*;
class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Meow");
    }
}

class AnimalUtil {

    public static void printAnimals(List<? extends Animal> animals) {
        for (Animal a : animals) {
            a.sound();
        }
    }
    public static void main(String[] args) {
        List<Dog> dogs = Arrays.asList(new Dog(), new Dog());
        List<Cat> cats = Arrays.asList(new Cat(), new Cat());
        printAnimals(dogs);
        printAnimals(cats);
    }
}
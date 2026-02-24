package org.example.animals;
public class AnimalInfo {
    static void main(String[] args) {
        Animals animals = new Animals();

        Animals cat = new Cat();
        cat.animalSound();

        Animals dog = new Dog();
        dog.animalSound();

        Animals cow = new Cow();
        cow.animalSound();

    }
}

package _07_abstractclass_interface._01_practice.animal_edible.animal;

import _07_abstractclass_interface._01_practice.animal_edible.edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
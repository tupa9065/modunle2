package Animal_InterfaceEdible.Animal;

import Animal_InterfaceEdible.Animal.Animal;
import Animal_InterfaceEdible.edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: Cuck-tack";
    }

    @Override
    public String howToEat() {
        return "Chicken: could be fried";
    }
}

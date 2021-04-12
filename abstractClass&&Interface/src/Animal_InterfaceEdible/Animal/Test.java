package Animal_InterfaceEdible.Animal;

import Animal_InterfaceEdible.edible.Edible;
import Animal_InterfaceEdible.fruit.Apple;
import Animal_InterfaceEdible.fruit.Fruit;
import Animal_InterfaceEdible.fruit.Orange;

public class Test {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
            if (animal instanceof Chicken) {
                Chicken chicken =(Chicken) animal;
                System.out.println(chicken.howToEat());
            }
        }

        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}

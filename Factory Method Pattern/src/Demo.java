public class Demo {
    public static void main(String[] args) {
        FactoryAnimal animal = new FactoryAnimal();
        Animal animal1 =animal.getAnimal("dog");
        System.out.println(animal1.makeSound());
        Animal animal2 =animal.getAnimal("cat");
        System.out.println(animal2.makeSound());
        Animal animal3 =animal.getAnimal("cow");
        System.out.println(animal3.makeSound());
    }
}

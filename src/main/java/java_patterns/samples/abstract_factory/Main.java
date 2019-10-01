package java_patterns.samples.abstract_factory;

public class Main {
    public static void main(String[] args) {
        AbstractFactory factory = AbstractFactory.factory(AnimalType.DOG);
        Animal animal = factory.getAnimal();

        System.out.println(animal.getVoice());
    }
}

package java_patterns.samples.abstract_factory;

public class DogFactory extends AbstractFactory {

    @Override
    Animal getAnimal() {
        return new Dog();
    }
}

package java_patterns.samples.abstract_factory;

public class CatFactory extends AbstractFactory {

    @Override
    Animal getAnimal() {
        return new Cat();
    }
}

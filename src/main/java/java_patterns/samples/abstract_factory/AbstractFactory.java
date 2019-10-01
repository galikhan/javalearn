package java_patterns.samples.abstract_factory;

abstract class AbstractFactory {

    private static final CatFactory catFactory = new CatFactory();
    private static final DogFactory dogFactory = new DogFactory();

    static AbstractFactory factory(AnimalType animalType) {

        if(animalType.equals(AnimalType.CAT))   {
            return catFactory;
        } else {
            return dogFactory;
        }
    }

    abstract Animal getAnimal();

}

enum AnimalType {
    DOG, CAT
}

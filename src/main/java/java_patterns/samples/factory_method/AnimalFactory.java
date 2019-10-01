package java_patterns.samples.factory_method;

public class AnimalFactory {

    public Animal getAnimal(AnimalType animalType) {
        if(animalType.equals(AnimalType.CAT)) {
            return new Cat();
        } else if(animalType.equals(AnimalType.DOG)) {
            return new Dog();
        }
        return null;
    }

}

enum AnimalType {
    DOG,
    CAT
}


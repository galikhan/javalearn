package java_patterns.samples.factory_method;

public class Main {

    public static void main(String[] args) {

        AnimalFactory animalFactory = new AnimalFactory();
        Animal animal = animalFactory.getAnimal(AnimalType.CAT);
        System.out.println(AnimalType.CAT + " : " + animal.getVoice());

        animal = animalFactory.getAnimal(AnimalType.DOG);
        System.out.println(AnimalType.DOG + " : " + animal.getVoice());
    }
}

package java_patterns.samples.abstract_factory_2;

public class Main {
    public static void main(String[] args) {

        IAbstractFactory abstractFactory = IAbstractFactory.getInstance("tree");
        OakTree oakTree = abstractFactory.create("oak");
        LemonTree lemonTree = abstractFactory.create("lemon");

        System.out.println("oak size : " + oakTree.getSize());
        System.out.println("lemon size : " + lemonTree.getSize());

    }
}

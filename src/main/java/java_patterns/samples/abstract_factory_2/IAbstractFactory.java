package java_patterns.samples.abstract_factory_2;

public interface IAbstractFactory {
    <T> T create(String type);

    static IAbstractFactory getInstance(String choice) {
        if(choice.equalsIgnoreCase("tree")) {
            return new FTreeFactory();
        } else {
            return new FColorFactory();
        }
    }
//    default <T> getInstance() {
//        return ;
//    }
}

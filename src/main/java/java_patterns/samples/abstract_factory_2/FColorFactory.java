package java_patterns.samples.abstract_factory_2;

public class FColorFactory implements IAbstractFactory {

    private static final Red red = new Red();
    private static final Black black = new Black();

    @Override
    public IColor create(String type) {
        if("black".equalsIgnoreCase(type)) {
            return black;
        } else {
            return red;
        }
    }
}

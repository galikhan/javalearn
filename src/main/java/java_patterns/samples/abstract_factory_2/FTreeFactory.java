package java_patterns.samples.abstract_factory_2;

public class FTreeFactory implements IAbstractFactory {

    private static final LemonTree lemonTree = new LemonTree();
    private static final OakTree oakTree = new OakTree();

    @Override
    public ITree create(String type) {
        if("lemon".equalsIgnoreCase(type)) {
            return lemonTree;
        } else {
            return oakTree;
        }
    }
}

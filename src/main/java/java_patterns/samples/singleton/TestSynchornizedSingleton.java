package java_patterns.samples.singleton;

public class TestSynchornizedSingleton {

    private static TestSynchornizedSingleton testSingleton;

    public static TestSynchornizedSingleton getInstance() {

        if(testSingleton == null) {
            testSingleton = new TestSynchornizedSingleton();
            System.out.println("synchronized instance created");
        } else {
            System.out.println("synchronized already created");
        }
        return testSingleton;
    }

}

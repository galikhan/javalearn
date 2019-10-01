package java_patterns.samples.singleton;

public class TestSingleton {

    private static TestSingleton testSingleton;

    public static TestSingleton getInstance() {

        if(testSingleton == null) {
            testSingleton = new TestSingleton();
            System.out.println("instance created");
        } else {
            System.out.println("already created");
        }
        return testSingleton;
    }
}

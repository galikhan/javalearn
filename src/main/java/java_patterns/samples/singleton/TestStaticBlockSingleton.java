package java_patterns.samples.singleton;

public class TestStaticBlockSingleton {

    private static TestStaticBlockSingleton testSingleton;

    public static TestStaticBlockSingleton getInstance() {
        return testSingleton;
    }

    static {
        if(testSingleton == null) {
            testSingleton = new TestStaticBlockSingleton();
            System.out.println("instance created static block");
        } else {
            System.out.println("already created static block");
        }
    }
}

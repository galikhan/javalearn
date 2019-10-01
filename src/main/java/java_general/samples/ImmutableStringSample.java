package java_general.samples;

public class ImmutableStringSample {

    public ImmutableStringSample() {
        String hello = "hello";
        String chello = hello;
        System.out.println("first " + hello);
        hello = "hello1";
        System.out.println("second "  + hello);
        System.out.println("chello " + chello);

        int a = 1;
        int b = a;
        a = 2;
        System.out.println("a1, b, a2 : " + a + ", " + b );

        Integer ao = new Integer(2);
        Integer bo = ao;
        ao = 1;
        System.out.println("a, b: " + ao + ", " + bo );
    }
}

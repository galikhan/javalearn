package jenkov.functional.samples;

public class JavaFunctionalProgramming {


    public JavaFunctionalProgramming() {
        sum(1, 2);
        String str1 = "str1";
        System.out.println(str1);
        str1 = "strstrnew";
        String str2 = str1.replace("1", "2");
        System.out.println(str1 + " - " + str2);

    }

    //example of pure function does not have side effect(ex. do not changes external var)
    //totally depends on input
    //
    public int sum(int a, int b) {
        return a + b;
    }
}



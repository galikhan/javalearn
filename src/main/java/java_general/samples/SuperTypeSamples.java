package java_general.samples;

import java.util.ArrayList;
import java.util.List;

public class SuperTypeSamples {

    public SuperTypeSamples() {
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("ccc");
        list.add("jjj");
        list.add("ddd");

        print(list);
        //print2 not working use ?(wildcard) supertype
        //print2(list);

    }

    public void print(List<?> list) {
        for(Object o : list) {
            System.out.println(o);
        }
    }

    public void print2(List<Object> list) {
        for(Object o : list) {
            System.out.println(o);
        }
    }

//    public void print2(List<T> list) {
//        for(T o : list) {
//            System.out.println(o);
//        }
//    }
//

    public void addNewShape(List<? extends Shape> list) {
//        list.add(new Circle());
    }
}


class Shape {

}

class Circle extends Shape{

}

class Rectangle extends Shape {

}
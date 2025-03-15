package test;

import java.io.Serializable;
import java.lang.invoke.SerializedLambda;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

public class PracticeTest implements PracticeInterface {

    public static void main(String[] args){
        System.out.println(PracticeTest.class.getName());
    }

    public void test() {
        System.out.println("access method");
    }
}

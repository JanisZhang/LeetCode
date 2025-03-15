package test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyTest implements InvocationHandler {
    private Object object;

    public ProxyTest(Object object){
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if(method.getName().equals("test")){
            System.out.println("Starting dynamic invoke");
            Object invoke = method.invoke(this.object,args);
            System.out.println("Finish dynamic invoke");
            return invoke;
        }
        return null;
    }

    public static void main(String[] args) {
        PracticeInterface o =
                (PracticeInterface)Proxy.newProxyInstance(PracticeTest.class.getClassLoader(),
                PracticeTest.class.getInterfaces(), new ProxyTest(new PracticeTest()));
        o.test();

    }
}

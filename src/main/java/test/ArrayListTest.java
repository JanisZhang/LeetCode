package test;

import javax.crypto.spec.PSource;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListTest {
    static ArrayListTest arrayListTest = new ArrayListTest();
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        List<Integer> list = Collections.synchronizedList(arrayList);
        CopyOnWriteArrayList<Integer> list1 = new CopyOnWriteArrayList<>();
        Vector<Integer> vector = new Vector<>();

        Runnable task = ()->{
            for (int i = 0; i < 1000;i++ ){
                arrayList.add(i);
            }
        };

        Thread thread1 = new Thread(()->{
            System.out.println(Thread.currentThread().getName());
            for (int i = 0; i < 1000;i++ ){
                vector.add(i);
            }
//            arrayListTest.add(arrayList);
        });

        Thread thread2 = new Thread(()->{
            System.out.println(Thread.currentThread().getName());
            for (int i = 0; i < 1000;i++ ){
                vector.add(i);
            }
//            arrayListTest.add(arrayList);
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
            System.out.println(vector.size());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

   void add(List<Integer> list){
        synchronized (this){
            for (int i = 0; i < 1000;i++ ){
                list.add(i);
            }
        }
    }
}

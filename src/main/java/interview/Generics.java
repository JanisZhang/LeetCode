package interview;

import java.util.ArrayList;

public class Generics<T> {

    private T value;

    public Generics(T value){
        this.value = value;
    }

    public T getValue(){
        return value;
    }

    public static void main(String[] args) {
        ArrayList<Generics> g = new ArrayList<>();
        ArrayList<Generics<Integer>> g = new ArrayList<>();
//        Generics<?> g1 = new Generics<>(10);
//        Generics<?> g2 = new Generics<>("Hello");
        Generics<Integer> g1 = new Generics<>(10);
        Generics<String> g2 = new Generics<>("Hello");
        g.add(g1);
        g.add(g2);
        int i = g.get(0).getValue();
        String s = g.get(1).getValue();
        System.out.println(s);
        System.out.println(i);
    }

}

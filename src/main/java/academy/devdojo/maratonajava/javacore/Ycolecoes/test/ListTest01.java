package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(10);
        List<String> names2 = new ArrayList<>(10);
        names.add("Cupim");
        names.add("Luan");
        names2.add("Bias");
        names2.add("Jesus");
//        names.remove(0); // Index
//        names.remove("Luan"); // Object
        names.addAll(names2);
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("---------");

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
    }
}

package academy.devdojo.maratonajava.javacore.Zgenerics;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
  public static void main(String[] args) {
    // Type erasure - apaga o tipo depois que ele é compilado
    List<String> lista = new ArrayList<>();
    lista.add("Cupim");
    lista.add("George Bias");

    for (String s : lista) {
      System.out.println(s);
    }
  }
}

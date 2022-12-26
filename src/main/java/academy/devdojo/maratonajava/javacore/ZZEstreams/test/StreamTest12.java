package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Category;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest12 {
  private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
          new LightNovel("Tensei Shittara", 8.99, Category.FANTASY),
          new LightNovel("Overlord", 10.99, Category.FANTASY),
          new LightNovel("Violet Evergarden", 5.99, Category.DRAMA),
          new LightNovel("No Game no life", 2.99, Category.FANTASY),
          new LightNovel("Fullmetal Alchemist", 5.99, Category.FANTASY),
          new LightNovel("Kumo desuga", 1.99, Category.FANTASY),
          new LightNovel("Kumo desuga", 1.99, Category.FANTASY),
          new LightNovel("Monogatari", 4.00, Category.ROMANCE)
  ));

  public static void main(String[] args) {
    Map<Category, List<LightNovel>> collect = lightNovels.stream().collect(Collectors.groupingBy(lightNovel -> lightNovel.getCategory()));
    System.out.println(collect);
  }
}

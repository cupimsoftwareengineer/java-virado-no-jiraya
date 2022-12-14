package academy.devdojo.maratonajava.javacore.ZZClambdas.service;

import academy.devdojo.maratonajava.javacore.ZZClambdas.dominio.Anime;

public class AnimeComparators {
  public static int compareByTitle(Anime a1, Anime a2) {
    return a1.getTitle().compareTo(a2.getTitle());
  }

  public int compareByTitleNonStatic(Anime a1, Anime a2) {
    return a1.getTitle().compareTo(a2.getTitle());
  }
}

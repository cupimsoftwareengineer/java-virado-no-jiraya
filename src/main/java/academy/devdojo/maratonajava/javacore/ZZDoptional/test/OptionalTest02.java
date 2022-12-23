package academy.devdojo.maratonajava.javacore.ZZDoptional.test;

import academy.devdojo.maratonajava.javacore.ZZDoptional.dominio.Manga;
import academy.devdojo.maratonajava.javacore.ZZDoptional.repositorio.MangaRepository;

import java.util.Optional;

public class OptionalTest02 {
  public static void main(String[] args) throws IllegalAccessException {
    Optional<Manga> mangaByTitle = MangaRepository.findByTile("Boku no hero");
    mangaByTitle.ifPresent(m -> m.setTitle("Boku no Hero 2"));
    System.out.println(mangaByTitle);

    Manga MangaById = MangaRepository.findById(2)
            .orElseThrow(IllegalAccessException::new);
    System.out.println(MangaById);

    Manga newManga = MangaRepository.findByTile("Drifters")
            .orElseGet(() -> new Manga(3, "Drifters", 20));
    System.out.println(newManga);
  }
}

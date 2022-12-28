package academy.devdojo.maratonajava.javacore.ZZIjdbc.service;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.repository.ProduceRepository;

public class ProducerService {
  public static void save(Producer producer) {
    ProduceRepository.save(producer);
  }

  public static void delete(Integer id) {
    requireValidId(id);
    ProduceRepository.delete(id);
  }

  public static void update(Producer producer) {
    requireValidId(producer.getId());
    ProduceRepository.update(producer);
  }

  private static void requireValidId(Integer id) {
    if (id == null || id <= 0) {
      throw new IllegalArgumentException("Invalid value for id");
    }
  }
}

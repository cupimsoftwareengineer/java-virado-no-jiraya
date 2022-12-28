package academy.devdojo.maratonajava.javacore.ZZIjdbc.service;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.repository.ProduceRepository;

public class ProducerService {
  public static void save(Producer producer) {
    ProduceRepository.save(producer);
  }

  public static void delete(int id) {
    if(id <= 0) {
      throw new IllegalArgumentException("Invalid value for id");
    }
    ProduceRepository.delete(id);
  }
}

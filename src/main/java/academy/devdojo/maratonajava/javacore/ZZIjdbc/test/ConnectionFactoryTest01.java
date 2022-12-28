package academy.devdojo.maratonajava.javacore.ZZIjdbc.test;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.repository.ProduceRepository;

public class ConnectionFactoryTest01 {
  public static void main(String[] args) {
    Producer producer = Producer.ProducerBuilder.builder().name("NHK").build();
    ProduceRepository.save(producer);
  }
}

package academy.devdojo.maratonajava.javacore.ZZIjdbc.test;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.service.ProducerService;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class ConnectionFactoryTest01 {
  public static void main(String[] args) {
    Producer producer = Producer.builder().name("cupim").build();
    Producer producerToUpdate = Producer.builder().id(11).name("CUPIM").build();
//    ProducerService.save(producer);
//    ProducerService.delete(7);
//    ProducerService.update(producerToUpdate);
//    List<Producer> producers = ProducerService.findAll();
//    List<Producer> producers = ProducerService.findByName("Mad");
//    List<Producer> producers = ProducerService.findByName("Mad");
//    log.info("Producers found '{}'", producers);
//    ProducerService.showProducerMetadata();
//    ProducerService.showDriverMetaData();
//    ProducerService.showTypeScrollWorking();
//    List<Producer> producers = ProducerService.findByNameAndUpdateToUpperCase("Deen");
//    List<Producer> producers = ProducerService.findByNameAndInsertWhenNotFound("A-1 pictures");
//    ProducerService.findByNameAndDelete("A-1 pictures");
//    List<Producer> producers = ProducerService.findByNamePreparedStatement("STUDIO DEEN");
//    log.info("Producers found '{}'", producers);
//    ProducerService.updatePreparedStatement(producerToUpdate);
    List<Producer> producers = ProducerService.findByNameCallableStatement("cupim");
    log.info("Producers found '{}'", producers);
  }
}

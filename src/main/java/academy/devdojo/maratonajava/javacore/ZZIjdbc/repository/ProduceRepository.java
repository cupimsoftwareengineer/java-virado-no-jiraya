package academy.devdojo.maratonajava.javacore.ZZIjdbc.repository;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.conn.ConnectionFactory;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

@Log4j2
public class ProduceRepository {
  public static void save(Producer producer) {
    String sql = String.format("INSERT INTO `anime_store`.`producer` (`name`) VALUES ('%s');", producer.getName());
    try (Connection conn = ConnectionFactory.getConnection();
         Statement stmt = conn.createStatement()) {
      int rowsAffected = stmt.executeUpdate(sql);
      log.info("Inserted producer '{} in the Database, rows affected '{}'", producer.getName(), rowsAffected);
    } catch (SQLException e) {
      log.error("Error while trying to insert producer '{}'", producer.getName(), e);
    }
  }

  public static void delete(int id) {
    String sql = String.format("DELETE FROM anime_store.producer WHERE id = %d;", id);
    try (Connection conn = ConnectionFactory.getConnection();
         Statement stmt = conn.createStatement()) {
      int rowsAffected = stmt.executeUpdate(sql);
      log.info("Deleted producer '{} from the Database, rows affected '{}'", id, rowsAffected);
    } catch (SQLException e) {
      log.error("Error while trying to delete producer '{}'", id, e);
    }
  }
}

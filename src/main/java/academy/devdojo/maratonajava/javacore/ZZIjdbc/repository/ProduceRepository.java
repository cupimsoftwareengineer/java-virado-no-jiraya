package academy.devdojo.maratonajava.javacore.ZZIjdbc.repository;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.conn.ConnectionFactory;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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

  public static void update(Producer producer) {
    String sql = String.format("UPDATE anime_store.producer t SET t.name = '%s' WHERE t.id = %d;", producer.getName(), producer.getId());
    try (Connection conn = ConnectionFactory.getConnection();
         Statement stmt = conn.createStatement()) {
      int rowsAffected = stmt.executeUpdate(sql);
      log.info("Updated producer '{}, rows affected '{}'", producer.getId(), rowsAffected);
    } catch (SQLException e) {
      log.error("Error while trying to update producer '{}'", producer.getId(), e);
    }
  }

  public static List<Producer> findAll() {
    log.info("Finding all Producers");
    return findByName("");
  }

  public static List<Producer> findByName(String name) {
    log.info("Finding Producer by name");
    String sql = String.format("SELECT * FROM anime_store.producer where name like '%%%s%%';", name);
    List<Producer> producers = new ArrayList<>();
    try (Connection conn = ConnectionFactory.getConnection();
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery(sql)) {
      while (rs.next()) {
        Producer producer = Producer
                .builder()
                .id(rs.getInt("id"))
                .name(rs.getString("name"))
                .build();
        producers.add(producer);
      }
    } catch (SQLException e) {
      log.error("Error while trying to find all producers", e);
    }
    return producers;
  }
}

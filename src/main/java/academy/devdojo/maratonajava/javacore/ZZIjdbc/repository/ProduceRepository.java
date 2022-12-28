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
      log.info("Inserted producer in the Database, rows affected '{}'", rowsAffected);
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}

package academy.devdojo.maratonajava.javacore.ZZIjdbc.repository;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.conn.ConnectionFactory;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ProduceRepository {
  public static void save(Producer producer) {
    String sql = String.format("INSERT INTO `anime_store`.`producer` (`name`) VALUES ('%s');", producer.getName());
    try (Connection conn = ConnectionFactory.getConnection();
         Statement stmt = conn.createStatement()) {
      int rowsAffected = stmt.executeUpdate(sql);
      System.out.println(rowsAffected);
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}

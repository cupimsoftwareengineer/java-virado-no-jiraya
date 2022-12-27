package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.test;

import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.Person;

public class BuilderPatternTest01 {
  public static void main(String[] args) {
    Person build = new Person.PersonBuilder()
            .firstName("George")
            .lastName("Bias")
            .username("ViradoNoJiraya")
            .email("georgeluancontato@gmail.com")
            .build();
    System.out.println(build);
  }
}

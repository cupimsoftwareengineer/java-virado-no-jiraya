package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

public class OuterClassesTest03 {
  private String name = "George";

  static class Nested {
    private String lastName = "Bias";

    void print() {
      System.out.println(new OuterClassesTest03().name + " " + lastName);
    }
  }

  public static void main(String[] args) {
    OuterClassesTest03.Nested nested = new OuterClassesTest03.Nested();
    nested.print();
  }
}
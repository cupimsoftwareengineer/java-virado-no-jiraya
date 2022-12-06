package academy.devdojo.maratonajava.javacore.Qstring.Test;

public class StringBuilderTest01 {
  public static void main(String[] args) {
    String nome = "George Bias";
    nome.concat("DevDojo");
    nome.substring(0,3);
    System.out.println(nome);

    StringBuilder sb = new StringBuilder("George Bias");
    sb.append(" DevDojo");
    sb.substring(0,2);
    sb.reverse();
    sb.delete(0,3);
    System.out.println(sb);
  }
}

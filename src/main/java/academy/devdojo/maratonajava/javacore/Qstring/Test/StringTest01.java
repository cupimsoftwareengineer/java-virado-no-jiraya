package academy.devdojo.maratonajava.javacore.Qstring.Test;

public class StringTest01 {
  public static void main(String[] args) {
    String nome = "George"; // String constant pool
    String nome2 = "George"; // String constant pool
    nome = nome.concat(" Bias");
    System.out.println(nome);
    System.out.println(nome == nome2);
    String nome3 = new String("George"); // 1 variavel de referencia, 2 objeto do tipo string, 3 uma string no pool de string
    System.out.println(nome2 == nome3);
    System.out.println(nome2 == nome3.intern());
  }
}
package academy.devdojo.maratonajava.javacore.Qstring.Test;

public class StringPerfomanceTest {
  public static void main(String[] args) {
    long inicio = System.currentTimeMillis();
    concactString(30000);
    long fim = System.currentTimeMillis();
    System.out.println("Tempo gasto para String " + (fim - inicio) + "ms");

    inicio = System.currentTimeMillis();
    concactStringBuilder(30000);
    fim = System.currentTimeMillis();
    System.out.println("Tempo gasto para concactStringBuilder " + (fim - inicio) + "ms");

    inicio = System.currentTimeMillis();
    concactStringBuffer(30000);
    fim = System.currentTimeMillis();
    System.out.println("Tempo gasto para StringBuffer " + (fim - inicio) + "ms");
  }

  private static void concactString(int tamanho) {
    String texto = "";

    for (int i = 0; i < tamanho; i++) {
      texto += i;
    }
  }

  private static void concactStringBuilder(int tamanho) {
    StringBuilder sb = new StringBuilder(tamanho);

    for (int i = 0; i < tamanho; i++) {
      sb.append(i);
    }
  }

  private static void concactStringBuffer(int tamanho) {
    StringBuffer sb = new StringBuffer(tamanho);

    for (int i = 0; i < tamanho; i++) {
      sb.append(i);
    }
  }
}

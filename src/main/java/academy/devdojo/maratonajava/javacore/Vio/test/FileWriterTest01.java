package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file)) {
            fw.write("O DevDojo é lindo, é o melhor curso do brasillllllll");
             fw.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

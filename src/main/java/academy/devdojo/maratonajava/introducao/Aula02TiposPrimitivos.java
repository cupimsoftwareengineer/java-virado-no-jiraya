package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int age = (int) 100000000000L; //casting
        long largeNumber = 100000;
        double salaryDouble = 2000.0;
        float salaryFloat = 2500.0F;
        byte ageByte = 10;
        short ageShort = 10;
        boolean tru = true;
        boolean fals = false;
        char caractere = 'M';

        System.out.println("The age is " + age);
    }
}

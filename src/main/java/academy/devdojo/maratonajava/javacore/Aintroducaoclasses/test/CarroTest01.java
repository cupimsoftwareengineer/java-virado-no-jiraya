package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();

        carro.nome = "Gol";
        carro.modelo = "Volkswagen";
        carro.ano = 2017;

        carro2.nome = "Uno";
        carro2.modelo = "Fiat";
        carro2.ano = 2019;

        carro = carro2;

        System.out.println("Nome do carro: " + carro.nome +
                "\nModelo do carro: " + carro.modelo +
                "\nAno do carro: " + carro.ano);

        System.out.println("\nNome do carro: " + carro2.nome +
                "\nModelo do carro: " + carro2.modelo +
                "\nAno do carro: " + carro2.ano);
    }
}

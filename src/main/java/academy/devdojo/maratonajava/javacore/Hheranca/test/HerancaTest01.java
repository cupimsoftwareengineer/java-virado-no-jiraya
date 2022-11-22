package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("012345-209");
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Cupim");
        pessoa.setCpf("12345678910");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        Funcionario funcionario = new Funcionario();
        System.out.println("\n");
        funcionario.setNome("Oda Nobunaga");
        funcionario.setCpf("22222222222");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(10000);

        funcionario.imprime();
    }
}

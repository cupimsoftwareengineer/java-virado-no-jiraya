package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "George Bias";
        professor.idade = 25;
        professor.sexo = 'M';

        System.out.println("Nome do professor: " + professor.nome +
                "\nIdade do professor: " + professor.idade +
                "\nSexo do professor: " + professor.sexo);
    }
}

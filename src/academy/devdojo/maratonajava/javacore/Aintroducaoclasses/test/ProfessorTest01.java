package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor prof = new Professor();

        prof.name = "William Suane";
        prof.age = 100;
        prof.sex = 'M';

        System.out.println(prof.name + ", " + prof.age + ", " + prof.sex);
    }
}

package academy.devdojo.maratonajava.javacore.Gassociacao.domainExercicio;

/*
         Crie um sistema que gerencie seminários
         O sistema deverá cadastrar seminários, estudantes, professores e local onde será realizado.

         um aluno poderá estar em apenas um seminário
         um seminário poderá ter nenhum ou vários alunos
         um professor poderá ministrar vários seminários
         um seminário deve ter um local

         Campos básicos (excluindo relacionamento)
         seminário: título
         aluno: nome, idade
         professor: nome, especialidade
         local: endereço
 */

public class Aluno {
    private String name;
    private int age;
    private Seminario seminario;

    public Aluno(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Aluno(String name, int age, Seminario seminario) {
        this(name, age);
        this.seminario = seminario;
    }

    public void imprime(){
        System.out.println("------------");
        System.out.println("Nome: " + this.name);
        System.out.println("Idade: " + this.age);
        System.out.println("Seminário: " + seminario.getTitle());
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

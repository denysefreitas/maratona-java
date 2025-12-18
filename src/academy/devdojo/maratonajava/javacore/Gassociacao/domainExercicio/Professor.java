package academy.devdojo.maratonajava.javacore.Gassociacao.domainExercicio;

public class Professor {
    private String name;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String name, String especialidade) {
        this.name = name;
        this.especialidade = especialidade;
    }

    public Professor(String name, String especialidade, Seminario[] seminarios) {
        this(name, especialidade);
        this.seminarios = seminarios;
    }

    public void imprime() {
        System.out.println("------------");
        System.out.println("Professor: " + this.name);
        System.out.println("Especialidade: " + this.especialidade);

        if (seminarios == null) {
            System.out.println("O professor não irá ministrar seminários.");
            return;
        }

        System.out.println("### Seminários cadastrados ###");

        for (Seminario seminario : this.seminarios) {
           System.out.println("-------------------");
            System.out.println("Título: " + seminario.getTitle());
            seminario.imprimeLocal();
            seminario.imprimeAlunos();
        }
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}

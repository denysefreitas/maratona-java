package academy.devdojo.maratonajava.javacore.Gassociacao.domainExercicio;

public class Seminario {
    private String title;
    private Aluno alunos[];
    private Local local;

    public Seminario(String title) {
        this.title = title;
    }

    public Seminario(String title, Aluno[] alunos) {
        this(title);
        this.alunos = alunos;
    }

    public Seminario(String title, Local local){
        this(title);
        this.local = local;
    }

    public Seminario(String title, Aluno[] alunos, Local local) {
        this(title, alunos);
        this.local = local;
    }

    public void imprimeAlunos(){
        if(alunos == null || alunos.length == 0){
            System.out.println("Não há alunos cadastrados para o seminário");
            return;
        }

        System.out.println("--- Alunos ---");
        for(Aluno aluno : this.alunos){
            System.out.println(aluno.getName());
        }
    }

    public void imprimeLocal(){
        if(this.local == null){
            System.out.println("O local ainda não foi definido");
            return;
        }
        System.out.println("Endereço: " + getLocal().getAdress());
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

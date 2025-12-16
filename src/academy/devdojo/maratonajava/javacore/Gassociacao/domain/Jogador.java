package academy.devdojo.maratonajava.javacore.Gassociacao.domain;

public class Jogador {
    private String name;
    private Time time;
    // Relação unidirecional, pois [a classe] time NÃO apresenta relações com jogadores

    public void imprime(){
        System.out.println(this.name);

        if(this.time != null){
            System.out.println(time.getNome());
        } else {
            System.out.println("O time do jogador ainda não foi informado");
        }
    }

    public Jogador(String name){
        this.name = name;
    }

//    public Time getTime() {
//        return time;
//    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

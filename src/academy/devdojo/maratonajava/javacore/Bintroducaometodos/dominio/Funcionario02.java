package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario02 {
    private String name;
    private int age;
    private double []salarys;
    private double media = 0.0;

    public void imprime(){
        System.out.println(this.name);
        System.out.println(this.age);

        if(salarys == null){
            return;
        }

        for(double aux : salarys){
            System.out.println(aux + " ");
        }
        imprimeMediaSalarial();
    }

    public void imprimeMediaSalarial(){
        double sum = 0.0;

        if(salarys == null){
            System.out.println("Não é possível calcular a média salarial do funcionário.");
            return;
        }

        for (double aux : this.salarys) {
            sum += aux;
        }

        media = sum / this.salarys.length;
        System.out.println("A média salarial é: " + media);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double[] getSalarys() {
        return salarys;
    }

    public double getMedia() {
        return media;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalarys(double[] salarys) {
        this.salarys = salarys;
    }
}

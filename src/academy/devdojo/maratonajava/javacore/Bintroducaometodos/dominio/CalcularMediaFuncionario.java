package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class CalcularMediaFuncionario {
    public void mediaSalarial(Funcionario funcionario) {
        double sum = 0.0, media;

        if(funcionario.salarys == null){
            System.out.println("Não é possível calcular a média salarial do funcionário, pois faltam dados.");
            return;
        }

        for (double aux : funcionario.salarys) {
            sum += aux;
        }

        media = sum / funcionario.salarys.length;
        System.out.println("A média salarial é: " + media);
    }
}

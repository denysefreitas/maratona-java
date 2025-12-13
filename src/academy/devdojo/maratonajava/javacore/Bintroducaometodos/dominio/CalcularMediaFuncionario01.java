package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class CalcularMediaFuncionario01 {
    public void mediaSalarial(Funcionario01 funcionario01) {
        double sum = 0.0;

        if(funcionario01.salarys == null){
            System.out.println("Não é possível calcular a média salarial do funcionário, pois faltam dados.");
            return;
        }

        for (double aux : funcionario01.salarys) {
            sum += aux;
        }

        double media = sum / funcionario01.salarys.length;
        System.out.println("A média salarial é: " + media);
    }
}

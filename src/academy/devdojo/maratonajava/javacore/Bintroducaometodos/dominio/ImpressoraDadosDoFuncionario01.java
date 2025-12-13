package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class ImpressoraDadosDoFuncionario01 {
    public void impressoraDadosDoFuncionario(Funcionario01 funcionario01){
        System.out.println(funcionario01.name);
        System.out.println(funcionario01.age);

        if(funcionario01.salarys == null){
            System.out.print("Não é possível imprimir o salário do funcionário, pois faltam dados.");
            return;
        }

        for(double aux: funcionario01.salarys){
            System.out.print(aux + " ");
        }
    }
}

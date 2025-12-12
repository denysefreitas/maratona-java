package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class ImpressoraDadosDoFuncionario {
    public void impressoraDadosDoFuncionario(Funcionario funcionario){
        System.out.println(funcionario.name);
        System.out.println(funcionario.age);

        if(funcionario.salarys == null){
            System.out.print("Não é possível imprimir o salário do funcionário, pois faltam dados.");
            return;
        }

        for(double aux: funcionario.salarys){
            System.out.print(aux + " ");
        }
    }
}

package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salary = 1800;
        String mensagemDoar = "Eu vou doar 500 pro devDojo";
        String mensagemNDoar = "Ainda não tenho condições, mas vou ter";

            // usando estruturas condicionais if-else
//        String result = "";
//        if(salary >  5000){
//            result = mensagemDoar;
//        } else {
//            result = mensagemNDoar;
//        }

        /* usando operador ternário, cuja sintaxe:
            String Operadorternario = (condicao) ? verdadeiro : falso
            É possível ainda, além do caso atualmente em vigor:
            (1)  String result = salary > 5000 ? "Eu vou doar 500 pro devDojo" : "Ainda não tenho condições, mas vou ter";
            (2) System.out.println(salary > 5000 ? mensagemDoar : mensagemNDoar);
        */
        String result = salary > 5000 ? mensagemDoar : mensagemNDoar;

        System.out.println(result);


    }
}

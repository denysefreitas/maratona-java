package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest01 {
    public static void main(String[] args) {
        // Checked -> filhas diretas da classe Exception; se não tratadas, geram ERRO DE COMPILAÇÃO -> obrigatório fazer tratamento
        // Unchecked -> filhas ou a própria classe RunTimeException -> o erro é de desenvolvimento, provavelmente -> tratamento é facultativo

        //Object object = null;
        //System.out.println(object.toString());
        int []nums = {1,2};
        System.out.println(nums[2]);
    }
}

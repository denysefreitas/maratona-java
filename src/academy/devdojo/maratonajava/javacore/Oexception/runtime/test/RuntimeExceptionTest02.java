package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        System.out.println(dividir(1, 0));
    }

    /**
     *
     * @param a
     * @param b não pode ser zero
     * @return a/b
     * @throws IllegalArgumentException caso b seja zero
     */
    public static int dividir(int a, int b) {
        if(b == 0){
            throw new IllegalArgumentException("Argumento ilegal. Não é possível dividir por zero");
        }
        return a/b; // Somente executado se a exceção não for lançada

//        try{
//            return a/b;
//        } catch (ArithmeticException e){
//            e.printStackTrace();
//        }
//        return 0;
    }
}

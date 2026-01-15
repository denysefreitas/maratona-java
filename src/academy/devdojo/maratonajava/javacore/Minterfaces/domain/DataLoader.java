package academy.devdojo.maratonajava.javacore.Minterfaces.domain;

public interface DataLoader {
    int MAX_DATA_SIZE = 10;
    // em atributos criados dentro de uma interface, é redundante usar PRIVATE STATIC FINAL

    void load();
    // em métodos criados dentro de uma interface, é redundante usar PUBLIC ABSTRACT

    default void checkPermission(){
        // em métodos default, é redundante usar PUBLIC
        System.out.println("Fazendo checagem de permissões");
    }

    static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize na interface DataLoader");
    }
}

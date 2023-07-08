package Fila.vetor;

public class Programa {
    public static void main(String[] args) throws Exception {
        Fila <Object> fila1 = new Fila<>(10);

        fila1.enfileirar("Jao");
        fila1.enfileirar("aoil");
        fila1.enfileirar(7);

        fila1.returnList();


        fila1.desenfileirar();
        fila1.enfileirar(7.5);

        fila1.returnList();

    }
}

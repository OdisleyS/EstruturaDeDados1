package Fila.no;

public class Programa <T> {

    public static void main(String[] args) throws Exception {

        Fila<Integer> fila1= new Fila<>( );

        fila1.enfileirar(1);
        fila1.enfileirar(2);
        fila1.enfileirar(3);
        fila1.returnList();

        fila1.desenfileirar();
        fila1.enfileirar(4);
        fila1.returnList();








    }

}

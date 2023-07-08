package Fila.no;

public class Fila<T> {

    private int tamanho;
    private No<T> primeiro;
    private No<T> ultimo;

    //métodos

    public void enfileirar(T dado) {
        No<T> valor = new No<T>(dado); //chamando a classe no e atribuindo um valor pra ela armazenar.

        if (this.primeiro == null) {
            this.primeiro = valor;
            this.ultimo = valor;

        } else {
            ultimo.proximo = valor;
            ultimo = valor;
        }
        this.tamanho++;

    }

    public void desenfileirar() throws FilaVaziaException {

        if (isEmpty()) {
            throw new FilaVaziaException("A fila está vazia, impossível remover o elemento");
        } else {

            primeiro = primeiro.proximo;

        }
        tamanho--;
    }

    /*   public boolean isFull() {

           throw new RuntimeException("A fila está cheia, impossível adicionar o elemento");

       }*/
    public boolean isEmpty() {

        if (this.tamanho == 0) {
            return true;
        } else {
            return false;
        }
    }


    public void returnList() {

        No<T> aux = primeiro;

        System.out.println("\n");
        System.out.println("FILA");

        for (int i = 0; i < this.tamanho; i++) {

            System.out.print("[ " + aux.dado + " ]");

            aux = aux.proximo;


        }


    }

}

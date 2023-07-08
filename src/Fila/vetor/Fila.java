package Fila.vetor;

import Fila.no.No;

public class Fila<T> {

    private T valores[];
    private int primeiro;
    private int ultimo;
    private int tamanho;
    private int capacidade;

    public Fila(int qtd) {
        this.capacidade = qtd;
        this.valores = (T[]) new Object[capacidade];

/*
        this.primeiro = 0;
        this.ultimo = 0;
        this.tamanho = 0;
*/


    }

    //metodos

    public void enfileirar(T elemento) throws FilaCheiaException {
        if (isFull()) {
            throw new FilaCheiaException("A fila está cheia, impossível adicionar elemento");
        }
        this.ultimo = ultimo % capacidade;

        this.valores[ultimo] = elemento;
        this.ultimo++;

        this.tamanho++;

    }

    public T desenfileirar() throws FilaVaziaException {
        if( isEmpty()){
            throw new FilaVaziaException("A fila está vazia!");
        }

        this.primeiro = primeiro % capacidade;
        T elemento = this.valores[primeiro];
        this.valores[primeiro] = null;

        this.primeiro++;

        this.tamanho--;
        return elemento;
    }


    public boolean isFull() {
        if (this.tamanho == capacidade) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {

        if (this.tamanho == 0) {
            return true;

        }
        return false;
    }

    public void returnList() {

        System.out.println("\n");
        System.out.println("FILA");

        for (int i = 0; i < this.tamanho; i++) { // tambem pode ser capacidade
            System.out.print("[ " + valores[i] + " ]");


        }


    }


}

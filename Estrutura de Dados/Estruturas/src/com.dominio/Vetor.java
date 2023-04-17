package com.dominio;

public class Vetor {
    private Object[] vetor;
    private int quantElementos;

    public Vetor(int elementos) {
        this.vetor = new Object[elementos];
    }

    public void aumentarEspacoVetor() {
        if (this.quantElementos >= this.vetor.length - 1) {
            Object[] novoVetor = new Object[this.vetor.length * 2];

            for (int i = 0; i < this.vetor.length; i++) {
                novoVetor[i] = this.vetor[i];
            }

            this.vetor = novoVetor;
        }
    }

    public void adicionarElementoAoFinal(Object elemento) {
        this.aumentarEspacoVetor();
        this.vetor[this.quantElementos] = elemento;
        this.quantElementos++;
    }

    public Object quantElementos() {
        return this.quantElementos;
    }

    public void imprimirElementos() {
        for (int i = 0; i < this.quantElementos; i++) System.out.print(this.vetor[i]);
    }

    public void obterElemento(int posicao) throws Exception {
        posicao -= 1;
        if (posicao > this.quantElementos && posicao > this.vetor.length || this.vetor[posicao] == null)
            throw new Exception("Posição inválida.");

        System.out.println(this.vetor[posicao]);
    }

    public void verificarElemento(Object elemento) {
        for (Object ele: this.vetor) {
            if (ele.equals(elemento)) {
                System.out.println("\nO elemento está no vetor");
                break;
            }

            System.out.println("\nO elemento não está no vetor.");
            break;
        }
    }

    public void adicionarElementoQualquerPosicao(Object elemento, int posicao) throws Exception {
        this.quantElementos++;
        this.aumentarEspacoVetor();
        if (posicao +1> this.quantElementos) throw new Exception("Posição inválida.");

        for (int i = this.quantElementos; i >= posicao; i--) {
            this.vetor[i+1] = this.vetor[i];
        }

        this.vetor[posicao] = elemento;
    }

    public void removerElementoQualquerPosicao(int posicao) throws Exception {
        this.quantElementos--;
        if (posicao +1 > this.quantElementos) throw new Exception("Posição inválida.");

        for (int i = posicao; i <= this.quantElementos; i++){
            this.vetor[i] = this.vetor[i+1];
        }
    }
}










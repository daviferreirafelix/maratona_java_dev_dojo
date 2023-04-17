package com.teste;

import com.dominio.Vetor;

public class Teste {

    public static void main(String[] args) throws Exception {
        Vetor vetor = new Vetor(6);

        vetor.adicionarElementoAoFinal("Davi");
        vetor.adicionarElementoAoFinal("Maria");
        vetor.adicionarElementoAoFinal("José");
        vetor.imprimirElementos();

        System.out.println("\nA quantidade de elementos preenchidos neste vetor é: " + vetor.quantElementos());

        vetor.obterElemento(2);
        vetor.adicionarElementoQualquerPosicao("Ana", 3);
        vetor.imprimirElementos();
        System.out.println("\nA quantidade de elementos preenchidos neste vetor é: " + vetor.quantElementos());
        vetor.obterElemento(4);
        vetor.adicionarElementoQualquerPosicao("Julieta", 4);
        System.out.println("\nA quantidade de elementos preenchidos neste vetor é: " + vetor.quantElementos());
        vetor.imprimirElementos();
        vetor.removerElementoQualquerPosicao(0);
        System.out.println("\nA quantidade de elementos preenchidos neste vetor é: " + vetor.quantElementos());
        vetor.imprimirElementos();
        vetor.verificarElemento("Davi");
    }

}

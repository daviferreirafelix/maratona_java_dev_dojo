package com.myproject.learningjava.orientacao_a_objetos.Hheranca.dominio;

public class Coordenador extends Professor {
    private String funcao;
    private double novo_salario;

    public void imprime() {
        super.imprime();
        System.out.println("Salário do coordenador: "+this.novo_salario);
        System.out.println("Função do coordenador: "+this.funcao);
    }

    public String getFuncao() {
        return funcao;
    }
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    public double getNovo_salario() {
        return novo_salario;
    }
    public void setNovo_salario(double novo_salario) {
        this.novo_salario = novo_salario;
    }
}

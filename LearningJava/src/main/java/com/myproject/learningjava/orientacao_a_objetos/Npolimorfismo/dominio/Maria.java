package com.myproject.learningjava.orientacao_a_objetos.Npolimorfismo.dominio;

public class Maria extends Pessoa{
    private String corPele;

    public Maria(String nome, int idade, double salario, Profissoes profissoes, String corPele){
        super(nome, idade, salario, profissoes);
        this.corPele = corPele;
    }

    @Override
    public double porcentagemSalarioParaAposentadoria() {
        if (super.getSalario() > 3.500){
            return super.getSalario() * PORCENTAGEM_APOSENTADORIA_SALARIO_ALTO;
        }
        return super.getSalario() * PORCENTAGEM_APOSENTADORIA_SALARIO_BAIXO;
    }

    public String getCorPele(){
        return this.corPele;
    }

    public void setCorPele(String corPele){
        this.corPele = corPele;
    }
}

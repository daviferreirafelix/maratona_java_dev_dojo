package com.myproject.learningjava.orientacao_a_objetos.Npolimorfismo.dominio;

public enum Profissoes {
    PROFESSOR("Professor"),
    ENEGENHEIRO("Engenheiro"),
    COZINHEIRO("Cozinheiro"),
    FAXINEIRO("Faxineiro");

    private final String tipoProfissao;

    Profissoes(String tipoProfissao){
        this.tipoProfissao = tipoProfissao;
    }

    public String getTipoProfissao(){
        return tipoProfissao;
    }
}

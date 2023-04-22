package com.myproject.learningjava.objects.Npolimorfismo.dominio;

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

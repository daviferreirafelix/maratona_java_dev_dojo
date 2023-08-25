package com.myproject.learningjava.orientacao_a_objetos.Dconstrutores.teste;

import com.myproject.learningjava.orientacao_a_objetos.Dconstrutores.dominio.Sobrecarga;

public class TesteSobrecarga {
    public static void main(String[] args) {
        Sobrecarga sobrecarga = new Sobrecarga("One Piece", 1037, "Aventura", "TOEI");
        sobrecarga.imprimeSobrecargaConstrutores();
    }
}

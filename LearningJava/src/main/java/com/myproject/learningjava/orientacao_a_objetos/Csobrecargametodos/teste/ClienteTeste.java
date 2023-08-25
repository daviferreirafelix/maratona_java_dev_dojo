package com.myproject.learningjava.orientacao_a_objetos.Csobrecargametodos.teste;
import com.myproject.learningjava.orientacao_a_objetos.Csobrecargametodos.dominio.Cliente;

public class ClienteTeste {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        cliente.cliente("Davi", "Rua Tal de Tal, numero 00", 12345, 'M', 12345);
        cliente.imprimeCliente();
    }
}

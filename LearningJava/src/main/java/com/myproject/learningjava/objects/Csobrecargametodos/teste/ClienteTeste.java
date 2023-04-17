package com.myproject.learningjava.objects.Csobrecargametodos.teste;
import com.myproject.learningjava.objects.Csobrecargametodos.dominio.Cliente;

public class ClienteTeste {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        cliente.cliente("Davi", "Rua Tal de Tal, numero 00", 12345, 'M', 12345);
        cliente.imprimeCliente();
    }
}

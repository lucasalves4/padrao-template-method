package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CadastroClienteTest {

    @Test
    void deveRetornarCadastrado() {
        CadastroCliente cliente = new CadastroCliente();
        cliente.setNome("José");
        cliente.setCpf(123413);
        assertEquals("Cadastrado", cliente.cadastrar());
    }

    @Test
    void deveRetornarNaoCadastrado() {
        CadastroCliente cliente = new CadastroCliente();
        cliente.setNome("Maria");
        cliente.setCpf(-123);
        assertEquals("Não cadastrado", cliente.cadastrar());
    }

    @Test
    void deveRetornarInformacoes() {
        CadastroCliente cliente = new CadastroCliente();
        cliente.setNome("Leandro");
        cliente.setCpf(123456);
        assertEquals("UsuárioCliente{nome='Leandro', situação =Cadastrado}", cliente.getInfo());
    }

}
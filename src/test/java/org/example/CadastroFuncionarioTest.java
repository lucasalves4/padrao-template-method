package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CadastroFuncionarioTest {

    @Test
    void deveRetornarCadastrado() {
        CadastroFuncionario funcionario = new CadastroFuncionario();
        funcionario.setNome("José");
        funcionario.setCpf(123413);
        assertEquals("Cadastrado", funcionario.cadastrar());
    }

    @Test
    void deveRetornarNaoCadastrado() {
        CadastroFuncionario funcionario = new CadastroFuncionario();
        funcionario.setNome("Maria");
        funcionario.setCpf(-123);
        assertEquals("Não cadastrado", funcionario.cadastrar());
    }

    @Test
    void deveRetornarInformacoes() {
        CadastroFuncionario funcionario = new CadastroFuncionario();
        funcionario.setNome("Fernanda");
        funcionario.setCpf(147258);
        assertEquals("UsuárioFuncionário{nome='Fernanda', situação =Cadastrado}", funcionario.getInfo());
    }

}
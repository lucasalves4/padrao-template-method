package org.example;

public class CadastroCliente extends CadastroUsuario{

    public String cadastrar() {
        if (this.verificarRestricoes()) {
            return "Cadastrado";
        } else {
            return "Não cadastrado";
        }
    }

    @Override
    public String getTipo() {
        return "UsuárioCliente";
    }
}

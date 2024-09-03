package org.example;

public abstract class CadastroUsuario {

    String nome;
    int cpf;

    public String getNome() {
        return nome;
    }

    public CadastroUsuario setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public int getCpf() {
        return cpf;
    }

    public CadastroUsuario setCpf(int cpf) {
        this.cpf = cpf;
        return this;
    }

    public boolean verificarRestricoes() {
        return this.cpf > 0;
    }

    public abstract String cadastrar();

    public String getTipo() {
        return "Usuário";
    }

    public String getInfo() {
        return getTipo() + "{" +
                "nome='" + this.nome + '\'' +
                ", situação =" + this.cadastrar() +
                '}';
    }
}

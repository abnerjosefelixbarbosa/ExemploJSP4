
package com.abn.exemplojsp4.models;

public class Usuario {
    
    private String nome;
    private String endereco;

    public Usuario() {
    }

    public Usuario(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nome=" + nome + ", endereco=" + endereco + '}';
    }
    
}

package com.codedemonbr.NationalBank;

public class Cliente {
    public final Conta conta;
    private final String nome;
    private final String cpf;

    public Cliente(String nome, String cpf, Conta conta) {
        this.nome = nome;
        this.cpf = cpf;
        this.conta = conta;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }


    @Override
    public String toString() {
        return "\n{" +
                "\nnome='" + nome + '\'' +
                "\ncpf='" + cpf + '\'' +
                "\nconta=" + conta +
                "\n}";
    }
}

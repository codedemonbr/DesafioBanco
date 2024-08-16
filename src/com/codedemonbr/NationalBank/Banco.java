package com.codedemonbr.NationalBank;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private final String nome;
    private final String cpnj;
    private final List<Cliente> clientes;

    public Banco(String nome, String cpnj) {
        this.nome = nome;
        this.cpnj = cpnj;
        this.clientes = new ArrayList<>();
    }

    public void cadastrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public String getNome() {
        return nome;
    }

    public String getCpnj() {
        return cpnj;
    }

    @Override
    public String toString() {
        return "\n{" +
                "\nnome='" + nome + '\'' +
                "\ncpnj='" + cpnj + '\'' +
                "\nclientes=" + clientes +
                "\n}";
    }


}

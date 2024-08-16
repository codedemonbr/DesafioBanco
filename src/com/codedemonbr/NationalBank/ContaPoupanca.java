package com.codedemonbr.NationalBank;

public class ContaPoupanca extends Conta {

    private final double rendimento;

    public ContaPoupanca() {
        this.rendimento = 0.01;
    }

    public void valorSeAplicado() {
        double montante = this.saldo * Math.pow((1 + this.rendimento), 12);

        String msg = "Se aplicado por um ano você terá R$" + montante;

        System.out.println(msg);
    }

}

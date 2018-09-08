package com.leo;

import java.util.Collections;
import java.util.List;

class Conta implements Comparable<Conta> {

    private int numero;
    private String titular;
    private double saldo;
    private double limite;

    public Conta() {
    }

    public Conta(int numero, String titular, double saldo, double limite) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.limite = limite;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    public boolean saca(double valor) {
        if (valor < this.saldo) {
            return true;
        } else {
            return false;
        }
    }

    public void deposita(double valor) {
        this.setSaldo(valor + saldo);
    }

    public boolean transfere(Conta destino, double valor) {
        boolean retirou = this.saca(valor);
        if (retirou == true) {
            destino.deposita(valor);
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public int compareTo(Conta conta) {
        return Double.compare(this.getSaldo(), conta.getSaldo());
    }

}
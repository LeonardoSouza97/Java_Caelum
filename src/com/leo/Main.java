package com.leo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        List<Conta> listaContas = new ArrayList<>();

        for (int i = 0; i <= 9; i++) {
            Conta conta = new Conta();
            Random valor = new Random() ;
            conta.setTitular("Leonardo" + valor.nextInt());
            conta.deposita(valor.nextDouble() * 10);
            listaContas.add(conta);
        }

        Conta maiorSaldo = Collections.max(listaContas);
        Conta menorSaldo = Collections.min(listaContas);

        System.out.println("Conta com o maior saldo:" + maiorSaldo.getSaldo());
        System.out.println("Conta com o menor saldo:" + menorSaldo.getSaldo());

        for (Conta conta : listaContas) {
            System.out.println("SALDO:" + conta.getSaldo());
        }

        ContaCorrente c1 = new ContaCorrente(20, "Leonardo", 10000, 20000);
        ContaCorrente c2 = new ContaCorrente(20, "Ana", 3000, 5000);

        c1.deposita(10000);
        c1.transfere(c2, 7000);

        System.out.println("SALDO C1:" + c1.getSaldo());
        System.out.println("SALDO C2:" + c2.getSaldo());

        int mesmaConta = c1.compareTo(c2);

        System.out.println(mesmaConta);
    }
}

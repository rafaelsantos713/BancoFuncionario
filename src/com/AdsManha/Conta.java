package com.AdsManha;

import java.util.Scanner;

class Conta {

    String nome_cliente;
    int numero_conta;
    double saldo_conta , limite , saque = 0, deposito = 0;
    private double saldototal;


    void depositar() {
        Scanner informado = new Scanner(System.in);

        System.out.println("Informe o valor do deposito R$: ");
        deposito = informado.nextDouble();

    }
    void saquar() {
        Scanner informado = new Scanner(System.in);
        System.out.println("Informe o  valor do seu saque R$: ");
        saque = informado.nextDouble();


    }
    void deposito(double saldo) {

        this.saldo_conta += this.deposito;


    }

    void saque(double saldo) {

        this.saldo_conta -= this.saque;

    }

    void limite(double limite) {

        this.limite += this.deposito;
    }

    void extrato() {



        System.out.println("Seu limite é R$: " + limite);
        System.out.println("Seu Saldo Total é R$: " + saldo_conta);
    }


    void saldototal(double saldo_conta) {
        this.saldototal = this.saldo_conta;
        System.out.println("Seu saldo é R$: " + saldo_conta);
    }
}

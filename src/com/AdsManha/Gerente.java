package com.AdsManha;

import java.util.Date;
import java.util.Scanner;

class Gerente  extends CadastroUsuario{

    String nome = "Ana", endereco = "Praça da Bandeira", agencia = "BB", emprego, salario_mensal;
    int idade = 35;
    double saldo, limite;

    void dadosaldo() {

        System.out.println("Saldo do cliente " + this.saldo + " limite é de  " + limite);

    }

    void tipo(double salario_mensal) {

        if (salario_mensal >= 1200 && salario_mensal <= 2450) {

            this.limite = 2450;

        } else if (salario_mensal >= 2455 && salario_mensal <= 3500) {

            this.limite = 3500;
        } else if (salario_mensal > 3500) {

            this.limite = 7000;
        }

    }

    void imprimir() {

        Cliente cliente_1 = new Cliente();
        Gerente gerente_1 = new Gerente();

        System.out.println("Informações do cliente consultado");
        System.out.println("Nome: " + cliente_1.nome);
        System.out.println("Endereço: " + cliente_1.endereco);
        System.out.println("Idade: " + cliente_1.idade);
        System.out.println("Emprego: " + cliente_1.emprego);
        System.out.println("Salario mensal: " + cliente_1.salario_mensal);
        System.out.println("Numero da conta: " + cliente_1.numero_conta);
        System.out.println("===== Dados Gerente =====");
        System.out.println("Nome: " + gerente_1.nome);
        System.out.println("Endereço: " + gerente_1.endereco);
        System.out.println("Agencia: " + gerente_1.agencia);

    }


}
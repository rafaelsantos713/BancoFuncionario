package com.AdsManha;

import java.util.Date;
import java.util.Scanner;

public class GerenciarConta extends Gerente {

        public static void main(String[] args) {


            Cliente cliente_1 = new Cliente();
            Scanner informado = new Scanner(System.in);
            Conta conta_1 = new Conta();
            Gerente gerente_1 = new Gerente();

            System.out.println("\nQual seu nome: ");
            cliente_1.nome = informado.next();

            System.out.println("\nQual seu endereço: ");
            cliente_1.endereco = informado.next();

            System.out.println("\nQual seu Emprego: ");
            cliente_1.emprego = informado.next();

            System.out.println("\nQual sua idade: ");
            cliente_1.idade = informado.nextInt();

            System.out.println("\nQual seu salario mensal: " );
            cliente_1.salario_mensal = informado.nextDouble();


            conta_1.depositar();
            conta_1.deposito(conta_1.deposito);
            conta_1.saquar();
            conta_1.saque(conta_1.saque);
            gerente_1.dadosaldo();
            conta_1.saldototal(conta_1.saldo_conta);
            conta_1.extrato();


            Date date = new Date();

            System.out.println(date.toString());
            Empresa e1 = new Empresa();


            e1.funcionarios = new Funcionario[2];

            Funcionario f1 = new Funcionario();
            f1.nome = "Rafael";
            f1.depto = "Analista";


            Funcionario f2 = new Funcionario();
            f2.nome = "Jonas";
            f2.depto = "TI";


            e1.adiciona(f1);
            e1.adiciona(f2);

            System.out.println("Quantidade de Funcionário na Empresa " + e1.quantidadeFuncionarios() + "\n");
            e1.mostraFuncionarios();


        }

    }



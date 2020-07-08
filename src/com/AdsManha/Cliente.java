package com.AdsManha;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

 public class  Cliente  extends CadastroUsuario{

    String nome, endereco, emprego;
    int idade, numero_conta = 280509;
    double salario_mensal, saldo = 0;

    void inserir_saldo(double salario_mensal) {

        this.saldo = this.salario_mensal;

        class geraId {

            public  int obterIdUnico(int numero_conta){
                try{
                    FileWriter arq1 = new FileWriter("numero_conta.txt");
                    PrintWriter arq2 = new PrintWriter("arq1");
                    arq2.println(++numero_conta);
                    arq2.close();
                    return numero_conta;
                }
                catch (IOException e){
                    e.printStackTrace();
                    return -1;

                }
            }


        }


    }

}

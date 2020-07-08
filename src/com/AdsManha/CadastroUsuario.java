package com.AdsManha;

import java.io.*;

public class CadastroUsuario  {
    private String nome;
    private String CPF;
    private String endereco;


    private static int numero_conta;

    static {
        System.out.println("Lê numero da conta");

        try {
            FileReader arq1 = new FileReader("numero_conta.txt");
            BufferedReader arq2 = new BufferedReader(arq1);
            numero_conta = Integer.parseInt(arq2.readLine());
            arq2.close();
            arq1.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileWriter arq1 = new FileWriter("numero_conta.txt");
            PrintWriter arq2 = new PrintWriter(arq1);
            arq2.println(1);
            arq2.close();
            arq1.close();
        } catch (IOException e) {
            e.printStackTrace();

        }

        }


    }

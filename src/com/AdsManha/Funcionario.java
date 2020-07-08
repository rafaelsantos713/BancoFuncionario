package com.AdsManha;


class Funcionario  extends CadastroUsuario{
    String	nome;
    String	depto;
    double  salario;
    String	RG;


    void imprimir() {
        System.out.println("\nNome: "+ this.nome);
        System.out.println("Depto: "+ this.depto);
        System.out.println("Salario: "+ this.salario);
        System.out.println("RG: "+ this.RG);

    }
}
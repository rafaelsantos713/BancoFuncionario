package com.AdsManha;

class Empresa {
    String cnpj;
    Funcionario[] funcionarios;
    int i;

    void adiciona(Funcionario f) {
        if (i < funcionarios.length) {
            funcionarios[i] = f;
            i++;
        }
        else {
            System.out.println("Vetor cheio!");
        }
    }

    int quantidadeFuncionarios() {
        return i;
    }

    void mostraFuncionarios() {
        for(int j=0; j<i; j++) {
            System.out.println(funcionarios[j].nome);
            System.out.println(funcionarios[j].depto);
            System.out.println(funcionarios[j].salario);
            System.out.println(funcionarios[j].RG);

        }
    }
}
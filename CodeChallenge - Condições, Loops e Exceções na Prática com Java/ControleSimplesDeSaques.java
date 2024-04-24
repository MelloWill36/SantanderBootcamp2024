package org.example;

import java.util.Scanner;

public class ControleSimplesDeSaques {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double limiteDiario = scanner.nextDouble();

    for (;;) {
        double valorSaque = scanner.nextDouble();

        if (valorSaque == 0) {
            System.out.println("Transacoes encerradas.");
            break;
        }

        if (valorSaque > limiteDiario) {
            System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
            break;
        } else {
            limiteDiario -= valorSaque;
            System.out.println("Saque realizado. Limite restante: " + limiteDiario);
        }
    }

    // Fechamos o Scanner para evitar vazamento de recursos:
    scanner.close();
    }
}

/*
Descrição
Você está desenvolvendo um programa simples em Java para auxiliar um cliente a realizar saques de uma conta bancária. O cliente pode fazer saques até atingir um limite diário predefinido.

Entrada
O programa solicitará ao usuário que informe o limite diário de saque.
Em seguida, o programa solicitará ao usuário que informe o valor do primeiro saque.
Saída
Utilizando um laço for, o programa iterará sobre os saques.
Para cada saque, o programa verificará se o valor ultrapassa o limite diário.
Se ultrapassar, o programa informará que o limite foi atingido e encerrará o loop.
Se não ultrapassar, o programa informará que o saque foi realizado com sucesso.
 */
package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegistroTransacoesBancarias {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = scanner.nextDouble();
        int quantidadeTransacoes = scanner.nextInt();

        // Crie a lista para armazenar as transações:
        List<String> transacoes = new ArrayList<>();

        // Implemente um loop 'for' para iterar sobre as transações:
        for (int i = 1; i <= quantidadeTransacoes; i++) {
            char tipoTransacao = scanner.next().charAt(0);
            double valorTransacao = scanner.nextDouble();

            // Aqui é verificar o tipo de transação e atualiza o saldo da conta de acordo:
            if (tipoTransacao == 'D' || tipoTransacao == 'd') {
                saldo += valorTransacao;
                // Adicione a transação à lista:
                transacoes.add("Deposito de " + valorTransacao);
            } else if (tipoTransacao == 'S' || tipoTransacao == 's') {
                saldo -= valorTransacao;
                // Adiciona a transação à lista
                transacoes.add("Saque de " + valorTransacao);
            } else {
                // Se o tipo de transação não for reconhecido, exibe uma mensagem de erro
                System.out.println("Opcao inválida. Utilize D para deposito ou S para saque.");
                i--; // Para repetir a transação inválida
            }
        }

        // Aqui é exibido o saldo final e a lista de transações ao final do processo:
        System.out.println("\nSaldo: " + saldo);
        System.out.println("\nTransacoes:");

        // Crie um loop 'for' para exibir cada transação na lista:
        for (int i = 0; i < transacoes.size(); i++) {
            // Agora exibA o número da transação seguido da descrição da transação:
            System.out.println((i+1) + ". " + transacoes.get(i));
        }

        // Fechamos o scanner para liberar recursos:
        scanner.close();
    }
}

/*
Descrição
Você está aprimorando o programa anterior e agora deseja utilizar a Stream API do Java para processar as transações bancárias de forma mais eficiente.

Entrada
O programa solicitará ao usuário que informe o saldo inicial da conta.
Em seguida, o programa solicitará a quantidade total de transações que o cliente deseja realizar.

Entrada de Transações:
Para cada transação, o programa solicitará ao usuário:
O tipo de transação: Digite 'D' para depósito ou 'S' para saque.
O valor da transação.
Saída
Utilizando a Stream API, o programa armazenará cada transação, que incluirá um tipo (Depósito ou Saque) e um valor.
Ao final das transações, o programa exibirá o saldo final da conta e a lista de transações.
 */
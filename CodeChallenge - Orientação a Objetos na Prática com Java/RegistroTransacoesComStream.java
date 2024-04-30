package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RegistroTransacoesComStream {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = scanner.nextDouble();
        int quantidadeTransacoes = scanner.nextInt();
        List<Transacao> transacoes = new ArrayList<>();

        for (int i = 1; i <= quantidadeTransacoes; i++) {
            char tipoTransacao = scanner.next().charAt(0);


            double valorTransacao = scanner.nextDouble();

            Transacao transacao = new Transacao(tipoTransacao, valorTransacao);
            transacoes.add(transacao);
            // Aqui é atualizado o saldo da conta com base no tipo de transação
            if (transacao.getTipo() == 'D' || transacao.getTipo() == 'd') {
                saldo += valorTransacao;
            } else if (transacao.getTipo() == 'S' || transacao.getTipo() == 's') {
                saldo -= valorTransacao;
            }
        }

        // Exibe o saldo final e a lista de transações ao final do processo usando Stream API
        System.out.println("\nSaldo : " + saldo);
        System.out.println("\nTransacoes:");
        // TODO: Crie um fluxo (stream) a partir da lista de transações:
        transacoes.stream()

                // TODO: Mapeie cada transação para uma string formatada:
                .map(transacao -> {
                    if (transacao.getTipo() == 'D' || transacao.getTipo() == 'd') {
                        return "d de " + transacao.getValor();
                    } else {
                        return "s de " + transacao.getValor();
                    }
                })
                // TODO: Colete os elementos do fluxo em uma lista:
                .collect(Collectors.toList())

                // TODO: Para cada elemento da lista, imprime no console:
                .forEach(System.out::println);
        scanner.close();
    }
}

class Transacao {
    private char tipo;
    private double valor;

    public Transacao(char tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public char getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
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
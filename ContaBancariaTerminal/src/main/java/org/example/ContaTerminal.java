package org.example;

import java.util.Scanner;

public class ContaTerminal {
    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    public static void main(String[] args) {
        ContaTerminal conta = new ContaTerminal();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência:");
        conta.setAgencia(scanner.nextLine());

        System.out.println("Por favor, digite o número da Conta:");
        conta.setNumero(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente:");
        conta.setNomeCliente(scanner.nextLine());

        System.out.println("Por favor, digite o saldo:");
        conta.setSaldo(scanner.nextDouble());

        // Exibindo os dados da conta
        System.out.println("\nDados da Conta:");
        System.out.println("Agência: " + conta.getAgencia());
        System.out.println("Número da Conta: " + conta.getNumero());
        System.out.println("Nome do Cliente: " + conta.getNomeCliente());
        System.out.println("Saldo: " + conta.getSaldo());

        scanner.close();
    }

    // Getters e Setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
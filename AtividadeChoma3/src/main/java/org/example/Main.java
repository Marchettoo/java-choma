package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Escolha o tipo de funcionário para cadastrar:");
            System.out.println("1. Funcionário em Tempo Integral");
            System.out.println("2. Funcionário Meio Período");
            System.out.println("3. Estagiário");
            System.out.println("0. Sair");
            int escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1:
                    System.out.print("Digite o nome: ");
                    String nomeIntegral = scanner.nextLine();
                    System.out.print("Digite o CPF: ");
                    String cpfIntegral = scanner.nextLine();
                    System.out.print("Digite o salário base: ");
                    double salarioBaseIntegral = scanner.nextDouble();
                    System.out.print("Digite o bônus (percentual): ");
                    double bonus = scanner.nextDouble();
                    scanner.nextLine();

                    FuncionarioTempoIntegral funcionarioIntegral = new FuncionarioTempoIntegral(
                            nomeIntegral, cpfIntegral, salarioBaseIntegral, bonus);
                    funcionarios.add(funcionarioIntegral);
                    break;

                case 2:
                    System.out.print("Digite o nome: ");
                    String nomeMeioPeriodo = scanner.nextLine();
                    System.out.print("Digite o CPF: ");
                    String cpfMeioPeriodo = scanner.nextLine();
                    System.out.print("Digite as horas trabalhadas: ");
                    int horasTrabalhadas = scanner.nextInt();
                    System.out.print("Digite o valor por hora: ");
                    double valorPorHora = scanner.nextDouble();
                    scanner.nextLine();

                    FuncionarioMeioPeriodo funcionarioMeioPeriodo = new FuncionarioMeioPeriodo(
                            nomeMeioPeriodo, cpfMeioPeriodo, horasTrabalhadas, valorPorHora);
                    funcionarios.add(funcionarioMeioPeriodo);
                    break;

                case 3:
                    System.out.print("Digite o nome: ");
                    String nomeEstagiario = scanner.nextLine();
                    System.out.print("Digite o CPF: ");
                    String cpfEstagiario = scanner.nextLine();
                    System.out.print("Digite a instituição de ensino: ");
                    String instituicaoEnsino = scanner.nextLine();
                    System.out.print("Digite a bolsa auxílio: ");
                    double bolsaAuxilio = scanner.nextDouble();
                    scanner.nextLine();

                    Estagiario estagiario = new Estagiario(
                            nomeEstagiario, cpfEstagiario, instituicaoEnsino, bolsaAuxilio);
                    funcionarios.add(estagiario);
                    break;

                case 0:
                    continuar = false;
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }

        System.out.println("\n--- Informações dos Funcionários Cadastrados ---");
        for (Funcionario funcionario : funcionarios) {
            funcionario.exibirInformacoes();
            System.out.println("Salário Calculado: " + funcionario.calcularSalario());
            System.out.println("-------------------------");
        }

        scanner.close();
    }
}

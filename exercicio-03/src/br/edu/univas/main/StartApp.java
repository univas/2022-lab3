package br.edu.univas.main;

import br.edu.univas.vo.CLT;
import br.edu.univas.vo.Estagiario;
import br.edu.univas.vo.Funcionario;
import br.edu.univas.vo.Vendedor;

import java.util.ArrayList;
import java.util.Scanner;

public class StartApp {

    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int option = 0;

        do {
            printMenu();
            option = readInteger(scanner);
            if (option == 1) {
                cadastraFuncionario(scanner, funcionarios);
            } else if (option == 2) {
                listaFuncionario(funcionarios);
            } else if (option != 9) {
                System.out.println("Opção errada!");
            }
        } while (option != 9);
    }

    private static void listaFuncionario(ArrayList<Funcionario> funcionarios) {
        for (Funcionario funcionario : funcionarios) {
            float salario = funcionario.calculaSalario();
            System.out.println(funcionario);
            System.out.println("Salario: " + salario);
        }
    }

    private static void cadastraFuncionario(Scanner scanner, ArrayList<Funcionario> funcionarios) {
        printSubMenu();
        int option = readInteger(scanner);
        if (option == 1) {
            cadastraCLT(scanner, funcionarios);
        } else if (option == 2) {
            cadastraEstagiario(scanner, funcionarios);
        } else if (option == 3) {
            cadastraVendedor(scanner, funcionarios);
        } else if (option != 9) {
            System.out.println("Opção errada!");
        }
    }

    private static void cadastraVendedor(Scanner scanner, ArrayList<Funcionario> funcionarios) {
        System.out.println("Cadastro de vendedor");
        System.out.println("Digite o nome:");
        String nome = scanner.nextLine();
        System.out.println("Digite o salario base");
        float salarioBase = readFloat(scanner);
        System.out.println("Comissão");
        float comissao = readFloat(scanner);
        System.out.println("Digite as horas trabalhadas");
        float horasTrabalhadas = readFloat(scanner);

        Funcionario vendedor = new Vendedor(salarioBase, comissao);
        vendedor.setNome(nome);
        vendedor.setHorasTrabalhadas(horasTrabalhadas);

        funcionarios.add(vendedor);
    }

    private static void cadastraEstagiario(Scanner scanner, ArrayList<Funcionario> funcionarios) {
        System.out.println("Cadastro de estagiario");
        System.out.println("Digite o nome:");
        String nome = scanner.nextLine();
        System.out.println("Digite o salario base");
        float salarioBase = readFloat(scanner);
        System.out.println("Digite o valor hora");
        float valorHora = readFloat(scanner);
        System.out.println("Digite as horas trabalhadas");
        float horasTrabalhadas = readFloat(scanner);

        Funcionario estagiario = new Estagiario(salarioBase, valorHora);
        estagiario.setNome(nome);
        estagiario.setHorasTrabalhadas(horasTrabalhadas);

        funcionarios.add(estagiario);
    }

    private static void cadastraCLT(Scanner scanner, ArrayList<Funcionario> funcionarios) {
        System.out.println("Cadastro de estagiario");
        System.out.println("Digite o nome:");
        String nome = scanner.nextLine();
        System.out.println("Digite o salario base");
        float salarioBase = readFloat(scanner);
        System.out.println("Digite o valor hora");
        float horasTrabalhadas = readFloat(scanner);

        Funcionario clt = new CLT(salarioBase);
        clt.setNome(nome);
        clt.setHorasTrabalhadas(horasTrabalhadas);

        funcionarios.add(clt);
    }

    private static void printMenu() {
        System.out.println("::::Cadastro de Funcionário::::");
        System.out.println("1 – Cadastrar Novo Funcionário");
        System.out.println("2 – Listar todos os Funcionários");
        System.out.println("9 – Sair");
    }

    private static void printSubMenu() {
        System.out.println("::::Cadastro de Funcionário::::");
        System.out.println("1 – CLT");
        System.out.println("2 – Estagiário");
        System.out.println("3 – Vendedor");
        System.out.println("9 – Voltar");
    }

    private static int readInteger(Scanner scanner) {
        int value = scanner.nextInt();
        scanner.nextLine();
        return value;
    }

    private static float readFloat(Scanner scanner) {
        float value = scanner.nextFloat();
        scanner.nextLine();
        return value;
    }
}

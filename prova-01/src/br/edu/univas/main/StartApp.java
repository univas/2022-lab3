package br.edu.univas.main;

import br.edu.univas.vo.Aluno;
import br.edu.univas.vo.Mestrado;
import br.edu.univas.vo.PosGraducao;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class StartApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Aluno> alunoList = new ArrayList<>();

        int option = 0;
        do {
            printMenu();
            option = readInteger(scanner);

            if (option == 1) {
                cadastrarAluno(scanner, alunoList);
            } else if (option == 2) {
                listarAlunosPosGraduacao(alunoList);
            } else if (option == 3) {
                listarAlunosMestrado(alunoList);
            } else if (option != 9) {
                System.out.println("Opção invalida!");
            }
        } while(option != 9);

        scanner.close();
    }

    private static void cadastrarAluno(
            Scanner scanner, ArrayList<Aluno> alunoList) {
        Aluno aluno;

        System.out.println("Cadastro de Aluno");
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Mestrado");
        System.out.println("2 - Pós Graduação");

        int option = readInteger(scanner);
        if (option == 1) {
            aluno = new Mestrado();
        } else {
            aluno = new PosGraducao();
        }

        System.out.println("Digite o nome:");
        aluno.setNome(scanner.nextLine());
        System.out.println("Digite o cpf:");
        aluno.setCpf(readInteger(scanner));
        System.out.println("Digite o e-mail:");
        aluno.setEmail(scanner.nextLine());

        if (alunoList.contains(aluno)) {
            System.out.println("Erro ao cadastrar aluno." +
                    "CPF já existe!");
        } else {
            alunoList.add(aluno);
            System.out.println("Aluno cadastrado com sucesso!");
        }
    }

    private static void printMenu() {
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Cadastrar aluno");
        System.out.println("2 - Listar alunos pós-graduação");
        System.out.println("3 - Listar alunos mestrado");
        System.out.println("9 - Sair");
    }

    private static int readInteger(Scanner scanner) {
        int result = scanner.nextInt();
        scanner.nextLine();
        return result;
    }

    private static void listarAlunosPosGraduacao(ArrayList<Aluno> alunoList) {
        for (int i = 0; i < alunoList.size(); i++) {
            Aluno aluno = alunoList.get(i);
            if (aluno instanceof PosGraducao) {
                System.out.println(aluno);
            }
        }
    }

    private static void listarAlunosMestrado(ArrayList<Aluno> alunoList) {
        for (int i = 0; i < alunoList.size(); i++) {
            Aluno aluno = alunoList.get(i);
            if (aluno instanceof Mestrado) {
                System.out.println(aluno);
            }
        }
    }
}

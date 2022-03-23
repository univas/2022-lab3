package br.edu.univas.vo;

import java.util.Scanner;

public class FuncionarioController {

    public Funcionario createFuncionario() {
        Scanner scanner = new Scanner(System.in);

        Funcionario f1 = new Funcionario();
        System.out.println("Digite o registro");
        f1.setRegistro(scanner.nextLine());

        System.out.println("Digite o nome:");
        f1.setNome(scanner.nextLine());

        System.out.println("Digite o email:");
        f1.setEmail(scanner.nextLine());

        DepartamentoController dController = new DepartamentoController();
        Departamento d1 = dController.createDepartamento();

        f1.setDepartamento(d1);
        return f1;
    }
}

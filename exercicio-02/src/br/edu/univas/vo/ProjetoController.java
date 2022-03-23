package br.edu.univas.vo;

import java.util.ArrayList;
import java.util.Scanner;

public class ProjetoController {

    public Projeto createProjeto() {
        Scanner scanner = new Scanner(System.in);
        Projeto p1 = new Projeto();

        System.out.println("Digite a data de inicio do projeto");
        p1.setInicio(scanner.nextLine());

        System.out.println("Digite a data de fim do projeto");
        p1.setFim(scanner.nextLine());

        System.out.println("Digite o status do projeto");
        p1.setStatus(scanner.nextLine());

        DepartamentoController dController = new DepartamentoController();
        Departamento d1 = dController.createDepartamento();
        p1.setDepartamento(d1);

        FuncionarioController fController = new FuncionarioController();

        System.out.println("Digite a quantidade de funcionarios");
        int quantidadeFuncionarios = scanner.nextInt();
        ArrayList<Funcionario> list = new ArrayList<>();
        for (int i = 0; i < quantidadeFuncionarios; i++) {
            Funcionario f1 = fController.createFuncionario();
            list.add(f1);
        }

        p1.setFuncionarios(list);
        return p1;
    }
}
